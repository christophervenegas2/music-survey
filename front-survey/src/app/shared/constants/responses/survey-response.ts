export interface SurveyResponse {
  status:     Status;
  listSurvey: ListSurvey[];
}

export interface ListSurvey {
  id:        number;
  email:     string;
  musicName: string;
  idMusic:   string;
}

export interface Status {
  code:        string;
  description: string;
}
