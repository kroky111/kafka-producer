package com.lisov.kafka.web.dto;

import com.lisov.kafka.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDto {

  private int delayInSeconds;
  private Data.MeasurementType[] measurementTypes;

}
