package com.Kiwi.Dashboard.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Transaction {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long transactionId;
    public String merchantId;
    public String orderId;
    public Double amount;
    public String customerId;
}
