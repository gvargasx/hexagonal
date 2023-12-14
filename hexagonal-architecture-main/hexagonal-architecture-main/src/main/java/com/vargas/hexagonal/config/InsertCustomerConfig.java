package com.vargas.hexagonal.config;

import com.vargas.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.vargas.hexagonal.adapters.out.InsertCustomerAdapter;
import com.vargas.hexagonal.adapters.out.SendCpfForValidationAdapter;
import com.vargas.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }

}
