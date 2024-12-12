package KattisOpgaver;

import java.util.Scanner;

public class FYI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        if(number.charAt(0) == '5' && number.charAt(1) ==  '5' && number.charAt(2) == '5'){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
