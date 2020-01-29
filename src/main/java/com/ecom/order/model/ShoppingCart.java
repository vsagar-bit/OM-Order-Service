package com.ecom.order.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class ShoppingCart {

    @Id
    private long orderId;
    private String sessionId;
    private Date date;
    private long productId;
    private int quantity;
    private double price;
    private boolean active;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + orderId +
                ", sessionId='" + sessionId + '\'' +
                ", date=" + date +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", active=" + active +
                '}';
    }
}
