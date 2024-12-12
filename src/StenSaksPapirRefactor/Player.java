package StenSaksPapirRefactor;

public abstract class Player {
    String playerName;
    int points;
    RockOrPaperOrScissors currentSign;

    public Player(String playerName){
        this.playerName = playerName;
        this.points = 0;
    }


    public abstract void chooseSign();

    public int getPoints(){
        return points;
    }

    public void addPoint(){
        points++;
    }

    public RockOrPaperOrScissors getCurrentSign(){
        return currentSign;
    }

    public String getPlayerName(){
        return playerName;
    }




}
