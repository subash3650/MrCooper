class WeeklyHabit extends Habit {
    private int timesPerWeek;

    public WeeklyHabit(String name, int duration, int timesPerWeek) {
        super(name, duration);
        this.timesPerWeek = timesPerWeek;
    }

    @Override
    public void track() {
        System.out.println("Tracking weekly habit: " + name + " (" + timesPerWeek + " times per week)");
    }
}
