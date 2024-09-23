package Loops;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(10) + 1;
        //man kan også skrive sådan for at få tal i range mellem 1 og 10: rand.nextInt(1, 11);
        int usersGuess = -1;
        int totalGuesses = 0;

        System.out.println("Welcome to the number guesser! please guess what number i'm thinking of!");
        System.out.println("the number is between 1 and 10");

        while(usersGuess != numberToGuess){
            usersGuess = input.nextInt();
            if (usersGuess == numberToGuess){
                System.out.println("well done, you guessed it! the number was " + numberToGuess);
            }else{
                if(usersGuess < numberToGuess){
                    System.out.println("NO! the number is higher.");
                }else{
                    System.out.println("NO! the number is lower.");
                }
            }

            totalGuesses++;
        }

        System.out.println("Congratulations! you used a total of " + totalGuesses + " guesses.");
        System.out.println("thanks for playing. Goodbye!");


    }
}
