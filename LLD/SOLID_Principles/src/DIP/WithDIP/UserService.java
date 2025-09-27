package DIP.WithDIP;

public class UserService {

    private final Database db;

    public UserService(Database db){
        this.db = db;
    }

    public void saveUser(String user){
        db.save(user);
    }

}
