package NotificationSystem;

public class SimpleNotification implements INotification{

    private String content;

    public SimpleNotification(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return this.content;
    }
}
