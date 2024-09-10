package com.lisov.kafka.web.mapper;

import com.lisov.kafka.model.Data;
import com.lisov.kafka.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
