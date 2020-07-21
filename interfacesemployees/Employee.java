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
public abstract class Employee {
    String name ;
    double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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

    
   public abstract void work();
    
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
    
    
    
}
