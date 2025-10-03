package ObserverDesignPattern;

public class Test {

    public static void main(String[] args) {
        Channel channel = new Channel("CoderArmy");

        Subscriber sub1 = new Subscriber("Varun", channel);
        Subscriber sub2 = new Subscriber("Aditya", channel);
        Subscriber sub3 = new Subscriber("Tanya", channel);

        channel.uploadVideo("Observer Design Pattern");
        channel.subscribe(sub1);

        // Aditya unsubscribe the channel
        channel.unSubscribe(sub2);

        channel.uploadVideo("Decorator Design Pattern");
    }


}
