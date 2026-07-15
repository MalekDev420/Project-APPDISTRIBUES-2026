package tn.esprit.reservation_service.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String clientName;

    // ID de l'événement provenant du microservice Event
    private Long eventId;

    private Integer numberOfSeats;

    private LocalDate reservationDate;

    public Reservation() {
    }

    public Reservation(Long id, String clientName, Long eventId,
                       Integer numberOfSeats, LocalDate reservationDate) {
        this.id = id;
        this.clientName = clientName;
        this.eventId = eventId;
        this.numberOfSeats = numberOfSeats;
        this.reservationDate = reservationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }
}