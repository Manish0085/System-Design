package NotificationSystem;

public class SMSStrategy implements NotificationStrategy{

    private String mobileNumber;

    public SMSStrategy(String mobile){
        this.mobileNumber = mobile;
    }


    @Override
    public void sendNotification(String content) {
        System.out.println("Sending SMS Notification to: "+mobileNumber+"\n"+content);
    }
}
