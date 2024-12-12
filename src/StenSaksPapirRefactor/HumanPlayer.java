package StenSaksPapirRefactor;

import java.util.Scanner;

public class HumanPlayer extends Player{

    private final String STEN = "rock";
    private final String SAKS = "scissors";
    private final String PAPIR = "paper";

    public HumanPlayer(String playerName){
        super(playerName);
    }

    public void chooseSign(){

        System.out.println("" + playerName + ", Please choose your hand sign (rock, paper or scissors");

        String playerChoice = "";
        Scanner input = new Scanner(System.in);
        while(!playerChoice.equals(STEN) && !playerChoice.equals(SAKS) && !playerChoice.equals(PAPIR)){
            String currentInput = input.next();
            playerChoice = currentInput.toLowerCase();
            if(!playerChoice.equals(STEN) && !playerChoice.equals(SAKS) && !playerChoice.equals(PAPIR)){
                System.out.println("please enter only either rock, paper or scissors");
            }
        }

        if(playerChoice.equals(STEN)){
            currentSign = RockOrPaperOrScissors.ROCK;
        } else if (playerChoice.equals(SAKS)) {
            currentSign = RockOrPaperOrScissors.SCISSORS;
        }else{
            currentSign = RockOrPaperOrScissors.PAPER;
        }
    }
}
