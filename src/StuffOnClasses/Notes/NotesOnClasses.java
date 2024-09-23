package StuffOnClasses.Notes;

import StuffOnClasses.Notes.Triangle;

import java.util.Scanner;

public class NotesOnClasses {

    //defining a new function:

    public static void announceTeaTime(){

        Scanner input = new Scanner(System.in);
        System.out.println("enter a random word to initiate tea time!");
        input.next();
        System.out.println("its teatime! come and get it!");
    }

    //defining a function with inputs:

    public static double calculateTotalMealPrice(double price, double tipRate, double taxRate){
        double finalPrice = price + price * tipRate + price * taxRate;
        return finalPrice;

    }

    public static void main(String[] args) {
        System.out.println("hello everyone!");
        //calling the function we made:
        announceTeaTime();

        System.out.println("lets call it again:");

        announceTeaTime();

        System.out.println(calculateTotalMealPrice(20.0, 0.2, 0.08));

        //creating a triangle object:

        Triangle wonky = new Triangle(2.5, 2.5, 2.5);
        System.out.println(wonky.getHeight());
        System.out.println(wonky.getAngleA());
        System.out.println(wonky.getAngleB());
        System.out.println(wonky.getAngleC());

        //variables must almost ALWAYS be private, even if you are both getting and setting them exactly as
        //they are.
        // a toString method is a method all classes inherit. when the object is printed, it will automatically
        //return what the overridden method returns

    }



}
