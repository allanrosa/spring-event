package com.example.events.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Message {
    private UUID id;
    private String type;
    private String description;
}
