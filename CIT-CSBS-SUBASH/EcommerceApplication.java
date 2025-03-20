public class EcommerceApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        List<Item> inventory = new ArrayList<>();
        Cart cart = new Cart();
        SuperAdmin admin = new SuperAdmin(1, "Admin", "admin", "admin123");
        admin.addProduct(new Item("Laptop", 101, 750.0), inventory);
        admin.addProduct(new Item("Phone", 102, 500.0), inventory);

        System.out.println("\nWelcome to the E-Commerce System!");

        while (true) {
            System.out.println("\n1️.Register\n2️ Login\n3️ Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) { 
                System.out.print("Enter name: ");
                String name = scanner.next();
                System.out.print("Enter age: ");
                int age = scanner.nextInt();
                System.out.print("Enter username: ");
                String username = scanner.next();
                System.out.print("Enter password: ");
                String password = scanner.next();

                users.add(new User(name, age, username, password));
                System.out.println("     Registration successful!");

            } else if (choice == 2) { 
                System.out.print("Enter username: ");
                String uname = scanner.next();
                System.out.print("Enter password: ");
                String pass = scanner.next();

                User loggedInUser = null;
                for (User u : users) {
                    if (u.login(uname, pass)) {
                        loggedInUser = u;
                        break;
                    }
                }

                if (loggedInUser != null) {
                    System.out.println(" Login successful!");
                    
                    while (true) {
                        System.out.println("\n1️ View Products\n2️ Add to Cart\n3️ View Cart\n4️ Checkout\n5️ Logout");
                        System.out.print("Choose an option: ");
                        int action = scanner.nextInt();

                        if (action == 1) {
                            System.out.println("\n Available Products:");
                            for (Item item : inventory) {
                                System.out.println("- " + item.itemName + " ($" + item.amount + ")");
                            }
                        } else if (action == 2) {
                            System.out.print("Enter product ID to add: ");
                            int productId = scanner.nextInt();
                            for (Item item : inventory) {
                                if (item.itemId == productId) {
                                    cart.addItem(item);
                                }
                            }
                        } else if (action == 3) {
                            cart.showCart();
                        } else if (action == 4) {
                            double totalAmount = cart.getTotalAmount();
                            if (totalAmount == 0) {
                                System.out.println("🛒 Your cart is empty.");
                            } else {
                                Payment payment = new Payment();
                                if (payment.pay(totalAmount)) {
                                    ShippingData shipping = new ShippingData("123 Main Street", 1);
                                    shipping.ship();
                                    new Notification("Your order has been placed successfully.").notifyUser();
                                }
                            }
                        } else if (action == 5) {
                            System.out.println("Logging out...");
                            break;
                        }
                    }
                } else {
                    System.out.println(" Invalid credentials!");
                }
            } else if (choice == 3) {
                System.out.println(" Exiting...");
                break;
            }
        }
        scanner.close();
    }
}
