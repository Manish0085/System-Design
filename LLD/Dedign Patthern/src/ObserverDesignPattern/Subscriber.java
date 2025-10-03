package ObserverDesignPattern;

public class Subscriber implements ISubscriber{

    private String name;
    private Channel channel;


    public Subscriber(String name, Channel ch){
        this.name = name;
        this.channel = ch;
    }


    @Override
    public void update() {
        System.out.println("Hey " + name + ",\n" + channel.getVideoData() +"\n");
    }
}
