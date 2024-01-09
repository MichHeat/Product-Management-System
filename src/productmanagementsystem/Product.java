/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productmanagementsystem;

/**
 *
 * @author Michelle Heath
 */
import java.util.Objects;

public class Product {

    private int productID;
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return productID == product.productID &&
            Double.compare(product.price, price) == 0 &&
            quantity == product.quantity &&
            Objects.equals(name, product.name);
}

@Override
public int hashCode() {
    return Objects.hash(productID, name, price, quantity);
}
}



