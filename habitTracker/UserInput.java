class UserInput{
    public static void main(String args[]){
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
        
        while (true) {
            System.out.println("\n=== Habit Tracker Menu ===");
            System.out.println("1.");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.");
            System.out.println("7.");
            System.out.println("8.");
            System.out.println("9.");
            System.out.println("10.");
            System.out.println("11.");
            System.out.println("12.");
            System.out.println("13.");
            System.out.println("14.");
            System.out.println("15. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;
                
                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    break;
                
                case 8:
                    break;

                case 9:
                    break;

                case 10:
                    break;

                case 11:
                    break;

                case 12:
                    break;

                case 13:
                    break;

                case 14:
                    break;

                case 15:
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
    }
}