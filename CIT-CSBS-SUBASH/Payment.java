class Payment {
    public boolean pay(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("💳 Payment required: $" + amount);
        System.out.print("Enter amount to pay: $");
        double enteredAmount = scanner.nextDouble();

        if (enteredAmount == amount) {
            System.out.println("✅ Payment successful!");
            return true;
        } else {
            System.out.println("❌ Payment failed! Incorrect amount.");
            return false;
        }
    }
}
