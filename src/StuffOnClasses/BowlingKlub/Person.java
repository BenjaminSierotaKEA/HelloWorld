package StuffOnClasses.BowlingKlub;

public class Person {

    String fornavn;
    String efternavn;
    double shoeSize;

    public Person(String fornavn, String efternavn, double shoeSize){
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.shoeSize = shoeSize;
    }

    public void udskrivPerson(){
        System.out.println("Navn: " + efternavn + ", " + fornavn + ". Skostørrelse: " + shoeSize);
    }
}
