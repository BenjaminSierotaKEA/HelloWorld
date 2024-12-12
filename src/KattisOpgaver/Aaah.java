package KattisOpgaver;


import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jonsAah = sc.nextLine();
        String doctorsAah = sc.nextLine();

        if(doctorsAah.length() <= jonsAah.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
