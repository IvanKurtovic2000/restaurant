package com.pwc.digispace.restaurant.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Booking implements Serializable {
	
	private int id;
	private int tablenumber;
	private List <Product> productList = new ArrayList<Product>();
	
	public Booking() {
		
	}
	
	public Booking(int id, int tablenumber) {
		super();
		this.id = id;
		this.tablenumber = tablenumber;
	}

	public Booking(int tablenumber) {
		super();
		this.tablenumber = tablenumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTablenumber() {
		return tablenumber;
	}

	public void setTablenumber(int tablenumber) {
		this.tablenumber = tablenumber;
	}
	
	
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", tablenumber=" + tablenumber + "]";
	}

}
