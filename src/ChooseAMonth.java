import java.util.Scanner;

public class ChooseAMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //gets all the entries in the enum and puts them in a handy dandy array
        Months[] months = Months.values();

        System.out.println("choose a month from 1-12:");
        int userChoice = 0;
        while(userChoice < 1 || userChoice > 12){
            userChoice = input.nextInt();
            if(userChoice < 1 || userChoice > 12){
                System.out.println("please enter a valid month");
            }
        }

        Months thisMonth = months[userChoice -1];

        switch (thisMonth){
            case DECEMBER, JANUARY, FEBUARY -> System.out.println("Its Winter");
            case MARCH, APRIL, MAY -> System.out.println("its spring");
            case JUNE, JULY, AUGUST -> System.out.println("Its summer!");
            case SEPTEMBER, OCTOBER, NOVEMBER -> System.out.println("Its Autumn");
        }

    }
}
