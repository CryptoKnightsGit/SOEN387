package business;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Product> shoppingCart;  // List of products in the shopping cart

    // Constructor
    public Customer(long userId, String username, String email, String password) {
        super(userId, username, email, password);  // Call the superclass (User) constructor
        shoppingCart = new ArrayList<>();  // Initialize an empty shopping cart
    }

    // Getters and setters for customer-specific attributes
    public List<Product> getCart() {
        return shoppingCart;
    }

    // Customer-specific methods
    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    public void removeFromCart(Product product) {
        shoppingCart.remove(product);
    }

    public void adjustQuantityInCart(Product product, int newQuantity) {
        // Implement logic to adjust the quantity of items in the cart
        // For example, update the quantity of the specified product in the cart
    }

    // Additional customer-specific methods can be added as needed
}
