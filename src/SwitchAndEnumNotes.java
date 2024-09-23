public class SwitchAndEnumNotes {
    public static void main(String[] args) {

        //normal way of writing a switch statement:
        String day = "Monday";

        switch (day) {
            case "Monday":
                System.out.println("it's monday");
                break;

            case "Tuesday":
                System.out.println("its tuesday");
                break;

            default:
                System.out.println("its another day idc");


        }

        //alternative way of writing a switch statement. one line per case, no need for break:

        switch (day){
            case "Monday" -> System.out.println("its still monday m8");

            case "Tuesday", "Wednesday" -> System.out.println("its some other day");

            default -> System.out.println("default, baby");



        }



        //Making a test enum:
        EnumNotes today = EnumNotes.THURSDAY;

        //the value of today is now THURSDAY. not a string, just THURSDAY.

        //return all the entries of the enums in an array:
        EnumNotes.values();
        //this is good for looping through all the constants with a for each loop fx.

        //the enum entries can be used in a switch statement:
        switch (today){
            case FRIDAY:
                System.out.println("its Friday");
                break;
            case MONDAY:
                System.out.println("its Monday");
                break;
            case SUNDAY:
                System.out.println("its sunday");
            default:
                System.out.println("its some other day");
        }

        //the ordinal function prints what number item the current value is in the list:
        System.out.println(today.ordinal());

        //for what goes on inside an enum see enum notes

    }

}
