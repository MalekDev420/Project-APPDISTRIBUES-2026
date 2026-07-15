package tn.esprit.notification_service.service;

import org.springframework.stereotype.Service;
import tn.esprit.notification_service.entity.Notification;
import tn.esprit.notification_service.repository.NotificationRepository;

import java.util.List;

@Service
public class NotificationServiceImpl implements INotificationService {

    private final NotificationRepository repository;

    public NotificationServiceImpl(NotificationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Notification save(Notification notification) {
        return repository.save(notification);
    }

    @Override
    public List<Notification> findAll() {
        return repository.findAll();
    }
}