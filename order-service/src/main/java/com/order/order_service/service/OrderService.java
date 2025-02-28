package com.order.order_service.service;


import com.order.order_service.entity.Order;
import com.order.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Save new order
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    // Get all orders by user ID
    public List<Order> getOrdersByUserId(Long userId) {
        return orderRepository.findByUserId(userId);
    }
}
