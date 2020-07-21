/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesemployees;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author feiba
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Teacher t1 = new Teacher("Fei",900);
        Teacher t2 = new Teacher("Sofia",600);
        
        Receptionist r1 = new Receptionist("Kostas",700);
        
        Director d1 = new Director("Mixalis",3000);
        Director d2 = new Director("Loukas",2500);
        
        
       
        
        List<Employee> employees = new ArrayList();
        employees.add(t1);
        employees.add(t2);
        employees.add(r1);
        employees.add(d1);
        employees.add(d2);
         for(Employee employee:employees) {
         employee.work();
         
         }
    
         
         
         List<Driving> driver  = new ArrayList();
         List<Advisable> adviser = new ArrayList();
         
         
         
         for(Employee employee: employees){
             if  (employee instanceof Driving)
                  driver.add((Driving)employee);
            
             else if(employee instanceof Advisable)
                 adviser.add((Advisable)employee);

         }
         
         // Separate employees that can drive from those that can advice.
         System.out.println("Employees that can drive are:" + driver.toString());
         System.out.println("Employees that can advise are:"+ adviser.toString());
}
}
