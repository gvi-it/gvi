package libraries;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashMap;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FormV implements KeyListener{

    private Component[] component;
    private Boolean val = false;
    private Boolean[] all;
    private HashMap<Class,Integer> ClassComponent = new HashMap<>();
    
    public FormV(Container pane) {
    this.component = pane.getComponents();
    this.all = new Boolean[this.component.length]; 
    
    ClassComponent.put(JTextField.class,0);
    ClassComponent.put(JCheckBox.class,1);
    ClassComponent.put(JFormattedTextField.class,2);
    ClassComponent.put(JLayeredPane.class,101);
    ClassComponent.put(JPanel.class,101);
    
   // pane.addKeyListener(this);
    
    }
    
    private Boolean revalidate(Component component) {
       
        boolean state = false;
        
          try {
             
             switch(ClassComponent.get(component.getClass())){
                 
                 case 0: {
                 state = (component.getName() == "require") ? !((JTextField) component).getText().equals(null) : true;
                  System.out.println("-----textfield");
                 break;
                 }
                 
                 case 1: {
                 state = (component.getName() == "require") ? ((JCheckBox) component).isSelected() : true;
                 System.out.println("-----checkbox");
                 break;
                 }   
                 
                 case 2: {
                     
                 state = (component.getName() == "require") ? ((JFormattedTextField) component).isEditValid() : true;
                  System.out.println("-----textfield");
                 break;
                 }
                 
                 case 101:{
                  
                 state = search(component);    
                     
                 break;    
                 }
                 
             }

    } catch(Exception e){
    state = true;
    }
        
    return state; 
        
    }
    
    private Boolean search(Component component){
        
        Component[] ctmp = (component instanceof JLayeredPane) ? ((JLayeredPane) component).getComponents() : ((JPanel) component).getComponents();
                
        for(int xtmp = 0; xtmp < ctmp.length; xtmp++){
             System.out.println("field : "+ctmp[xtmp].getClass());

             val = revalidate(ctmp[xtmp]);
             
             if(!val){ break; }       

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