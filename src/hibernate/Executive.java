package hibernate;

import java.util.HashSet;
import java.util.Set;

public class Executive  implements java.io.Serializable {

     private Integer id;
     private Role role;
     private String name;
     private String lastname;
     private String email;
     private String password;
     private String roleName;
     private Float salary;
     private Integer hours;
     private Set companies = new HashSet(0);
     private Set scheduleses = new HashSet(0);
     private Set forms = new HashSet(0);
     private Set corporateTaxes = new HashSet(0);

    public Executive() {
    }

    public Executive(Role role, String name, String lastname, String email, String password, String roleName,Float salary, Integer hours, Set companies, Set scheduleses, Set forms, Set corporateTaxes) {
       this.role = role;
       this.roleName = roleName;
       this.name = name;
       this.lastname = lastname;
       this.email = email;
       this.password = password;
       this.salary = salary;
       this.hours = hours;
       this.companies = companies;
       this.scheduleses = scheduleses;
       this.forms = forms;
       this.corporateTaxes = corporateTaxes;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Role getRole() {
        return this.role;
    }
   
    public void setRole(Role role) {
        this.role = role;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public Float getSalary() {
        return this.salary;
    }
    
    public void setSalary(Float salary) {
        this.salary = salary;
    }
    public Integer getHours() {
        return this.hours;
    }
    
    public void setHours(Integer hours) {
        this.hours = hours;
    }
    public Set getCompanies() {
        return this.companies;
    }
    
    public void setCompanies(Set companies) {
        this.companies = companies;
    }
    public Set getScheduleses() {
        return this.scheduleses;
    }
    
    public void setScheduleses(Set scheduleses) {
        this.scheduleses = scheduleses;
    }
    public Set getForms() {
        return this.forms;
    }
    
    public void setForms(Set forms) {
        this.forms = forms;
    }
    public Set getCorporateTaxes() {
        return this.corporateTaxes;
    }
    
    public void setCorporateTaxes(Set corporateTaxes) {
        this.corporateTaxes = corporateTaxes;
    }
}


