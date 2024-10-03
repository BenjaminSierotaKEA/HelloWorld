package PizzaMenuOpgave;

import java.util.ArrayList;

public class Pizza {
    String name;
    String sauce;
    ArrayList<String> toppings;

    public Pizza(String name, String sauce, ArrayList<String> toppings){
        this.name = name;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public String getName(){
        return name;
    }

    public String getSauce(){
        return sauce;
    }

    public ArrayList<String> getToppings(){
        return toppings;
    }

    @Override
    public String toString(){
        String result = getName().toUpperCase() + "\n";
        result += "Sauce: " + getSauce() + ". Toppings: ";
        for(int i = 0; i < toppings.size(); i++){
            if (toppings.size() == 1){
                result += toppings.get(i) + ".";
            }
            else if (i == toppings.size()-1){
                result += " and " + toppings.get(i) + ".";
            }else{
                result += toppings.get(i);
                if(i < toppings.size() -2){
                    result +=  ", ";
                }
            }
        }

        return result;
    }

}
