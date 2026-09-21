package Level1ClassesAndObjectsBasics;

public class Car {
    private String brand;
    private int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrand() {
        return brand;
    }

    public void incrementSpeed(int amount) {
        this.speed += amount;
    }

}
