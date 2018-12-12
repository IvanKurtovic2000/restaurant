package com.pwc.digispace.restaurant;

import java.util.Calendar;

import com.pwc.digispace.restaurant.dao.ProductDAO;
import com.pwc.digispace.restaurant.entities.Product;

public class App {
	public static void main(String[] args) {

		// create a java timestamp object that represents the current time (i.e., a
		// "current timestamp") Calendar calendar = Calendar.getInstance();
		Calendar calendar = Calendar.getInstance();
		java.sql.Timestamp ourJavaTimestampObject = new java.sql.Timestamp(calendar.getTime().getTime());

		ProductDAO product = new ProductDAO();
		Product hamburger = new Product(9, "Hamburger", "Saftiger Hamburger mit Pommes", 15L, "Fastfood",
				ourJavaTimestampObject);

		Product pommes = new Product(7, "Pommes", "leckere Pommes", 5L, "Fastfood", ourJavaTimestampObject);

		// Create a Product in the Database product.createProduct(hamburger);

		// Delete a Product in the Database with the help of the ID
		product.deleteProduct(9);

		// Finds all Products in the Database product.findAllProducts();

		// Update a Product by ID product.updateProduct(pommes);

		// Finds all Products in the Database product.findAllProducts();

		// Finds a Product in the Database by ID product.findProductById(2);

	}
}
