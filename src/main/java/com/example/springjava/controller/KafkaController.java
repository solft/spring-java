package com.example.springjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class KafkaController {

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Autowired
    KafkaTemplate kafkaTemplate;

    @RequestMapping(value="/get")
    public String getData(@RequestParam(value = "message", required = true, defaultValue = "") String message) {
        LocalDateTime date = LocalDateTime.now();
        String dateStr = date.format(fmt);

        kafkaTemplate.send("mytopic", dateStr + " " + message);
        return "kafkaTemplate.send >> " + message;
    }
}
