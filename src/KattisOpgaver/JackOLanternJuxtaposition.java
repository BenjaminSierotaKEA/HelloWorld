package KattisOpgaver;

import java.util.Scanner;

public class JackOLanternJuxtaposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        int result = Integer.parseInt(data[0]) * Integer.parseInt(data[1]) * Integer.parseInt(data[2]);
        System.out.println(result);
    }
}
