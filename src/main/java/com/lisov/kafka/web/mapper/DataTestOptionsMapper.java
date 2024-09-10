package com.lisov.kafka.web.mapper;

import com.lisov.kafka.model.test.DataTestOptions;
import com.lisov.kafka.web.dto.DataTestOptionsDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
