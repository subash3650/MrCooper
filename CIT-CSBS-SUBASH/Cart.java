class Cart {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println("🛒 " + item.itemName + " added to cart.");
    }

    public void removeItem(Item item) {
        items.remove(item);
        System.out.println("🗑️ " + item.itemName + " removed from cart.");
    }

    public double getTotalAmount() {
        double total = 0;
        for (Item item : items) {
            total += item.amount;
        }
        return total;
    }

    public void showCart() {
        if (items.isEmpty()) {
            System.out.println("🛒 Your cart is empty.");
            return;
        }
        System.out.println("🛍️ Cart Items:");
        for (Item item : items) {
            System.out.println("- " + item.itemName + " ($" + item.amount + ")");
        }
        System.out.println("💰 Total: $" + getTotalAmount());
    }
}
