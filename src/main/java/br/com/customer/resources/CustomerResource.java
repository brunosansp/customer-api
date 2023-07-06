package br.com.customer.resources;

import br.com.customer.entities.Customer;
import br.com.customer.repositories.ICustomerRepository;
import br.com.customer.service.impl.ICustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerResource {

    private final ICustomerService iCustomerService;

    public CustomerResource(ICustomerService iCustomerService) {
        this.iCustomerService = iCustomerService;
    }

    @GetMapping
    public List<Customer> list() {
        return iCustomerService.findAll();
    }

    @GetMapping("/find")
    public Customer findByCpf(@RequestParam("cpf") String cpf) {
        return iCustomerService.findByCpf(cpf);
    }

}
