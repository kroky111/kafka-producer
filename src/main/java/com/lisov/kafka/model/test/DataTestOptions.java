package com.lisov.kafka.model.test;

import com.lisov.kafka.model.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {

  private int delayInSeconds;
  private Data.MeasurementType[] measurementTypes;

}
