package Level2InstanceMethods;

public class iteam {
    String name;
    double price;
    int stock;

    iteam(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    boolean isInStock() {
        if(this.stock > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    boolean isExpensive() {
        if(this.price > 1000) {
            return true;
        }
        else {
            return false;
        }
    }


    boolean canSellAmount(int amount) {
        if(this.stock >= amount) {
            return true;
        }
        else {
            return false;
        }
    }

    void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Stock: " + this.stock);
        System.out.println("Price: " + this.price);
    }


}
