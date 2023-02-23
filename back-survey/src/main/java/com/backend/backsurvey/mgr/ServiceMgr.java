package com.backend.backsurvey.mgr;

import com.backend.backsurvey.model.dto.SurveyResponseDto;
import com.backend.backsurvey.model.entity.Survey;
import com.backend.backsurvey.model.dto.StatusDto;

/**
 * @author christophervenegas2
 */
public interface ServiceMgr {

  /**
   * @return
   */
  SurveyResponseDto getListSurvey();

  /**
   * @return
   */
  StatusDto saveSurvey( Survey SurveyData);
}
