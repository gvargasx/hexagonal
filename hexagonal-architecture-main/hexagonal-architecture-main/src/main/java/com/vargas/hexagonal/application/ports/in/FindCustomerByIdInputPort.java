package com.vargas.hexagonal.application.ports.in;

import com.vargas.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
