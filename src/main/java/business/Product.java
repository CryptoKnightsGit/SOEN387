package business;
public class Product {
    private String sku;
    private String name;
    private String description;
    private String vendor;
    private String slug;
    private double price;

    public Product(String sku, String name, String description, String vendor, String slug, double price) {
        this.sku = sku;
        this.name = name;
        this.description = description;
        this.vendor = vendor;
        this.slug = slug;
        this.price = price;
    }

    //copy constructor
     public Product(Product p,String sku, String name, String description, String vendor, String slug, double price) {
        this.sku = p.sku;
        this.name = p.name;
        this.description = p.description;
        this.vendor = p.vendor;
        this.slug = p.slug;
        this.price = p.price;
    }

    // Getters and setters for the product attributes

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public String getSlug() {
        return slug;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }


    
    // to string to display and check all info.
    public String toString() {
		return "The [sku=" + sku + ", The name=" + name + ", The description=" + description + ", The vendor=" + vendor + ", The slug=" + slug+ ", The price=" + price + "]";
	}


}