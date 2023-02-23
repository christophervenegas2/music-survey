package com.backend.backsurvey.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.backsurvey.dao.ISurveyDao;
import com.backend.backsurvey.model.entity.Survey;
import com.backend.backsurvey.service.ISurveyService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class SurveyImpl implements ISurveyService {

  @Autowired
  private ISurveyDao surveyDao;

  public List<Survey> getListSurvey() {
    List<Survey> listSurveyAnswers = surveyDao.findAll();
    return listSurveyAnswers;
  }

  public Survey saveSurvey(Survey surveyData) {
    Survey listSurveyAnswers = surveyDao.save(surveyData);
    return listSurveyAnswers;
  }
}
