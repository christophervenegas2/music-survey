import { Injectable } from '@angular/core';
import { Observable, retry } from 'rxjs';
import {HttpClient} from '@angular/common/http';
import { ApiRutes } from './rutes/apiRutes';
import { SurveyResponse } from '../../constants/responses/survey-response';
import { surveyParams } from '../../constants/entryparams/survey-params';

@Injectable({
  providedIn: 'root'
})
export class SurveyService {

  apiRutes = ApiRutes;

  constructor(private http: HttpClient) {
  }

  getSurveyAnswers(): Observable<SurveyResponse> {
    return this.http.get<SurveyResponse>(this.apiRutes.survey).pipe(
      retry(3));
  }

  saveSurvey(survey: surveyParams): Observable<SurveyResponse> {
    return this.http.post<SurveyResponse>( this.apiRutes.survey, survey)
      .pipe(retry(3));
  }
}

