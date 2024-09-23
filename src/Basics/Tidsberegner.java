package Basics;

import java.util.Scanner;

public class Tidsberegner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many hours have passed since midnight?");
        int hours = input.nextInt();
        System.out.println("plus how many minutes?");
        int minutes = input.nextInt();
        System.out.println("plus how many seconds?");
        int seconds = input.nextInt();

        int secondsSinceMidnight = hours * 60 * 60 + minutes * 60 + seconds;
        System.out.println("the time is " + hours + ":" + minutes + ":" +  seconds + " " + secondsSinceMidnight + " seconds have passed since midnight.");
    }
}
