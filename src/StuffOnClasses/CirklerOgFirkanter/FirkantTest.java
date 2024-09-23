package StuffOnClasses.CirklerOgFirkanter;

import StuffOnClasses.CirklerOgFirkanter.Cirkel;
import StuffOnClasses.CirklerOgFirkanter.Firkant;

public class FirkantTest {
    public static void main(String[] args) {
        Firkant square = new Firkant(2.0, 5);

        System.out.println(square.beregnAreal());

        Firkant square2 = new Firkant(4.7, 8.9);
        System.out.println(square2.beregnAreal());

        Firkant square3 = new Firkant(5.6, 5.6);
        System.out.println(square3.beregnAreal());

        System.out.println(square.hvilkenSlagsFirkant());
        System.out.println(square2.hvilkenSlagsFirkant());
        System.out.println(square3.hvilkenSlagsFirkant());

        Cirkel circle1 = new Cirkel(2.5);
        System.out.println("circle1: " + circle1.beregnAreal());;
        Cirkel circle2 = new Cirkel(5.4);
        System.out.println("circle2: " + circle2.beregnAreal());
    }
}
