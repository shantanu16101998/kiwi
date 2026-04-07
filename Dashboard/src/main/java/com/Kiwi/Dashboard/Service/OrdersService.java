
package com.Kiwi.Dashboard.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Kiwi.Dashboard.Entity.Orders;

import com.Kiwi.Dashboard.Repository.OrdersRepository;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository OrdersRepository;

    public List<Orders> getAllOrderss() {
        return OrdersRepository.findAll();
    }

    public List<Orders> getByMerchantId(String merchantId) {
        return OrdersRepository.findByMerchantId(merchantId);
    }

}
