package Arrays;

public class ArrayOpgaver {
    public static void main(String[] args) {
        int[] testArray = new int[8];
        String[] hello = {"hej", "med", "dig"};
        double[] swag = {3.4, 2.5, 1.2, 6.7};

        testArray[0] = 34;
        testArray[7] = 117;

        //for each loop:
        for(int item : testArray){
            System.out.println(item);
        }

        for(String word : hello){
            System.out.print(word + " ");
        }
        System.out.println("double arrayet:");
        System.out.println(swag[2]);
        //getting the length of the array:
        System.out.println(swag.length);
    }
}
