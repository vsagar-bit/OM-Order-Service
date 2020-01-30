package com.ecom.order.dto;

public class ProductDetailsDTO {

	private Long productId;
	private Long productPrice;
	private Long quantity;
	private Long discount;

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

	@Override
	public String toString() {
		return "OrderDetails{" +" productId=" + productId + ", productPrice=" + productPrice
				+ ", quantity=" + quantity + ", discount=" + discount  +"}";
	}
}
