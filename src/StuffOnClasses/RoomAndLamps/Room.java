package StuffOnClasses.RoomAndLamps;

import StuffOnClasses.RoomAndLamps.Lampe;

public class Room {
    public static void main(String[] args) {
        Lampe deskLamp = new Lampe(false);
        Lampe wallLamp = new Lampe(true);
        Lampe bedLamp = new Lampe();

        System.out.println(deskLamp.getIsOn());
        deskLamp.pressSwitch();
        System.out.println(deskLamp.getIsOn());

        System.out.println(Lampe.getTotalLamps());
    }
}
