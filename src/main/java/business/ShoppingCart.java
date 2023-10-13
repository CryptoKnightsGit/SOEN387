package business;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items;  // List of products in the shopping cart

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    // Add a product to the shopping cart
    public void addItem(Product product) {
        items.add(product);
    }

    // Remove a product from the shopping cart
    public void removeItem(Product product) {
        items.remove(product);
    }

    // Adjust the quantity of a product in the shopping cart
    public void adjustQuantity(Product product, int newQuantity) {
        // Implement logic to adjust the quantity of items in the cart
        // For example, update the quantity of the specified product
    }

    // Get the list of products in the shopping cart
    public List<Product> getItems() {
        return items;
    }
}