package com.vargas.hexagonal.application.ports.out;

import com.vargas.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
