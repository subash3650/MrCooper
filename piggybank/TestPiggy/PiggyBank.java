import java.util.Scanner;

class PiggyBank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter username");
       String username = sc.next();

       System.out.println("Enter password");
       String password = sc.next();

       System.out.println("Enter name");
       String name = sc.next();

       System.out.println("Enter email");
       String email = sc.next();
       
       User user = new User(username, password, name, email, 0);
       user.SignUp();

       Savings saving = new Savings();
       Budget budget = new Budget(username, password);
       Challenges challenges = new Challenges("Savings Goal", 100.0);

       while(true){
        System.out.println("\n Welcome to the Piggy Bank application");
        System.out.println("Choose an Option");

        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. Add savings");
        System.out.println("4. View Savings");
        System.out.println("5. Add Budget");
        System.out.println("6. Set Deadline");
        System.out.println("7. Change Budget");
        System.out.println("8. Change Savings");
        System.out.println("9. Exit");
        System.out.println("Enter Choice");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter Income amount");
                int income = sc.nextInt();
                user.addIncome(income);
                break;

            case 2:
                System.out.println("Enter expense amount");
                int expense = sc.nextInt();
                user.addExpense(expense);
                break;

            case 3:
                System.out.println("Enter Saving Category");
                String Category = sc.next();
                System.out.println("Enter amount");
                int budget = sc.nextInt();
                save.addSaving(Category, budget);
                break;

            case 4:
                save.viewSavings();
                break;

            case 5:
                System.out.println("Enter Budget category");
                String category = sc.next();
                System.out.println("Enter amount");
                int amount = sc.nextInt();;
                save.addBudget(category, amount);
                break;

            case 6:
                System.out.println("Enter category");
                String category = sc.next();
                System.out.println("Enter Deadline");
                String date = sc.next();
                save.addDeadline(category, date);
                break; 

            case 7:
                System.out.println("Enter the change value of Budget");
                String change = sc.next();
                System.out.println("Enter the amount");
                int amount = sc.next();
                challenges.changeBudget(change, amount);
                break;

            case 8:
                System.out.println("Enter the change value of Saving");
                String change = sc.next();
                System.out.println("Enter the amount");
                int amount = sc.next();
                challenges.changeSavings(change, amount);
                break;  

            case 9:
                System.out.println("Exiting from the application.......");
                break;

            default:
                System.out.println("The choice is invalid");              
        }

       } 
    }
}