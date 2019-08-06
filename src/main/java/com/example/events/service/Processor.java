package com.example.events.service;

import com.example.events.model.Message;
import com.example.events.MessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class Processor implements MessageProcessor {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public Message processMessage(Message message) {

        System.out.println("Message with id "+message.getId()+" was processed");
        MessageEvent messageEvent = new MessageEvent(this, message);
        System.out.println("Publishing new messageEvent...");
        applicationEventPublisher.publishEvent(messageEvent);

        return message;
    }
}
