public enum EnumNotes {
    //an enum consists of a bunch of entries (always named in ALL CAPS):
    //these are called "enumeration constants"
    SUNDAY(100, 0),
    MONDAY(10, 5),
    TUESDAY(30, 4),
    WEDNESDAY(50, 3),
    THURSDAY(30, 2),
    FRIDAY(80, 1),
    SATURDAY(100, 0);

    //and some variables
    final int dayEnjoymentIndex;
    final int timeUntilWeekend;

    //which are assigned with a constructor below.
    EnumNotes(int dayEnjoymentIndex, int timeUntilWeekend){
        this.dayEnjoymentIndex = dayEnjoymentIndex;
        this.timeUntilWeekend = timeUntilWeekend;
    }

    //we then assign each entry a value for each variable. (so the first one in the parenthesis
    // is dayEnjoymentIndex, the second is timeUntilWeekend, and so on if we had more variables
    //enums arnt meant to be changed at any point. they are meant as a way to get constant
    //data about a set of entries.
}
