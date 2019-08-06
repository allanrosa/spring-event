package com.example.events.listener;

import com.example.events.MessageEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MessageEventListener2 implements ApplicationListener<MessageEvent> {

    @Override
    public void onApplicationEvent(MessageEvent event) {
        System.out.println("Received event in second listener - " + event.getMessage().getId());
    }
}
