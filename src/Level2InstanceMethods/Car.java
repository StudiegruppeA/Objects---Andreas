package Level2InstanceMethods;

public class Car {
    String brand;
    int speed;
    int maxSpeed;
    int fuel;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
        this.maxSpeed = speed;
        this.fuel = 100;
    }

    void accelerate(int amount){
        this.speed += amount;
    }

    void brake(int amount) {
        this.speed -= amount;
    }

    void printStatus() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Speed: " + this.speed);
        System.out.println("Fuel: " + this.fuel);
    }

    void printAll() {
        printStatus();
        System.out.println(getSpeedCatefory());
        System.out.println(getInfo());
    }


    String getFuelStatus() {
        if (isLowFuel()) {
            return "We are ready to go!";
        }
        else {
            return "We are low on fuel";
        }
    }

    String getSpeedCatefory() {
        if(this.maxSpeed > 100) {
            return "Fast car";
        }
        else if(this.maxSpeed > 50) {
            return "normal car";
        }
        else {
            return "slow car";
        }

    }

    String getInfo() {
        return brand + " " + speed + "/" + maxSpeed + " km/h";
    }

    boolean isLowFuel() {
        return fuel <= 20;
    }
}


