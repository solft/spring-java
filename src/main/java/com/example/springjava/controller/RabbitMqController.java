package com.example.springjava.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbit")
@PropertySource("classpath:rabbitmq.properties")
public class RabbitMqController {

    @Value("${rabbitmq.host}")
    private String host;

//    private ConnectionFactory connectionFactory = new CachingConnectionFactory();
//    private AmqpAdmin admin = new RabbitAdmin(connectionFactory);
//    private AmqpTemplate template = new RabbitTemplate(connectionFactory);
//
//    @GetMapping("/producer")
//    public String produceMessage() {
//
//        admin.declareQueue(new Queue("myqueue"));
//        template.convertAndSend("myqueue", "foo");
//
//        return "Produce Message";
//    }
//
//    @GetMapping("/consumer")
//    public String consumeMessage() {
//        String foo = (String) template.receiveAndConvert("myqueue");
//
//        return foo;
//    }

    @GetMapping("/test")
    public String test() {
        return host;
    }
}
