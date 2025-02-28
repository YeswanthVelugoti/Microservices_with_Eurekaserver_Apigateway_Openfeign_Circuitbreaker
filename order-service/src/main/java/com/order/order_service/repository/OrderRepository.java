package com.order.order_service.repository;

import com.order.order_service.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    // Find all orders by userId
    List<Order> findByUserId(Long userId);
}
