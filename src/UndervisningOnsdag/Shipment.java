package UndervisningOnsdag;


//entity class
//This represent something, its mearly a storage for data that could change.
public class Shipment {
    private int hoursToDeliver;
    private int palletCount;
    private String destanation;
    private String depature;
    private double weight;
    private double tax;


     public Shipment(String destanation, String depature, int palletCount){
        this.destanation = destanation;
        this.depature = depature;
        this.palletCount = palletCount;
    }


    //Getters

    public double getWeight() {
        return weight;
    }


    //Setters

    public void setHoursToDeliver(int hoursToDeliver) {
        this.hoursToDeliver = hoursToDeliver;
    }

    public void setDestanation(String destanation) {
        this.destanation = destanation;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setWeight(double weight) {
        this.weight = weight * palletCount;
    }


    public String toString() {
         return "Time: " + hoursToDeliver + " Depature: " + depature + " Destination: " + destanation + " Weight: " + weight + " PalletCount: " + palletCount + " Weight" + getWeight();
    }
    //Metoder











}
