package LSP.WithLSP;

public class FixedTermAccount implements NonWithdrawableAccount{

    private double balance;


    @Override
    public void deposite(double amount) {
        balance += amount;
        System.out.println("Deposited "+amount+ " to the Saving Account. New Balance "+balance);
    }

}
