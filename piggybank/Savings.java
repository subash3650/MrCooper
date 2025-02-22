import java.util.HashMap;

class Savings{
    private HashMap<String, Double> savecat = new HashMap<>();
    private HashMap<String, String> deadline = new HashMap<>();
    private HashMap<Double, String> budgetDes = new HashMap<>();

    public void addgoal(String cat, double amt, String date){
        savecat.put(cat, amt);
        deadline.put(cat, date);
        System.out.println("Saving Goals added successfully" + cat + "," + date);
    }

    public void addgoal(String cat, double amt){
        savecat.put(cat, amt);
        System.out.println("Saving Goals added successfully" + cat + "," + amt);
    }

    public void viewParticularSaving(String str){
        for(String goal : savecat.keySet()){
            if(goal.equals(str)){
                System.out.println(savecat.get(goal));
            }
            else{
                System.out.println("Saving category not found");
            }
        }
    }

    public void addBudgetDescription(double amount, String description){
        budgetDes.put(amount, description);
    }

    public void ViewBudgetDes(){
        for(Double amt : budgetDes.keySet()){
            System.out.println(amt);
            System.out.println(budgetDes.get(amt));
        }
    }
    public void allGoal(){
        for(String goal : savecat.keySet()){
            System.out.println("the budget of" + goal + " " + savecat.get(goal));
        }
    }

    public void showDeadline(String cat){
        for(String s : deadline.keySet()){
            if(s.equals(cat)){
                System.out.println("The deadline is" + " " + deadline.get(s));
                break;
            }
        }
    }
    public void addBudgettoGoal(String bs, int money){
        for(String b : savecat.keySet()){
            if(b.equals(bs)){
                double c = savecat.get(b);
                savecat.put(b, c+money);
                System.out.println("Amount added to the budget successfully");
                break;
            }
        }
        System.out.println("Category Not found");
    }
}
