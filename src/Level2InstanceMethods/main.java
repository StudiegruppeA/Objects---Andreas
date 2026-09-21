package Level2InstanceMethods;
import java.util.Scanner;
public class main {


    Subscription[] services = new Subscription[5];
    Scanner input = new Scanner(System.in);
    String userInput;
    void main() {
        services[0] = new Subscription("YouTube", 140.99, 2, true);
        services[1] = new Subscription("Blizzard", 99, 100, true);
        services[2]  = new Subscription("Viaplay", 130, 10, true);
        services[3] = new Subscription("Disney", 80, 5, true);
        services[4] = new Subscription("hbo", 120, 20, true);


        double yearlyCosts = 0;
        int randomNumber1 = (int) (Math.random() * 5);
        int randomNumber2;
        if(randomNumber1  == 4) {
            randomNumber2 = randomNumber1 - 1;
        }
        else {
            randomNumber2 = randomNumber1 +1;
        }


        for(int i = 0; i < 12; i++) {
            if (i == 3) {
                services[randomNumber1].cancel();
                services[randomNumber2].cancel();
            } else if (i == 6) {
                services[randomNumber1].reActivate();

            }
            for(Subscription service : services) {
                service.renew();
                if(service.autoRenew) {
                    System.out.println("1 month cost = " + service.monthlyPrice);
                    yearlyCosts += service.monthlyPrice;
                }
            }
        }

        for(Subscription service : services) {
            service.printInfo();
            System.out.println("=======");
        }


        System.out.println(yearlyCosts);

        System.out.println((int) (Math.random() * 4));
    }


    int getRandom() {
        return (int) Math.random() * 5;
    }
    int getAmount() {
        System.out.println("What amount would you like");
        return input.nextInt();
    }

    void displayMenu(String[] menu) {
        for(String option : menu) {
            System.out.println(option);
        }
    }

    String getUserInput() {
        userInput = input.nextLine().toLowerCase();
        return userInput;

    }


}
