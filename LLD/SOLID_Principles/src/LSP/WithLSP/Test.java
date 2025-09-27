package LSP.WithLSP;

import java.util.ArrayList;
import java.util.List;

public class Test
{

    public static void main(String[] args) {
        List<WithdrawableAccount> withdrawableAccounts = new ArrayList<>();
        withdrawableAccounts.add(new SavingAccount());
        withdrawableAccounts.add(new CurrentAccount());

        List<NonWithdrawableAccount> depositOnlyAccounts = new ArrayList<>();
        depositOnlyAccounts.add(new FixedTermAccount());

        BankClient client = new BankClient(depositOnlyAccounts, withdrawableAccounts);
        client.processTransaction();
    }
}
