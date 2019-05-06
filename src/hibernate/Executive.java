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
     private Set companies = new HashSet();
     private Set scheduleses = new HashSet();
     private Set forms = new HashSet();
     private Set corporateTaxes = new HashSet();
     private Set ListExecutives = new HashSet();

    public Executive() { }

    public Executive(Role role, String name, String lastname, String email, String password,Float salary, int hours) {

       this.role = role;
       this.name = name;
       this.lastname = lastname;
       this.email = email;
       this.password = password;
       this.salary = salary;
       this.hours = hours;
/*       this.companies = companies;
       this.scheduleses = scheduleses;
       this.forms = forms;
       this.corporateTaxes = corporateTaxes;
       this.ListExecutives.add(ListExecutive);*/
    }
    

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set getListExecutives() {
        return ListExecutives;
    }

    public void setListExecutives(Executive model) {
        this.ListExecutives.add(model);
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
    
    public void setCompanies(Company companies) {
        this.companies.add(companies);
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


