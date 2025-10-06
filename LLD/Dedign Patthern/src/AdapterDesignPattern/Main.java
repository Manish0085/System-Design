package AdapterDesignPattern;

public class Main {

    public static void main(String[] args) {
        // 1. Create the adaptee
        XmlDataProvider xmlProv = new XmlDataProvider();

        // 2. Make our adapter
        IReport adapter = new XmlDataProviderAdapter(xmlProv);

        // 3. Give it some raw data
        String rawData = "Alice:42";

        // 4. Client prints the JSON
        Client client = new Client();

        client.getReport(adapter, rawData);
        // → Processed JSON: {"name":"Alice", "id":42}
    }

}
