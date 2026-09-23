package UndervisningOnsdag;

public class Drivers {
    private String name;
    private String car;

    public Drivers(String name, String car) {
        this.name = name;
        this.car = car;
    }

    public String toString(){
        return "Driver: " + name + " Car: " + car;
    }


}
