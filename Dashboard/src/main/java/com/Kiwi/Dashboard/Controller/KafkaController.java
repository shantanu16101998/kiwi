package com.Kiwi.Dashboard.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Kiwi.Dashboard.Entity.PublishMessageRequest;
import com.Kiwi.Dashboard.Service.Producer;

import tools.jackson.databind.ObjectMapper;

/* not explicity needed just for testing the producer */
@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private Producer producer;
    private ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public void TestController(Producer producer) {
        this.producer = producer;
    }

    @PostMapping("/publish")
    public void publishMessage(@RequestBody PublishMessageRequest publishMessageRequest) {

        this.producer.sendMessage(objectMapper.writeValueAsString(publishMessageRequest));

    }

}
