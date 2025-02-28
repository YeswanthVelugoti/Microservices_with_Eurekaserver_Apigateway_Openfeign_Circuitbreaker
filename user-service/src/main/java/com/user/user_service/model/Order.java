package com.user.user_service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)  // Prevents JSON parsing errors if extra fields exist
public class Order {
    private Long id;
    private Long userId;
    private String productName;
    private Double amount;
    private LocalDateTime orderDate;
    
    public Long getId() { return id; }
    public Long getUserId() { return userId; }
    public String getProductName() { return productName; }
    public Double getAmount() { return amount; }
    public LocalDateTime getOrderDate() { return orderDate; }
}
