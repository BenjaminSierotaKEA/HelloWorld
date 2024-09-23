import java.util.ArrayList;

public class ArrayListNotes {
    public static void main(String[] args) {
        //an arraylist is a way of storing a bunch of objects that can vary in size, unlike an array. to create one:
        //this makes an arraylist of strings. if you just want an arraylist of objects, you can omit the type
        ArrayList<String> someStrings = new ArrayList<String>();

        //adding an element to the list:
        someStrings.add("Hello world");
        someStrings.add("Byebye moon");

        //getting something from a list at the given index number:
        String print = someStrings.get(0);
        System.out.println(print);

        //changing an item at a given index number:
        someStrings.set(0, "wazzup globe");

        //remove the element at a given index number:
        someStrings.remove(0);

        //remove everything from the list:
        someStrings.clear();

        //getting the size of the list:

        int printInt = someStrings.size();
        System.out.println(printInt);

        //looping through a list with a for loop:

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        //and a foreach loop:

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
