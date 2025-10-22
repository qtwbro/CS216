package Cities;

public class RankedCity extends City implements Comparable<City> {

    public RankedCity(String name, double area) {
        super(name, area);
        //TODO Auto-generated constructor stub
    }


    @Override
    public int compareTo(City o) {
    if (getArea() < o.getArea()) {
        return 1;
    } else if (getArea() > o.getArea()){
        return -1;
    } else if (getArea() == o.getArea()) {
        return extracomp(o);
    } else {
        return 0;
    }
  }

    public int extracomp(City o) {
        if (getName().length() > o.getName().length()) {
            return 1;
        } else {
            return -1;
        }
        
    }

}

