package Arrays;

public class ArrayNotes {
    public static void main(String[] args) {
        //creating an array of type double of size 5:
        double[] anArray = new double[5];
        //creating an array and initilizing it in the same line:
        double[] lotteryNumbers = {23, 45, 64, 999, 14};

        //arrays of primitive types are initialized with all values = 0.
        //arrays of reference types (objects, etc) are initialized with each value = null.

        //accessing an array:
        System.out.println(lotteryNumbers[0]);
        //assigning a slot in the array:
        lotteryNumbers[0] = 69420;
        System.out.println(lotteryNumbers[0]);


        //finding thee largest and smallest entries in the array:
        double smallest = lotteryNumbers[0];
        for(int i = 0; i < lotteryNumbers.length; i++){
            if(lotteryNumbers[i] < smallest) {
               smallest = lotteryNumbers[i];
            }
        }

        System.out.println("the smallest lottery number is " + smallest);

        double largest = lotteryNumbers[0];
        for(int i=0; i < lotteryNumbers.length; i++){
            if(lotteryNumbers[i] > largest)
                largest = lotteryNumbers[i];
        }

        System.out.println("the largest lottery number is " + largest);
    }

}
