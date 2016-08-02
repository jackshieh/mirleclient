package com.shenghsiang.api.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Item implements Serializable {
	private static final long serialVersionUID = -6025097010191618117L;
	@JsonProperty("rowNum")
	private String rowNum;
	@JsonProperty("description")
	private String description;
	@JsonProperty("quantity")
	private double quantity;
	@JsonProperty("unitPrice")
	private double unitPrice;
	@JsonProperty("amount")
	private double amount;
	
	public String getRowNum() {
		return rowNum;
	}
	public void setRowNum(String rowNum) {
		this.rowNum = rowNum;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
