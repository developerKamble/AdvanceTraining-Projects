package com.ProblemStatment1.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.ProblemStatment1.dao.ProductManagementDAO;
import com.ProblemStatment1.model.Product;

public class ProductMangementApp {
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static ProductManagementDAO dao=new ProductManagementDAO();

public static void main(String[] args)throws Exception{
String option="";
do {
	System.out.println("A. View Products \nB. Add Product \nC. Update Product \nD Delete Product \n Search Product \nF.Exit");
	System.out.println("================================================");
	System.out.println("Enter an Option ");
	System.out.println("================================================");
	option=br.readLine();
	System.out.println();
	
	switch(option) {
	case "A":{
		viewProducts();
		break;
	}
	case "B":{
		addProduct();
		break;
	}
	case "C":{
		updateProduct();
		break;
	}
	case "D":{
		deleteProduct();
		break;
	}
	case "E":{
		searchProduct();
		break;
	}
	case "F":{
		System.out.println("**********************************");
		System.exit(0);
		break;
	}
		
	}
}while(!option.equals("F"));
}
public static void viewProducts(){
	System.out.println("------------------------------------------");
	List<Product> productList =dao.getAllProduct();
	for(Product product :productList) {
		displayProduct(product);
	}
	System.out.println("-------------------------------------------");
	System.out.println("\n");
}
public static void addProduct() throws Exception {
	System.out.println("-------------------------------------");
	System.out.println("Enter Product Id : ");
	System.out.println("-------------------------------------");
	String productId=br.readLine();
	System.out.println("-------------------------------------");
	System.out.println("Enter Product Name : ");
	System.out.println("-------------------------------------");
	String productName=br.readLine();
	System.out.println("-------------------------------------");
	System.out.println("Enter Product Price : ");
	System.out.println("-------------------------------------");
	int productPrice=Integer.parseInt(br.readLine());
	
	Product product=new Product(productId,productName,productPrice);
	int status=dao.addProduct(product);
	if(status==1) {
		System.out.println("Product addes successfully");
	}else {
		System.out.println("Error while adding product");
	}
	System.out.println("\n");
}
public static void updateProduct() throws Exception {
	System.out.println("-------------------------------------");
	System.out.println("Enter Product Id : ");
	System.out.println("-------------------------------------");
	String productId=br.readLine();
	System.out.println("-------------------------------------");
	System.out.println("Enter New Product Name : ");
	System.out.println("-------------------------------------");
	String productName=br.readLine();
	System.out.println("-------------------------------------");
	System.out.println("Enter New Product Price : ");
	System.out.println("-------------------------------------");
	int productPrice=Integer.parseInt(br.readLine());
	
	Product product=new Product(productId,productName,productPrice);
	int status=dao.updateProduct(product);
	if(status==1) {
		System.out.println("Product updated successfully");
	}else {
		System.out.println("Error while updating product");
	}
	System.out.println("\n");
}
public static void deleteProduct() throws Exception {
	System.out.println("-------------------------------------");
	System.out.println("Enter Product Id : ");
	System.out.println("-------------------------------------");
	String productId=br.readLine();
	System.out.println("-------------------------------------");
 
	int status=dao.deleteProduct(productId);
	if(status==1) {
		System.out.println("Prosuct deleted successfully ");
	}else {
		System.out.println("Error while deleting product");
	}
}

public static void searchProduct() throws IOException {
	System.out.println("-------------------------------------");
	System.out.println("Enter Product Id : ");
	System.out.println("-------------------------------------");
	String productId=br.readLine();
	Product product =dao.getProductById(productId);
	displayProduct(product);
	System.out.println("\n");
}
public static void displayProduct(Product product) {
	System.out.println("Product Id : "+product.getpId());
	System.out.println("Product Name : "+product.getpName());
	System.out.println("Product Price : "+product.getpPrice());
	System.out.println("\n");
}

}
