package OCP.WithOCP;

public class CartInvoicePrinter {

    private ShoppingCart cart;

    public CartInvoicePrinter(ShoppingCart cart){
        this.cart = cart;
    }

    public void printInvoice(){
        System.out.println("Shopping Cart Invoice:  ");
        this.cart.getProducts()
                .stream()
                .forEach(System.out::println);
        System.out.println("Total: $"+cart.calculateTotal());
    }
}
