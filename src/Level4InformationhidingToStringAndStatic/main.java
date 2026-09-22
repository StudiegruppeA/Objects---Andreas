package Level4InformationhidingToStringAndStatic;

import java.util.ArrayList;

public class main {

    void main() {


        Player p1 = new Player("ame", 100);

        Item i1 = new Item("Frost", "Weapon", 20);

        Item i2 = new Item("Blink", "amor", 30);
        p1.buyItem(i1);
        p1.buyItem(i2);

        System.out.println(Item.getIteamsCreated());

        System.out.println(p1);

        p1.find("amor");

    }
}
