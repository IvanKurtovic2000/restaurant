package com.pwc.digispace.restaurant;


import com.pwc.digispace.restaurant.dao.ProductDAO;
import com.pwc.digispace.restaurant.entities.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ProductDAO product = new ProductDAO();
    	
    	Product hamburger = new Product();
    	hamburger.setId(11);
    	hamburger.setName("Hamburger");
    	hamburger.setDescription("Saftiger Hamburger mit Pommes");
    	hamburger.setPrice(14L);
    	hamburger.setCategory("Fastfood");
    	hamburger.setCreationdate(null);
    	
    	product.createProduct(hamburger);
    	
    	
    }
}
