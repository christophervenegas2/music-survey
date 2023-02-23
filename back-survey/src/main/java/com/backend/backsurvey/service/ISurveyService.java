package com.backend.backsurvey.service;

import java.util.List;

import com.backend.backsurvey.model.entity.Survey;

/**
 * @author christophervenegas2
 */
public interface ISurveyService {

  /**
   * @return
   */
  public List<Survey> getListSurvey();

  /**
   * @return
   */
  public Survey saveSurvey( Survey surveyData );
  
}
