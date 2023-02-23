import { Component, OnChanges, OnInit, AfterViewInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { ChartOptions } from 'chart.js';
import { SurveyService } from '../../shared/services/survey/survey.service';
import { ResultText } from './texts/result.text';

@Component({
  selector: 'app-result',
  templateUrl: './result.component.html',
  styleUrls: ['./result.component.sass']
})
export class ResultComponent implements OnInit {

    dataSource: any;
    dataChart: { pop: number, rock: number, electronica: number, reggaeton: number, rap: number} = {pop: 0, rock: 0, electronica: 0, reggaeton: 0, rap: 0};
    displayedColumns: string[] = ['idSurvey', 'musicName', 'idMusicType', 'email'];
    @ViewChild(MatPaginator) paginator: MatPaginator;

    // Pie
    public pieChartOptions: ChartOptions<'pie'> = {
      responsive: false,
    };
    public pieChartLabels = [ [ 'Pap' ], [ 'Rock' ], [ 'Electronica' ], [ 'Reggeaton' ], [ 'Rap' ] ];
    public pieChartDatasets = [ {
      data: [ 0, 0, 0, 0, 0 ]
    } ];
    public pieChartLegend = true;
    public pieChartPlugins = [];

    resultText = ResultText;

    constructor(private surveyService: SurveyService) {

    }

    ngOnInit(): void {
      this.getSurvey();
    }

    getSurvey() {
      this.surveyService.getSurveyAnswers().subscribe((v)=>{
        try {
          this.dataSource = new MatTableDataSource(v.listSurvey);
          this.dataSource.paginator = this.paginator;
          this.dataChart.pop = v.listSurvey.filter((v)=>v.idMusic==='1').length;
          this.dataChart.rock = v.listSurvey.filter((v)=>v.idMusic==='2').length;
          this.dataChart.electronica = v.listSurvey.filter((v)=>v.idMusic==='3').length;
          this.dataChart.reggaeton = v.listSurvey.filter((v)=>v.idMusic==='4').length;
          this.dataChart.rap = v.listSurvey.filter((v)=>v.idMusic==='5').length;
          console.log(this.dataChart);
          this.pieChartDatasets = [{ data: [this.dataChart.pop, this.dataChart.rock, this.dataChart.electronica, this.dataChart.reggaeton, this.dataChart.rap]}]
        } catch (error) {

        }
      })
    }

}
