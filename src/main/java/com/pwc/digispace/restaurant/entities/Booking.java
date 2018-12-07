package com.pwc.digispace.restaurant.entities;

public class Booking {
	
	private int id;
	private int tablenumber;
	
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

	@Override
	public String toString() {
		return "Booking [id=" + id + ", tablenumber=" + tablenumber + "]";
	}

}
