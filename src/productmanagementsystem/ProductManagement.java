/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productmanagementsystem;

/**
 *
 * @author Michelle Heath
 */
import java.util.ArrayList;

public class ProductManagement {
    private ArrayList<Product> products;

    public ProductManagement() {
        this.products = new ArrayList<>();
    }

    public void addProduct(String name, double price, int quantity) {
        Product product = new Product(name, price, quantity);
        products.add(product);
        System.out.println("Product added successfully!");
    }

    public void editProduct(int id, String name, double price, int quantity) {
        Product product = findProduct(id);
        if (product != null) {
            product.setName(name);
            product.setPrice(price);
            product.setQuantity(quantity);
            System.out.println("Product updated successfully!");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void removeProduct(int id) {
        Product product = findProduct(id);
        if (product != null) {
            products.remove(product);
            System.out.println("Product deleted successfully!");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void viewProducts() {
        System.out.println("\nCurrent Product List: ");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private Product findProduct(int id) {
    for (Product product : products) {
        if (product.getProductID() == id) {
            return product;
        }
    }
    return null;
}
}  
