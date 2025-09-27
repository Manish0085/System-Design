package SRP.WithoutSRP;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p){
        this.products.add(p);
    }

    public List<Product> getProducts(){
        return this.products;
    }


    public double calculateTotal(){
        return products.stream()
                .mapToDouble(product -> product.getPrice())
                .sum();

    }

    public void printInvoice(){
        System.out.println("Shopping Cart Invoice:  ");
        products.stream().
                forEach(System.out::println);

        System.out.println("Total: $"+calculateTotal());
    }

    public void saveToDB(){
        System.out.println("Saving shopping cart to database");
    }





}
