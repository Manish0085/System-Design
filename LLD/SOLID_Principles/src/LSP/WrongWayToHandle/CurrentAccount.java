package LSP.WrongWayToHandle;

public class CurrentAccount implements Account {

    private double balance;

    public CurrentAccount(){
        this.balance = 0;
    }

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
            System.out.println("Insufficient funds in Currents Account!");
        }
    }
}
