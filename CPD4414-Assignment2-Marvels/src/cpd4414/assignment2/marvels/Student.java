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
public class Student {
    private String name;
    private String id;
    private String gender;
    private double grade;

    public Student() {
        this.name = "";
        this.id = "";
        this.gender = "";
        this.grade = 0;
    }

    public Student(String name, String id, String gender, double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student s = (Student)obj;
            return(id.equalsIgnoreCase(s.getId())&& name.equals(s.getName()));
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "{ \"name\" : \"" + this.name + "\", \"id\" : \"" + this.id + "\", \"gender\" : \"" + this.gender + "\", \"grade\" : " + this.grade + " }";
    }
}
