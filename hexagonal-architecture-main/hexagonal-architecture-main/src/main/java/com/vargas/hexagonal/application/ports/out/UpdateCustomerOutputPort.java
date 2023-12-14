package com.vargas.hexagonal.application.ports.out;

import com.vargas.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);

}
