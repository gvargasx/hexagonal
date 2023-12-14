package com.vargas.hexagonal.application.ports.in;

import com.vargas.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
