/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import static org.hibernate.engine.internal.Cascade.cascade;

//SELECT c1,c2 FROM Salesman c1 INNER JOIN C1.


@NamedQueries( value= {
    @NamedQuery(name ="Salesman.findByName", query = "SELECT s FROM Salesman s WHERE s.sname = :onoma"),
    @NamedQuery(name ="Salesman.findSalesmanByNameWithFamily", query = "SELECT s FROM Salesman s JOIN FETCH s.members m WHERE s.sname = :onoma")
})


@Entity
public class Salesman implements Serializable{
    
     @Id//Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scode;
    private String sname;
    private String scity;
    private double scomm;
    @OneToMany(mappedBy = "salesman", cascade = CascadeType.ALL)//JPA look at the field salesman to find out how to map the tables.TO ALL ΣΗΜΑΙΝΕΙ ΟΤΙ ΕΑΝ ΒΓΑΛΕΙΣ ΤΟΝ SALESMAN
    //BGALE KAI OTI EXEI PX.FAMILY
    private List<Family> members;
    @OneToMany(mappedBy = "salesman" , cascade = {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REMOVE})
    private List<Sales> sales;
    
    public Salesman() {
    }

    public Salesman(String sname, String scity, double scomm) {
        this.sname = sname;
        this.scity = scity;
        this.scomm = scomm;
    }

    public int getScode() {
        return scode;
    }

    public void setScode(int scode) {
        this.scode = scode;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity;
    }

    public double getScomm() {
        return scomm;
    }

    public void setScomm(double scomm) {
        this.scomm = scomm;
    }

    public List<Family> getMembers() {
        return members;
    }

    public void setMembers(List<Family> members) {
        this.members = members;
    }

    public List<Sales> getSales() {
        return sales;
    }

    public void setSales(List<Sales> sales) {
        this.sales = sales;
    }
    
    //η μεθοδος που συνδεει τις δυο πλευρες family kai salesman
    public void addmember(Family member){
      if(members == null){
       members = new ArrayList();}
       members.add(member);
       member.setSalesman(this);
    }
    
    
    @Override
    public String toString() {
        return "Salesman{" + "scode=" + scode + ", sname=" + sname + ", scity=" + scity + ", scomm=" + scomm + '}';
    }
}
