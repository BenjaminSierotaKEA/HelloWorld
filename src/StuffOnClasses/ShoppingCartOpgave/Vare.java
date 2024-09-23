package StuffOnClasses.ShoppingCartOpgave;

public class Vare {
    private String name;
    private double price;

    public Vare(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Item name:" + name + "Item Price: " + price + "kr";
    }
}
