class Light {

    void turnOn() {
        System.out.println("Light is turned ON");
    }

}

class Fan {

    void start() {
        System.out.println("Fan is started");
    }

}

public class SmartHome {

    private Light light;
    private Fan fan;

    public SmartHome() {
        light = new Light();
        fan = new Fan();
    }

    void activateHome() {
        light.turnOn();
        fan.start();
    }

    public static void main(String[] args) {

        SmartHome home = new SmartHome();
        home.activateHome();

    }
}