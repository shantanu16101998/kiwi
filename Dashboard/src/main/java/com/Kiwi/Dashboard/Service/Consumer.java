package com.Kiwi.Dashboard.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.Kiwi.Dashboard.Entity.Orders;
import com.Kiwi.Dashboard.Entity.PublishMessageRequest;
import com.Kiwi.Dashboard.Entity.Transaction;
import com.Kiwi.Dashboard.Repository.OrdersRepository;
import com.Kiwi.Dashboard.Repository.TransactionRepository;

import tools.jackson.databind.ObjectMapper;

@Service
public class Consumer {

    private ObjectMapper objectMapper = new ObjectMapper();
    
    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private TransactionRepository transactionRepository;


    
    /* this ideally should be done in txn service */
    public void insertToDB(PublishMessageRequest publishMessageRequest) {

        if (publishMessageRequest.orders != null) {

            Orders order = new Orders();
            order.setAmount(publishMessageRequest.orders.getAmount());
            order.setCustomerId(publishMessageRequest.orders.getCustomerId());
            order.setMerchantId(publishMessageRequest.orders.getMerchantId());
            order.setOrderId(publishMessageRequest.orders.getOrderId());
            ordersRepository.save(order);
        }
        else if (publishMessageRequest.transaction != null) {
            Transaction transaction = new Transaction();

            transaction.setAmount(publishMessageRequest.transaction.getAmount());
            transaction.setCustomerId(publishMessageRequest.transaction.getCustomerId());
            transaction.setMerchantId(publishMessageRequest.transaction.getMerchantId());
            transaction.setTransactionId(publishMessageRequest.transaction.getTransactionId());
            transaction.setOrderId(publishMessageRequest.transaction.getOrderId());
            transactionRepository.save(transaction);

        }

    }

    @KafkaListener(topics = "test_topic", groupId = "group_id")
    public void consumeMessage(String message) {

        // User user = objectMapper.readValue(json, User.class);

        PublishMessageRequest publishMessageRequest = objectMapper.readValue(message, PublishMessageRequest.class);

        insertToDB(publishMessageRequest);

        System.out.println("Consumer received message:" + objectMapper.writeValueAsString(publishMessageRequest));
    }
}