package com.vargas.hexagonal.application.ports.out;

import com.vargas.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipcode);

}
