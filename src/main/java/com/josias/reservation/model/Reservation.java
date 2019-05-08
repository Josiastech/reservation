package com.josias.reservation.model;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/*
Reservation representation
 */
@Data
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid2")
    private String idRes;
    @Temporal(TemporalType.DATE)
    private Date startReservationDate;
    @Temporal(TemporalType.DATE)
    private Date endReservationDate;
    private int numberOfGuest;
    private String Description;
    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client;
}
