class Bank {
    private String Name;
    private int age;
    private String email;
    private String password;
    
    public Bank(String Name, int age, String email, String password) {
        this.Name = Name;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public String getName() { return Name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
}