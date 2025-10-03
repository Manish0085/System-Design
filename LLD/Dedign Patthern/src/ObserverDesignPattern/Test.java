package ObserverDesignPattern;

public class Test {

    public static void main(String[] args) {
        Channel channel = new Channel("CoderArmy");

        Subscriber sub1 = new Subscriber("Varun", channel);
        Subscriber sub2 = new Subscriber("Aditya", channel);
        Subscriber sub3 = new Subscriber("Tanya", channel);

        channel.subscribe(sub1);
        channel.subscribe(sub3);
        channel.subscribe(sub2);

        channel.uploadVideo("Observer Design Pattern");

        // Aditya unsubscribe the channel
        channel.unSubscribe(sub2);

        channel.uploadVideo("Decorator Design Pattern");
    }


}
