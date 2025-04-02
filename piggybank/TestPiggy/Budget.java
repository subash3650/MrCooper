import java.util.HashMap;

class Budget extends Savings{
    private String username;
    private String password;
    private Map<String, String> dead = new HashMap<>();

    public Budget(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void addBudget(String category, int amount){
        budget.put(category, amount);
        System.out.println("Budget added");
    }

    public void addDeadline(String category, String deadline){
        dead.put(category, category);
        System.out.println("Deadline added");
    }
}