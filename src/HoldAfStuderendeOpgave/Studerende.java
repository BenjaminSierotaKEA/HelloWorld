package HoldAfStuderendeOpgave;

public class Studerende {
    private String name;
    private String eMailAddress;


    public Studerende(String name, String eMailAddress){
        this.name = name;
        this.eMailAddress = eMailAddress;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String geteMailAddress(){
        return eMailAddress;
    }
    public void seteMailAddress(String eMailAddress){
        this.eMailAddress = eMailAddress;
    }


    @Override
    public String toString(){
        return "STUDENT NAME: " + name + " EMAIL ADDRESS: " + eMailAddress;
    }

}
