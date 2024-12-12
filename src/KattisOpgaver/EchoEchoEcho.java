package KattisOpgaver;

import java.util.Scanner;

public class EchoEchoEcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String echo = word + " " + word + " " + word;
        System.out.println(echo);
    }

}
