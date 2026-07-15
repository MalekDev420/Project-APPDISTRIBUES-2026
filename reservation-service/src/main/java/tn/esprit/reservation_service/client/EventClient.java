package tn.esprit.reservation_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.reservation_service.dto.Event;

@FeignClient(name = "EVENT-SERVICE")
public interface EventClient {

    @GetMapping("/events/{id}")
    Event getEventById(@PathVariable Long id);

}