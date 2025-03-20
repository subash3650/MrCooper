class DailyHabit extends Habit {
    public DailyHabit(String name, int duration) {
        super(name, duration);
    }

    @Override
    public void track() {
        System.out.println("Tracking daily habit: " + name);
    }
}
