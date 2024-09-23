public class TerningSpil {
    public static void main(String[] args) {
        Terning terning1 = new Terning();
        Terning terning2 = new Terning();
        boolean snakeEyes = false;
        int rolls = 0;

        System.out.println("welcome to the snake eyes game! try to roll snake eyes with these two dice!");
        System.out.println("off we go!");

        while(!snakeEyes){
            terning1.roll();
            terning2.roll();
            System.out.print("terning1: " + terning1.getFaceValue());
            System.out.println(" terning2: " + terning2.getFaceValue());
            if ((terning1.getFaceValue() == 1) && terning2.getFaceValue() == 1){
                snakeEyes = true;
            }
            rolls++;
        }
        terning1.roll();
        terning2.roll();
        System.out.println(terning1.getFaceValue());
        System.out.println(terning2.getFaceValue());
        System.out.println("You rolled snake eyes after " + rolls + " rolls. GOOD GAME");
        System.out.println("bye");



    }
}
