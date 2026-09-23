package UndervisningOnsdag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Arraylist {

    //Arraylist = an adjustable array that is always the length of objects.
    //i.e starts with 0 and when i put 5 in it it will be 5 long

    //Arraylist<String> cars = new arraylist<String>();
    //Arraylist = the type of list
    //<String> = the data type, could also be an object or whatever
    //= new arraylist<String>(); = creating a new list with this thing
    //car.add("test") Here i am adding that to the list.


    Scanner input = new Scanner(System.in);
    int userInput = 0;

    ArrayList<Drivers> drivers = new ArrayList<Drivers>();
    void main() {


        ArrayList<String> menu = new ArrayList<String>();

        menu.add("1) Register driver");
        menu.add("2) Show all drivers");
        menu.add("3) quit");


       while(userInput != 3) {
           displaymenu(menu);
           getInput();
           switch (userInput) {
               case 1 -> registerDriver();
               case 2 -> showAllDrivers();
               case 3 -> System.out.println("Bye bye");
               default -> System.out.println("please enter a valid number");
           }

       }


    }

    void registerDriver() {
        input.nextLine();
        System.out.println("Who do you wanna register?");
        String driverName = input.nextLine();


        System.out.println("What car do they drive?");
        String carName = input.nextLine();

        drivers.add(new Drivers(driverName, carName));

    }

    void showAllDrivers(){
        if(drivers.size() == 0) {
            System.out.println("There are no cars noob");
        }
        for(Drivers l : drivers) {
            System.out.println(l);
        }
    }

    void displaymenu(ArrayList<String> menu) {
        for(String l : menu) {
            System.out.println(l);
        }
    }

    void getInput() {
        System.out.println("What do you wana do?");
        userInput = input.nextInt();
    }

}
