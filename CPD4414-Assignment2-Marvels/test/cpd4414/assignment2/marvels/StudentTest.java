/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment2.marvels;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0660563
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of no-arg constructor of class Student
     */
    @Test
    public void testStudent() {
        System.out.println("Student No-Arg Constructor");
        Student expResult = new Student("","","",0);
        Student result = new Student();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of no-arg constructor of class Student
     */
    @Test
    public void testFullStudent() {
        System.out.println("Student Constructor");
        Student expResult = new Student("Joe Smith", "c0660563", "male", 96.9);
        Student result = new Student("Joe Smith", "c0660563", "male", 96.9);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student("Joe Smith", "c0660563", "male", 96.9);
        String expResult = "Joe Smith";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        Student instance = new Student();
        String expResult = "Joe Smith";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student("Joe Smith", "c0660563", "male", 96.9);
        String expResult = "c0660563";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Student instance = new Student();
        String expResult = "c0660563";
        instance.setId(expResult);
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Student instance = new Student("Joe Smith", "c0660563", "male", 96.9);
        String expResult = "male";
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        Student instance = new Student();
        String expResult = "male";
        instance.setGender(expResult);
        String result = instance.getGender();
        assertEquals(expResult, result);
    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Student instance = new Student("Joe Smith", "c0660563", "male", 96.9);
        double expResult = 96.9;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        Student instance = new Student();
        double expResult = 96.9;
        instance.setGrade(expResult);
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Student("Joe Smith", "c0660563", "male", 90.9);
        Student instance = new Student("Joe Smith", "c0660563", "male", 96.9);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testNotEquals() {
        System.out.println("not equals");
        Object obj = null;
        Student instance = new Student("Joe Smith", "c0660563", "male", 96.9);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testIdNotEquals() {
        System.out.println("not equals");
        Object obj = new Student("Joe Smith", "c0660564", "male", 96.9);
        Student instance = new Student("Joe Smith", "c0660563", "male", 96.9);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testNameNotEquals() {
        System.out.println("not equals");
        Object obj = new Student("Joe Doe", "c0660563", "male", 96.9);
        Student instance = new Student("Joe Smith", "c0660563", "male", 96.9);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testBothNotEquals() {
        System.out.println("not equals");
        Object obj = new Student("Joe Doe", "c0660564", "male", 96.9);
        Student instance = new Student("Joe Smith", "c0660563", "male", 96.9);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("Joe Smith", "c0660563", "male", 96.9);
        String expResult = "{ \"name\" : \"Joe Smith\", \"id\" : \"c0660563\", \"gender\" : \"male\", \"grade\" : 96.9 }";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
