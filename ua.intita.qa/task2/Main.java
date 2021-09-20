package task2;

public class Main {
    public static void main(String[] args) {
        Wheel wheel = new Wheel("Bridgestone", 17.0, "winter");
        Engine engine = new Engine("Vaz", 3.4, "turbo-diesel");
        Automobile automobile = new Automobile("Vaz", 2021, "pink", wheel, wheel, wheel, wheel, engine);

        engine.go();
        automobile.refuel();
        wheel.changeTheWheel();
        System.out.println(automobile.getLabel());
    }

}
