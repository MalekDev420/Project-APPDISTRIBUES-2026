package tn.esprit.reservation_service.dto;

import java.time.LocalDate;

public class Event {

    private Long id;
    private String eventName;
    private String location;
    private LocalDate eventDate;
    private Integer availableSeats;

    public Event() {
    }

    public Event(Long id, String eventName, String location, LocalDate eventDate, Integer availableSeats) {
        this.id = id;
        this.eventName = eventName;
        this.location = location;
        this.eventDate = eventDate;
        this.availableSeats = availableSeats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }
}