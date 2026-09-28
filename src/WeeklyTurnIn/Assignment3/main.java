package WeeklyTurnIn.Assignment3;
import java.util.Scanner;

public class main {
    Scanner input = new Scanner(System.in);

    void main() {
        BankAccount b1 = new BankAccount("Andreas", 1000);
        b1.deposit(getAmount());
        b1.deposit(1000);
        b1.printTransactionHistory();
        b1.findLargestX("Deposit");


        System.out.println(b1.getBalance());


    }

    public double getAmount() {
        System.out.println("Insert amount");
        double amount = input.nextDouble();
        return amount;
    }
}
