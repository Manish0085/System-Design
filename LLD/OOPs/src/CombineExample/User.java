package CombineExample;


// Encapsulation
public class User {

    private String name;
    private String email;
    private String cardNnumber;

    public User(String name, String email, String cardNnumber) {
        this.name = name;
        this.email = email;
        this.cardNnumber = cardNnumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    /// no direct getter for cardNumber ----> security
}
