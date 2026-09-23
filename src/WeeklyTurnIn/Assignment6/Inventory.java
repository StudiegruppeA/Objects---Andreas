package WeeklyTurnIn.Assignment6;
import java.util.ArrayList;

public class Inventory {
    private String playername;
    private ArrayList<Item> items;
    private int maxCapacity;

    public Inventory(String playername, int maxCapacity) {
        this.playername = playername;
        this.items = new ArrayList<Item>();
        this.maxCapacity = maxCapacity;
    }

    public String toString() {
        return "Player name: " + playername +"\nMaxCapacity: " + maxCapacity + "\n items:\n" + items;
    }

    public void addIteam(Item i) {
        if(maxCapacity > i.getValue()) {
            System.out.println(i);
            items.add(i);
        }
        else {
            System.out.println("Sadly you dont have room for this");
        }
    }

    public void getTotalValue() {
        if(!this.items.isEmpty()) {
            int sum = 0;
            for(Item i : items) {
                sum += i.getValue();
            }
            System.out.println("total value is: " + sum);
        }
        else {
            System.out.println("You dont have any items noob");
        }
    }

    public void findByType(String type) {
        for(Item i : items) {
            if(i.getYype() == type)
            System.out.println(i);
        }
    }

    public void printInventory() {
        System.out.println("Inventory for: " + this.playername);
        for(Item i : items) {
            System.out.println(i);
        }
    }
}
