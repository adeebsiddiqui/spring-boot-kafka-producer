package com.ad.app.controller;

import com.ad.app.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-kafka-producer")
public class SpringAppController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/simple-message")
    public ResponseEntity<Void> publishStringMessage(@RequestBody String message) {
        kafkaProducer.publishMessage(message);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
