package Loops;

import java.util.Scanner;

public class WhileLoopWithSentinel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SENTINEL = -1;
        int sum = 0;
        int current_item = 0;

        System.out.println("Welcome to the cashier 2.0. you can enter as many items as you like.");
        System.out.println("When you are done enter -1 to get your total");

        while(current_item != SENTINEL){
            System.out.println("please enter a price, or -1 to exit:");
            current_item = input.nextInt();
            if(current_item != SENTINEL){
                sum += current_item;
            }
        }

        System.out.println("your total is: " + sum);
        System.out.println("goodbye!");
    }
}
