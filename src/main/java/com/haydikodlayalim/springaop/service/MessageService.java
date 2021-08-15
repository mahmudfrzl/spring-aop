package com.haydikodlayalim.springaop.service;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String sendMessage(String message){
        System.out.println("Message Sent " +message);
        return message;
    }
}
