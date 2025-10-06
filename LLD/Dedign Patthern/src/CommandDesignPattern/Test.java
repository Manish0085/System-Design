package CommandDesignPattern;

public class Test {

    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        RemoteController remote = new RemoteController();

        remote.setCommand(0, new LightCommand(light));
        remote.setCommand(1, new FanCommand(fan));

        System.out.println("----- Toggling light Button 0 ----- ");
        remote.pressButton(0); // ON
        remote.pressButton(0); // OFF


        System.out.println("\n\n----- Toggling Fan Button 1 ----- ");
        remote.pressButton(1); // ON
        remote.pressButton(1); // OFF


    }
}
