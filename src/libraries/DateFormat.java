package libraries;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {

    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");  
    private final LocalDateTime now = LocalDateTime.now();
    
    public DateFormat() { }
    
    public String getTime(){ return (now.getHour() > 12) ? (now.getHour() - 12)+":"+now.getMinute()+" pm" : "0"+now.getHour()+":"+now.getMinute()+" am"; }
    
    public String getDate(){ 
    
        String m,d;
        
        d = (now.getDayOfMonth() < 10) ? "0"+now.getDayOfMonth(): ""+now.getDayOfMonth();
        m = (now.getMonthValue() < 10) ? "0"+now.getMonthValue() : ""+now.getMonthValue();
        return  d+"-"+m+"-"+ now.getYear();    
    }    
}
