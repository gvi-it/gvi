package hibernate;
// Generated 30-abr-2019 16:41:29 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CorporateTax generated by hbm2java
 */
public class CorporateTax  implements java.io.Serializable {


     private Integer id;
     private Company company;
     private Executive executive;
     private Float irs;
     private Date year;
     private String street;
     private String city;
     private String zipCode;
     private Boolean checked;
     private Float state;
     private Date date;
     private String addressee;
     private String observation;
     private String comment;
     private Set corporateStatuses = new HashSet(0);

    public CorporateTax() {
    }

    public CorporateTax(Company company, Executive executive, Float irs, Date year, String street, String city, String zipCode, Boolean checked, Float state, Date date, String addressee, String observation, String comment, Set corporateStatuses) {
       this.company = company;
       this.executive = executive;
       this.irs = irs;
       this.year = year;
       this.street = street;
       this.city = city;
       this.zipCode = zipCode;
       this.checked = checked;
       this.state = state;
       this.date = date;
       this.addressee = addressee;
       this.observation = observation;
       this.comment = comment;
       this.corporateStatuses = corporateStatuses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    public Executive getExecutive() {
        return this.executive;
    }
    
    public void setExecutive(Executive executive) {
        this.executive = executive;
    }
    public Float getIrs() {
        return this.irs;
    }
    
    public void setIrs(Float irs) {
        this.irs = irs;
    }
    public Date getYear() {
        return this.year;
    }
    
    public void setYear(Date year) {
        this.year = year;
    }
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public Boolean getChecked() {
        return this.checked;
    }
    
    public void setChecked(Boolean checked) {
        this.checked = checked;
    }
    public Float getState() {
        return this.state;
    }
    
    public void setState(Float state) {
        this.state = state;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public String getAddressee() {
        return this.addressee;
    }
    
    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }
    public String getObservation() {
        return this.observation;
    }
    
    public void setObservation(String observation) {
        this.observation = observation;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    public Set getCorporateStatuses() {
        return this.corporateStatuses;
    }
    
    public void setCorporateStatuses(Set corporateStatuses) {
        this.corporateStatuses = corporateStatuses;
    }




}

