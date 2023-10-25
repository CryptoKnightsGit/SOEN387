package business;

import java.util.List;

public class testDriver {
    public static void main(String[] args) {


    //getProduct(sku) test
    User user = new User(1, "testUser", "testEmail", "testPassword" ); // Instantiate the User class
    int skuToRetrieve = 123;
    Product product = user.getProduct(skuToRetrieve); 
    System.out.println("getProduct(123) by a user:");
    System.out.println(product.toString());


    //////////////////////////////////////////////////////////////////////////////
    //getAllProducts() test
    System.out.println("\n\n\nNow we retrieve all products:");
    List<Product> allProducts = user.getAllProducts();
    for (Product listProduct : allProducts) {
        System.out.println(listProduct.toString());
    }


    //////////////////////////////////////////////////////////////////////////////
    //shopping cart test
    System.out.println("\n\n\nNow we test the shopping cart:\n");
    Customer customer = new Customer(2, "testCustomer", "testCustomer@gmail.com", "testPassword");
   
    Product cartProduct1 = customer.getProduct(123);
    Product cartProduct2 = customer.getProduct(456);
    Product cartProduct3 = customer.getProduct(789);

    customer.addToCart(cartProduct1);
    customer.addToCart(cartProduct2);
    customer.addToCart(cartProduct3);

    List<Product> shoppingCart = customer.getCart();
    System.out.println("Shopping cart after adding all items:");
    for (Product shoppingCartProduct : shoppingCart){
        System.out.println(shoppingCartProduct.toString());
    }

    customer.removeFromCart(cartProduct1);
    shoppingCart = customer.getCart();
    System.out.println("\nShopping cart after removing sku 123:");
    for (Product shoppingCartProduct : shoppingCart){
        System.out.println(shoppingCartProduct.toString());
    }


    //////////////////////////////////////////////////////////////////////////////
    //downloadProductCatalog test
    System.out.println("\n\n\nNow we test the createProduct() and downloadProductCatalog() staff member functions:");
    Staff staff = new Staff(3, "staff", "staff@gmail.com", "password");
    staff.createProduct(321, "staffCreatedProduct", "This was created in the testDriver.java", "amazon", "product-321", 99.56);
    staff.downloadProductCatalog();
    }
}
