package WeeklyTurnIn.Assignment3;

public class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }


    public String getType(){
        return type;
    }

    public double getbAmount() {
        return amount;
    }


    public String toString(){
        return "Type: " + type + "\n Amount: " + amount;

    }





}
