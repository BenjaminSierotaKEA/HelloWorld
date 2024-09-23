package Arrays;

public class IterateThroughArray {
    public static void main(String[] args) {
        double[] someNumbers = {4.5, 25.3, 12.1, 34.0, 15.5 };

        //raising the contents of the array to the power of 2:

        for(double item : someNumbers){
            System.out.println(Math.pow(item, 2));
        }
        //finding the smallest in the array:
        double smallest = someNumbers[0];
        for(int i = 1; i < someNumbers.length; i++){
            if (someNumbers[i] < smallest){
                smallest = someNumbers[i];
            }
        }
        System.out.println("the smallest is: " + smallest);

        //finding the largest in the array:
        double largest = someNumbers[0];
        for(int i = 1; i < someNumbers.length; i++){
            if(someNumbers[i] > largest){
                largest = someNumbers[i];
            }
        }
        System.out.println("the largest is: " + largest);

        for(int i = 0; i < someNumbers.length; i++){
            if(someNumbers[i] == 12.1){
                System.out.println("Hurra! Jeg fandt 12.1 . Det stod på index " + i);
            }
        }
    }
}
