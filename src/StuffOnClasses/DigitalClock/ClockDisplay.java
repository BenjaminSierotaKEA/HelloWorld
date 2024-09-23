package StuffOnClasses.DigitalClock;

public class ClockDisplay {
    private NumberDisplay minutes;
    private NumberDisplay hours;
    private String displayString;

    //constructor. creates two number display objects to display minutes and hours
    public ClockDisplay(){
        minutes = new NumberDisplay(60);
        hours = new NumberDisplay(24);
        updateDisplay();
    }
    public ClockDisplay(int minutes, int hours){
        this.minutes = new NumberDisplay(60);
        this.hours = new NumberDisplay(24);
        setTime(minutes, hours);
    }

    //does what it says on the tin
    public String getDisplayString() {
        return displayString;
    }

    //increments minutes. if minutes goes over 59, it increments hours
    public void timeTick(){
        minutes.increment();
        if(minutes.getValue() == 00){
            hours.increment();
        }
        updateDisplay();
    }

    public void setTime(int h, int m){
        hours.setValue(h);
        minutes.setValue(m);
        updateDisplay();

    }

    private void updateDisplay(){
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue();
    }
}
