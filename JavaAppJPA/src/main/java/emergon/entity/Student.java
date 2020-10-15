/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.entity;

import emergon.MyListener;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@EntityListeners(MyListener.class)
@Entity 
public class Student implements Serializable{
    @Id//Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String name;
    private int age;
    private LocalDate dob;
    private String sclass;

    public Student() {
    }

    public Student(String name, int age, LocalDate dob, String sclass) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.sclass = sclass;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return dob;
    }

    public void setDate(LocalDate date) {
        this.dob = date;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    @Override
    public String toString() {
        return "Student{" + "sid=" + sid + ", name=" + name + ", age=" + age + ", date=" + dob + ", sclass=" + sclass + '}';
    }
    
 
    
    
    
    
    
}
