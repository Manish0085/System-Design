package OCP.WithoutOCP;


public class Test {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 15000));
        cart.addProduct(new Product("LCD", 32000));
        cart.addProduct(new Product("Mouse", 150));
        cart.addProduct(new Product("Charger", 4500));

        CartInvoicePrinter printer = new CartInvoicePrinter(cart);
        printer.printInvoice();


        CartDBStorage storage = new CartDBStorage(cart);
        storage.saveToDB();
        storage.saveToFile();
        storage.saveToMongo();
    }
}
