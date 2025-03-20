import java.util.ArrayList;
import java.util.Scanner;

public class HabitTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        User currentUser = null;

        while (true) {
            System.out.println("Welcome to the Habit Tracker!");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Create a username: ");
                    String username = scanner.nextLine();
                    System.out.print("Create a password: ");
                    String password = scanner.nextLine();

                    User newUser = new User(name, username, password);
                    users.add(newUser);
                    System.out.println("Registration successful! You can now log in.");
                    break;

                case 2:
                    System.out.print("Enter your username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String loginPassword = scanner.nextLine();

                    boolean loggedIn = false;
                    for (User user : users) {
                        if (user.getUsername().equals(loginUsername) && user.getPassword().equals(loginPassword)) {
                            currentUser = user;
                            loggedIn = true;
                            break;
                        }
                    }

                    if (loggedIn) {
                        System.out.println("Login successful! Welcome, " + currentUser.getName() + ".");
                        userMenu(scanner, currentUser);
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using Habit Tracker. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void userMenu(Scanner scanner, User user) {
        while (true) {
            System.out.println("\n--- Welcome to your Habit Tracker ---");
            System.out.println("1. Add Habit");
            System.out.println("2. Track Habit");
            System.out.println("3. View Habits");
            System.out.println("4. Log out");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter habit name: ");
                    String habitName = scanner.nextLine();
                    System.out.print("Enter duration in minutes: ");
                    int duration = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Is this a daily, weekly, or monthly habit? ");
                    String habitType = scanner.nextLine();

                    if (habitType.equalsIgnoreCase("daily")) {
                        user.addHabit(new DailyHabit(habitName, duration));
                    } else if (habitType.equalsIgnoreCase("weekly")) {
                        System.out.print("How many times per week? ");
                        int timesPerWeek = scanner.nextInt();
                        user.addHabit(new WeeklyHabit(habitName, duration, timesPerWeek));
                    } else if (habitType.equalsIgnoreCase("monthly")) {
                        System.out.print("How many times per month? ");
                        int timesPerMonth = scanner.nextInt();
                        user.addHabit(new MonthlyHabit(habitName, duration, timesPerMonth));
                    } else {
                        System.out.println("Invalid habit type.");
                    }
                    break;

                case 2:
                    user.trackHabit(scanner);
                    break;

                case 3:
                    user.displayHabits();
                    break;

                case 4:
                    System.out.println("Logging out...");
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
