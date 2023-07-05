package br.com.customer.resources;

import br.com.customer.entities.Customer;
import br.com.customer.repositories.ICustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerResource {

    private final ICustomerRepository iCustomerRepository;

    public CustomerResource(ICustomerRepository iCustomerRepository) {
        this.iCustomerRepository = iCustomerRepository;
    }

    @GetMapping
    public List<Customer> list() {
        return iCustomerRepository.findAll();
    }
}
