package DIP.WithDIP;

import javax.xml.crypto.Data;

public class MongoDB implements Database {


    @Override
    public void save(String data) {
        System.out.println(
                "Executing MongoDB Function: db.users.insert({name: '"
                        + data + "'})"
        );
    }
}
