package DIP.WithDIP;

public class Test {

    public static void main(String[] args) {
        Database mongo = new MongoDB();
        Database mySql = new MySqlDB();

        UserService service1 = new UserService(mySql);
        service1.saveUser("Mohan");

        UserService service2 = new UserService(mongo);
        service2.saveUser("Amit");
    }
}
