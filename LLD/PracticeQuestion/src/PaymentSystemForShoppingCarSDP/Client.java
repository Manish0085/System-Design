package PaymentSystemForShoppingCarSDP;

public class Client {

    public static void main(String[] args) {
        PaymentStrategy strategy1 = new PayPalPayment();
        strategy1.pay(4152);

        PaymentStrategy strategy2 = new CreditCardPayment();
        strategy2.pay(745);

        PaymentStrategy strategy3 = new UpiPayment();
        strategy3.pay(4125);
    }
}
