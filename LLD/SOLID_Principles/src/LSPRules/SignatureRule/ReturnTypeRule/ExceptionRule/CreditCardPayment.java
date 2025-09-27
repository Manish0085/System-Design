package LSPRules.SignatureRule.ReturnTypeRule.ExceptionRule;

public class CreditCardPayment extends Payment{


    @Override
    public void pay(double amount) throws  IllegalArgumentException{
        if (amount > 10000){
            throw new IllegalArgumentException("Credit Card Limit exceed!!");
        }
        System.out.println("Credit card payment of " + amount + " processed.");

    }
}
