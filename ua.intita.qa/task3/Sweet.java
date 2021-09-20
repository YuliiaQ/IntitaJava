package task3;

public class Sweet implements Comparable<Sweet> {


    protected String name;
    protected double weight;
    protected double sugarValue;

    public double getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }
    public double getSugarValue() {
        return sugarValue;
    }


    @Override
    public int compareTo(Sweet anotherSweet) {
        return this.name.compareTo(anotherSweet.name);
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugarValue=" + sugarValue +
                '}';
    }
}
