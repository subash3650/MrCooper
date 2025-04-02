class Challenges extends Savings{
    private String reason;
    private double changeOver;

    public Challenges(String reason, double changeOver){
        this.reason = reason;
        this.changeOver = changeOver;
    }

    public void changeBudget(String change, int amount){
        for(String s : budget.keySet()){
            if(s == change){
                budget.remove(s);
                budget.put(change, amount);
            }
        }
    }

    public void changeSavings(String change, int amount){
        for(String s : save.keySet()){
            if(s == change){
                save.remove(s);
                save.put(change, amount);
            }
        }
    }
}