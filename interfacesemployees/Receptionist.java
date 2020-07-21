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
public class Receptionist extends Employee implements Driving {

    public Receptionist() {
    }
    
    
    public Receptionist(String name, double salary){
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

    
    
    
    public static void greet(){
        System.out.println("Receptionist is greeting");}
    
    
    
    
    @Override
    public String toString() {
        return "Receptionist{" + name + '}';
    }

    @Override
    public void drive() {
        System.out.println("Receptionist can drive");
    }

    @Override
    public void work() {
        System.out.println("Receprionist is greeting");
    }
    
    
    
    
    
}
