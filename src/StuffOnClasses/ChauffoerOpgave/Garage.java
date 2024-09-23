package StuffOnClasses.ChauffoerOpgave;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Bil> biler;

    public Garage(){
        this.biler = new ArrayList<Bil>();
    }

    public void addCar(Bil carToAdd){
        biler.add(carToAdd);
    }

    public double totalPrice(){
        double total = 0.0;
        for(Bil i : biler){
            total += i.getNyPris();
        }
        return total;
    }
}
