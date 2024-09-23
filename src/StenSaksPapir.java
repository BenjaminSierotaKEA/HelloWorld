import java.util.Random;
import java.util.Scanner;

public class StenSaksPapir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        String playerChoice = "";
        String computerChoice = "";
        final String STEN = "sten";
        final String SAKS = "saks";
        final String PAPIR = "papir";
        int playerScore = 0;
        int computerScore = 0;
        int rounds = 0;
        final int POINTS_TO_WIN = 2;


        System.out.println("Velokommen til Sten saks papir!");
        System.out.println("Første til " + POINTS_TO_WIN + " Vinder!");
        //the main game loop:
        while(playerScore < POINTS_TO_WIN && computerScore < POINTS_TO_WIN){
            rounds++;
            System.out.println("runde " + rounds + ":");

            System.out.println("Indtast din håndtegn: (sten, saks eller papir)");
            // getting the player input:
            playerChoice = "";
            while(!playerChoice.equals(STEN) && !playerChoice.equals(SAKS) && !playerChoice.equals(PAPIR)){
                String currentInput = input.next();
                playerChoice = currentInput.toLowerCase();
                if(!playerChoice.equals(STEN) && !playerChoice.equals(SAKS) && !playerChoice.equals(PAPIR)){
                    System.out.println("indtast venligst enten sten saks eller papir");
                }
            }

            //getting the computer choice
            int choiceNumber = rand.nextInt(3);
            if(choiceNumber == 0){
                computerChoice = PAPIR;
            }else if(choiceNumber == 1){
                computerChoice = SAKS;
            }else if(choiceNumber == 2){
                computerChoice = PAPIR;
            }

            System.out.println("Computeren valgt " + computerChoice);

            //finding the winner:
            if(playerChoice.equals(computerChoice)){
                System.out.println("Uafgjort!");
            }else{
                if(playerChoice.equals(STEN)){
                     if (computerChoice.equals(SAKS)){
                        System.out.println("Du Vinder");
                        playerScore += 1;
                    } else if (computerChoice.equals(PAPIR)) {
                        System.out.println("Computeren Vinder!");
                        computerScore += 1;
                    }

                } else if (playerChoice.equals(SAKS)) {
                    if(computerChoice.equals(STEN)){
                        System.out.println("Computeren Vinder!");
                        computerScore += 1;
                    } else if (computerChoice.equals(PAPIR)) {
                        System.out.println("Du Vinder!");
                        playerScore += 1;
                    }

                } else if (playerChoice.equals(PAPIR)) {
                    if(computerChoice.equals(STEN)){
                        System.out.println("Du Vinder!");
                        playerScore += 1;
                    }else if (computerChoice.equals(SAKS)){
                        System.out.println("Computeren Vinder!");
                        computerScore += 1;
                    }

                }
            }


        }


        //after the main loop, lets announce the winner
        if(playerScore >= POINTS_TO_WIN){
            System.out.println("Den Endelig vinder, efter " + rounds + " runder, er dig!");
        }else if(computerScore >= POINTS_TO_WIN) {
            System.out.println("Den Endelig vinder, efter " + rounds + " runder, er computeren!");
        }



    }
}

