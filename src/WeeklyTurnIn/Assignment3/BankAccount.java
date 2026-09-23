package WeeklyTurnIn.Assignment3;
import java.util.ArrayList;

public class BankAccount {
    private String name;
    private double balance;
    private ArrayList<Transaction> transactions;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.transactions = new ArrayList<Transaction>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        if(this.transactions == null) { //This creates the transactoin array if it dosnt exsist
            transactions = new ArrayList<Transaction>();
            this.transactions.add(new Transaction("Deposit", amount));
        }
        else{
            this.transactions.add(new Transaction("Deposit", amount));
        }

    }

    public void Whitdraw(double amount) {
        if(this.transactions == null) { //This creates the transactoin array if it dosnt exsist
            transactions = new ArrayList<Transaction>();
        }
            if (this.getBalance() > amount) {
            this.balance -= amount;
            transactions.add(new Transaction("Whitdraw", amount));
        }
        else{
            System.out.println("You got insufficient funds");
        }
    }

    public void printTransactionHistory() {
        for(Transaction i : this.transactions) {
            System.out.println(i);
        }
    }

    public void findLargestX(String type){
        Transaction find = transactions.get(0);
        for(int i = 0; i < transactions.size(); i++) {
            if(this.transactions.get(i).getType() == type) {
                if(transactions.get(i).getbAmount() > find.getbAmount()) {
                    find = transactions.get(i);
                }
            }
        }
        System.out.println(find);
    }


    public String toString() {
        return "Owner: " + name + "\n Balance: " + balance +  "\n Transactions: " + transactions;
    }





}
