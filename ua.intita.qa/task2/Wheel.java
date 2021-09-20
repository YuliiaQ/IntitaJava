package task2;

public class Wheel {
    private String name;
    private double radius;
    private String season;

    public Wheel (String name, double radius, String season){
        this.name=name;
        this.radius=radius;
        this.season=season;
    }
    public void changeTheWheel (){
        System.out.println("The wheel is being changed");
    }
}
