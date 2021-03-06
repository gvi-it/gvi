package hibernate;
// Generated 30-abr-2019 16:41:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Provider generated by hbm2java
 */
public class Provider  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String address;
     private String phone;
     private String email;
     private String website;
     private Set inventories = new HashSet(0);

    public Provider() {
    }

    public Provider(String name, String address, String phone, String email, String website, Set inventories) {
       this.name = name;
       this.address = address;
       this.phone = phone;
       this.email = email;
       this.website = website;
       this.inventories = inventories;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getWebsite() {
        return this.website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
    public Set getInventories() {
        return this.inventories;
    }
    
    public void setInventories(Set inventories) {
        this.inventories = inventories;
    }




}


