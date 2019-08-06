package com.example.springjava.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:rabbitmq.properties")
public class RabbitMqConfiguration {
//
//    @Value("{rabbitmq.host}")
//    private String host;


}
