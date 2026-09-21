package Level2InstanceMethods;

public class Subscription {
    String service;
    double monthlyPrice;
    int monthsActive;
    boolean autoRenew;


    Subscription(String service, double monthlyPrice, int monthsActive, boolean autoRenew) {
        this.service = service;
        this.monthlyPrice = monthlyPrice;
        this.monthsActive = monthsActive;
        this.autoRenew = autoRenew;
    }

    void renew() {
        if(autoRenew) {
            System.out.println("Auto renew!");
            System.out.println(service);
            monthsActive++;
        }
        else {
            System.out.println("Auto renew failed as subscription to " + service + " is inactive");
        }
    }

    void cancel() {
        System.out.println("You have canceled your subscription to " + service);
        autoRenew = false;
    }

    void reActivate() {
        System.out.println("You have activated your subsctipon to" + service );
        autoRenew = true;
    }

    double getTotalPaid() {
        return monthsActive * monthlyPrice;
    }

    double getYearlyCost() {
        return 12 * monthlyPrice;
    }

    boolean isCheaperThan(Subscription other) {
        return this.monthlyPrice < other.monthlyPrice;
    }

    void printInfo() {
        System.out.println("service: " + service);
        System.out.println("Monthly price: " + monthlyPrice);
        System.out.println("Months active: " + monthsActive);
        System.out.println("Total paid for service: " + getTotalPaid());
        System.out.println("Autorenew:" + autoRenew);
    }



}
