package PizzaMenuOpgave;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaMain {
    public static void main(String[] args) {
        PizzaMenu menu = new PizzaMenu();
        PizzaController controller= new PizzaController(menu);
        PizzaUI ui = new PizzaUI(controller);
        ui.mainMenu();

    }


}
