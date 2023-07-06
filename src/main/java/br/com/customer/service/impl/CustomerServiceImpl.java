package br.com.customer.service.impl;

import br.com.customer.entities.Customer;
import br.com.customer.repositories.ICustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    private final ICustomerRepository iCustomerRepository;

    public CustomerServiceImpl(ICustomerRepository iCustomerRepository) {
            this.iCustomerRepository = iCustomerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }

    @Override
    public Customer findByCpf(String cpf) {
        return iCustomerRepository.findByCpf(cpf);
    }
}
