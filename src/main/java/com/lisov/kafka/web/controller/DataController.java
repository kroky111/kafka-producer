package com.lisov.kafka.web.controller;

import com.lisov.kafka.model.Data;
import com.lisov.kafka.model.test.DataTestOptions;
import com.lisov.kafka.service.KafkaDataService;
import com.lisov.kafka.service.TestDataService;
import com.lisov.kafka.web.dto.DataDto;
import com.lisov.kafka.web.dto.DataTestOptionsDto;
import com.lisov.kafka.web.mapper.DataMapper;
import com.lisov.kafka.web.mapper.DataTestOptionsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

  private final KafkaDataService kafkaDataService;
  private final TestDataService testDataService;

  private final DataMapper dataMapper;
  private final DataTestOptionsMapper dataTestOptionsMapper;

  @PostMapping("/send")
  public void send(@RequestBody DataDto dataDto) {
    Data data = dataMapper.toEntity(dataDto);
    kafkaDataService.send(data);
  }

  @PostMapping("/test/send")
  public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {
    DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
    testDataService.sendMessages(testOptions);
  }

  public static void main(String[] args) {
    System.out.println(isPolindrome(121));
    System.out.println(isPolindrome(122));
  }

  private static boolean isPolindrome(int number) {
    if (number < 0) {
      return false;
    }

    int temp = number;
    int reversed = 0;

    while (temp != 0) {
      int digit = temp % 10;
      reversed = reversed * 10 + digit;
      temp /=10;
    }

    return reversed == number;

  }

}
