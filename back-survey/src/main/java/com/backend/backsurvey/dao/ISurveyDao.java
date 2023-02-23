package com.backend.backsurvey.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.backend.backsurvey.model.entity.Survey;

public interface ISurveyDao extends CrudRepository<Survey, Long> {
  List<Survey> findAll();
}
