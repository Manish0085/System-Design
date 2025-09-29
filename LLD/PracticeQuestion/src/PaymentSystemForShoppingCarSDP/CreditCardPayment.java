package PaymentSystemForShoppingCarSDP;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Payment processed of "+amount+"rs. via Credit Card");
    }
}
