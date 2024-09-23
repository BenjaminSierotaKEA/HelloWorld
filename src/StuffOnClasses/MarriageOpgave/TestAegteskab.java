package StuffOnClasses.MarriageOpgave;

public class TestAegteskab {


    public static void main(String[] args) {
        Menneske alice = new Menneske("Alice");
        Menneske bob = new Menneske("Bob");

        System.out.println(alice);
        System.out.println(bob);
        alice.gifterSigMed(bob);

        System.out.println(alice);
        System.out.println(bob);

        bob.bliverSkilt();
        System.out.println(alice);
        System.out.println(bob);
    }
}
