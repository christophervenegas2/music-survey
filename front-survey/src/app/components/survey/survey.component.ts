import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AlertService } from 'ngx-alerts';
import { surveyParams } from 'src/app/shared/constants/entryparams/survey-params';
import { Music } from 'src/app/shared/constants/musicType';
import { SurveyService } from '../../shared/services/survey/survey.service';
import { SurveyText } from './texts/survey.text';

@Component({
  selector: 'app-survey',
  templateUrl: './survey.component.html',
  styleUrls: ['./survey.component.sass']
})


export class SurveyComponent implements OnInit {

  formGroup: FormGroup = new FormGroup({});
  musicList = Music;
  surveyText = SurveyText;

  constructor(private router: Router, private alertService: AlertService, private surveyService: SurveyService) {
  }

  ngOnInit(): void {
    this.formInit();
  }

  onSubmit() {
    const musicName = this.musicList.find((v)=>this.formGroup.get('idTypeMusic')?.value == v.idTypeMusic)?.musicName;
    const survey: surveyParams = {
      idMusic: this.formGroup.get('idTypeMusic')?.value,
      email: this.formGroup.get('email')?.value,
      musicName: musicName,
    }
    this.surveyService.saveSurvey(survey).subscribe(()=>{
      try {
        console.log("xd");
        this.alertService.success("Encuesta exitosa, muchas gracias")
        setTimeout(()=> this.router.navigate(['/home']), 1200);
      } catch (e) {
        console.log("xd");
        this.alertService.danger("Error al intentar guardar su encuesta, porfavor reintentar")
      }
    });
  }


  formInit() {
    this.formGroup = new FormGroup({
      idTypeMusic: new FormControl('', [Validators.required, Validators.minLength(1)]),
      email: new FormControl('', [Validators.required, Validators.email])
    });
  }
}
