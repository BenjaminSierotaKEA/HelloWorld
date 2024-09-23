package Basics;

public class Tid {
    public static void main(String[] args) {

        final int MINUTTER_PER_TIME = 60;

        int sekund = 56;
        int minut = 55;
        int time = 9;

        int sekundFinished = 30;
        int minutFinished = 8;
        int timeFinished = 10;

        System.out.println("time: " + time + " minut: " + minut + " sekund: " + sekund);

        int sekunderSidenMidnat = sekund + minut * MINUTTER_PER_TIME + time * MINUTTER_PER_TIME * 60;

        System.out.println("seconds since midnight: " + sekunderSidenMidnat);

        int sekunderTilbageIDagen = 24 * MINUTTER_PER_TIME * 60 - sekunderSidenMidnat;
        System.out.println("seconds left in the day: " + sekunderTilbageIDagen);

        int secondsUsed = (sekundFinished + minutFinished * 60 + timeFinished * MINUTTER_PER_TIME * 60) - sekunderSidenMidnat;
        System.out.println("seconds used on opgave: " + secondsUsed );

        //------------------HJEMMEOPGAVE-------------------------------------------------
        System.out.println("percentage of hour elapsed: " + ((minut * 100)/MINUTTER_PER_TIME) + "%");
        System.out.println("percentage of hour elapsed: " + ((double)minut/ (double)MINUTTER_PER_TIME * 100.0) + "%");

        //fin.


    }
}