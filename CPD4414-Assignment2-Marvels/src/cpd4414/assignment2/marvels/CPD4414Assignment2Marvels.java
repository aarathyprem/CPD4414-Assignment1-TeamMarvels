/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment2.marvels;

/**
 *
 * @author c0660563
 */
public class CPD4414Assignment2Marvels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student s1 = new Student();
        
        s1.setId("c0660563");
        s1.setName("Aarathy Premnath");
        s1.setGender("female");
        s1.setGrade(90.9);
        
        System.out.println(s1.toString());
        
        Student s2 = new Student();
        
        s2.setId("c0123456");
        s2.setName("Joe Smith");
        s2.setGender("male");
        s2.setGrade(96.9);
        
        System.out.println(s2.toString());
        
        
        Course c = new Course();
        //c.add(s1);
       // c.add(s2);
        
        System.out.println(c.toString());
    }
    
}
