package NotificationSystem;

public class EmailStrategy implements NotificationStrategy{



    private String emailId;

    public EmailStrategy(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void sendNotification(String content) {
        System.out.println("Sending Email Notification to: " + emailId+"\n"+ content);
    }
}
