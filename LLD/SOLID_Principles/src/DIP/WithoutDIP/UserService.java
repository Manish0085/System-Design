package DIP.WithoutDIP;

public class UserService {

    private SQLDB sql = new SQLDB();
    private MongoDB mongodb = new MongoDB();


    public void saveToSqlDB(String user){
        sql.save(user);
    }


    public void saveToMongoDB(String user){
        sql.save(user);
    }
}
