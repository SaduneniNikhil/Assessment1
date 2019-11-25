package com.example.demo;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="sub_product")
public class SubProduct {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private String productName;
	
	@Column
	private String subProductName;
	@Column
	private double subProductCost;
	
	@Column
	private LocalDate subProductFromDate;

	@Column
	private LocalDate subProductThruDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSubProductName() {
		return subProductName;
	}

	public void setSubProductName(String subProductName) {
		this.subProductName = subProductName;
	}

	public double getSubProductCost() {
		return subProductCost;
	}

	public void setSubProductCost(double subProductCost) {
		this.subProductCost = subProductCost;
	}

	public LocalDate getSubProductFromDate() {
		return subProductFromDate;
	}

	public void setSubProductFromDate(LocalDate subProductFromDate) {
		this.subProductFromDate = subProductFromDate;
	}

	public LocalDate getSubProductThruDate() {
		return subProductThruDate;
	}

	public void setSubProductThruDate(LocalDate subProductThruDate) {
		this.subProductThruDate = subProductThruDate;
	}

}
