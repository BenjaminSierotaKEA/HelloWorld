package StuffOnClasses.ChauffoerOpgave;

public class Bil {
    private String farve;
    private double kilosmetersDriven;
    private double nyPris;

    private Chauffoer currentDriver;


    public Bil (String farve, double kilosmetersDriven, double nyPris){
        this.farve = farve;
        this.kilosmetersDriven = kilosmetersDriven;
        this.nyPris = nyPris;
    }

    public void drive(int distance){
        if (distance >= 0){
            kilosmetersDriven += distance;
        }
    }

    public double getNyPris(){
        return nyPris;
    }

    @Override
    public String toString(){
        String firstSeg = "BIL. Farve: " + farve + " Kilometere kørt: " + kilosmetersDriven + " Nypris: " + nyPris + " ";
        String secondSeg;
        if (currentDriver == null){
            secondSeg = "Driver: No Driver";
        }else{
            secondSeg = "Driver: " + currentDriver.getNavn();
        }
        return firstSeg + secondSeg;
    }

    public boolean driverGetsIn(Chauffoer c){
        if (currentDriver == null){
            currentDriver = c;
            return  true;
        }else{
            return false;
        }
    }

    public Chauffoer hvemKoererBilen(){
        return currentDriver;
    }

    public Chauffoer driverGetsOut(){
        Chauffoer c = currentDriver;
        currentDriver = null;
        return c;
    }

}
