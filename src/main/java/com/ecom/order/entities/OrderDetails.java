package com.ecom.order.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class OrderDetails {

    @Id
    private Long id;
	private Long orderId;
    private Long productId;
    private Long productPrice;
    private Long quantity;
    private Long discount;
    private Boolean active;
    
    
    
    public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getOrderId() {
		return orderId;
	}



	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}



	public Long getProductId() {
		return productId;
	}



	public void setProductId(Long productId) {
		this.productId = productId;
	}



	public Long getProductPrice() {
		return productPrice;
	}



	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}



	public Long getQuantity() {
		return quantity;
	}



	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}



	public Long getDiscount() {
		return discount;
	}



	public void setDiscount(Long discount) {
		this.discount = discount;
	}



	public Boolean getActive() {
		return active;
	}



	public void setActive(Boolean active) {
		this.active = active;
	}



	@Override
    public String toString() {
        return "OrderDetails{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", productPrice=" + productPrice +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", active=" + active +
                '}';
    }
}
