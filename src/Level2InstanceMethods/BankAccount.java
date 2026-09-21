package Level2InstanceMethods;

public class BankAccount {
    String ownerName;
    double balance;

    BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void whitdraw(double amount) {
        if(hasSufficentFunds(amount)) {
            this.balance -= amount;
        }
        else {
            errormsg();
        }

    }
    void transfer(BankAccount reciver,  double amount){
        if(hasSufficentFunds(amount)) {
            this.whitdraw(amount);
            reciver.deposit(amount);
        }
        else {
            errormsg();

        }
    }

    void printAccount () {
        System.out.println("Owner: " + this.ownerName);
        System.out.println("Balance: " + this.balance);
    }

    void errormsg() {
        System.out.println("Error insuficent funds");
    }

    boolean hasSufficentFunds(double amount) {
        if(this.balance >= amount) {
            return true;
        }
        return false;
    }


}
