import java.util.ArrayList;
import java.util.Scanner;

class Fitness {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        String Name = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        System.out.println("Enter Password:");
        String password = sc.nextLine();

        System.out.println("Enter Weight:");
        double weight = sc.nextDouble();

        System.out.println("Enter Height:");
        double height = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Enter Category:");
        String category = sc.nextLine();

        User user = new User(Name, age, email, password, weight, height, category);
        FitnessTracker tracker = new FitnessTracker(user);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Workout");
            System.out.println("2. Add Food Log");
            System.out.println("3. View Workouts");
            System.out.println("4. View Food Logs");
            System.out.println("5. Generate Report");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Workout Name:");
                    String workoutName = sc.nextLine();
                    System.out.println("Enter Duration (in minutes):");
                    int duration = sc.nextInt();
                    System.out.println("Enter Calories Burned:");
                    double calories = sc.nextDouble();
                    tracker.addWorkout(new Workout(workoutName, duration, calories));
                    break;
                case 2:
                    System.out.println("Enter Food Name:");
                    String foodName = sc.nextLine();
                    System.out.println("Enter Calories:");
                    double foodCalories = sc.nextDouble();
                    tracker.addFoodlog(new FoodLog(foodName, foodCalories));
                    break;
                case 3:
                    tracker.displayWorkouts();
                    break;
                case 4:
                    tracker.displayFoodLogs();
                    break;
                case 5:
                    tracker.generateReport();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}