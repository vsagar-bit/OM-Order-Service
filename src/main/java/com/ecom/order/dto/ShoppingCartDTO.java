package com.ecom.order.dto;

import java.util.Date;
import java.util.List;

public class ShoppingCartDTO {

	private Long customerId;
	private String sessionId;
	private Date date;
	private List<ProductDetailsDTO> productsList;
	private CheckoutDetailsDTO checkoutDetails;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
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
	
	public List<ProductDetailsDTO> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<ProductDetailsDTO> productsList) {
		this.productsList = productsList;
	}

	public CheckoutDetailsDTO getCheckoutDetails() {
		return checkoutDetails;
	}

	public void setCheckoutDetails(CheckoutDetailsDTO checkoutDetails) {
		this.checkoutDetails = checkoutDetails;
	}

	@Override
	public String toString() {
		return "ShoppingCart{" + ", sessionId='" + sessionId + '\'' + ", date=" + date + "}";
	}
}
