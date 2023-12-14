package com.vargas.hexagonal.application.ports.in;

import com.vargas.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
