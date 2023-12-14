package com.vargas.hexagonal.adapters.in.consumer.mapper;

import com.vargas.hexagonal.adapters.in.consumer.message.CustomerMessage;
import com.vargas.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
