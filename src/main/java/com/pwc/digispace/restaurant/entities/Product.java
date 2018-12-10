package com.pwc.digispace.restaurant.entities;

import java.io.Serializable;
import java.sql.Timestamp;

public class Product implements Serializable {

	private int id;
	private String name;
	private String description;
	private Long price;
	private String category;
	private Timestamp creationdate;

	/*
	 * enum Category { VORSPEISE, HAUPTGERICHT, DESSERT }
	 * 
	 */

	public Product() {

	}

	public Product(int id, String name, String description, Long price, String category, Timestamp creationdate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
		this.creationdate = creationdate;
	}

	public Product(String name, String description, Long price, String category, Timestamp creationdate) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
		this.creationdate = creationdate;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Timestamp getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(Timestamp creationdate) {
		this.creationdate = creationdate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", category=" + category + ", creationdate=" + creationdate + "]";
	}

}
