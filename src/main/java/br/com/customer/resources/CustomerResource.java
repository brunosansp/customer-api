package br.com.customer.resources;

import br.com.customer.entities.Customer;
import br.com.customer.repositories.ICustomerRepository;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/find")
    public Customer findByCpf(@RequestParam("cpf") String cpf) {
        return iCustomerRepository.findByCpf(cpf);
    }

}
