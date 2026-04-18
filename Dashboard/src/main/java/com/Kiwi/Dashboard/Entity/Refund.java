package com.Kiwi.Dashboard.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Refund {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long refundId;
    
    public String merchantId;
    public String orderId;
    public Double amount;
    public String customerId;
    public String status;
    public LocalDateTime dateCreated;
    public String paymentMethod;
    public String gateway;
    public String currency;
    public String errorMessage;
}
