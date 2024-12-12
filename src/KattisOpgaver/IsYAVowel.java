package KattisOpgaver;

import java.util.Scanner;

public class IsYAVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int vowelsWithoutY = 0;
        int vowelsWithY = 0;
        for(int i = 0; i < word.length(); i++){
            char currentLetter = word.charAt(i);
            if(currentLetter == 'a' || currentLetter == 'e' || currentLetter == 'i' || currentLetter == 'o' || currentLetter == 'u'){
                vowelsWithoutY++;
                vowelsWithY++;
            }else if(currentLetter == 'y'){
                vowelsWithY++;
            }
        }

        System.out.println(vowelsWithoutY + " " + vowelsWithY);
    }
}
