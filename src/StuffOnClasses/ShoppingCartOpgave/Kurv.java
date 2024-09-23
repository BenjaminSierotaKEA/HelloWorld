package StuffOnClasses.ShoppingCartOpgave;

import java.util.ArrayList;

public class Kurv {

    private ArrayList<OrdreLinje> orders;

    public Kurv(){
        orders = new ArrayList<OrdreLinje>();

    }

    public void addLine(OrdreLinje line){
        orders.add(line);
    }

    public double totalPrice(){
        double total = 0;
        for(OrdreLinje i : orders){
            total += i.totalPrice();
        }
        return  total;
    }

    @Override
    public String toString(){
        String result = "";
        for(OrdreLinje i : orders){
            result = result + i + "\n";
        }
        result = result + "Total Price:" + totalPrice() + "Kr";
        return  result;
    }

}
