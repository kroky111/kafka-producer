package com.lisov.kafka.service;

import com.lisov.kafka.model.Data;

public interface KafkaDataService {
  void send(Data data);
}
