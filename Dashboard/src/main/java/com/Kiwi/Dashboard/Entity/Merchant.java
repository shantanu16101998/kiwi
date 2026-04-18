package com.Kiwi.Dashboard.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Merchant {
    @Id
    public String merchantId;
    public String merchantName;
    public LocalDateTime dateCreated;
    
}