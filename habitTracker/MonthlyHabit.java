class MonthlyHabit extends Habit {
    private int timesPerMonth;

    public MonthlyHabit(String name, int duration, int timesPerMonth) {
        super(name, duration);
        this.timesPerMonth = timesPerMonth;
    }

    @Override
    public void track() {
        System.out.println("Tracking monthly habit: " + name + " (" + timesPerMonth + " times per month)");
    }
}
