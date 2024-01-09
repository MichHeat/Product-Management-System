/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productmanagementsystem;

import java.util.Scanner;

/**
 *
 * @author Michelle Heath
 */
public class ProductManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ProductManagement productManagement = new ProductManagement();
        UserInterface userInterface = new UserInterface(productManagement);
        userInterface.start();
    }
}

class UserInterface {
    private ProductManagement productManagement;
    private Scanner scanner;

    public UserInterface(ProductManagement productManagement) {
        this.productManagement = productManagement;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean quit = false;
        while (!quit) {
            System.out.println("\nProduct Management System");
            System.out.println("Select an option from the menu:");
            System.out.println("1. Add a Product to the list");
            System.out.println("2. Update and edit Product Price");
            System.out.println("3. Delete Product");
            System.out.println("4. View All Products");
            System.out.println("5. Quit");

            System.out.print("Enter your option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the new line character

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> updateProductPrice();
                case 3 -> deleteProduct();
                case 4 -> viewAllProducts();
                case 5 -> quit = true;
                default -> System.out.println("Invalid option. Select an option from the list. Please try again.");
            }
        }
    }

    private void addProduct() {
        System.out.print("Enter a Product ID: ");
        String productID = scanner.next();
        System.out.print("Enter a Product name: ");
        String name = scanner.next();
        System.out.print("Enter the Product's price: R");
        double price = scanner.nextDouble();
        System.out.print("Enter the quantity of the Product: ");
        int quantity = scanner.nextInt();
        productManagement.addProduct(name, price, quantity);
    }

    private void updateProductPrice() {
        System.out.print("Enter a ProductID to update a product: ");
        int editID = scanner.nextInt();
        System.out.print("Enter a new name for the Product: ");
        String editName = scanner.next();
        System.out.print("Enter the new price of the Product: ");
        double editPrice = scanner.nextDouble();
        System.out.print("Enter the new quantity of the Product: ");
        int editQuantity = scanner.nextInt();
        productManagement.editProduct(editID, editName, editPrice, editQuantity);
        System.out.println("Product updated successfully!");
    }

    private void deleteProduct() {
        System.out.print("Enter the ProductID of the product you want to delete: ");
        int removeID = scanner.nextInt();
        productManagement.removeProduct(removeID);
        System.out.println("Product deleted successfully!");
    }

    private void viewAllProducts() {
        productManagement.viewProducts();
    }
}

    
    


    

