package Basics;

public class Dato {
    public static void main(String[] args) {
        int year = 2024;
        String month = "August";
        int date = 28;
        String day = "Wednesday";

        System.out.println(year);
        System.out.println(month);
        System.out.println(date);
        System.out.println(day);

        System.out.println("Hello, America! Today is " + day + ", " + month + " " + date + "th, " + year );
        System.out.println("Hello Europe! Today is " + day + ", the " + date + "th of " + month + ", " + year );
    }
}
