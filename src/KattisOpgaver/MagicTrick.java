package KattisOpgaver;

import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 1;

        char[] letters = sc.nextLine().toCharArray();
        for(int i = 0; i < letters.length; i++){
            for(int j = 0; j < letters.length; j++){
                if(letters[i] == letters[j] && i != j){
                    result = 0;
                }
            }
        }

        System.out.println(result);
    }
}
