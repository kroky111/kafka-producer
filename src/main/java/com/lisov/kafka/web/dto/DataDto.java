package com.lisov.kafka.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lisov.kafka.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class DataDto {

  private Long sensorId;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
  private LocalDateTime timestamp;

  private double measurement;
  private Data.MeasurementType measurementType;

}
