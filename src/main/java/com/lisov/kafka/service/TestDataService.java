package com.lisov.kafka.service;

import com.lisov.kafka.model.test.DataTestOptions;

public interface TestDataService {

  void sendMessages(DataTestOptions testOptions);
}
