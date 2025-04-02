abstract class Account{
    protected int balance;
    protected String username;
    protected String password;

    public Account(String username, String password, int balance){
        this.username = username;
        this.password = password;
        this.balance = balance;
    }
    public abstract void addIncome(int amount);
    public abstract void addExpense(int amount);

    public int getBalance() return balance;
}
