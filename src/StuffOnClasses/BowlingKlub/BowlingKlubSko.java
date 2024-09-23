package StuffOnClasses.BowlingKlub;

public class BowlingKlubSko {
    public static void main(String[] args) {
        Person alice = new Person("Alice", "Anderson", 38);
        Person bob = new Person("Bob", "Baker", 45);
        Person carol = new Person("Carol", "Chesterton", 41);

        alice.udskrivPerson();
        bob.udskrivPerson();
        carol.udskrivPerson();

        //objects are stored as references. if you pass another variable the same reference, it wont create a copy
        //of the object. if you change one, the other changes too. they are the same
        Person duncan = alice;
        duncan.fornavn = "Duncan";
        alice.udskrivPerson();
    }
}
