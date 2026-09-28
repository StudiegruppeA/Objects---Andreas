package WeeklyTurnIn.Assignment2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    void main() {

        ArrayList<String> a1 = new ArrayList<String>();
        ArrayList<String> a2 = new ArrayList<String>();
        ArrayList<String> a3 = new ArrayList<String>();
        ArrayList<String> a4 = new ArrayList<String>();

        a1.add("electronic");
        a1.add("new");

        a2.add("clothing");
        a2.add("used");

        a3.add("clothing");
        a3.add("new");

        a4.add("electronic");
        a4.add("used");


        ArrayList<Product> array = new ArrayList<Product>();

        array.add(new Product("Laptop", 800.99, a1));
        array.add(new Product("T-shirt", 30.99, a2));
        array.add(new Product("Shoes", 30.99, a3));
        array.add(new Product("TV", 400.99, a4));



        //Product.findMostExpensive(array);


        System.out.println(array.get(0).hasTag(""));
        //Product.findBetween(31, 1000, array);
    }
}
