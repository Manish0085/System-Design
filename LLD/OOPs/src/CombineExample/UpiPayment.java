package CombineExample;

public class UpiPayment implements Payment{

    private String UPI_ID;

    public UpiPayment(String UPI_ID)
    {
        this.UPI_ID = UPI_ID;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of " + amount + " via " + this.UPI_ID);
    }
}
