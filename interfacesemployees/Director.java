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
public class Director extends Employee implements Driving,Advisable{

    public Director() {
    }
    
    
     public Director(String name, double salary){
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

    
    
    public void guide(){
        System.out.println("Director gives guidance");}
    
    @Override
    public String toString() {
        return "Director{" + name +'}';
    }

    @Override
    public void drive() {
        
    }

    @Override
    public void giveAdvice() {
       
    }

    @Override
    public void work() {
        System.out.println("Director gives guidance");
    }
    
    
    
    
}
