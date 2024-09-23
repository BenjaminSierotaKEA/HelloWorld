public class Calculator {

    //ADD methods:
    public double add(double num1, double num2){
        return num1 + num2;
    }
    public double add(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public int add(String num1, String num2){
        //parse int spits out zero if it doesnt get a string comprised
        //entirely of numbers. add some sort of validation if youre
        //using it seriously
        int num1AsInt = Integer.parseInt(num1);
        int num2AsInt = Integer.parseInt(num2);
        return num1AsInt + num2AsInt;
    }


    //MULTIPLY methods:
    public double multiply(double num1, double num2){
        return num1 * num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    //DIVIDE methods:
    public int divide(int num1, int divisor){
        return num1/divisor;
    }

    //we testing:
    public static void main(String[] args) {
        //lets test this out
        Calculator calc = new Calculator();
        int result = calc.add("123", "123");
        System.out.println("Addition of two integers: 5 + 10 = " + calc.add(5, 10));
        System.out.println("Addition of two doubles: 3.5 + 4.7 = " + calc.add(3.5 , 4.7));
        System.out.println("Addition of three integers: 1 + 2 + 3 = " + calc.add(1,2,3));
        System.out.println("Addition of three doubles: 2.3 + 5.7 + 4.6 = " + calc.add(2.3, 5.7,4.6));
        System.out.println("Addition of two Strings: \"123\" + \"123\" = " + result);
        System.out.println("Multiplication of two integers:  5 * 6 = " + calc.multiply(5,6));
        System.out.println("Multiplication of two doubles: 3.5 * 2.0 = " + calc.multiply(3.5, 2.0) );
        System.out.println("Division of integers: 10 / 2 = " + calc.divide(10,2));
    }
}
