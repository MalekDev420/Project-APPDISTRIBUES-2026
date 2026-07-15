package tn.esprit.notification_service.service;

import tn.esprit.notification_service.entity.Notification;

import java.util.List;

public interface INotificationService {

    Notification save(Notification notification);

    List<Notification> findAll();
}