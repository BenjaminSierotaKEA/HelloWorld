package SlushIceShop;

import java.util.ArrayList;

public class SlushIceShop {
    private String name;
    private ArrayList<String> flavours;

    public String getName(){
        return name;
    }

    public ArrayList<String> getFlavours(){
        return flavours;
    }

    public void addFlavour(String flavour){
        flavours.add(flavour);
    }

    public void removeFlavour(String flavour){
        flavours.remove(flavour);
    }

    public int amountOfFlavours(){
        return flavours.size();
    }

    public void printFlavours(){
        System.out.println(name + "has " + amountOfFlavours() + "Flavours of slush ice:");
        for(String f: flavours){
            System.out.println(f);
        }
    }
}
