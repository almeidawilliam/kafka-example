package com.study.personal.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {


    @KafkaListener(id = "my.test", topics = "test")
    public void listener(MessageTest messageTest) {
        System.out.println(messageTest.getId() + " - " + messageTest.getMensagem());
        System.out.println("--------------------------------------------------------------");
    }
}
