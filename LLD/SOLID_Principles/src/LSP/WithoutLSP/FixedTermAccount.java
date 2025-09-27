package LSP.WithoutLSP;

public class FixedTermAccount implements Account {

    private double balance;

    public FixedTermAccount(){
        this.balance = 0;
    }

    @Override
    public void deposite(double amount) {
        balance += amount;
        System.out.println("Deposited "+amount+ " to the Current Account. New Balance "+balance);
    }

    @Override
    public void withdraw(double amount) {
        throw new UnsupportedOperationException("Withdrawal not allowed in Fixed Term Account!");
    }
}
