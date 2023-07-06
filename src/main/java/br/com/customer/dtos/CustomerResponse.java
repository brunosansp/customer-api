package br.com.customer.dtos;

import br.com.customer.entities.Address;
import br.com.customer.entities.Customer;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerResponse {

    private String cpf;
    private String name;
    private String email;
    private String phone;
    private Address address;

    public CustomerResponse(Customer customer) {
        this.cpf = customer.getCpf();
        this.name = customer.getName();
        this.email = customer.getEmail();
        this.phone = customer.getPhone();
        this.address = customer.getAddress();
    }
}