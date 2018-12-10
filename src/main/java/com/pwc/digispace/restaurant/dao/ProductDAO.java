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

	// Creates a new Product in the H2 Database
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

	
	// Updates a new Product in the H2 Database
	public void updateProduct(Product product) {

		try {
			String queryString = "UPDATE PRODUCT SET NAME=?, DESCRIPTION=?, PRICE=?, CATEGORY=?, CREATIONDATE=?  WHERE ID=?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			
			ptmt.setString(1, product.getName());
			ptmt.setString(2, product.getDescription());
			ptmt.setLong(3, product.getPrice());
			ptmt.setString(4, product.getCategory());
			ptmt.setTimestamp(5, product.getCreationdate());
			ptmt.setInt(6, product.getId());

			ptmt.executeUpdate();
			System.out.println("Table Updated Successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			}

			catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
	}
	  
	 

	// Deletes a new Product in the H2 Database using the ID
	public void deleteProduct(int id) {
		try {
			String queryString = "DELETE FROM PRODUCT WHERE ID=?";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			ptmt.setInt(1, id);
			ptmt.executeUpdate();
			System.out.println("Data deleted Successfully");
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

	
	// Finds all Products in the H2 Database 
	public void findAllProducts() {
		try {
			String queryString = "SELECT * FROM PRODUCT";
			connection = getConnection();
			ptmt = connection.prepareStatement(queryString);
			resultSet = ptmt.executeQuery();
			while (resultSet.next()) {
				System.out.println("ID " + resultSet.getInt("ID") + ", Name " + resultSet.getString("Name")
						+ ", DESCRIPTION " + resultSet.getString("DESCRIPTION") + ", PRICE " + resultSet.getLong("PRICE")
						+ ", CATEGORY " + resultSet.getString("CATEGORY") + ", CREATIONDATE " + resultSet.getTimestamp("CREATIONDATE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
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
