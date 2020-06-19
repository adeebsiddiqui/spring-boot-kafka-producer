package com.ad.app.service;

import com.ad.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, String> simpleKafkaTemplate;

    @Autowired
    private KafkaTemplate<String, Laptop> jsonKafkaTemplate;

    @Value("${kafka.topic.simple}")
    private String simpleTopic;

    @Value("${kafka.topic.json}")
    private String jsonTopic;

    public void publishMessage(String message) {
        simpleKafkaTemplate.send(simpleTopic, message);
    }

    public void publishMessage(Laptop laptop) {
        jsonKafkaTemplate.send(jsonTopic, laptop);
    }
}
