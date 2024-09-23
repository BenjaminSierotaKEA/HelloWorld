package Loops;

import java.util.Random;

//this program throws two dice until the sum of both of the throws equals seven

public class TerningKast {
    public static void main(String[] args) {
        Random rand = new Random();
        int dice1 = 0;
        int dice2 = 0;

        int sum = 0;

        while(sum != 7){
            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;

            sum = dice1 + dice2;

            System.out.println(dice1  + "+" + dice2 + "=" + sum);
        }
    }
}
