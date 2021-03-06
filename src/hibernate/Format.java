package hibernate;
// Generated 30-abr-2019 16:41:29 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Format generated by hbm2java
 */
public class Format  implements java.io.Serializable {


     private Integer id;
     private String type;
     private Set forms = new HashSet(0);

    public Format() {
    }

    public Format(String type, Set forms) {
       this.type = type;
       this.forms = forms;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    public Set getForms() {
        return this.forms;
    }
    
    public void setForms(Set forms) {
        this.forms = forms;
    }




}


