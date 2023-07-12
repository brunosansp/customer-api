package br.com.customer.entities;

import br.com.customer.dtos.CustomerRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "tb_customer")
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String uuid;

    @CPF @NotBlank
    private String cpf;

    @NotBlank
    private String name;

    @Email @NotBlank
    private String email;

    @NotBlank
    private String phone;

    @Embedded
    private Address address;
    
    public Customer(CustomerRequest request) {
        this.uuid = UUID.randomUUID().toString();
        this.cpf = request.getCpf();
        this.name = request.getName();
        this.email = request.getEmail();
        this.phone = request.getPhone();
        this.address = new Address(request.getAddress());
    }
}
