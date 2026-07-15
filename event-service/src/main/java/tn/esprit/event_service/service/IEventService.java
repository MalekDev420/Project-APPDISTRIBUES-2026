package tn.esprit.event_service.service;

import tn.esprit.event_service.entity.Event;

import java.util.List;

public interface IEventService {

    Event addEvent(Event event);

    List<Event> getAllEvents();

    Event getEventById(Long id);

    Event updateEvent(Event event);

    void deleteEvent(Long id);
}