package Loops;

public class ForLoopOpgaver {
    public static void main(String[] args) {

        for(int i = 1; i < 5; i++){
            System.out.println("2 gange " + i + "= " + (i * 2));
        }

        System.out.println("Opgave 1:");
        for(int i = 1; i<7; i++){
            System.out.print(i*2 + " ");
        }
        System.out.println("\nOpgave 2:");
        int start = 4;
        for(int i = 0; i < 6; i++){
            System.out.print((start + i * 15) + " ");
        }

        System.out.println("\nOpgave 3:");
        start = 30;
        for(int i = 0; i < 6; i++){
            System.out.print((start + i * (-10)) + " ");
        }

        System.out.println("\nOpgave 4:");
        start = -7;
        for(int i = 0; i < 6; i++){
            System.out.print((start + i*4) + " ");
        }

        System.out.println("\nOpgave 5:");
        start = 97;
        for(int i = 0; i < 6; i++){
            System.out.print((start - i * 3) + " ");
        }

    }
}
