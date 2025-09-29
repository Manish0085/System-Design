package PaymentSystemForShoppingCarSDP;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Payment processed of "+amount+"rs. via PayPal");
    }
}
