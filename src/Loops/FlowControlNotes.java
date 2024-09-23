package Loops;

import java.util.Scanner;

public class FlowControlNotes {

    public static void main(String[] args) {
        //whats up losers lets make some decisions happen
        //first, the scanner:
        Scanner input = new Scanner(System.in);

        System.out.println("you may draw three fortunes. pick a number between 1 and 10");

        int fortunes = 0;
        //heres a while loop:
        while (fortunes < 3){
            System.out.println("select a fortune:");
            int pick = input.nextInt();
            //and if/else statement:
            if (pick > 10 || pick < 0){
                System.out.println("you ask too much!");
            }else {
                //lets be fancy and add a switch statement
                switch (pick){
                    case 0:
                        System.out.println("you will meet a tall dark stranger");
                        break;
                    case 1:
                        System.out.println("fame and fortune shall come your way");
                        break;
                    case 2:
                        System.out.println("you will meet your one and only soon");
                        break;
                    case 3:
                        System.out.println("You will suceed in your efforts");
                        break;
                    case 4:
                        System.out.println("you will find the truth you seek");
                        break;
                    default:
                        System.out.println("you will have a nice day, im too lazy to write six more of these");
                }
            }

            fortunes++;


        }

        for(int i = 0; i <= 10; i++){
            System.out.println("here's i: " + i);
        }
        int i = 0;
        do{
            System.out.println("hello matey");
            i++;
        }while(i < 10);
    }
}
