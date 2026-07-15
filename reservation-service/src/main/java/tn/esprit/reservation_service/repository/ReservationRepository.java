package tn.esprit.reservation_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.reservation_service.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}