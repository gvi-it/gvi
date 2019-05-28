package libraries;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormV implements KeyListener{

    private Component[] component;
    private Boolean val = false;
    private Boolean[] all;
    
    public FormV(Container pane) {
    this.component = pane.getComponents();
    this.all = new Boolean[this.component.length]; 
    
   // pane.addKeyListener(this);
    
    }
    
    private Boolean search(Component component){
  
        Component[] ctmp = (component instanceof JLayeredPane) ? ((JLayeredPane) component).getComponents() : ((JPanel) component).getComponents();
                
        for(int xtmp = 0; xtmp < ctmp.length; xtmp++){
             
            if(ctmp[xtmp] instanceof JTextField || ctmp[xtmp] instanceof JPasswordField || ctmp[xtmp] instanceof JComboBox || ctmp[xtmp] instanceof JCheckBox || ctmp[xtmp] instanceof JTextArea) {
              
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
            } else if(ctmp[xtmp] instanceof JLayeredPane || ctmp[xtmp] instanceof JPanel){
                
             val = search(ctmp[xtmp]);
             
                if(!val)
                {
                break;    
                }
            }          
        }
        return val;
    }
    
    public Boolean validate(){

        for(int x = 0; x < this.component.length; x++) {
            
            if(this.component[x] instanceof JLayeredPane || this.component[x] instanceof JPanel){
               System.out.println(this.component[x].getClass());
                this.all[x] = this.search(this.component[x]);
                System.out.println("position"+x+" = "+this.val);
                
            } else {
                this.all[x] = true;
                System.out.println(this.component[x].getClass());
                  System.out.println(this.component[x].getName());
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

    private void InputType(Container pane) {
    
        
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {

            System.out.println(e.getSource().getClass());
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}