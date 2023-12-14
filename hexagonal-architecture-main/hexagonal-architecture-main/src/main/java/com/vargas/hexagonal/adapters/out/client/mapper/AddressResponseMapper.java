package com.vargas.hexagonal.adapters.out.client.mapper;

import com.vargas.hexagonal.adapters.out.client.response.AddressResponse;
import com.vargas.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
