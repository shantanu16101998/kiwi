
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
        System.out.println("Fetching all orders...");
        System.out.println(OrdersRepository.findAll());
        return OrdersRepository.findAll();
    }

}
