class User extends Account{
    private String name;
    private String email;

    public User(String username, String password, String name, String email, int balance){
        super(username, password, balance);
        this.name = name;
        this.email = email;
    }

    public void addIncome(int amount){
        balance += amount;
        System.out.println("Income added Successfully");
    }

    public void addExpense(int amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            balance -= amount;
            System.out.println("Expence recorded");
        }
    }

    public void SignIn(){
        System.out.println(Signed In);
    }

    public void SignUp(){
        System.out.println(Signed up);
    }
    
}
