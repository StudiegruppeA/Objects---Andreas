package Level4InformationhidingToStringAndStatic;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Item> inventory;
    private int gold;


    public Player(String name, int gold) {
        this.name = name;
        this.inventory = new ArrayList<>();
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public int getGold() {
        return gold;
    }

    public String toString() {
        return "Name: " + name + "Inventory: " + inventory + " Gold: " + gold;
    }


    public void euqip(Item item) {
       this.inventory.add(item);
    }

    public void removeItem(Item item) {
        if (inventory.contains(item)) {
            System.out.println("You have successful removed " + item.getName() + "from your inventory");
            this.inventory.remove(item);
        }
        else {
            System.out.println("Could not find" + item.getName() + " in your inventory");
        }
    }

    public void buyItem(Item item) {
        if (getGold() > item.getValue()) {
            System.out.println("You have bought: " + item.getName());
            System.out.println(item.getValue() + " has been deducted from your account");
            this.gold -= item.getValue();
            this.inventory.add(item);
        }
        else {
            System.out.println("You had insufficient funds");
        }
    }

    public void sellItem(Item item) {
        if (inventory.contains(item)) {
            System.out.println("You have sold" + item.getName());
            System.out.println(item.getValue() + " has been added to your gold");
            gold += item.getValue();
            this.inventory.remove(item);
        }
        else{
            System.out.println("You do not have " + item.getName() + " in your inventory");
        }
    }

    public boolean isValidType(String type) {
        if(type.equals("weapon") || type.equals("potion") || type.equals("amor")) {
            return true;
        }
        else{
            return false;
        }
    }

   public void find(String type) {
       System.out.println("Items with the " + type + " type");
       if (isValidType(type)) {
           for (Item l : inventory) {
               if (l.getType().equals(type)) {

                   System.out.println(l);
               }
           }
       }
       else {
           System.out.println("please enter valid type");
       }
   }




}
