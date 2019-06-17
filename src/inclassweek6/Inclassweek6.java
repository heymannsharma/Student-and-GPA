/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassweek6;

import java.util.ArrayList;

/**
 *
 * @author heymannsharma
 */
public class Inclassweek6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> students = new ArrayList<>();

        java.util.Scanner input = new java.util.Scanner(System.in);
//        java.util.Scanner input1 = new java.util.Scanner(System.in);
        boolean keepGoing = true;
        while (true) {
            System.out.println("Enter student id or -1 to stop");
            int id = input.nextInt();
            input.nextLine();
            if (id == -1) {
                break;
            }

            System.out.println("Enter student name");
            String name = input.nextLine();
            
            System.out.println("Enter student gpa");
            double gpa = input.nextDouble();
            students.add(new Student(id, name, gpa));
        }
   
        while(keepGoing) {
        System.out.println("How would you like to sort? "
                + "\n1: by id\n2: by name\n3: by gpa\n0: to quit ");
        int selection = input.nextInt();
        switch(selection){
            case 1:
                students.sort(null);
                System.out.println("After the sort using the natural ordering");
                displayStudents(students);
                break;
            case 2:
                StudentByNameComparator nameComparator= new StudentByNameComparator();
                students.sort(nameComparator);
                System.out.println("After the sort using the name comparator");
               displayStudents(students);
                break;
            case 3:
                StudentByGPACompatator gpaCompatator = new StudentByGPACompatator();
                students.sort(gpaCompatator);
                System.out.println("After the sort using GPA");
                displayStudents(students);
                break;
            default:
                keepGoing = false;
        }
        
       

        }
    
        }
    
    private static void displayStudents(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
