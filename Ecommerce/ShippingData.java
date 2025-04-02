class ShippingData {
    String address;
    int id;

    public ShippingData(String address, int id) {
        this.address = address;
        this.id = id;
    }

    public void ship() {
        System.out.println("Order shipped to: " + address);
    }
}

class Notification {
    String message;

    public Notification(String message) {
        this.message = message;
    }

    public void notifyUser() {
        System.out.println("Notification: " + message);
    }
}
