package com.example.events.service;

import com.example.events.model.Message;

public interface MessageProcessor {

    Message processMessage(Message message);
}
