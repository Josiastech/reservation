package com.josias.reservation.repository;

import com.josias.reservation.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
    @Query("select r from Reservation r where r.startReservationDate >=: " +
            "startReservationDate and r.endReservationDate <=: endReservationDate")
    public List<Reservation> find(@Param("startReservationDate")
                                              Date startReservationDate,
                                  @Param("endReservationDate") Date endReservationDate);
}
