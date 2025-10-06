package NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class NotificationEngine implements IObserver{

    private NotificationObservable notificationObservable;
    private List<NotificationStrategy> strategies;

    public NotificationEngine(NotificationObservable notificationObservable) {
        this.notificationObservable = notificationObservable;
        this.strategies = new ArrayList<>();
    }

    public void addNotificationStrategy(NotificationStrategy ns) {
        this.strategies.add(ns);
    }

    @Override
    public void update() {
        String content = notificationObservable.getNotificationContent();
        for (NotificationStrategy strategy: strategies){
            strategy.sendNotification(content);
        }
    }
}
