package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Set;
import javax.persistence.CascadeType;

@Entity
@Table(name = "product")
public class MainProduct {
	@Id
	@GeneratedValue
	private int id;

	@Column
	private String name;

	@Column
	private double cost;

	@Column
	private LocalDate fromDate;

	@Column
	private LocalDate thruDate;
	
	@OneToMany(mappedBy = "productName", cascade = CascadeType.ALL)
	private Set<SubProduct> subProducts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public LocalDate getFromDate() {
		return fromDate;
	}

	public void setFromDate(LocalDate fromDate) {
		this.fromDate = fromDate;
	}

	public LocalDate getThruDate() {
		return thruDate;
	}

	public void setThruDate(LocalDate thruDate) {
		this.thruDate = thruDate;
	}

	@Override
	public String toString() {
		return "MainProduct [id=" + id + ", name=" + name + ", cost=" + cost + ", fromDate=" + fromDate + ", thruDate="
				+ thruDate + "]";
	}
	public MainProduct(int id, String name, double cost, LocalDate fromDate, LocalDate thruDate) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.fromDate = fromDate;
		this.thruDate = thruDate;
		
	}

	public MainProduct() {
		
	}
	public MainProduct( String name, double cost, LocalDate fromDate, LocalDate thruDate) {
		super();
		this.name = name;
		this.cost = cost;
		this.fromDate = fromDate;
		this.thruDate = thruDate;
	}

}
