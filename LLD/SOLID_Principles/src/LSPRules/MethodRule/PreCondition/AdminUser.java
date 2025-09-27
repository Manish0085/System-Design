package LSPRules.MethodRule.PreCondition;

public class AdminUser extends User {

    @Override
    public void setPassword(String password) {
        if (password.length() < 6){
            throw new IllegalArgumentException("Password must be at least 6 characters long!");
        }

        System.out.println("Password set Successfully!!");
    }
}
