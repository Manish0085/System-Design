package LSPRules.MethodRule.PreCondition;

public class User {

    // Precondition: Password must be at least 8 characters long
    public void setPassword(String password){
        if (password.length() < 8){
            throw new IllegalArgumentException("Password must be at least 8 characters long!");
        }

        System.out.println("Password set Successfully!!");
    }
}
