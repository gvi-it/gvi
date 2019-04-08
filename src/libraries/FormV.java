package libraries;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JLayeredPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormV {

    private Component[] component;
    private Boolean val = false;
    private Boolean[] all;
    
    public FormV(Container pane) {
    this.component = pane.getComponents();
    this.all = new Boolean[this.component.length]; 
    }
    
    private Boolean search(JLayeredPane layared){
        
        Component[] ctmp = layared.getComponents();
                
        for(int xtmp = 0; xtmp < ctmp.length; xtmp++){
             
            if(ctmp[xtmp] instanceof JTextField || ctmp[xtmp] instanceof JPasswordField) {
              
                if(ctmp[xtmp].getName() == "require") {
                System.out.println(true);

                    if(!((JTextField) ctmp[xtmp]).getText().equals("")){
                    val = true;
                    } else {                
                    val = false;
                    break;
                    }
                } else {
                    val = true;
                }
            } else if(ctmp[xtmp] instanceof JLayeredPane){
                
             val = search((JLayeredPane) ctmp[xtmp]);
             
                if(!val)
                {
                break;    
                }
            }          
        }
        return val;
    }
    
    public Boolean validate(){
   
        for(int x = 0; x < this.component.length; x++){
            
            if(this.component[x] instanceof JLayeredPane){
               System.out.println(this.component[x].getClass());
                this.all[x] = this.search((JLayeredPane) this.component[x]);
                System.out.println("position"+x+" = "+this.val);
                
            } else {
                this.all[x] = true;
                System.out.println(this.component[x].getClass());
            }
        }
        for(int y = 0; y < this.all.length; y++){
        
            if(!this.all[y]){
            this.val = false;
            break;    
            }   
        }
        return this.val;    
    } 
}
