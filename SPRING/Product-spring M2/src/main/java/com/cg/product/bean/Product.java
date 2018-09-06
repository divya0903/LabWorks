package com.cg.product.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Class: Product
 * Number of attributes: 4
 * @author gudivya
 * Date of Creation:08/08/2018
 */
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
public class Product {

	@Id private String id;
	private String name;
	private String model;
	private double price;
	private String date;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
