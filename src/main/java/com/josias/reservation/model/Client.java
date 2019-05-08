package com.josias.reservation.model;

import lombok.Data;
import java.util.*;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

/**
 * Client table representation
 */
@Data
@Entity
@Table(name = "client")
@NamedQuery(name = "client.findByIdentification", query="Select c from client where c.idCard = ?1")
public class Client {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String idClient;
    private String nameCli;
    private String lastNameCli;
    private String idCard;
    private String address;
    private String phone;
    private String email;
    @OneToMany(mappedBy = "client")
    private Set<Reservation> reservation;

    public Client() {
    }
}
