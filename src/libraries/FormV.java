package libraries;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.util.HashMap;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class FormV {

    private Component[] component;
    private Boolean val = false, simple = true;
    private Boolean[] all;
    private HashMap<Class,Integer> ClassComponent = new HashMap<>();
    
    public FormV(Container pane) {
    
    component = pane.getComponents();
    all = new Boolean[this.component.length]; 
    
    ClassComponent.put(JSpinner.class,0);
    ClassComponent.put(JTextField.class,1);
    ClassComponent.put(JCheckBox.class,2);
    ClassComponent.put(JComboBox.class,3);  
    ClassComponent.put(JTextArea.class,4);
    ClassComponent.put(JPasswordField.class,5);
    ClassComponent.put(JFormattedTextField.class,6);
  
    ClassComponent.put(JLayeredPane.class,101);
    ClassComponent.put(JPanel.class,101);
    
   // pane.addKeyListener(this);
    
    }
    
     public FormV(Container pane, Boolean simple) {
     this.simple = simple;    
     }
    
    private Boolean revalidate(Component component,Integer focus) {
       
        boolean state = false;
        
          try {

            switch(ClassComponent.get(component.getClass())){
                 
                 case 0: {
                 
                 state = (component.getName() == "require") ? (!((JSpinner) component).getValue().equals(0) && (int) ((JSpinner) component).getValue() > 0) : true;
                 System.out.println("-----JSpinner");
                                  
                ((JSpinner) component).setBorder((state == false && component.getName() == "require") ? BorderFactory.createLineBorder(Color.red) : new JSpinner().getBorder());
                 break;
                     
                 }
                 
                 case 1: {
                 state = (component.getName() == "require") ? !((JTextField) component).getText().equals("") : true;
                 System.out.println("-----textfield");
       
                 ((JTextField) component).setBorder((state == false && component.getName() == "require") ? BorderFactory.createLineBorder(Color.red) : new JTextField().getBorder());
          
                 break;
                 }
                 
                 case 2: {
                     
                 state = (component.getName() == "require") ? ((JCheckBox) component).isSelected() : true;
                 System.out.println("-----checkbox");
   
                 if(component.getName() == "require") {
                 
                 ((JCheckBox) component).setBorderPaintedFlat(true);
                 ((JCheckBox) component).setBorderPainted(true);
                 ((JCheckBox) component).setBorder((state == false) ? BorderFactory.createLineBorder(Color.red) : new JCheckBox().getBorder());
  
                 }
                 
                 break;
                 }   
                 
                 case 3: {
                 state = (component.getName() == "require") ? (((JComboBox) component).getSelectedIndex() != 0 && ((JComboBox) component).getSelectedIndex() > 0) : true; 
                 System.out.println("-----ComboBox option: "+((JComboBox) component).getSelectedIndex());
                 
                 if(component.getName() == "require") {
                        
                 ((JComboBox) component).setBorder((state == false) ? BorderFactory.createLineBorder(Color.red) : new JComboBox().getBorder());

                 } 
                 
                 break;
                 }
                 
                 case 4: {
                 state = (component.getName() == "require") ? !((JTextArea) component).getText().equals("") : true; 
                 System.out.println("-----TextArea");
                 
                 if(component.getName() == "require") {
                 
                 ((JTextArea) component).setBorder((state == false) ? BorderFactory.createLineBorder(Color.red) : new JTextArea().getBorder()); 
 
                 }
                 break;
                 }
                 
                 case 5: {
                 state = (component.getName() == "require") ? !((JPasswordField) component).getText().equals("") : true;
                 System.out.println("-----PasswordField");
                 
                 if(component.getName() == "require") {
                 
                 ((JPasswordField) component).setBorder((state == false) ? BorderFactory.createLineBorder(Color.red) : new JPasswordField().getBorder());    

                 }
                 break;
                 }
                 
                 case 6: {    
                 state = (component.getName() == "require") ? ((JFormattedTextField) component).isEditValid() : true;
                 System.out.println("-----FormattedTextField");
                 
                 if(component.getName() == "require") {
                 
                 ((JFormattedTextField) component).setBorder((state == false) ? BorderFactory.createLineBorder(Color.red) : new JFormattedTextField().getBorder());  
                                      
                 }
                 
                 break;
                 }
 
                 case 101: {
                  
                 state = search(component);    
                     
                 break;    
                 }
                 
             }

    } catch(Exception e) {
    state = true;
    }
 
    return state;         
    }
   
    
    private Boolean search(Component component){
        
        Component[] ctmp = (component instanceof JLayeredPane) ? ((JLayeredPane) component).getComponents() : ((JPanel) component).getComponents();

        for(int xtmp = 0; xtmp < ctmp.length; xtmp++){
             System.out.println("field : "+ctmp[xtmp].getClass());

             val = revalidate(ctmp[xtmp],xtmp);
             
             if(!val){ ctmp[xtmp].requestFocus(); break; }       

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
        
        for(int y = 0; y < this.all.length; y++) {
        
            if(!simple){ JOptionPane.showMessageDialog(null,"Please complete the form","",JOptionPane.ERROR_MESSAGE);   }   
            
            
            if(!this.all[y]){
            this.val = false;
            break;    
            } 

        }
        return this.val;    
    } 

}