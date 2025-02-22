class FitnessTracker {
    private User user;
    private ArrayList<Workout> workouts;
    private ArrayList<FoodLog> foodLogs;

    public FitnessTracker(User user) {
        this.user = user;
        this.workouts = new ArrayList<>();
        this.foodLogs = new ArrayList<>();
    }

    public void addWorkout(Workout workout) {
        workouts.add(workout);
        System.out.println("Workout added.");
    }

    public void addFoodlog(FoodLog foodLog) {
        foodLogs.add(foodLog);
        System.out.println("Food Log added.");
    }

    public void displayWorkouts() {
        System.out.println("\nWorkout History:");
        for (Workout workout : workouts) {
            workout.displayWorkout();
        }
    }

    public void displayFoodLogs() {
        System.out.println("\nFood Log History:");
        for (FoodLog foodLog : foodLogs) {
            foodLog.displayFoodLog();
        }
    }

    public void generateReport() {
        double totalCaloriesBurned = 0;
        for (Workout workout : workouts) {
            totalCaloriesBurned += workout.getCaloriesBurned();
        }

        double totalCaloriesConsumed = 0;
        for (FoodLog foodLog : foodLogs) {
            totalCaloriesConsumed += foodLog.getCalories();
        }

        System.out.println("\nHealth Report:");
        System.out.println("Total Calories Burned: " + totalCaloriesBurned);
        System.out.println("Total Calories Consumed: " + totalCaloriesConsumed);
        System.out.println("Net Calories: " + (totalCaloriesConsumed - totalCaloriesBurned));
    }
}