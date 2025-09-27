package LSPRules.SignatureRule.ExceptionRule;

public class Payment {

    public void pay(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid AMount!");
        }

        System.out.println("Payment of "+amount+ " processed");
    }
}
