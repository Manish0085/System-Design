package SRP.WithSRP;


public class Test {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new Product("Laptop", 15000));
        cart.addProduct(new Product("LCD", 32000));
        cart.addProduct(new Product("Mouse", 150));
        cart.addProduct(new Product("Charger", 4500));

        System.out.println(cart.getProducts());
        System.out.println(cart.calculateTotal());
        CartInvoicePrinter print = new CartInvoicePrinter(cart);
        print.printInvoice();

        DBStorage db = new DBStorage(cart);
        db.sveToDB();

    }
}
