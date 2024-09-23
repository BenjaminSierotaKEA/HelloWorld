package Basics;

public class StringNotes {
    public static void main(String[] args) {
        //a string is a reference type in java.
        //making a string:
        String str = "hello world";

        //a strignis an array of chars. (cannot be accessed like one like in other languages)
        //substring retruns a string that cuts off the start of the original strring up
        //to the index passed to it:
        System.out.println(str.substring(3));

        //You can also use two arguments to cut a section out:
        System.out.println("test: " + str.substring(2,7));

        //charAt() returns the char at the passed index in the string:
        System.out.println(str.charAt(3));

        //length() returns the length of the string:
        System.out.println(str.length());

        str = "hi there";
        System.out.println("cbat test: " + str.substring(0,2));



    }
}
