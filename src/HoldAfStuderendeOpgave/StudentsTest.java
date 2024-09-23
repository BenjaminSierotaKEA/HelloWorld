package HoldAfStuderendeOpgave;

import java.util.Scanner;

public class StudentsTest {
    public static void main(String[] args) {
        Studerende s1 = new Studerende("Alice Allwood", "AA@gmail.com");
        Studerende s2 = new Studerende("Bob Barker", "BB@gmail.com");
        Studerende s3 = new Studerende("Carol Carver", "CC@gmail.com");

        Scanner input = new Scanner(System.in);

        Hold holdet = new Hold();
        holdet.addStudent(s1);
        holdet.addStudent(s2);
        holdet.addStudent(s3);

        System.out.println(holdet);

        System.out.println("Please enter a student name to search for:");

        String searchTerm =  input.nextLine();

        Studerende foundStudent = holdet.searchForStudent(searchTerm);

        if (foundStudent == null){
            System.out.println("The student you searched for does not exist");
        }else{
            System.out.println(foundStudent);

            System.out.println("Edit Student? y/n");
            String response = "";
            while(!response.equals("y") && !response.equals("n")){
                response = input.next();
                if(!response.equals("y") && !response.equals("n")){
                    System.out.println("please enter sometihng valid");
                }
            }

            if(response.equals("y")){
                editStudent(foundStudent, input);
            }
        }



    }

    private static void editStudent(Studerende student, Scanner input){


        int choice = 0;
        while(choice != 3){

            System.out.println("Choose what to edit:");
            System.out.println("1. Name:");
            System.out.println("2. E-mail Address");
            System.out.println("3. Exit");

            choice = input.nextInt();
            if(choice == 1){
                System.out.println("Please enter a new name:");
                String newName = input.next() + input.nextLine();
                student.setName(newName);
            } else if (choice == 2) {
                System.out.println("Please enter an email address:");
                String newEmail = input.next() + input.nextLine();
                student.seteMailAddress(newEmail);

            } else if (choice == 3) {
                System.out.println("You have exited the editor");
            }else {
                System.out.println("please enter a valid choice");
            }

        }

        System.out.println(student);
    }
}
