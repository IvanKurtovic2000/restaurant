package com.pwc.digispace.restaurant.service;

import com.pwc.digispace.restaurant.dao.ProductDAO;
import com.pwc.digispace.restaurant.entities.Product;

public class ProductService {
	
	private ProductDAO pDao;
	
	public void createProduct(Product product) {
		pDao.createProduct(product);
	}
	
	

}
