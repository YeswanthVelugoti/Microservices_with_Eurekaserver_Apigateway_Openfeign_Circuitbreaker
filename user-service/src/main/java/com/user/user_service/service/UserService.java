package com.user.user_service.service;


import com.user.user_service.client.OrderClient;
import com.user.user_service.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private OrderClient orderClient; // Inject Feign Client

    public List<Order> getUserOrders(Long userId) {
        return orderClient.getOrdersByUserId(userId); // Call Order Service
    }
}
