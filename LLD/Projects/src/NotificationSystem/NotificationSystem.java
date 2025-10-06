package NotificationSystem;

public class NotificationSystem {

    public static void main(String[] args) {

        // Create NotificationService
        NotificationService service = NotificationService.getInstance();

        // Get Observable
        NotificationObservable observable = service.getObservable();

        // Create Logger
        Logger logger = new Logger(observable);

        // Create Notification Engine observers
        NotificationEngine engine = new NotificationEngine(observable);
        engine.addNotificationStrategy(new EmailStrategy("random.person@gmail.com"));
        engine.addNotificationStrategy(new SMSStrategy("+91 8965541123"));
        engine.addNotificationStrategy(new PopUpStartegy());

        // Attach these Observers
        observable.add(logger);
        observable.add(engine);

        // Create a notification with decorator
        INotification notification = new SimpleNotification("Your Order has been shipped!");
        notification = new TimeStampDecorator(notification);
        notification = new SignatureDecorator(notification, "Customer Care");

        service.sendNotification(notification);
    }
}
