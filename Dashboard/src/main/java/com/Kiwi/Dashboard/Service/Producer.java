package com.Kiwi.Dashboard.Service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
    private static final String TOPIC = "test_topic";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {

        kafkaTemplate.send(TOPIC, message)
                .thenAccept(result -> {
                    // message sent successfully
                    System.out.println("Message sent successfully to topic "
                            + result.getRecordMetadata().topic()
                            + " partition " + result.getRecordMetadata().partition()
                            + " offset " + result.getRecordMetadata().offset());
                })
                .exceptionally(ex -> {
                    // message failed to send
                    System.err.println("Failed to send message: " + ex.getMessage());
                    return null;
                });
    }

    @Bean
    public NewTopic createTopic() {

        return new NewTopic(TOPIC, 3, (short) 1);
    }

}
