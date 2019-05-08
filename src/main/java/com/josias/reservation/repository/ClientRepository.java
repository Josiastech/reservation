package com.josias.reservation.repository;

import com.josias.reservation.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, String> {
    public List<Client> findByLastName(String lastName);
    public Client findByIdentification(String idCard);
}
