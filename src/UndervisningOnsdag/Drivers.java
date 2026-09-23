package UndervisningOnsdag;

public class Drivers {
    private String name;
    private String car;
    private int id;
    private static int idCount = 0; //here we make this so all objects own this, it does not get reset. the class owns it not the object


    public Drivers(String name, String car) {
        this.name = name;
        this.car = car;
        this.id = idCount + 1;
        idCount++;
    }

    public String toString(){
        return "Driver: " + name + " Car: " + car + " ID: " + id;
    }


}
