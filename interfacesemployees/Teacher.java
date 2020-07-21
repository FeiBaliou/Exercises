/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesemployees;

/**
 *
 * @author feiba
 */
public class Teacher extends Employee implements Advisable{
   
   
    
    public Teacher() {
    }

    public Teacher(String name, double salary) {
        super(name,salary);
       
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    
    
    public static void teach(){
        System.out.println("Teacher is teaching ");
    
    }

    @Override
    public String toString() {
        return "Teacher{" + name +'}';
    }

    @Override
    public void giveAdvice() {
        System.out.println("Teacher advise");
    }

    @Override
    public void work() {
        System.out.println("Teacher is teaching");
    }
    
    
    
    
    
    
    
}
