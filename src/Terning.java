import java.util.Random;

public class Terning {
    private final int MAX = 6;
    private int faceValue;
    private Random rand;

    public Terning(){
        rand = new Random();
        faceValue = rand.nextInt(MAX) + 1;
    }

    public void roll(){
        faceValue = rand.nextInt(MAX) + 1;
    }

    public int getFaceValue(){
        return faceValue;
    }
}
