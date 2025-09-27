package LSPRules.SignatureRule.ExceptionRule;

public class Test {

    public static void main(String[] args) {
        try {
            Payment p1 = new CreditCardPayment(); // works fine
            p1.pay(2000);

            Payment p2 = new UpiPayment();
            p2.pay(6000);


        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
