package Level1ClassesAndObjectsBasics;

public class BankAccount {

    String owner;
    int balance;

    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    public String getOwner(){
        return this.owner;
    }

    public int getBalance() {
        return this.balance;
    }

    public void whitdrawnMoney(int amount) {
       this.balance -= amount;
    }

}
