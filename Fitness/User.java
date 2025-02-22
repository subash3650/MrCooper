class User {
    private String name;
    private int age;
    private String email;
    private String password;
    private double weight;
    private double height;
    private String category;

    public User(String name, int age, String email, String password, double weight, double height, String category) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
        this.weight = weight;
        this.height = height;
        this.category = category;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public double getWeight() { return weight; }
    public double getHeight() { return height; }
    public String getCategory() { return category; }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
