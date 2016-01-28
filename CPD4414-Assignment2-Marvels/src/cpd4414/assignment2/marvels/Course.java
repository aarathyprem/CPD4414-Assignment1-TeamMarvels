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

/**
 *
 * @author c0660563
 */
public class Course {
    private  List<Student> students;

    public Course() {
        this.students = new ArrayList<Student>();
    }

    public Course(List<Student> students) {
        this.students = students;
    }
    
    public void add(Student student) {
        this.students.add(student);
    }
    
    public void remove(Student student) {
        this.students.remove(student);
    }
    
    public void remove(String id) {
        this.students.removeIf(s -> s.getId() == id);
    }
    
    public void remove(int position) {
        this.students.remove(position);
    }
    
    public void insert(Student student, int position) {
        this.students.add(position, student);
    }
    
    public Student get(String id) {
        Student stud = null;
        for (Student student : this.students) {
            if (student.getId().equals(id)) {
                stud = student;
            }
        }
        return stud;
    }
    
    public Student get(int position) {
        Student stud = null;
        if(position <= this.students.size())
            stud = this.students.get(position);
        return stud;
    }
    
    public List<Student> getAll() {
        return this.students;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Course) {
            Course c = (Course)obj;
            return(c == this.students);
        }
        return false;
    }
    
    @Override
    public String toString(){
        String studStr = "";
        if(this.students.size() > 0) {
            studStr = "[\n";
            for (int i = 0; i < this.students.size(); i++) {
                if(i > 0)
                    studStr += ",\n";
                studStr += "\t{ \"name\" : \"" + this.students.get(i).getName()+ "\", \"id\" : \"" + this.students.get(i).getId() + "\", \"gender\" : \"" + this.students.get(i).getGender() + "\", \"grade\" : " + this.students.get(i).getGrade() + " }";
            }
            studStr += "\n]";
        }
        return studStr;
    }
    
    public Set<Student> getAllByGender(String gender) {
        Set<Student> stud = new HashSet<>();
        this.students.stream().filter((student) -> (student.getGender().equals(gender))).forEach((student) -> {
            stud.add(student);
        });
        return stud;
    }
    
    public Map<String, Set<Student>> getGradeMap() {
        Map<String, Set<Student>> gradeMap = new TreeMap<>();
        
        Set<Student> gradeMapA = new HashSet();
        Set<Student> gradeMapB = new HashSet();
        Set<Student> gradeMapC = new HashSet();
        Set<Student> gradeMapD = new HashSet();
        Set<Student> gradeMapF = new HashSet();
        
        for (int i = 0; i < this.students.size(); i++) {
            double grade = this.students.get(i).getGrade();
            
            if(grade >= 80 && grade <= 100)
                gradeMapA.add(this.students.get(i));
            else if(grade >= 70 && grade <= 79)
                gradeMapB.add(this.students.get(i));
            else if(grade >= 60 && grade < 69)
                gradeMapC.add(this.students.get(i));
            else if(grade >= 50 && grade < 59)
                gradeMapD.add(this.students.get(i));
            else
                gradeMapF.add(this.students.get(i));
            
        }
        
        if(gradeMapA.size() > 0)
            gradeMap.put("A", gradeMapA);
        if(gradeMapB.size() > 0)
            gradeMap.put("B", gradeMapB);
        if(gradeMapC.size() > 0)
            gradeMap.put("C", gradeMapC);
        if(gradeMapD.size() > 0)
            gradeMap.put("D", gradeMapD);
        if(gradeMapF.size() > 0)
            gradeMap.put("F", gradeMapF);
        
        return gradeMap;
    }
}
