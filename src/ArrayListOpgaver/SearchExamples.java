package ArrayListOpgaver;

import java.util.ArrayList;
import java.util.List;

public class SearchExamples {
    public static void main(String[] args) {

        //searchign through an array:
        int[] tabel = {2, 5, 7, 4, 8, 11, 45, 23, 76, 34, 45, 44, 55, 77, 99, 2, 5 };
        int searchFor = 5;

        //searching for five: (finds the first instance of the element only)
        boolean found = false;
        for(int i = 0; i < tabel.length; i++){
            if(tabel[i] == searchFor){
                System.out.println("found at position " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("the element was not found");
        }

        //searching for a person with the name Lotte Olsen:
        Person2 p1 = new Person2("Mikkel Hansen", 91.0, 25, 192.5);
        Person2 p2 = new Person2("Ulla Jenson", 65.3, 40, 167.0);
        Person2 p3 = new Person2("Lotte Olsen", 56.8, 30, 171.0);
        Person2 p4 = new Person2("Lillian Jenson", 66.8, 46, 188.0);
        Person2 p5 = new Person2("Morten Petersen", 87.0, 23, 188.0);

        ArrayList<Person2> personDataBase = new ArrayList<Person2>(List.of(p1, p2, p3, p4, p5));


        String searchForPerson = "Lotte Olsen";

        boolean found2 = false;
        for (Person2 p: personDataBase){
            if (p.name.equals(searchForPerson)){
                System.out.println("person found:" + p);
                found2 = true;
            }
        }
        if (!found2){
            System.out.println("Could not find the person in the list");
        }

        //code for finding people higher than a certain height: (Opgave)
        String lowerHeightLimit = "170.0";
        double lHLimit = Double.parseDouble(lowerHeightLimit);
        for(Person2 p : personDataBase){
            if(p.height >= lHLimit){
                System.out.println(p.name);
            }
        }

    }


}
