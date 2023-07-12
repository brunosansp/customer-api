package br.com.customer.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Entity
@Table(name = "tb_customer")
public class Customer {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

}
