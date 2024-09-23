public class Main {
    public static void main(String[] args) {
        //this is a comment
        /*
        multi line comment
         */
        //variables:
        boolean isHappy = false;
        char myInitial = 'B';
        int myAge = 28;
        float aFloat = 28.1F; //you need F after floating numbers
        String myName = "Benjamin Solomon Dan Sierota";
        int x = 2;
        int y = 5;

        System.out.println(isHappy);
        isHappy = !isHappy;
        System.out.println(isHappy);
        isHappy = !isHappy;
        System.out.println(isHappy);

        //string cocatenation:
        System.out.println("Hello world! its me, " + myName);

        //assigning multiple variables to the same value at once:
        x = y = 50;
        System.out.println(x + y);

        //casting to a different type of variable:
        float z = 23.5F;
        int a = 0;
        int b = 14;
        //it rounds down:
        a = (int) z;
        System.out.println(a);

        //operators:
        a = a + b;
        a = a - b;
        a = a * b;
        a = a / b;
        a = a % b;
        a = a++;
        a = --a;
        System.out.println(a);

        //logical operators:
        boolean ba = true;
        boolean bb = false;

        boolean c = ba == bb;
        c = ba != bb;
        c = ba && bb;
        c = ba || bb;
        c = !ba;

        //comparisons:
        c = a > b;
        c = a < b;
        c = a <= b;
        c = a >= b;

        System.out.println(c);


        //-------STRINGS-------
        String exampleText = "hdbsvhdvksdvksdnvsd";
        System.out.println("string length is " + exampleText.length());
        //makes the whole string upper case:
        System.out.println(exampleText.toUpperCase());
        //and lower case:
        System.out.println(exampleText.toLowerCase());

        //finds the index of the first occurence of a piece of text in the string:
        exampleText = "alpha omega nuclear warhead Foundation";
        System.out.println(exampleText.indexOf("Found"));
        //string escape characters:
        System.out.println("hello i am a \"real\" 'person', i can write backslash, watch:  \\ \\\\\\");

        //gets the char number entered out of the string (apparently we cant simply access it like an array)
        //or maybe we can, idk (it gives us an error when we try
        System.out.println(exampleText.charAt(3));

        System.out.println("squeak squeak im a mmouse");
        System.out.println();
        //sout is a shortcut for writing a print line statement
        //psvm is a shortcut for writing public static void main

        //chars use single quotation marks, strings use double
        char aLetter = 'A';

    }
}