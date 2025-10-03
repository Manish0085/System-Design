package ObserverDesignPattern;

public interface IChannel {

    void subscribe(ISubscriber iSubscriber);
    void unSubscribe(ISubscriber iSubscriber);
    void notifySubscribers();
}
