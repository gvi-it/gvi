package model;

public class executive {
    
     private int id,type;
    private String name,lastname,ext,email,password,erole;
    
    public executive(int id, String name, String lastname, String ext, String email, String password, String erole, int type) {
    this.id = id;
    this.name = name;
    this.lastname = lastname;
    this.email = email;
    this.password = password;
    this.erole = erole;
    this.type = type;
    }
    
    public executive(){
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setErole(String erole) {
        this.erole = erole;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getId() {
        return id;
    }

    public String getErole() {
        return erole;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getExt() {
        return ext;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    } 

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }  
}