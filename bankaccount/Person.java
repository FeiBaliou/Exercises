/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author feiba
 */
public class Person {
    private String FirstName;
    private String LastName;
    private int age;
    private List <String> person;
    
    Scanner in = new Scanner(System.in);
    
    

    public Person() {
        person = new ArrayList <>();
        System.out.println("Enter your first name: ");
        FirstName =in.next(); 
        System.out.println("Enter your last name: ");
        LastName =in.next();
        person.add("Holder's Name:" +LastName.toUpperCase()+ " " +  FirstName.toUpperCase().charAt(0)+".");
        System.out.println("Enter your age: ");
        age =in.nextInt(); 
         if (age>18) {
        } else {
            while (age<18){
            System.out.println("You must be at least 18 years old. Enter a valid age:");
               age = in.nextInt();
             } 
        
         }
    }
    

    public Person(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public Person(String FirstName, String LastName, int age) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
    }

    public Person(String FirstName, String LastName, int age, List<String> person) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.person = person;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getPerson() {
        return person;
    }

    public void setBankAccount(List<String> person) {
        this.person = person;
    }
    
    
    
    
    
}
