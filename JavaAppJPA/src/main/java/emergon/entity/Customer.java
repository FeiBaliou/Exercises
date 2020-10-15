/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergon.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer implements Serializable{
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)  
   private int ccode ;
   private String cname;
   
   @OneToMany (mappedBy="customer")
   private List<Sales> sales;

    public Customer() {
    }

    public int getCcode() {
        return ccode;
    }

    public void setCcode(int ccode) {
        this.ccode = ccode;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    
    public List<Sales> getSales() {
        return sales;
    }

    public void setSales(List<Sales> sales) {
        this.sales = sales;
    }
   
    
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.ccode;
        hash = 53 * hash + Objects.hashCode(this.cname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.ccode != other.ccode) {
            return false;
        }
        if (!Objects.equals(this.cname, other.cname)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Customer{" + "ccode=" + ccode + ", cname=" + cname + '}';
    }

    
   
   
   
    
}
