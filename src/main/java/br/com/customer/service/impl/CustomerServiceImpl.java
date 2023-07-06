package br.com.customer.service.impl;

import br.com.customer.dtos.CustomerResponse;
import br.com.customer.entities.Customer;
import br.com.customer.exceptions.NotFoundCustomerException;
import br.com.customer.repositories.ICustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements ICustomerService {

    private final ICustomerRepository iCustomerRepository;

    public CustomerServiceImpl(ICustomerRepository iCustomerRepository) {
            this.iCustomerRepository = iCustomerRepository;
    }

    @Override
    public List<CustomerResponse> findAll() {
        List<Customer> result = iCustomerRepository.findAll();
        return result.stream().map(CustomerResponse::new).collect(Collectors.toList());
    }

    @Override
    public CustomerResponse findByCpf(String cpf) {
        return new CustomerResponse(iCustomerRepository.findByCpf(cpf).orElseThrow(NotFoundCustomerException::new));
    }
}
