package LSPRules.PropertyRule.ClassInvarient;

public class Test {


    public static void main(String[] args) {
        BankAccount acc = new SavingAccount(1000);

        acc.withdraw(1500); // ❌ balance = -500 (violates invariant)

        System.out.println("Balance: " + acc.getBalance());
    }
}
