
package com.Kiwi.Dashboard.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class KpiSnapshot {
    @Id
    private String merchantId;
    private Double totalPaymentVolume;
    private Double totalSuccessTransactions;
    private Double totalTransactions;
    private Double totalOrders;
    private Double totalOrdersVolume;
    private Double totalSuccessPaymentVolume;
}
