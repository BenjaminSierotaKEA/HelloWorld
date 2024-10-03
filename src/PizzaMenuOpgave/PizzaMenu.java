package PizzaMenuOpgave;

import java.util.ArrayList;

public class PizzaMenu {

    private ArrayList<Pizza> menu;

    public PizzaMenu(){
        menu = new ArrayList<Pizza>();
    }

    public ArrayList<Pizza> getMenu(){
        return menu;
    }

    public void addPizza(String name, String sauce, ArrayList<String> toppings){
        Pizza pizza = new Pizza(name, sauce, toppings);
        menu.add(pizza);
    }

    @Override
    public String toString(){
        String result = "MENU: \n";
        for(Pizza p: menu){
            result += p + "\n";
        }
        return result;
    }

}
