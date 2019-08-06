package com.example.events.listener;

import com.example.events.MessageEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MessageEventListener1 implements ApplicationListener<MessageEvent> {

    @Override
    public void onApplicationEvent(MessageEvent event) {
        System.out.println("Received event in first listener  - " + event.getMessage().getId());
    }
}
