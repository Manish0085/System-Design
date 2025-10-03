package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements IChannel{

    private List<ISubscriber> subscribers;
    private String name;
    private String latestVideo;

    public Channel(String name){
        this.subscribers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void subscribe(ISubscriber subscriber) {
        if (!subscribers.contains(subscriber)){
            subscribers.add(subscriber);
        }
    }

    @Override
    public void unSubscribe(ISubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (ISubscriber sb: subscribers){
            sb.update();
        }
    }

    public String getVideoData(){
        return "Checkout our new Video: " + latestVideo ;
    }


    public void uploadVideo(String title){
        this.latestVideo = title;
        System.out.println("["+name + " uploaded " + "\""+title + "\"]");
        notifySubscribers();
    }
}
