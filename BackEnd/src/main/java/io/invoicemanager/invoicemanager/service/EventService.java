package io.invoicemanager.invoicemanager.service;

import io.invoicemanager.invoicemanager.domain.UserEvent;
import io.invoicemanager.invoicemanager.enumeration.EventType;

import java.util.Collection;



public interface EventService {
    Collection<UserEvent> getEventsByUserId(Long userId);
    void addUserEvent(String email, EventType eventType, String device, String ipAddress);
    void addUserEvent(Long userId, EventType eventType, String device, String ipAddress);
}
