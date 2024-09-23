public class Hilsen {
    /*Opgave 1
    public static String hej(String name){
        return "Hej " + name + "!";
    }

     */

    //Opgave 2:
    /*
    public String hej(String name){
        return "Hej " + name + "!";
    }

     */
    public void hej(String name){
        System.out.println("Hej " + name + "!");
    }

    public static void main(String[] args) {
        String name = "Klaus";
        Hilsen hils = new Hilsen();
        //Opgave 1:
        //System.out.println(hej("Benjamin"));
        //System.out.println(hej(name));

        hils.hej(name);



    }
}
