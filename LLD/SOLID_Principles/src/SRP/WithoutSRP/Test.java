package SRP.WithoutSRP;

public class Test {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 15000));
        cart.addProduct(new Product("LCD", 32000));
        cart.addProduct(new Product("Mouse", 150));
        cart.addProduct(new Product("Charger", 4500));

        cart.getProducts();
        cart.printInvoice();
        cart.saveToDB();
    }

    // This is violating SRP
}

