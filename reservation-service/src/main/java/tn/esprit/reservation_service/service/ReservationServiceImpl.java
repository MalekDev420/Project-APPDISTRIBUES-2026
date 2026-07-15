package tn.esprit.reservation_service.service;

import org.springframework.stereotype.Service;
import tn.esprit.reservation_service.client.EventClient;
import tn.esprit.reservation_service.dto.Event;
import tn.esprit.reservation_service.entity.Reservation;
import tn.esprit.reservation_service.repository.ReservationRepository;

import java.util.List;

@Service
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository reservationRepository;
    private final EventClient eventClient;

    public ReservationServiceImpl(ReservationRepository reservationRepository,
                                  EventClient eventClient) {
        this.reservationRepository = reservationRepository;
        this.eventClient = eventClient;
    }

    @Override
    public Reservation addReservation(Reservation reservation) {

        // Vérifie que l'événement existe
        Event event = eventClient.getEventById(reservation.getEventId());

        if (event == null) {
            throw new RuntimeException("Event introuvable !");
        }

        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }
}