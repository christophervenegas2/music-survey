package com.backend.backsurvey.model.response;

import com.backend.backsurvey.model.dto.SurveyResponseDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SurveyResponseRest extends ResponseRest {

  private SurveyResponseDto surveyResponse = new SurveyResponseDto();
  
}
