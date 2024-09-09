package project;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
	public static void menu() {
		System.out.println(" 1 - Add Stock ");
		System.out.println(" 2 - View Stock ");
		System.out.println(" 3 - Search Stock ");
		System.out.println(" 4 - Edit Stock ");
		System.out.println(" 5 - Delete Stock ");
		System.out.println(" 6 - Exit");
	}
	
	
	public static void main(String[] args) {
		int option;
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> productList = new ArrayList<Product>();
		do {
			Product p = new Product();
			menu();
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Product ID: ");
				p.setId(sc.nextInt());
				System.out.println("Enter Product Name: ");
				p.setName(sc.next());
				System.out.println("Enter Product Price: ");
				p.setPrice(sc.nextInt());
				System.out.println("Enter Product Quantity: ");
				p.setQuantity(sc.nextInt());
				System.out.println("Enter Product Company: ");
				p.setCompany(sc.next());
				p.addStock(p);
				productList.add(p);
				
				break;
			case 2:
				System.out.println("-----------------------------------------------");
				p.viewStock(productList);
				System.out.println("-----------------------------------------------");
				break;
			case 3:
				System.out.println("Enter Product ID: ");
				int id = sc.nextInt();
				Product product = p.searchStock(productList, id);
				if (product != null) {
					System.out.println("-----------------------------------------------");
		            System.out.println("Product found: " + product);
		            System.out.println("-----------------------------------------------");
		        } else {
		        	System.out.println("-----------------------------------------------");
		            System.out.println("Product with ID " + id + " not found.");
		            System.out.println("-----------------------------------------------");
		        }
				break;
			case 4:
				System.out.println("Enter Product ID for Update or Edit: ");
				int id1 = sc.nextInt();
				Product updateProduct = p.searchStock(productList, id1);
				if (updateProduct != null) {
				    System.out.println("Enter new product name: ");
				    String newName = sc.next();

				    System.out.println("Enter new product price: ");
				    int newPrice = sc.nextInt();

				    System.out.println("Enter new product quantity: ");
				    int newQuantity = sc.nextInt();

				    System.out.println("Enter new company name: ");
				    String newCompany = sc.next();

				    // Update the product with new values
				    p.updateStock(productList, id1, newName, newPrice, newQuantity, newCompany);

				    System.out.println("-----------------------------------------------");
				    System.out.println("Updated Product :- ");
				    p.viewStock(productList);
				    System.out.println("-----------------------------------------------");
				} else {
				    System.out.println("Product not found for ID " + id1);
				}			
				break;
			case 5:
				System.out.println("Enter Product ID for Delete: ");
				int id2 = sc.nextInt();
				p.deleteStock(productList, id2);
				p.viewStock(productList);
				break;
			case 6:
				System.out.println("Thanks For Using Inventory Management System");
				System.exit(0);
			default:
				System.out.println("Invalid Input");
				break;
			}
		}while(option != 0);
	}
}


//System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
//System.out.println("Product ID\t\t\t\t Product Name\t\t\t\t Product Price\t\t\t\t Product Quantity\t\t\t\t Product Company ");
//System.out.println(product.id +"\t\t\t\t"+ product.name +"\t\t\t\t"+ product.price +"\t\t\t\t"+ product.quantity +"\t\t\t\t"+ product.company);
//System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");	
