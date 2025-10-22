package Cities;

public class City {
    private final String name;
    private final double area;

    public City(String name, double area){
        this.name = name;
        this.area = area;
    }

    public String getName(){
        return this.name;
    }

    public double getArea(){
        return this.area;
    }

    @Override
    public String toString() {
        return this.name + " " + this.area;
    }
}
