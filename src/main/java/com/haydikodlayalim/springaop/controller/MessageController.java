package com.haydikodlayalim.springaop.controller;

import com.haydikodlayalim.springaop.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;
    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        return ResponseEntity.ok(messageService.sendMessage(message));
    }
}
