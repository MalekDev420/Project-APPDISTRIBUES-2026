package tn.esprit.notification_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.notification_service.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}