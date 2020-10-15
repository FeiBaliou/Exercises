/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon;

import emergon.entity.Customer;
import emergon.entity.Family;
import emergon.entity.FamilyType;
import emergon.entity.Product;
import emergon.entity.Salesman;
import emergon.entity.Student;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;
import javax.persistence.TypedQuery;


public class MainClass {
    
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static void main (String [] args) {
        
       
        
        System.out.println("Starting JPA....");
        
        openEntityManagerFactory();      
        
 
          deleteStudent();
        

        
        
//        Product p = new Product("Phone", 120);
//        createProduct(p);
//        Customer c = getCustomerById(100102);
//        System.out.println("Customer before update:" + c);
//        c.setCname("kk");
//        updateCustomer(c);
//        System.out.println("Customer after update:" + c);

         


        
        closeEntityManagerFactory();
        
    }
     
    //CRUD Student
    //Create Student
   
    private static void createStudent(){
         Student student = new Student("Mary",20,LocalDate.parse("1990-09-06",formatter),"CB12");
         openEntityManager();
         em.getTransaction().begin();
         em.persist(student); 
         em.getTransaction().commit();
         closeEntityManager();
    
    }
    
    
    
     //Delete Student
    private static void deleteStudent(){
         openEntityManager();
         Query query = em.createNativeQuery("SELECT * FROM student WHERE name = ?", Student.class);
         query.setParameter(1,"Nikos");
         Student student = (Student)query.getSingleResult();
         em.getTransaction().begin();
         em.remove(student);
         em.getTransaction().commit();
         closeEntityManager();
   
    }
    
    //Update Student
     private static Student updateStudent(Student s){
        openEntityManager();
        em.getTransaction().begin();
        s = em.merge(s); 
        em.getTransaction().commit(); 
        closeEntityManager();
        return s;
   
}
       //Get Student by Id
       private static Student getStudentById(int sid){
        openEntityManager();
        Student student =  em.find(Student.class, sid);
        System.out.println("*************");
        System.out.println("student:" + student);
        System.out.println("******************");
        closeEntityManager();
        return student;
    
    }
    
    
    
    private static void deleteSalesman(){
         openEntityManager();
         Query query = em.createNativeQuery("SELECT * FROM salesman WHERE sname = ?", Salesman.class);
         query.setParameter(1,"kAPA");
         Salesman politis = (Salesman)query.getSingleResult();
         //em.createNativeQuery("SELECT * FROM Salesman where sname = ?", Salesman.class);
        // em.find(Salesman.class, 108);
         em.getTransaction().begin();
         em.remove(politis);
         em.getTransaction().commit();
         closeEntityManager();
    
    
    
    }
    
    private static void createSalesmanWithFamily(){
        Salesman politis = new Salesman("Mary","Thessaloniki",0.15);
        Family member1  = new Family("Peter",FamilyType.FATHER,LocalDate.now());
      //  Family member2  = new Family("Jonathan JuniorB",FamilyType.DAUGHTER,LocalDate.now());
        politis.addmember(member1);
      //  politis.addmember(member2);
        
        //μπαινει στη βαση ο politis και τα members στο family
         openEntityManager();
         em.getTransaction().begin();
         em.persist(politis);  //Add product
         em.getTransaction().commit();
         closeEntityManager();
    
    }
    
    private static Salesman getSalesmanWithFamily(String name){
      openEntityManager();
      TypedQuery<Salesman> query=  em.createNamedQuery("Salesman.findSalesmanByNameWithFamily", Salesman.class);
      query.setParameter("onoma", name);
      Salesman s;
      
        s = query.getSingleResult();
      
//      return  s = query.getSingleResult();
     // List<Salesman> list = query.getResultList();
     // System.out.println("--------------------------------------");
      //list.get(0).getMembers().size(); //gia na trexei to query o Hibernate wste na ferei to family
     // System.out.println("--------------------------------------");
      closeEntityManager();
       return s;
    
    
    }
    
    private static Salesman getSalesmanByName(String name){
        openEntityManager();
        Query query=  em.createNamedQuery("Salesman.findByName", Salesman.class);
        query.setParameter("onoma", name);
        // η getResultList που ειναι ποιο ασφαλες.Ean xrisimopoioisoume to getSingle result ua valoume TypedQuery<Salesman> query
        //query.getSingleResult(); 
        List<Salesman> list = query.getResultList();
        closeEntityManager();
        if(list.size()>0){
         return list.get(0);
       } else{return null;}
       
    
    }
    
    
    private static void printCustomers(){
       openEntityManager();
       String sql = "SELECT c FROM Customer c";  //jpql java Persistence Query Language
       TypedQuery query = em.createQuery(sql, Customer.class);  //We create object TypedQuery fron EntityManager
       
       List<Customer> list = query.getResultList(); //Execute the Query tog et the List
        System.out.println("***********");
           for(Customer c:list){
           System.out.println(c);
           }
       
        System.out.println("***********");
        closeEntityManager();
    
    
    }

    
    
    private static void createProduct(Product p){
         openEntityManager();
         em.getTransaction().begin();
         em.persist(p);  //Add product
         em.getTransaction().commit();
         closeEntityManager();
    }
    
    private static void deleteProduct(Product p){
         openEntityManager();
        // Product p = em.find(Product.class,1319);
         em.getTransaction().begin();
         em.remove(p);  //Add product
         em.getTransaction().commit();
         closeEntityManager();
    
        
    }
    
   
    
    
    
    private static Customer getCustomerById(int ccode){
        openEntityManager();
        Customer customer =  em.find(Customer.class, ccode);
        System.out.println("*************");
        System.out.println("customer:" + customer);
        System.out.println("******************");
        closeEntityManager();
        return customer;
    
    }
    
   private static Customer updateCustomer(Customer c){
       openEntityManager();
        em.getTransaction().begin();
        c = em.merge(c); //like Update  Επιστρέφει τον customer
        em.getTransaction().commit(); //send the query to the Database
        
        closeEntityManager();
        return c;
   
}
    
        
    private static void openEntityManager(){
     em = emf.createEntityManager();
    }
    
    private static void closeEntityManager(){
     em.close();
    }
    
    private static void openEntityManagerFactory(){
        System.out.println("Opening EntityManagerFactory...");
        emf = Persistence.createEntityManagerFactory("mainPU");

}
    
    private static void closeEntityManagerFactory(){
        emf.close();
        System.out.println("Closing EntityManagerFactory....");
    
    }
    
    
}
