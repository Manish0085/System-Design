package NotificationSystem;

public class SignatureDecorator extends INotificationDecorator{

    private String signature;

    public SignatureDecorator(INotification iNotification, String sign) {
        super(iNotification);
        this.signature = sign;
    }

    @Override
    public String getContent() {
        return iNotification.getContent() + "\n--" + signature + "\n\n";
    }
}
