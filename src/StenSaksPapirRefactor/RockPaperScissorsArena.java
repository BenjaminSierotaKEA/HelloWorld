package StenSaksPapirRefactor;

public class RockPaperScissorsArena {


    private int pointsToWin;
    private int roundsPlayed;
    private Player player1;
    private Player player2;

    public RockPaperScissorsArena(int pointsToWin, Player player1, Player player2){
        this.pointsToWin = pointsToWin;
        this.roundsPlayed = 0;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame(){
        System.out.println("Velokommen til Sten saks papir!");

        System.out.println("Første til " + pointsToWin + " Vinder!");

        gameLoop();
    }

    private void gameLoop(){

        while(player1.getPoints() < pointsToWin && player2.getPoints() < pointsToWin){
            roundsPlayed++;
            System.out.println("ROUND: " + roundsPlayed);
            Outcomes outcome = battle();

            System.out.println(player1.getPlayerName() + " chose " + player1.getCurrentSign().asAString +
                    " and " + player2.getPlayerName() + " chose " + player2.getCurrentSign().asAString);
            if(outcome.equals(Outcomes.PLAYER_1_WIN)){
                System.out.println(player1.getPlayerName() + " Wins this round.");

            } else if (outcome.equals(Outcomes.PLAYER_2_WIN)) {
                System.out.println(player2.getPlayerName() + "Wins this round");

            }else{
                System.out.println("This round is a draw");
            }

            System.out.println("The current score is:\n" + player1.getPlayerName() + ": " + player1.getPoints()
                    + "|" + player2.getPlayerName() + ": " + player2.getPoints());
        }

        System.out.println("The game is over.");
        if(player1.getPoints() >= pointsToWin){
            System.out.println(player1.getPlayerName() + " Wins.");
        }else{
            System.out.println(player2.getPlayerName() + " Wins.");
        }

    }

    private Outcomes battle(){
        player1.chooseSign();
        player2.chooseSign();
        RockOrPaperOrScissors p1Sign = player1.getCurrentSign();
        RockOrPaperOrScissors p2Sign = player2.getCurrentSign();

        if(p2Sign.equals(p1Sign)){
            return Outcomes.DRAW;
        } else if (p1Sign.equals(RockOrPaperOrScissors.ROCK)) {
            if(p2Sign.equals(RockOrPaperOrScissors.SCISSORS)){
                player1.addPoint();
                return  Outcomes.PLAYER_1_WIN;
            }else{
                player2.addPoint();
                return Outcomes.PLAYER_2_WIN;
            }

        }else if (p1Sign.equals(RockOrPaperOrScissors.PAPER)) {
            if(p2Sign.equals(RockOrPaperOrScissors.ROCK)){
                player1.addPoint();
                return  Outcomes.PLAYER_1_WIN;
            }else{
                player2.addPoint();
                return Outcomes.PLAYER_2_WIN;
            }
            //scissors
        }else{
            if(p2Sign.equals(RockOrPaperOrScissors.PAPER)){
                player1.addPoint();
                return Outcomes.PLAYER_1_WIN;
            }else{
                player2.addPoint();
                return Outcomes.PLAYER_2_WIN;
            }
        }


    }

    public static void main(String[] args) {
        Player player1 = new HumanPlayer("Benjamin");
        Player player2 = new ComputerPlayer("HAL9000");
        RockPaperScissorsArena arena = new RockPaperScissorsArena(5, player1, player2);
        arena.startGame();
    }


}
