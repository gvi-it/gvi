package hibernate;
// Generated 30-abr-2019 16:41:29 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Schedules generated by hbm2java
 */
public class Schedules  implements java.io.Serializable {


     private Integer id;
     private Executive executive;
     private Date entry;
     private Date launchEntry;
     private Date launchExit;
     private Date exit;
     private Date date;

    public Schedules() {
    }

    public Schedules(Executive executive, Date entry, Date launchEntry, Date launchExit, Date exit, Date date) {
       this.executive = executive;
       this.entry = entry;
       this.launchEntry = launchEntry;
       this.launchExit = launchExit;
       this.exit = exit;
       this.date = date;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Executive getExecutive() {
        return this.executive;
    }
    
    public void setExecutive(Executive executive) {
        this.executive = executive;
    }
    public Date getEntry() {
        return this.entry;
    }
    
    public void setEntry(Date entry) {
        this.entry = entry;
    }
    public Date getLaunchEntry() {
        return this.launchEntry;
    }
    
    public void setLaunchEntry(Date launchEntry) {
        this.launchEntry = launchEntry;
    }
    public Date getLaunchExit() {
        return this.launchExit;
    }
    
    public void setLaunchExit(Date launchExit) {
        this.launchExit = launchExit;
    }
    public Date getExit() {
        return this.exit;
    }
    
    public void setExit(Date exit) {
        this.exit = exit;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


