class SuperAdmin extends Admin {
    public SuperAdmin(int adminId, String name, String username, String password) {
        super(adminId, name, username, password);
    }

    @Override
    public void updateProduct(Item item) {
        System.out.println("✅ SuperAdmin updated product: " + item.itemName);
    }
}
