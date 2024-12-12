package KattisOpgaver;

import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] tempsAsString = sc.nextLine().split(" ");
        int result = 0;
        for(String s : tempsAsString){
            int temp = Integer.parseInt(s);
            if(temp < 0){
                result++;
            }
        }

        System.out.println(result);
    }
}
