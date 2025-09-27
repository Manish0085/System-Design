package LSP.WithLSP;

public class SavingAccount implements WithdrawableAccount{

    private double balance;

    @Override
    public void deposite(double amount) {
        balance += amount;
        System.out.println("Deposited "+amount+ " to the Saving Account. New Balance "+balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdraw " + amount + " from the Saving Account. New Balance " + balance);
        }
        else {
            System.out.println("Insufficient funds in Savings Account!");
        }
    }
}
