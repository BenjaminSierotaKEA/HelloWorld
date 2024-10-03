package PizzaMenuOpgave;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaUI {

    private PizzaController controller;

    public PizzaUI(PizzaController controller){
        this.controller = controller;
    }
    public void mainMenu(){
        boolean exit = false;
        Scanner input = new Scanner(System.in);


        System.out.println("Hello, and welcome to the pizza menu maker.");

        while(exit == false){
            System.out.println("PLEASE SELECT AN OPTION:");
            System.out.println("1. Display Menu");
            System.out.println("2. Add Pizza");
            System.out.println("3. Exit Program");

            int userChoice = input.nextInt();
            switch (userChoice){
                case 1:
                    if(controller.getPizzaMenu().getMenu().size()> 0){
                        System.out.println(controller.getPizzaMenu());
                    }else {
                        System.out.println("There are no pizzas on the menu");
                    }

                    break;
                case 2:
                    addNewPizza(controller.getPizzaMenu(), input);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Please select a valid option");
            }

        }


    }

    private void addNewPizza(PizzaMenu menu, Scanner input){

        String name;
        String sauce;
        ArrayList<String> toppings = new ArrayList<String>();
        boolean moreToppings = true;

        System.out.println("Please enter a name for the pizza:");
        name = input.next() + input.nextLine();
        System.out.println("Please enter the pizzas sauce:");
        sauce = input.next() + input.nextLine();

        while(moreToppings == true){
            System.out.println("Please enter a topping:");
            String topping = input.next() + input.nextLine();
            toppings.add(topping);
            System.out.println("Add another topping? y/n");

            String userChoice = "";
            while (!userChoice.equals("y") && !userChoice.equals("n")){
                userChoice = input.next() + input.nextLine();
                if(!userChoice.equals("y") && !userChoice.equals("n")){
                    System.out.println("Please enter a valid input");
                }
            }

            System.out.println(userChoice);
            switch (userChoice){
                case "y":
                    break;
                case"n":
                    System.out.println("pizza complete!");
                    moreToppings = false;
                    break;
                default:
                    System.out.println("error!");
            }

        }

        menu.addPizza(name, sauce, toppings);

    }
}
