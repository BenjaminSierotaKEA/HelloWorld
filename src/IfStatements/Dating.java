package IfStatements;

import java.util.Scanner;

public class Dating{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Angiv udseende på en skala fra 1-10");
        //På en skala fra 1 til 10
        int udseende = scan.nextInt();
        System.out.println("Angiv iQ:");
        int iQ = scan.nextInt();
        // årsindkomst
        System.out.println("Angiv årsindkomst:");
        int indkomst = scan.nextInt();
        System.out.println("Angiv alder:");
        int alder = scan.nextInt();

        //Her sætter vi den boolske variabel smuk til true hvis udseende er >=9, eller false hvis udseende er mindre end 9
        boolean smuk = udseende >=9;
        /*OPGAVE
        Nedenfor skal du skrive kode hvor du sætter variablene klog, rig og ung efter samme princip som boolean variablen smuk på linjen ovenfor.
        Fx kan man være klog hvis ens iQ er større end 125, rig hvis ens indkomst er større end 700000 og ung hvis man er under 30.
        */
        //Skriv din kode her:
        boolean klog = iQ >= 125;
        boolean rig = indkomst >= 700000;
        boolean ung = alder <= 30;





        //---------------------------------------------------------------------------------------------------------------------------------------------------

        //Koden nedenfor tjekker værdien af den boolske variabel smuk, og skriver en besked til konsollen
        if (smuk) {
            System.out.println("Du er smuk");
        }
        else {
            System.out.println("Du er ikke smuk");
        }
        /*OPGAVE
        Nedenfor skal du lave tilsvarende if-else sætninger for variablene klog, rig og ung,
         på samme måde som det er gjort med variablen smuk.
         */
        //Skriv din kode her:

        if (klog){
            System.out.println("Ej hvor er du klog! <3");

        }else{
            System.out.println("du er ikke særlig klog");
        }

        if (rig){
            System.out.println("Du er rig!!!");
        }else {
            System.out.println("du er ikke rig :(");
        }

        if (ung){
            System.out.println("du er ung!");
        }else{
            System.out.println("Du er alt for gammel!");
        }






        //---------------------------------------------------------------------------------------------------------------------------------------------------


        /*OPGAVE
        Her skal du ændre koden på linjen nedenfor sådan at man er interessant hvis man både er smuk OG klog OG rig OG ung.
        Brug den boolske operator && til at kæde de boolske variable sammen.
         */
        boolean interessant = smuk && klog && rig && ung;

        if(interessant)
            System.out.println("Jeg er interesseret");
        else
            System.out.println("Jeg er ikke interesseret");

    }
}
