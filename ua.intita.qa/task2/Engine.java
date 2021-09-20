package task2;

public class Engine {
    private String name;
    private double volume;
    private String type;

    public Engine(String name, double volume, String type){
        this.name=name;
        this.volume=volume;
        this.type=type;
    }
    public void go (){
        System.out.println("The engine has started and the car drove");
    }
}
