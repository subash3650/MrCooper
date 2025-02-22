
class FoodLog {
    private String foodName;
    private double calories;

    public FoodLog(String foodName, double calories) {
        this.foodName = foodName;
        this.calories = calories;
    }

    public void displayFoodLog() {
        System.out.println("Food: " + foodName + " | Calories: " + calories);
    }

    public double getCalories() {
        return calories;
    }
}