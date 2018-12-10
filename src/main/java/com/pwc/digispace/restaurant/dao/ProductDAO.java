package com.pwc.digispace.restaurant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.pwc.digispace.restaurant.entities.Product;

public class ProductDAO {

	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;

	public ProductDAO() {
	}

	private Connection getConnection() throws SQLException {
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
		return conn;
	}

	public void createProduct(Product product) {
		try {
			String queryString = "INSERT INTO PRODUCT(ID, NAME, DESCRIPTION, PRICE, CATEGORY, CREATIONDATE) VALUES(?,?,?,?,?,?)";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setInt(1, product.getId());
			ptmt.setString(2, product.getName());
			ptmt.setString(3, product.getDescription());
			ptmt.setLong(4, product.getPrice());
			ptmt.setString(5, product.getCategory());
			ptmt.setTimestamp(6, product.getCreationdate());
			ptmt.executeUpdate();
			System.out.println("Data Added Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

}
