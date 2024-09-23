package IfStatements;

import java.util.Scanner;

public class PortoBeregner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int pris = 0;
        boolean ugyldigt = false;

        System.out.println("hej! velkomment til portoberegneren.");
        System.out.println("indtast venligst din brevs vægt: (i gram)");

        //recieving input:
        double weight = input.nextDouble();

        //deciding price:
        if (weight <= 0 || weight > 2000){
            ugyldigt = true;
        }else if (weight < 250){
            pris = 25;
        }else if (weight < 500) {
            pris = 50;
        }else {
            pris = 75;
        }

        //Printing results:
        if (ugyldigt == false){
            System.out.println("porto for denne brev bliver: " + pris);
        }else {
            System.out.println("Et Brev med denne vægt kan vi ikke sende.");
        }

        System.out.println("Tak for at bruge porto-beregneren, og farvel");

    }
}
