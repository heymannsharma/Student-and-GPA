/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassweek6;

/**
 *
 * @author heymannsharma
 */
public class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
    

    @Override
    public int compareTo(Student student) {
        int difference = this.id - student.getId();
        return difference;
    }

    @Override
    public String toString() {
        String format = "Student %s has id %d get %.1f";
        return String.format(format, name, id, gpa);
    }
    
    

}
