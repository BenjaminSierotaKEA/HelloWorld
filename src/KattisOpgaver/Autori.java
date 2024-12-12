package KattisOpgaver;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names = sc.nextLine();
        String[] namesSplit = names.split("-");
        String result = "";
        for(String n : namesSplit){
            result += "" + n.charAt(0);
        }
        System.out.println(result);
    }
}
