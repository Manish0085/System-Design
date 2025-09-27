package LSPRules.PropertyRule.HistoryConstraint;

public class Test {

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(100);

        acc.withdraw(20);

        BankAccount fixedAcc = new FixedDepositAccount(500);

        fixedAcc.withdraw(100);
    }
}
