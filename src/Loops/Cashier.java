package Loops;//for loop notes

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the amount of items you would like to scan:");
        int quantity = input.nextInt();

        double total = 0.0;

        for(int i = 0; i < quantity; i++){
            System.out.println("enter the cost of the item:");
            double price = input.nextDouble();
            total += price;
        }

        System.out.println("that will be £" + total + ", please.");
    }

}
