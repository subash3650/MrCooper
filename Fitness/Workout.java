class Workout{
    private String workout;
    private int duration;
    private double calories;

    public Workout(String workout, int duration, double calories){
        this.workout = workout;
        this.duration = duration;
        ths.calories = calories;
    }
     public void displayWorkout() {
        System.out.println("Workout: " + exerciseName + " | Duration: " + duration + " min | Calories Burned: " + caloriesBurned);
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }
}
