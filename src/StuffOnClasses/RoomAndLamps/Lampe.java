package StuffOnClasses.RoomAndLamps;

public class Lampe {
    private boolean isOn = false;
    private static int totalLamps = 0;

    public Lampe(){
        this.isOn = false;
        this.totalLamps++;
    }
    public Lampe(Boolean isOn){
        this.isOn = isOn;
        this.totalLamps++;
    }

    public static int getTotalLamps(){
        return totalLamps;
    }

    public boolean getIsOn(){
        return isOn;
    }

    public void pressSwitch(){
        isOn = !isOn;
    }

    //overrides the inherited function, so that when the object is printed this happens
    @Override
    public String toString(){
        if(isOn){
            return "Lampen er tændt";
        }else {
            return "Lampen er slukket";
        }
    }
}
