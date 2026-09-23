package WeeklyTurnIn.Assignment2;
import java.util.ArrayList;

public class Product {
    private String name;
    private double price;
    private ArrayList<String> tags;

    public Product(String name, double price, ArrayList<String> tags){
        this.name = name;
        this.price = price;
        this.tags = tags;
    }

    public String toString() {
        return "Name: " + name + "\n" + "Price: " + price + "\n" + "Tags: " + tags;
    }

    public Boolean hasTag(String tag) {
        for (String I : this.tags) {
            if (I.equals(tag)) {
                return true;
            }
        }
        return false;
    }

    public double getPrice() {
        return price;
    }

    public static void findMostExpensive(ArrayList<Product> array) {
        Product price = array.get(0);
        for(Product i : array) {
            if(i.getPrice() > price.getPrice()) {
                price = i;
            }
        }
        System.out.println(price);
    }

    public static void findBetween(double v1, double v2, ArrayList<Product> array) {
        for(Product i : array) {
            if(i.getPrice() > v1 && i.getPrice() < v2) {
                System.out.println(i);
            }
        }
    }


}
