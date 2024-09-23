package StuffOnClasses.DigitalClock;

public class NumberDisplay {

    //class for handling a two digit number?
    private int limit;
    private int value;

    //constructor. sets the rollover limit, always sets value to 0.
    public NumberDisplay(int rollOverLimit){

        this.limit = rollOverLimit;
        this.value = 0;

    }
    //getter for the value
    public int getValue() {
        return value;
    }
    //setter for the value. only actually sets the value if its between zero and the limit
    public void setValue(int replacementValue){
        if(0 < replacementValue && replacementValue < limit){
            this.value = replacementValue;
        }

    }

    //increases the value by the input number. rolls over the limit if the result is above limit
    public void increment(){
        int result = value + 1;
        if(result >= limit){
            value = result % limit;
        }else{
            value = result;
        }
    }

    //returns the display value as a string. puts a zero in front if the value is less than ten
    public String getDisplayValue(){
        if(value < 10){
            return "0" + value;
        }else{
            return "" + value;
        }
    }
}
