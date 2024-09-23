package Basics;//importing the scanner class:
import java.util.Scanner;

public class ScannerNotes {
    public static void main(String[] args) {
        //creating a new scanner object:'
        Scanner input = new Scanner(System.in);
        //asking for the next double written into the console i guess?
        double testHolder = input.nextDouble();
        System.out.println(testHolder);
        //gets the next string written, will end at a space
        String testString = input.next();
        System.out.println(testString);
        //gets the second word written
        testString = input.next();
        System.out.println(testString);
        //and the word after that
        testString = input.next();
        System.out.println(testString);
        //gets the rest of the line
        testString = input.nextLine();
        System.out.println(testString);
    }
}
