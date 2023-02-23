package com.backend.backsurvey.model.dto;

import java.util.List;

import com.backend.backsurvey.model.entity.Survey;
import lombok.Data;

@Data
public class SurveyResponseDto {

  private StatusDto status;

  private List<Survey> listSurvey;
}
