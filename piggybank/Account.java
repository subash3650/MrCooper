import java.util.ArrayList;

class Account{
    private double balance;
    private double total;
    private ArrayList<Double> depo = new ArrayList<>();
    private ArrayList<Double> draw = new ArrayList<>();

    // public Account() {
    //     this.balance = 0.0;
    // }

    public double getBalance() {
        return balance;
    }

    public double getTotal(){
        return total;
    }
    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            total += amount;
            depo.add(amount);
            System.out.println("₹" + amount + " deposited successfully!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            total += amount;
            draw.add(amount);
            System.out.println("₹" + amount + " withdrawn successfully!");
            return true;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
            return false;
        }
    }
    
    public void displayDeposits(){
        for(int i=0; i<depo.size(); i++){
            System.out.println(depo.get(i));
        }
    }

    public void displayWithdraw(){
        for(int i=0; i<draw.size(); i++){
            System.out.println(draw.get(i));
        }
    }
}
