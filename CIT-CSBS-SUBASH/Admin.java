import java.util.*;

abstract class Admin {
    int adminId;
    String name;
    String username;
    String password;

    public Admin(int adminId, String name, String username, String password) {
        this.adminId = adminId;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void addProduct(Item item, List<Item> inventory) {
        inventory.add(item);
        System.out.println("✅ Product '" + item.itemName + "' added successfully.");
    }

    public abstract void updateProduct(Item item);
}
