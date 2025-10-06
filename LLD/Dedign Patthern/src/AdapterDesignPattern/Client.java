package AdapterDesignPattern;

public class Client {

    public void getReport(IReport report, String rawData){
        System.out.println("Processed JSON: "
                + report.getJsonData(rawData));
    }
}
