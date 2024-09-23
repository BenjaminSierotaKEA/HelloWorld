package StuffOnClasses.DigitalClock;

public class DigitalClockDemo {
    public static void main(String[] args) {
        ClockDisplay clockDisplay = new ClockDisplay();

        clockDisplay.setTime(18, 59);
        for(int i = 0; i < 420; i++){
            clockDisplay.timeTick();
            String display = clockDisplay.getDisplayString();
            System.out.println(display);
        }
    }
}
