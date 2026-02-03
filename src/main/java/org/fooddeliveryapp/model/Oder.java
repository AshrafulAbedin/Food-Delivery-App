package org.fooddeliveryapp.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Oder {
    private String id;
    private String userId;
    private String restaurantId;
    private List<OrderItem>items;
    private OrderStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private double totalPrice;
    private String deliveryAddress;

    public Oder() {
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.status = OrderStatus.PENDING;
    }
    public void confirm()
    {
        if (this.status == OrderStatus.PENDING)
        {
            this.status = OrderStatus.CONFIRMED;
            this.updatedAt = LocalDateTime.now();
        }
    }
    public void cancel()
    {
        if (this.status == OrderStatus.CONFIRMED)
        {
            this.status = OrderStatus.CANCELLED;
            this.updatedAt = LocalDateTime.now();
        }
    }

    //getter
    public String getId() {
        return id;
    }
    public String getUserId() {
        return userId;
    }
    public String getRestaurantId() {
        return restaurantId;
    }
    public List<OrderItem> getItems() {
        return items;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    //setter
    public void setId(String id) {
        this.id = id;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }
    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}

