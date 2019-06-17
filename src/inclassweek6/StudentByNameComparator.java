/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassweek6;

import java.util.Comparator;

/**
 *
 * @author Kiran
 */
public class StudentByNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        String name1 = student1.getName();
        String name2 = student2.getName();

        int difference = name1.compareTo(name2);
        return difference;
    }

}
