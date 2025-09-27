package LSPRules.SignatureRule.ExceptionRule;

public class UpiPayment extends Payment{

    @Override
    public void pay(double amount) throws Exception {
        if (amount > 5000){
            throw new Exception("Upi Limit exceed!!");
        }
        System.out.println(" UPI Payment of " + amount + " processed.");
    }


// Subclass (violates LSP ❌)
//    @Override
//    public void pay(double amount) throws Throwable {
//        if (amount > 5000){
//            throw new Throwable("Upi Limit exceed!!");
//        }
//        System.out.println(" UPI Payment of " + amount + " processed.");
//    }
}
