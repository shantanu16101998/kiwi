package com.Kiwi.Dashboard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Kiwi.Dashboard.Entity.Orders;
import com.Kiwi.Dashboard.Service.OrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    
    @Autowired
    private OrdersService OrdersService;

    @GetMapping
    public List<Orders> getAllOrders() {
        System.out.println("Fetching all orders... in controller");
        System.out.println(OrdersService.getAllOrderss());
        return OrdersService.getAllOrderss();
    }

}
