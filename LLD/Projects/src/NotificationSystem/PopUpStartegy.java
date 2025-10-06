package NotificationSystem;

public class PopUpStartegy implements NotificationStrategy{
    @Override
    public void sendNotification(String content) {
        System.out.println("Sending Popup Notification: \n" + content);
    }
}
