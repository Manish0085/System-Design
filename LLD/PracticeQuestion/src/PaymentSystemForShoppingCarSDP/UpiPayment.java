package PaymentSystemForShoppingCarSDP;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Payment processed of "+amount+"rs. via Upi");
    }
}
