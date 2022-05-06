package com.nttdata.demo.helper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductorKafka {

    /*injection kafka template*/
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    /*our topic name where message will be send*/
    private final String kafkaTopic = "topic";
    public void send(String message) {
        /*method to send the information to apache kafka*/
        kafkaTemplate.send(kafkaTopic, message);
    }
}
