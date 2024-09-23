package Basics;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        final double INCHES_TO_CM_CONVERSION = 2.54;
        Scanner input = new Scanner(System.in);

        System.out.println("Velkommen til Tommer til CM konverteren");
        System.out.println("Indtast venligst en antal tommer:");

        double inches = input.nextDouble();

        double centimeters = inches * INCHES_TO_CM_CONVERSION;

        System.out.println("Dette er lig: " + centimeters + "cm");
        System.out.println("Tak fordi du brugte  Tommer til Cm konverteren. Farvel!");
    }
}
