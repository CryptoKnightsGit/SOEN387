package business;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private List<Product> shoppingCart;  // List of products in the shopping cart
    private long userId;        // Unique identifier for the user
    private String username;    // User's username
    private String email;       // User's email address
    private String password;    // User's password (hash or encrypted)

    // Constructor
    public Customer(long userId, String username, String email, String password) {
        super(userId, username, email, password);  // Call the superclass (User) constructor
        shoppingCart = new ArrayList<>();  // Initialize an empty shopping cart
    }

    public Customer() {

        this.userId=0;
        this.username="default";
        this.email="something@.com";
        this.password= "secret";


    }

    // Getters and setters for customer-specific attributes
    public List<Product> getCart() {
        return shoppingCart;
    }

    // Customer-specific methods
    public void addToCart(Product product) {
        shoppingCart.add(product);
    }

    public List<Product> removeFromCart(Product product) {
        shoppingCart.remove(product);
        return shoppingCart;
    }

    public void adjustQuantityInCart(Product product, int newQuantity) {
        // Implement logic to adjust the quantity of items in the cart
        // For example, update the quantity of the specified product in the cart
    }

    // Additional customer-specific methods can be added as needed
}
