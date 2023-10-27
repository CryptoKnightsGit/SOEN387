package business;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private ShoppingCart shoppingCart; // List of products in the shopping cart
    private long userId; // Unique identifier for the user
    private String username; // User's username
    private String email; // User's email address
    private String password; // User's password (hash or encrypted)

    // Constructor
    public Customer(long userId, String username, String email, String password) {
        super(userId, username, email, password); // Call the superclass (User) constructor
        shoppingCart = new ShoppingCart(); // Initialize an empty shopping cart
    }

    public Customer() {

        this.userId = 0;
        this.username = "default";
        this.email = "something@.com";
        this.password = "secret";
        shoppingCart = new ShoppingCart();
    }

    // Getters and setters for customer-specific attributes
    public ShoppingCart getCart() {
        return this.shoppingCart;
    }

    // Customer-specific methods
    public void addToCart(Product product) {
        shoppingCart.addItem(product);
    }

    public ShoppingCart removeFromCart(Product product) {
        shoppingCart.removeItem(product);
        return shoppingCart;
    }

    public void adjustQuantityInCart(Product product, int newQuantity) {
        // Implement logic to adjust the quantity of items in the cart
        // For example, update the quantity of the specified product in the cart
    }

    // Additional customer-specific methods can be added as needed
}
