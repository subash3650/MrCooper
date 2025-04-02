import java.util.HashMap;

class Savings{
    private HashMap<String, Integer> save = new HashMap<>();
    private HashMap<String, Integer> budget = new HashMap<>();
    private HashMap<String, Integer> deadline = new HashMap<>();

    public void addSaving(String category, int amount){
        save.put(category, save.getOrDefault(category, 0) + amount);
        System.out.println("Savings added"); 
    }

    public void addBudget(String category, int amount){
        budget.put(category, amount);
        System.out.println("Budget added Successfully");
    }

    public void addDeadline(String category, String date){
        deadline.put(category, date);
        System.out.println("Deadline set for" + category + "-" + date);
    }

    public void viewSavings(){
        System.out.println("Savings details");
        for(String s : map.keySet()){
            System.out.println(s);
            System.out.println(save.get(s));
        }
    }
}
