package HoldAfStuderendeOpgave;

import java.util.ArrayList;

public class Hold {
    private ArrayList<Studerende> students = new ArrayList<Studerende>();

    public void addStudent(Studerende studentToAdd){
        students.add(studentToAdd);
    }

    public Studerende searchForStudent(String searchName){

        for(Studerende s : students){
            if(s.getName().equals(searchName)){
                return s;
            }
        }
        return null;

    }


    @Override
    public String toString(){
        String output = "------LIST OF STUDENTS:------\n";
        for(Studerende s: students){
            output = output + s + "\n";
        }
        return output;
    }


}
