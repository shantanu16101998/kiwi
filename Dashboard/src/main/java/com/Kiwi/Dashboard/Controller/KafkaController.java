package com.Kiwi.Dashboard.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Kiwi.Dashboard.Service.Producer;

/* not explicity needed just for testing the producer */
@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private Producer producer;

    @Autowired
    public void TestController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/publish")
    public void publishMessage(@RequestParam(required = false) String message) {

        this.producer.sendMessage(message);

    }

}
