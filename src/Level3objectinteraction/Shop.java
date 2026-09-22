package Level3objectinteraction;

public class Shop {
    String name;
    Item[] inventory;
    int itemCount;

    Shop(String name, int maxInventory) {
        this.name = name;
        this.inventory = new Item[maxInventory];
        this.itemCount = 0;
    }


    void addItem(Item i) {
        if(inventory.length > itemCount) {
            inventory[itemCount] = i;
            itemCount++;
            System.out.println("You have added " + i.name + " to your inventory");
        }
        else {
            System.out.println("Your inventory is sadly full");
        }
    }

    Item findCheepest() {
        Item cheap = inventory[0];
        for(Item i : inventory) {
            if(i == null) {
                break;
            }
            if(cheap.price > i.price) {
                cheap = i;
            }
        }
        return cheap;
    }

    Item findExpenisve() {
        Item expensive = inventory[0];
        for(Item i : inventory) {
            if(i == null) {
                break;
            }
            if(expensive.price < i.price) {
                expensive = i;
            }
        }
        return expensive;
    }


}
