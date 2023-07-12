package br.com.customer.entities;

import jakarta.persistence.Embeddable;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Embeddable
public class Address {

    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
  
  public Address(Address address) {
    this.cep = address.getCep();
    this.logradouro = address.getLogradouro();
    this.numero = address.getNumero();
    this.complemento = address.getComplemento();
    this.bairro = address.getBairro();
    this.localidade = address.getLocalidade();
    this.uf = address.getUf();
  }
}
