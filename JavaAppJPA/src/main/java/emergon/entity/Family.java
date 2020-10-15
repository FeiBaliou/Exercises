/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Family implements Serializable{
    @Id//Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//DB will create the primary key(auto increment)
    private int fid;
    private String fname;
    @Enumerated(EnumType.STRING) //to ORDINAL ΘΑ ΦΕΡΕΙ ΤΟΝ ΑΡΙΘΜΟ ΤΟΥ ENUM
    private FamilyType frelationship;
    private LocalDate dob;
    @ManyToOne
    @JoinColumn(name = "salesman")//owning side
    private Salesman salesman;
    
    public Family() {
    }

    public Family(String fname, FamilyType frelationship, LocalDate dob) {
        this.fname = fname;
        this.frelationship = frelationship;
        this.dob = dob;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public FamilyType getFrelationship() {
        return frelationship;
    }

    public void setFrelationship(FamilyType frelationship) {
        this.frelationship = frelationship;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Salesman getSalesman() {
        return salesman;
    }

    public void setSalesman(Salesman salesman) {
        this.salesman = salesman;
    }

    @Override
    public String toString() {
        return "Family{" + "fid=" + fid + ", fname=" + fname + ", frelationship=" + frelationship + ", dob=" + dob + '}';
    }
    
    
}