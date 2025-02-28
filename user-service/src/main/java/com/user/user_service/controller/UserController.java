package com.user.user_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.user.user_service.model.Order;
import com.user.user_service.service.UserService;

import java.util.List;
import java.util.Arrays;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;
	
    @GetMapping
    public List<String> getUsers() {
        return Arrays.asList("John Doe", "Jane Doe", "Alice", "Bob");
    }
        

        @GetMapping("/{userId}/orders")
        public List<Order> getUserOrders(@PathVariable Long userId) {
            return userService.getUserOrders(userId);
    }
}