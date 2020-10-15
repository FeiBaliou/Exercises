/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon;

import emergon.entity.Student;
import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

/**
 *
 * @author feiba
 */
public class MyListener {

    public MyListener() {
    }
    
    
    
    @PrePersist void onPrePersist(Student s) {
      System.out.println("Pre-Persistiting operation: " + s);
    }
    
    
    @PostPersist void onPostPersist(Student s) {
    System.out.println("Post-Persistiting operation: " + s);
    }
    
    
    @PostLoad void onPostLoad(Student s) {
    System.out.println("Post-Loading operation: " + s);
    }
    
    
    @PreUpdate void onPreUpdate(Student s) {
    System.out.println("Pre-Update operation: " + s);
    }
    
    
    
    @PostUpdate void onPostUpdate(Student s) {
    System.out.println("Post-Update operation: " + s );
    }
    
    
    @PreRemove void onPreRemove(Student s) {
    System.out.println("Pre-Removing operation: " + s );
    }
    
    
    @PostRemove void onPostRemove(Student s) {
    System.out.println("Post-Removing operation: " + s);
    }
}

