package Forest;

public class Tree {

    private int age;
    private double height;
    private double growthPct;

    public Tree(double growthPct){
        this.age = 1;
        this.height = 0.25;
        this.growthPct = growthPct;
    }

    public void growOneYear(){
        height = height * (1 + growthPct/100);
        if(height > 20){
            height = 20;
        }
        age++;
    }

    public String toString(){
        return "Tree Age: " + age + " Height: " + height + " Growth %: " + growthPct;
    }

}
