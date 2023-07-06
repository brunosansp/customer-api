package br.com.customer.service.impl;

import br.com.customer.entities.Customer;

import java.util.List;

public interface ICustomerService {

    List<Customer> findAll();

    Customer findByCpf(String cpf);
}
