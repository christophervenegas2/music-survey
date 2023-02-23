package com.backend.backsurvey.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="survey_music")

public class Survey implements Serializable {
  
  private static final long serialVersionUID = -1;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String email;
  private String musicName;
  private String idMusic;
}
