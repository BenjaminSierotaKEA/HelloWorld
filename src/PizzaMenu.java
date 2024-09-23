import java.util.Scanner;

public class PizzaMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to the pizzeria!");
        System.out.println("Please choose one of the following Delicious pizzas:");
        System.out.println("1. Margherita");
        System.out.println("2. Vesuvio");
        System.out.println("3. Hawaii");
        System.out.println("4.Pepperoni");

        int userChoice = input.nextInt();

        switch (userChoice){
            case 1:
                System.out.println("you have chosen  a margherita");
                break;
            case 2:
                System.out.println("you have chosen a vesuvio");
                break;
            case 3:
                System.out.println("you have chosen a hawaii");
                break;
            case 4:
                System.out.println("you have chosen a pepperoni");
                break;
            default:
                System.out.println("you have chosen an invalid number, no pizza for you");
        }
    }
}
