package tn.esprit.notification_service.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.notification_service.entity.Notification;
import tn.esprit.notification_service.service.INotificationService;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final INotificationService service;

    public NotificationController(INotificationService service) {
        this.service = service;
    }

    @PostMapping
    public Notification save(@RequestBody Notification notification) {
        return service.save(notification);
    }

    @GetMapping
    public List<Notification> getAll() {
        return service.findAll();
    }
}