/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Preinstalleduser
 */
public class DateFormat {

    
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");  
    private LocalDateTime now = LocalDateTime.now();
    

    public DateFormat() {
    }
    
    public String getTime(){
    
    String dateHour = "";    
        
    if(now.getHour() > 12){
    
        int xhr = 0;
        
        for(int x= 12; x <= now.getHour(); x++){
        xhr++;    
        }
        
        dateHour = xhr+":"+now.getMinute()+" pm";
        
    } else { dateHour = "0"+now.getHour()+":"+now.getMinute()+" am"; }    
        
    return dateHour;    
    }
    
    public String getDate(){ 
    
        String m,d;
        
        if(now.getMonthValue() < 10) {
        m = "0"+now.getMonthValue(); }   
        else { m = ""+now.getMonthValue(); }
        
                if(now.getDayOfMonth() < 10) {
        d = "0"+now.getDayOfMonth(); }   
        else { d = ""+now.getDayOfMonth(); }
        
    return d+"-"+m+"-"+now.getYear();
    }
    
}
