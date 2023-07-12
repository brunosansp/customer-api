package br.com.customer.dtos;

import br.com.customer.entities.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.ToString;
import org.hibernate.validator.constraints.br.CPF;

@Data
@ToString
public class CustomerRequest {

    @CPF @NotBlank
    private String cpf;

    @NotBlank
    private String name;

    @Email @NotBlank
    private String email;

    @NotBlank
    private String phone;

    private Address address;
}
