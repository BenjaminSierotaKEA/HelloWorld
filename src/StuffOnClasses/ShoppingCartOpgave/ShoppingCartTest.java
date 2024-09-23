package StuffOnClasses.ShoppingCartOpgave;

public class ShoppingCartTest {
    public static void main(String[] args) {
        Vare socks = new Vare("socks", 30.0);
        OrdreLinje socksOrder = new OrdreLinje(socks, 5);
        //System.out.println(socks);
        //System.out.println(socksOrder);

        Vare bread = new Vare("bread", 28.90);
        Vare pizza = new Vare("pizza", 35.00);

        OrdreLinje breadOrder = new OrdreLinje(bread, 3);
        OrdreLinje pizzaOrder = new OrdreLinje(pizza, 23);

        Kurv minKurv = new Kurv();
        minKurv.addLine(socksOrder);
        minKurv.addLine(breadOrder);
        minKurv.addLine(pizzaOrder);
        System.out.println(minKurv);

        BipBop bipBop = new BipBop();
        System.out.println(bipBop);
    }
}
