package task0;

public class AlarmClock {
    private static final String model = "clock2541";
    private String owner;

    public AlarmClock(String owner) {
        this.owner = owner;
    }

    public void wakeUp() {
        System.out.println(owner + " kelkis");
    }
}
