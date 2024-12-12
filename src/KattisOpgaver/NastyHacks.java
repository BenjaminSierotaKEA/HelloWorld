package KattisOpgaver;

import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lines = sc.nextLine();
        while(sc.hasNextLine()){
            String currentLine = sc.nextLine();
            String[] currentLineSplit = currentLine.split(" ");
            int noAdRevenue = Integer.parseInt(currentLineSplit[0]);
            int withAdRevenue = Integer.parseInt(currentLineSplit[1]);
            int adCost = Integer.parseInt(currentLineSplit[2]);
            int adBenefit = withAdRevenue - noAdRevenue - adCost;
            if(adBenefit > 0){
                System.out.println("advertise");
            }else if (adBenefit < 0){
                System.out.println("do not advertise");
            }else{
                System.out.println("does not matter");
            }

        }

    }
}
