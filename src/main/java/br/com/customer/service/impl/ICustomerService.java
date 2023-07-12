package br.com.customer.service.impl;

import br.com.customer.dtos.CustomerResponse;
import br.com.customer.entities.Customer;

import java.util.List;

public interface ICustomerService {

    List<CustomerResponse> findAll();

    CustomerResponse findByCpf(String cpf);
}
