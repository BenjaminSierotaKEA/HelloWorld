package StuffOnClasses.CirklerOgFirkanter;

public class Cirkel {
    double radius;

    public Cirkel(double radius){
        this.radius = radius;
    }

    public double beregnAreal(){
        return Math.PI * Math.pow(radius,2);
    }
}
