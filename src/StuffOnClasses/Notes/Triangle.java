package StuffOnClasses.Notes;//class to test instantiating objects

public class Triangle {
    //attribute variables: (also called instance variables)
   private double baseWidth = 0;
   private double height = 0;
   private double sideA = 0;
   private double sideB = 0;
   private double angleA = 0;
   private double angleB = 0;
   private double angleC = 0;

    //constructor function for the class: (it doesnt have a return type because it
    //returns the object itself. it doesnt like it when it has the static keyword
    //on it either. What does static do again?
    //static makes it so there's only one copy of that thing. stati stuff cant access
    //member variables of their object
    public Triangle(double baseWidth, double sideA, double sideB){

        this.baseWidth = baseWidth;
        this.height = Math.sqrt(
                Math.pow(sideA, 2) - (Math.pow(sideB, 2)/4)
        );
        this.sideA = sideA;
        this.sideB = sideB;
        //add code that calculates angles here:
        this.angleA = Math.acos(
                (Math.pow(sideB,2) + Math.pow(baseWidth,2) - Math.pow(sideA,2))/(2*sideB*baseWidth)
        );
        this.angleB = Math.acos(
                (Math.pow(sideA,2) + Math.pow(baseWidth,2) - Math.pow(sideB,2))/(2*sideA*baseWidth)
        );
        this.angleC = Math.acos(
                (Math.pow(sideA,2) + Math.pow(sideB,2) - Math.pow(baseWidth,2))/(2*sideB*sideA)
        );

    }

    public double getBaseWidth(){
        return baseWidth;
    }
    public double getHeight(){
        return height;
    }
    public double getSideA(){
        return sideA;
    }
    public double getSideB(){
        return sideB;
    }

    public double getAngleA() {
        return angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public double getAngleC() {
        return angleC;
    }
}
