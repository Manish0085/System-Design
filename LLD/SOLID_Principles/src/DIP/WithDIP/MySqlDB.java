package DIP.WithDIP;

import javax.xml.crypto.Data;

public class MySqlDB implements Database {

    @Override
    public void save(String data) {
        System.out.println(
                "Executing SQL Query: INSERT INTO users VALUES('"
                        + data + "');"
        );
    }
}
