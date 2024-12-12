package StenSaksPapirRefactor;

import java.util.Random;

public class ComputerPlayer extends Player {

    public ComputerPlayer(String playerName){
        super(playerName);
    }

    public void chooseSign(){

        Random rand = new Random();
        int selection = rand.nextInt(1,4);
        if(selection == 1){
            currentSign = RockOrPaperOrScissors.ROCK;
        } else if (selection == 2) {
            currentSign = RockOrPaperOrScissors.PAPER;
        }else {
            currentSign = RockOrPaperOrScissors.SCISSORS;
        }

    }
}
