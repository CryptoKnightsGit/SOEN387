package business;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

public class User {
    private long userId;        // Unique identifier for the user
    private String username;    // User's username
    private String email;       // User's email address
    private String password;    // User's password (hash or encrypted)
    
    // Constructor
    public User(long userId, String username, String email, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    //Copy constructor
    public User(User u,long userId, String username, String email, String password) {
        this.userId = u.userId;
        this.username = u.username;
        this.email = u.email;
        this.password = u.password;
    }
    // public Product getProduct(String sku) {
    //     // Replace "products.json" with the path to your local JSON file
    //     String jsonFilePath = "products.json";

    //     try {
    //         // Read the JSON data from the file
    //         FileReader fileReader = new FileReader(jsonFilePath);
    //         List<Product> products = new Gson().fromJson(fileReader, new TypeToken<List<Product>>() {
    //         }.getType());

    //         // Search for the product by SKU
    //         for (Product product : products) {
    //             if (product.getSku().equals(sku)) {
    //                 return product; // Return the product if found
    //             }
    //         }

    //         // Handle the case when the product with the given SKU is not found
    //         // You can throw an exception or return null, depending on your application's design
    //         return null;
    //     } catch (IOException e) {
    //         // Handle any potential IO errors (e.g., file not found, JSON parsing issues)
    //         e.printStackTrace();
    //         return null;
    //     }
    // }


    // Getters and setters for attributes
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Additional methods for user-related functionality
    public boolean authenticate(String inputPassword) {
        // Implement user authentication logic (e.g., compare inputPassword with stored password)
        return this.password.equals(inputPassword);
    }

    // Other common user-related methods can be added as needed


    //toString to display all the pertinent info
    public String toString() {
		return "The [userId=" + userId + ", The username=" + username
				+ ", The email=" + email + ", The password=" + password + "]";
	}

}
