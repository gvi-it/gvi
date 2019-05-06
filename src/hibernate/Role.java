package hibernate;
// Generated 30-abr-2019 16:41:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Role generated by hbm2java
 */
public class Role  implements java.io.Serializable {


     private Integer id;
     private String role;
     private Set executives = new HashSet(0);

    public Role() {
    }

    public Role(String role, Set executives) {
       this.role = role;
       this.executives = executives;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.role;
    }
    
    public void setName(String role) {
        this.role = role;
    }
    public Set getExecutives() {
        return this.executives;
    }
    
    public void setExecutives(Set executives) {
        this.executives = executives;
    }




}


