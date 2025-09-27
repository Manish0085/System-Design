package OCP.WithOCP;


public class Test {

    public static void main(String[] args) {


        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Laptop", 15000));
        cart.addProduct(new Product("LCD", 32000));
        cart.addProduct(new Product("Mouse", 150));
        cart.addProduct(new Product("Charger", 4500));

        CartInvoicePrinter printer = new CartInvoicePrinter(cart);
        printer.printInvoice();

        Persistence save1 = new SQLPersistence();
        save1.save(cart);

        Persistence save2 = new NoSQLPersistence();
        save2.save(cart);

        Persistence save3 = new FileSystem();
        save3.save(cart);

    }
}
