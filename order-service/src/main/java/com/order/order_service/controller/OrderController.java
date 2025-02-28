package com.order.order_service.controller;

import com.order.order_service.entity.Order;
import com.order.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Create a new order
    @PostMapping
    public ResponseEntity<Order> placeOrder(@RequestBody Order order) {
   
    	System.out.println("Saving order: " + order);
    	Order savedOrder = orderService.saveOrder(order);
        return ResponseEntity.ok(savedOrder);
    }

    // Get all orders for a specific user
    @GetMapping("/user/{userId}")
    public List<Order> getOrdersByUserId(@PathVariable Long userId) {
        return orderService.getOrdersByUserId(userId);
    }
}
