package NotificationSystem;

import java.util.List;

public class NotificationService {

    private NotificationObservable observable;
    private static NotificationService instance;
    private List<INotification> iNotifications;

    private NotificationService(){
        this.observable = new NotificationObservable();
    }


    public static NotificationService getInstance(){
        if (instance == null){
            instance = new NotificationService();
        }
        return instance;
    }


    public NotificationObservable getObservable(){
        return observable;
    }

    public void sendNotification(INotification notification){
        iNotifications.add(notification);
        observable.setNotification(notification);
    }

}
