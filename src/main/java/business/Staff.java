package business;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

public class Staff extends User {
    // Constructor
    public Staff(long userId, String username, String email, String password) {
        super(userId, username, email, password);  // Call the superclass (User) constructor
    }

      // Staff-specific method to create a new product
    public void createProduct(int sku, String name, String description, String vendor, String slug, double price) {
        // Create a new product with the given SKU and name
        Product newProduct = new Product(sku, name, description, vendor, slug, price);  

        // Perform any additional logic, such as adding the new product to the database
        try{
            //read existing product catalog
            FileReader fileReader = new FileReader("src\\main\\products.json");
            List<Product> products = new Gson().fromJson(fileReader, new TypeToken<List<Product>>() {}.getType());
            fileReader.close();

            // Check if a product with the same SKU already exists
            int newProductSKU = newProduct.getSku();
            boolean duplicateSKU = false;
            for (int i = 0; i < products.size(); i++) {
                JsonObject productJson = products.get(i).toJsonObject();
                int existingSKU = productJson.get("sku").getAsInt();

                if (newProductSKU == existingSKU) {
                    duplicateSKU = true;
                    break;
                }
            }
            if (duplicateSKU) {
                System.err.println("A product with the same SKU already exists. The new product cannot be added.");
                return;
            }

            // Add the new product to the catalog
            products.add(newProduct);

            // Create a Gson object with pretty printing enabled
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Write the updated product catalog back to the JSON file
            FileWriter fileWriter = new FileWriter("src\\main\\products.json");
            fileWriter.write(gson.toJson(products));
            fileWriter.close();
            System.out.println("Product added to the catalog successfully.");
        }catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error adding product to the product catalog.");
        }
        
        
    }

    public void updateProduct(Product product, String newName, String newDescription, double newPrice) {
        // Update the product details
        product.setName(newName);
        product.setDescription(newDescription);
        product.setPrice(newPrice);
    
        // Perform any additional product management logic here, such as updating the database
    }

    // Staff-specific method to download a list of all products
     public void downloadProductCatalog() {
        try {
            // Read the existing JSON file
            FileReader fileReader = new FileReader("src\\main\\products.json");
            List<Product> products = new Gson().fromJson(fileReader, new TypeToken<List<Product>>() {}.getType());

            // Create a Gson object with pretty printing enabled
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Create a new JSON file with the product data
            FileWriter fileWriter = new FileWriter("src\\main\\downloadedCatalog.json");
            fileWriter.write(gson.toJson(products));
            fileWriter.close();

            System.out.println("Product catalog downloaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error downloading the product catalog.");
        }
    }

    // Additional staff-specific methods can be added as needed
}

