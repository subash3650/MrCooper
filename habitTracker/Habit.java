abstract class Habit {
    protected String name;
    protected int duration;

    public Habit(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public abstract void track();

    public void display() {
        System.out.println("Habit: " + name + " - Duration: " + duration + " minutes");
    }
}
