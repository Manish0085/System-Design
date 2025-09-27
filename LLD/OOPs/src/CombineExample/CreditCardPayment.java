package CombineExample;

public class CreditCardPayment implements Payment{

    private User user;

    public CreditCardPayment(User user){
        this.user = user;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit card payment of "+amount+" for "+ user.getName());
    }
}
