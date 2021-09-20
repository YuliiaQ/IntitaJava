package task2;

public class Automobile {
    public String getLabel() {
        return label;
    }

    private String label;
    private int date;
    private String color;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Engine engine;

    public Automobile(String label, int date, String color, Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Engine engine){
        this.label=label;
        this.date=date;
        this.color=color;
        this.wheel1=wheel1;
        this.wheel2=wheel2;
        this.wheel3=wheel3;
        this.wheel4=wheel4;
        this.engine=engine;
    }
    public void refuel () {
        System.out.println("The car is being refueled");
    }
}
