package NotificationSystem;

public class TimeStampDecorator extends INotificationDecorator{


    public TimeStampDecorator(INotification iNotification) {
        super(iNotification);
    }

    @Override
    public String getContent() {
        return TimeStamp.getCurrentTime() + iNotification.getContent();
    }
}
