package IfStatements;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("hej, velkommen til BMI beregneren. Indtast venligst din højde (i meter):");
        double height = input.nextDouble();
        System.out.println("og din vægt: (i kg)");
        double weight = input.nextDouble();

        double BMI = weight / Math.pow(height, 2);
        System.out.println("Din BMI er " + BMI);

        if (BMI <= 18.5) {
            System.out.println("Du er undervægtig");
        } else if (BMI > 18.5 && BMI <= 25.0) {
            System.out.println("Din vægt er normal");
        } else if (BMI > 25.0 && BMI <= 30.0) {
            System.out.println("Du er overvægtig");
        } else if (BMI > 30.0) {
            System.out.println("Du er svær overvægtig");
        }

        System.out.println("Tak for at bruge BMI beregneren. Farvel!");
    }

}

