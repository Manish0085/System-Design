package NotificationSystem;

import java.util.ArrayList;
import java.util.List;

public class NotificationObservable implements IObservable{

    private List<IObserver> observers;
    private INotification currentNotification;

    public NotificationObservable(){
//        this.currentNotification = notification;
        this.observers = new ArrayList<>();
    }


    @Override
    public void add(IObserver iObserver) {
        this.add(iObserver);
    }

    @Override
    public void remove(IObserver iObserver) {
        if (observers.contains(iObserver)){
            observers.remove(iObserver);
        }
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer: observers){
            observer.update();
        }
    }

    public void setNotification(INotification iNotification){
        this.currentNotification = iNotification;
        notifyObservers();
    }

    public INotification getNotification(){
        return this.currentNotification;
    }

    public String getNotificationContent(){
        return currentNotification.getContent();
    }
}
