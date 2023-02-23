package com.backend.backsurvey.mgr.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backsurvey.mgr.ServiceMgr;
import com.backend.backsurvey.model.dto.StatusDto;
import com.backend.backsurvey.model.dto.SurveyResponseDto;
import com.backend.backsurvey.model.entity.Survey;
import com.backend.backsurvey.constants.CommonConstant;
import com.backend.backsurvey.service.ISurveyService;

@Service
public class ServiceMgrImpl implements ServiceMgr {
  
  @Autowired
  private ISurveyService empresaService;

  protected static final Logger log = LoggerFactory.getLogger( ServiceMgrImpl.class );

  @Override
  public SurveyResponseDto getListSurvey() {
    StatusDto status = new StatusDto();
    SurveyResponseDto response = new SurveyResponseDto();

    try {
      List<Survey> listSurvey = empresaService.getListSurvey();

      if (listSurvey.isEmpty() || listSurvey == null) {
        status.setCode(CommonConstant.CODE_500);
        status.setDescription(CommonConstant.ERROR_GET);
        response.setListSurvey(List.of());
        response.setStatus(status);
        return response;
      }

      status.setCode(CommonConstant.CODE_200);
      status.setDescription(CommonConstant.OK);
      response.setListSurvey(listSurvey);
      response.setStatus(status);
    } catch (Exception e) {
      log.error("ERROR - no se pudo obtener la encuesta {}", e);
      status.setCode(CommonConstant.CODE_500);
      status.setDescription(CommonConstant.ERROR_GET);
      response.setListSurvey(List.of());
      response.setStatus(status);
    }
    return response;
  }

  @Override
  public StatusDto saveSurvey(Survey surveyData) {
    StatusDto status = new StatusDto();

    try {
      Survey survey = empresaService.saveSurvey(surveyData);

      if (survey.equals("") || survey == null) {
        status.setCode(CommonConstant.CODE_500);
        status.setDescription(CommonConstant.ERROR_SAVE);
        return status;
      }

      status.setCode(CommonConstant.CODE_200);
      status.setDescription(CommonConstant.OK);
    } catch (Exception e) {
      log.error("ERROR - no se pudo guardar la encuesta {}", e);
      status.setCode(CommonConstant.CODE_500);
      status.setDescription(CommonConstant.ERROR_SAVE);
    }
    return status;
  }
}
