package tn.esprit.reservation_service.service;

import tn.esprit.reservation_service.entity.Reservation;

import java.util.List;

public interface IReservationService {

    Reservation addReservation(Reservation reservation);

    List<Reservation> getAllReservations();

    Reservation getReservationById(Long id);

    Reservation updateReservation(Reservation reservation);

    void deleteReservation(Long id);

}