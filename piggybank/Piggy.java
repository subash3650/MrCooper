import java.util.Scanner;

class Piggy {
    public static void main(String[] args) {
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
        
        Bank bk = new Bank(Name, age, email, password);
        Account acc = new Account();
        Savings sav = new Savings();
        
        while (true) {
            System.out.println("\n=== Piggy Bank Menu ===");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Add new Goal");
            System.out.println("5. Add new Goal with deadline");
            System.out.println("6. Get a goals Goal");
            System.out.println("7. Get all goals Goal");
            System.out.println("8. Enter the category to see the deadline");
            System.out.println("9. Enter the Goal with description");
            System.out.println("10. See all the Goal and Description");
            System.out.println("11. Total money Circulated");
            System.out.println("12. View all the deposited amounts");
            System.out.println("13. View all the Withdrawed amounts");
            System.out.println("14. Add Budget to a goal");
            System.out.println("15. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter money to deposit:");
                    double dep = sc.nextDouble();
                    acc.addBalance(dep);
                    break;

                case 2:
                    System.out.println("Enter money to withdraw:");
                    double wit = sc.nextDouble();
                    acc.withdraw(wit);
                    break;

                case 3:
                    System.out.println("Your balance is: ₹" + acc.getBalance());
                    break;

                case 4:
                    System.out.println("Enter the Category");
                    String str = sc.nextLine();
                    System.out.println("Enter the Goal");
                    double budget = sc.nextDouble();
                    sc.nextLine();
                    sav.addgoal(str, budget);
                    break;
                
                case 5:
                    System.out.println("Enter the Goal");
                    String s = sc.nextLine();
                    System.out.println("Enter the Budget");
                    double b = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter the deadline");
                    String date = sc.nextLine();
                    sav.addgoal(s, b, date);
                    break;

                case 6:
                    System.out.println("Enter the Goal");
                    String category = sc.nextLine();
                    System.out.println("Enter the Budget");
                    sav.viewParticularSaving(category);
                    break;

                case 7:
                    sav.allGoal();
                    break;
                
                case 8:
                    System.out.println("Enter the category");
                    String deadcat = sc.nextLine();
                    sav.showDeadline(deadcat);
                    break;

                case 9:
                    System.out.println("Enter Budget");
                    double amount = sc.nextInt();
                    System.out.println("Enter Description");
                    String desc = sc.nextLine();
                    sc.nextLine();
                    sav.addBudgetDescription(amount, desc);
                    System.out.println("Budget and Description added successfully");
                    break;

                case 10:
                    sav.ViewBudgetDes();
                    break;

                case 11:
                    System.out.println(acc.getTotal());
                    break;

                case 12:
                    acc.displayDeposits();
                    break;

                case 13:
                    acc.displayWithdraw();
                    break;

                case 14:
                    String bs = sc.nextLine();
                    int money = sc.nextInt();
                    sav.addBudgettoGoal(bs, money);
                    break;

                case 15:
                    System.out.println("Thank you for using Piggy Bank! Goodbye.");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}
