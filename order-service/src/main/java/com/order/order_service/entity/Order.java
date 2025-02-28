package com.order.order_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders") // Table name in SQL Server
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment primary key
    private Long id;

    @Column(nullable = false) 
    private Long userId; // ID of the user placing the order

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private Double amount;

    private LocalDateTime orderDate;

    @PrePersist
    public void setOrderDate() {
        this.orderDate = LocalDateTime.now();
    }

    // Explicit Getters and Setters (in case Lombok is not working)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }
}
