package io.invoicemanager.invoicemanager.service.implementation;

import io.invoicemanager.invoicemanager.domain.UserEvent;
import io.invoicemanager.invoicemanager.enumeration.EventType;
import io.invoicemanager.invoicemanager.repository.EventRepository;
import io.invoicemanager.invoicemanager.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    @Override
    public Collection<UserEvent> getEventsByUserId(Long userId) {
        return eventRepository.getEventsByUserId(userId);
    }

    @Override
    public void addUserEvent(String email, EventType eventType, String device, String ipAddress) {
        eventRepository.addUserEvent(email, eventType, device, ipAddress);
    }

    @Override
    public void addUserEvent(Long userId, EventType eventType, String device, String ipAddress) {

    }
}
