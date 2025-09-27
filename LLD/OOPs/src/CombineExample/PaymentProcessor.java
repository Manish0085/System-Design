package CombineExample;

public class PaymentProcessor {

    public void processPayment(Payment payment, double amount){
        payment.pay(amount);
    }


    public static void main(String[] args) {

        User user = new User("Manish", "manishk45126@gmail.com", "1234-5678-9012");
        PaymentProcessor pay = new PaymentProcessor();

        Payment p1 = new CreditCardPayment(user);
        Payment p2 = new UpiPayment("manish@upi");

        pay.processPayment(p1, 1100.0);
        pay.processPayment(p2, 500.0);

    }
}
