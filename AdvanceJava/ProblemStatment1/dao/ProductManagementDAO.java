package com.ProblemStatment1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ProblemStatment1.config.DBConfig;
import com.ProblemStatment1.model.Product;

public class ProductManagementDAO {

	Connection conn = DBConfig.getConnection();

	public List<Product> getAllProduct() {
		List<Product> productList = new ArrayList<Product>();
		try {
			Statement stat = conn.createStatement();
			ResultSet result = stat.executeQuery("Select * From product");
			while (result.next()) {
				Product product = new Product(result.getString("pId"), result.getString("pName"),
						result.getInt("pPrice"));
				productList.add(product);
			}
			DBConfig.closeConnection(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productList;

	}

	public Product getProductById(String pId) {
		Product product=null;
		try {
			PreparedStatement ps=conn.prepareStatement("Select * from product where pId=?");
			ps.setString(1, pId);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				product =new Product(rs.getString("pId"),rs.getString("pName"),rs.getInt("pPrice"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return product;	
	}
	public int addProduct(Product product) {
		int status =0;
		try {
			PreparedStatement ps =conn.prepareStatement("Insert into product values(?,?,?)");
			ps.setString(1,product.getpId());
			ps.setString(2,product.getpName());
			ps.setInt(3, product.getpPrice());
			status =ps.executeUpdate();		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public int updateProduct(Product product) {
		int status=0;
		try {
			PreparedStatement ps=conn.prepareStatement("Update product Set pName=?,pPrice=? where pId=?");
		ps.setString(1, product.getpName());
		ps.setInt(2, product.getpPrice());
		ps.setString(3, product.getpId());
		status=ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	public int deleteProduct(String productId) {
		int status=0;
		try {
			PreparedStatement ps=conn.prepareStatement("Delete from product where pId=?");
			ps.setString(1,productId);
			status=ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	
	
}
