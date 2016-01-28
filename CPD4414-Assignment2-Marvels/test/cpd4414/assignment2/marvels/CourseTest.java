/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment2.marvels;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
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
public class CourseTest {
    
    public CourseTest() {
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
     * Test of add method, of class Course.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Student student = null;
        Course instance = new Course();
        instance.add(student);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_Student() {
        System.out.println("remove");
        Student student = null;
        Course instance = new Course();
        instance.remove(student);
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_String() {
        System.out.println("remove");
        String id = "";
        Course instance = new Course();
        instance.remove(id);
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        int position = 0;
        Course instance = new Course();
        instance.remove(position);
    }

    /**
     * Test of insert method, of class Course.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Student student = null;
        int position = 0;
        Course instance = new Course();
        instance.insert(student, position);
    }

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_String() {
        System.out.println("get");
        String id = "";
        Course instance = new Course();
        Student expResult = null;
        Student result = instance.get(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Course.
     */
    @Test
    public void testGet_int() {
        System.out.println("get");
        int position = 0;
        Course instance = new Course();
        Student expResult = null;
        Student result = instance.get(position);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetAllEmpty() {
        System.out.println("getAllEmpty");
        Course instance = new Course();
        List<Student> expResult = new ArrayList<Student>();
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAll method, of class Course.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        Course instance = new Course();
        
        List<Student> expResult = null;
        List<Student> result = instance.getAll();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student("Joe Smith", "c0660563", "male", 96.9));
        Object obj = new Course(studs);
        Course instance = new Course(studs);
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testNotEquals() {
        System.out.println("not equals");
        Object obj = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testListNotEquals() {
        System.out.println("list not equals");
        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student("Joe Smith", "c0660563", "male", 96.9));
        studs.add(new Student("Jain Doe", "c0123463", "male", 86.9));
        List<Student> studs1 = new ArrayList<Student>();
        studs1.add(new Student("John Smith", "c0112263", "male", 86.9));
        Object obj = new Course(studs);
        Course instance = new Course(studs1);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student("Joe Smith", "c0660563", "male", 96.9));
        Course instance = new Course(studs);
        String expResult = "[\n\t{ \"name\" : \"Joe Smith\", \"id\" : \"c0660563\", \"gender\" : \"male\", \"grade\" : 96.9 }\n]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllByGender method, of class Course.
     */
    @Test
    public void testGetAllByGender() {
        System.out.println("getAllByGender");
        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student("Joe Smith", "c0660563", "male", 96.9));
        studs.add(new Student("Amy Ian", "c0121212", "female", 95.3));
        Set<Student> studSet = new HashSet<Student>();
        studSet.add(new Student("Joe Smith", "c0660563", "male", 96.9));
        String gender = "male";
        Course instance = new Course(studs);
        Set<Student> expResult = studSet;
        Set<Student> result = instance.getAllByGender(gender);
        assertEquals(expResult, result);
    }

    /**
     * Test of getGradeMap method, of class Course.
     */
    @Test
    public void testGetGradeMap() {
        System.out.println("getGradeMap");
        Set<Student> studSet = new HashSet<Student>();
        List<Student> studs = new ArrayList<Student>();
        studs.add(new Student("Joe Smith", "c0660563", "male", 96.9));
        studSet.add(new Student("Joe Smith", "c0660563", "male", 96.9));
        Map<String, Set<Student>> expResult = new TreeMap<>();
        expResult.put("A", studSet);
        Course instance = new Course(studs);
        Map<String, Set<Student>> result = instance.getGradeMap();
        assertEquals(expResult, result);
    }
    
}
