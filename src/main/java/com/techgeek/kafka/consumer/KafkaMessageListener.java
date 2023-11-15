package com.techgeek.kafka.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);
    @KafkaListener(topics="techgeek-topic", groupId = "geek-cons-grp-4")
    public String consumer1(String message){
        log.info("consumer1 consumed message {}", message);
        return "successfully consumed";
    }

    @KafkaListener(topics="techgeek-topic", groupId = "geek-cons-grp-4")
    public String consumer2(String message){
        log.info("consumer2 consumed message {}", message);
        return "successfully consumed";
    }

    @KafkaListener(topics="techgeek-topic", groupId = "geek-cons-grp-4")
    public String consumer3(String message){
        log.info("consumer3 consumed message {}", message);
        return "successfully consumed";
    }

    @KafkaListener(topics="techgeek-topic", groupId = "geek-cons-grp-4")
    public String consumer4(String message){
        log.info("consumer4 consumed message {}", message);
        return "successfully consumed";
    }

    @KafkaListener(topics="techgeek-topic", groupId = "geek-cons-grp-4")
    public String consumer5(String message){
        log.info("consumer5 consumed message {}", message);
        return "successfully consumed";
    }
}