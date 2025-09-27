package DIP.WithoutDIP;

public class SQLDB {

    public void save(String data) {
        System.out.println(
                "Executing SQL Query: INSERT INTO users VALUES('"
                        + data + "');"
        );    }
}
