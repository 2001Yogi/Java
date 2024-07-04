
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Inventory {
	private static List<Product> productList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
        while (true) {
            displayMenu();
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                addProduct();
            } else if (choice.equals("2")) {
                viewProduct();
            } else if (choice.equals("3")) {
                searchProduct();
            } else if (choice.equals("4")) {
                editProduct();
            } else if (choice.equals("5")) {
                deleteProduct();
            } else if (choice.equals("6")) {
                System.out.println("Exiting...");
                break;
            }else {
                System.out.println("Invalid choice. Please select again.");
            }
        }
    }
	
	private static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add Stock");
        System.out.println("2. View Stock");
        System.out.println("3. Search Stock");
        System.out.println("4. Edit Stock");
        System.out.println("5. Delete Stock");
        System.out.println("6. Exit");
        System.out.print("Select an option: ");
    }

    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        String p_id = scanner.next();
        System.out.print("Enter Product Name: ");
        String name = scanner.next();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Product Quantity: ");
        double quantity = scanner.nextDouble();
        System.out.print("Enter Product Company: ");
        String company = scanner.next();

        Product product = new Product(p_id,name,company,quantity,price);
        productList.add(product);
        System.out.println("Product added successfully!");
    }

    private static void viewProduct() {
        if (productList.isEmpty()) {
            System.out.println("No Products available.");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    private static void searchProduct() {
        System.out.print("Enter Product ID to search: ");
        String searchId = scanner.nextLine();
        for (Product product : productList) {
            if (product.getP_id().equals(searchId)) {
                System.out.println(product);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void editProduct() {
        System.out.print("Enter Product ID to edit: ");
        String editId = scanner.nextLine();
        for (Product product : productList) {
            if (product.getP_id().equals(editId)) {
            	System.out.print("Enter Product Name: ");
                String name = scanner.next();
                System.out.print("Enter Product Price: ");
                double price = scanner.nextDouble();
                System.out.print("Enter Product Quantity: ");
                double quantity = scanner.nextDouble();
                System.out.print("Enter Product Company: ");
                String company = scanner.next();

                product.setName(name);
                product.setPrice(price);
                product.setQuantity(quantity);
                product.setCompany(company);
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    
    private static void deleteProduct() {
        System.out.print("Enter Student ID to delete: ");
        String deleteId = scanner.nextLine();
        for (Product product : productList) {
            if (product.getP_id().equals(deleteId)) {
                productList.remove(product);
                System.out.println("Product deleted successfully!");
                return;
            }
        }
        System.out.println("Product not found.");
    }
}

