package Weekday;

import java.util.Scanner;

public class EnumOpgave {
    public static void main(String[] args) {
        System.out.println("tast 1 for " + UgeDag.MONDAY);
        System.out.println("tast 2 for " + UgeDag.TUESDAY);
        System.out.println("tast 3 for " + UgeDag.WEDNESDAY);
        System.out.println("tast 4 for " + UgeDag.THURSDAY);
        System.out.println("tast 5 for " + UgeDag.FRIDAY);
        System.out.println("tast 6 for " + UgeDag.SATURDAY);
        System.out.println("tast 7 for " + UgeDag.SUNDAY);
        int brugerValg = 0;
        Scanner input = new Scanner(System.in);
        while (brugerValg > 7 || brugerValg < 1) {
            brugerValg = input.nextInt();
            if (brugerValg > 7 || brugerValg < 1) {
                System.out.println("DU må kun skrive et tal mellem 1-7. Prøv igen");
            }

        }
        UgeDag ugedag = null;

        switch (brugerValg) {
            case 1 -> ugedag = UgeDag.MONDAY;
            case 2 -> ugedag = UgeDag.TUESDAY;
            case 3 -> ugedag = UgeDag.WEDNESDAY;
            case 4 -> ugedag = UgeDag.THURSDAY;
            case 5 -> ugedag = UgeDag.FRIDAY;
            case 6 -> ugedag = UgeDag.SATURDAY;
            case 7 -> ugedag = UgeDag.SUNDAY;
        }

        if (ugedag == UgeDag.MONDAY || ugedag == UgeDag.TUESDAY ||
                ugedag == UgeDag.WEDNESDAY || ugedag == UgeDag.THURSDAY || ugedag == UgeDag.FRIDAY) {
            System.out.println("Det hverdag og du skal i skole!");
            if (ugedag == UgeDag.MONDAY) {
                System.out.println("Du skal i skole igen :(");
            } else if (ugedag == UgeDag.FRIDAY) {
                System.out.println("Men du har weekend når du har fri!");
            }
        }   else {
            System.out.println("Det er weekend, sov videre");
        }
    }
}
        /*switch (ugedag){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Det er hverdag");
            case SATURDAY, SUNDAY -> System.out.println("Det er weekend");
        }


         */

 