package Forest;

import java.util.ArrayList;
import java.util.Random;

public class Forest {

    private ArrayList<Tree> trees;

    public Forest(){
        trees = new ArrayList<Tree>();
    }

    public void addTree(double growthPct){
        Tree newTree = new Tree(growthPct);
        trees.add(newTree);
    }

    public void growOneYear(){
        for(Tree t : trees){
            t.growOneYear();
        }
    }

    @Override
    public String toString(){
        String result = "Forest: \n";
        for(Tree t : trees){
            result = result + t + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Forest forest = new Forest();
        int trees = rand.nextInt(0, 20);
        for(int i = 0; i < trees; i++){
         forest.addTree(rand.nextDouble(0.1, 50));
        }

        for(int i = 0; i < 10; i++){
            forest.growOneYear();
            System.out.println(forest);
        }
    }
}
