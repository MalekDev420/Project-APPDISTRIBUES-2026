package tn.esprit.event_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.event_service.entity.Event;

public interface EventRepository extends JpaRepository<Event, Long> {

}