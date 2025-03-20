import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String name;
    private String username;
    private String password;
    private ArrayList<Habit> habits;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.habits = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public void addHabit(Habit habit) {
        habits.add(habit);
    }

    public void trackHabit(Scanner scanner) {
        System.out.println("Which habit would you like to track?");
        for (int i = 0; i < habits.size(); i++) {
            System.out.println((i + 1) + ". " + habits.get(i).name);
        }

        int choice = scanner.nextInt();
        if (choice > 0 && choice <= habits.size()) {
            habits.get(choice - 1).track();
        } else {
            System.out.println("Invalid choice");
        }
    }

    public void displayHabits() {
        System.out.println("\nAll habits of " + name + ":");
        for (Habit habit : habits) {
            habit.display();
        }
    }
}
