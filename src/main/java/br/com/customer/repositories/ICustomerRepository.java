package br.com.customer.repositories;

import br.com.customer.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, String> {
    Optional<Customer> findByCpf(String cpf);
}