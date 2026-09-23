package WeeklyTurnIn.Assignment6;

public class main {

    void main() {
        Inventory i1 = new Inventory("Andreas", 30);
        Inventory i2 = new Inventory("Tanya", 120);

        Item a1 = new Item("Frost", 20, "Sword");
        Item a2 = new Item("Fire", 500, "Sword");
        Item a3 = new Item("Wind", 10, "sheild");

        i1.addIteam(a1);
        i1.addIteam(a3);

        i2.addIteam(a2);
        i2.addIteam(a3);

        System.out.println(Item.getTotalIteamsCreated());

    }
}
