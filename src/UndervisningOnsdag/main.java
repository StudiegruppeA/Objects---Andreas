package UndervisningOnsdag;

public class main {



    void main() {
        //Ship = refrence, objekt, instans,
        //Every time we make a new of these things.
        Shipment ship = new Shipment("København", "oslo", 10);


        ship.setWeight(20);

        System.out.println(ship.getWeight());

        //Works because im trying to do it on the object itself with the toString mehtod
        //if println does not get some text it will call the objects toStringMethod.
        System.out.println(ship);
    }
}
