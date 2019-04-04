package libraries;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FormV {

    private Component[] component;
    private Boolean val = false;
    
    public FormV(Container pane) {
    this.component = pane.getComponents();
    }
    
    public Boolean validate(){
    
        for(int x = 0; x < this.component.length; x++){
            
            if(this.component[x] instanceof JTextField || this.component[x] instanceof JPasswordField) {
              
                if(this.component[x].getName() == "require" && !((JTextField) this.component[x]).getText().equals("")) {
                System.out.println(true);
                this.val = true;
                } else {                
                this.val = false;
                break;
                }
            }
        }
        return this.val;    
    } 
}
