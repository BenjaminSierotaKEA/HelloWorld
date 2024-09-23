package StuffOnClasses.ChauffoerOpgave;

public class ChauffoerTest {

    public static void main(String[] args) {
        Bil nyBil = new Bil("Rød", 23, 100000.00);
        System.out.println(nyBil);
        Chauffoer driver = new Chauffoer("Søren");

        System.out.println("Bilens nypris:" + nyBil.getNyPris());
        nyBil.driverGetsIn(driver);
        nyBil.drive(100);
        System.out.println(nyBil);
        printDriver(nyBil.hvemKoererBilen());
        nyBil.driverGetsOut();
        printDriver(nyBil.hvemKoererBilen());

        //tester garageklassen
        Bil bil1 = new Bil("Gul", 456, 75000);
        Bil bil2 = new Bil("sølv", 2000, 50000);

        Garage garage = new Garage();
        garage.addCar(nyBil);
        garage.addCar(bil1);
        garage.addCar(bil2);
        System.out.println(garage.totalPrice());
    }

    public static void printDriver(Chauffoer driverTest){
        if(driverTest == null){
            System.out.println("no driver");
        }else {
            System.out.println("Driver:" + driverTest.getNavn());
        }
    }
}
