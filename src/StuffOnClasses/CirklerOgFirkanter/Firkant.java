package StuffOnClasses.CirklerOgFirkanter;

public class Firkant {
    double width;
    double height;

    public Firkant(double w, double h){
        this.width = w;
        this.height = h;

    }

    public double beregnAreal(){
        return this.width * this.height;
    }

    public String hvilkenSlagsFirkant(){
        if(width == height){
            return "Det er en Kvadrat";
        }else{
            return "Det er en Rektangel";
        }
    }
}
