/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassweek6;

import java.util.Comparator;

/**
 *
 * @author heymannsharma
 */
public class StudentByGPACompatator implements Comparator<Student> {
    
    @Override
    public int compare(Student student1, Student student2) {
        double gpa1 = student1.getGpa();
        double gpa2 = student2.getGpa();
        
        int difference = (int) (student1.getGpa()-student2.getGpa());
        return difference;
    }
    
    
}
