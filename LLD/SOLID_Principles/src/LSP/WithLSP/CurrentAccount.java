package LSP.WithLSP;

public class CurrentAccount implements WithdrawableAccount{

    private double balance;

    @Override
    public void deposite(double amount) {
        balance += amount;
        System.out.println("Deposited "+amount+ " to the Current Account. New Balance "+balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount){
            balance -= amount;
            System.out.println("Withdraw " + amount + " from the Current Account. New Balance " + balance);
        }
        else {
            System.out.println("Insufficient funds in Current Account!");
        }
    }
}
