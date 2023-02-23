package com.backend.backsurvey.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.backsurvey.mgr.ServiceMgr;
import com.backend.backsurvey.model.dto.SurveyResponseDto;
import com.backend.backsurvey.model.dto.StatusDto;
import com.backend.backsurvey.model.entity.Survey;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping(value = "/api/v1")
public class SurveyController {
  
  @Autowired
  private ServiceMgr service;

  protected static final Logger log = LoggerFactory.getLogger( SurveyController.class );

  @RequestMapping(value = "/survey", method = RequestMethod.GET)
  public ResponseEntity<SurveyResponseDto> listSurvey() {
    return new ResponseEntity<SurveyResponseDto>(service.getListSurvey() , HttpStatus.OK);
  }

  @RequestMapping(value = "/survey", method = RequestMethod.POST)
  public ResponseEntity<StatusDto> saveSurvey(@RequestBody Survey survey) {
    return new ResponseEntity<StatusDto>(service.saveSurvey(survey) , HttpStatus.OK);
  }

  // /**
  //  * @return
  //  */
  // @GetMapping("/categories")
  // public ResponseEntity<CategoryResponseRest> searchCategories() {
    
  //   ResponseEntity<CategoryResponseRest> response = service.search();
  //   return response;
  // }

  // /**
  //  * @param id
  //  * @return
  //  */
  // @GetMapping("/categories/{id}")
  // public ResponseEntity<CategoryResponseRest> searchCategoriesById(@PathVariable Long id) {
    
  //   ResponseEntity<CategoryResponseRest> response = service.searchById(id);
  //   return response;
  // }

  // /**
  //  * @param categories
  //  * @return
  //  */
  // @PostMapping("/categories")
  // public ResponseEntity<CategoryResponseRest> saveCategory(@RequestBody Category categories) {
    
  //   ResponseEntity<CategoryResponseRest> response = service.saveCategory(categories);
  //   return response;
  // }

  // @PutMapping("/categories/{id}")
  // public ResponseEntity<CategoryResponseRest> updateCategory(@PathVariable Long id, @RequestBody Category categories) {
    
  //   ResponseEntity<CategoryResponseRest> response = service.updateCategory(categories, id);
  //   return response;
  // }

  // @DeleteMapping("/categories/{id}")
  // public ResponseEntity<CategoryResponseRest> deleteCategory(@PathVariable Long id) {
    
  //   ResponseEntity<CategoryResponseRest> response = service.deleteCategory( id);
  //   return response;
  // }

}
