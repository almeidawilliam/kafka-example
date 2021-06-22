package com.study.personal.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer implements CommandLineRunner {

    @Autowired
    private KafkaTemplate<String, MessageTest> kafkaTemplate;

    @Override
    public void run(String... args) {
        var message = new MessageTest(1L, "a message");
        kafkaTemplate.send("test", message);
    }
}
