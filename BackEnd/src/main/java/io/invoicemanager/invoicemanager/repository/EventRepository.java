package io.invoicemanager.invoicemanager.repository;

import io.invoicemanager.invoicemanager.domain.UserEvent;
import io.invoicemanager.invoicemanager.enumeration.EventType;

import java.util.Collection;


public interface EventRepository {
    Collection<UserEvent> getEventsByUserId(Long userId);
    void addUserEvent(String email, EventType eventType, String device, String ipAddress);
    void addUserEvent(Long userId, EventType eventType, String device, String ipAddress);
}
