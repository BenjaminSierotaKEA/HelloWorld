package StuffOnClasses.ShoppingCartOpgave;

public class OrdreLinje {
    Vare vare;
    int antal;

    public OrdreLinje(Vare vare, int antal){
        this.vare = vare;
        this.antal = antal;
    }

    public double totalPrice(){
        return vare.getPrice() * antal;

    }

    public String toString(){
        return "Item Name: " + vare.getName() + " number: " + antal + " Total Price: " + totalPrice();
    }
}

