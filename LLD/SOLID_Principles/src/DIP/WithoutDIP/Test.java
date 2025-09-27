package DIP.WithoutDIP;

public class Test {

    public static void main(String[] args) {
        UserService service = new UserService();

        service.saveToMongoDB("Mainsh");
        service.saveToSqlDB("Rahul");
    }
}
