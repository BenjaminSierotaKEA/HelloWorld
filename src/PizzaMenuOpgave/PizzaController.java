package PizzaMenuOpgave;

import java.util.ArrayList;

public class PizzaController {
    private PizzaMenu pizzaMenu;

    public PizzaController(PizzaMenu pizzaMenu){
        this.pizzaMenu = pizzaMenu;
    }


    public PizzaMenu getPizzaMenu(){
        return pizzaMenu;
    }

    public void addNewPizza(String pizzaName, String pizzaSauce, ArrayList<String> pizzaToppings){
        pizzaMenu.addPizza(pizzaName, pizzaSauce, pizzaToppings);
    }

}
