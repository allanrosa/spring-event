package com.example.events.controller;

import com.example.events.model.Message;
import com.example.events.service.MessageProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    MessageProcessor processor;

    @PostMapping(value = "/process")
    public ResponseEntity<Message> processMessage(@RequestBody Message message){
        Message processedMessage = processor.processMessage(message);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(processedMessage, headers, HttpStatus.CREATED);
    }
}
