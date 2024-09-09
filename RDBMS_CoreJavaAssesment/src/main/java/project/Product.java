package project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;  
import java.util.Scanner;  

public class Product {
	private int id;
	private String name;
	private int price;
	private int quantity;
	private String company;
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int id, String name, int price, int quantity, String company) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.company = company;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", company="
				+ company + "]";
	}
	
	public void addStock(Product p) {
		this.id = p.id;
		this.name = p.name;
		this.price = p.price;
		this.quantity = p.quantity;
		this.company = p.company;
	}
	
	public void viewStock(ArrayList<Product> arr) {
		for (Product product : arr) {
			System.out.println("---------------------------------------");
			System.out.println("Product ID: " + product.id);
			System.out.println("Product Name: " + product.name);
			System.out.println("Product Price: " + product.price);
			System.out.println("Product Quantity: " + product.quantity);
			System.out.println("Product Company: " + product.company);	
			System.out.println("---------------------------------------");
		}
	}
	
	public Product searchStock(ArrayList<Product> arr, int id) {
		for (Product product : arr) {
			if (product.getId() == id) {
                return product;
            }
        }
        return null; 
		}
	
	public void updateStock(ArrayList<Product> arr, int id1, String newName, int newPrice, int newQuantity, String newCompany) {
		
		for (Product product : arr) {
			 if (product.getId() == id1) {
				 	product.setName(newName);
					product.setPrice(newPrice);
					product.setQuantity(newQuantity);
					product.setCompany(newCompany);
					System.out.println("---------------------------------------");
					System.out.println("Product updated: " + product);
					System.out.println("---------------------------------------");
			 	}
			}
		System.out.println("---------------------------------------");
		System.out.println("Product with ID " + id1 + " not found.");
		System.out.println("---------------------------------------");
	}
	
//	public void deleteStock(ArrayList<Product> arr, int id2) {
//		Iterator<Product> iterator = arr.iterator();
//	    while (iterator.hasNext()) {
//	        Product product = iterator.next();
//	        if (product.getId() == id2) {
//	            iterator.remove();
//	            System.out.println("---------------------------------------");
//	            System.out.println("Product deleted: " + product);
//	            System.out.println("---------------------------------------");
//	        }
//	    }
//	    System.out.println("---------------------------------------");
//	    System.out.println("Product with ID " + id2 + " not found.");
//	    System.out.println("---------------------------------------");
//	}
	
	public void deleteStock(ArrayList<Product> arr, int id2) {
		Iterator<Product> iterator = arr.iterator();
	    while (iterator.hasNext()) {
	        Product product = iterator.next();
	        if (product.getId() == id2) {
	            iterator.remove();
	            System.out.println("---------------------------------------");
	            System.out.println("Product deleted: " + product);
	            System.out.println("---------------------------------------");
	        }
	    }
	    System.out.println("---------------------------------------");
	    System.out.println("Product with ID " + id2 + " not found.");
	    System.out.println("---------------------------------------");
	}
}	
