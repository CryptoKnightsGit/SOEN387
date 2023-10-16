package business;

import java.util.ArrayList;
import java.util.List;

public class Staff extends User {
    // Constructor
    public Staff(long userId, String username, String email, String password) {
        super(userId, username, email, password);  // Call the superclass (User) constructor
    }

      // Staff-specific method to create a new product
    public Product createProduct(String sku, String name) {
        // Create a new product with the given SKU and name
        Product newProduct = new Product(sku, name, "", "", "", 0.0);  

        // Perform any additional logic, such as adding the new product to the database

        return newProduct;
    }

    public void updateProduct(Product product, String newName, String newDescription, double newPrice) {
        // Update the product details
        product.setName(newName);
        product.setDescription(newDescription);
        product.setPrice(newPrice);
    
        // Perform any additional product management logic here, such as updating the database
    }

    // Staff-specific method to download a list of all products
    public List<Product> downloadProductList() {
        // Implement staff-specific functionality to download a list of products
        // You can return a list of Product objects or a file, depending on your requirements
        return new ArrayList<Product>();  // Placeholder return value
    }

    // Additional staff-specific methods can be added as needed
}

