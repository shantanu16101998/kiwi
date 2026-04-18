package com.Kiwi.Dashboard.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Orders {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private String merchantId;
    private Double amount;
    private String customerId;
    private String status;
    private LocalDateTime dateCreated;
    private String currency;
}
