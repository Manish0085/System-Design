package OCP.WithOCP;

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
                .mapToDouble(Product::getPrice)
                .sum();
    }
}
