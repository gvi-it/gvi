package controller;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import view.*;
import model.*;

public class cpanel implements ActionListener, ItemListener{

    Toolkit resource = Toolkit.getDefaultToolkit();
    
    int width = resource.getScreenSize().width;
    int heigth = resource.getScreenSize().height;
    
    public cpanel(executive model) {
        
        switch(model.getrole()) {
          //rtht
            case 1:
            {
                
            tools admin = new tools();
            
            admin.jMenuItem1.addActionListener(this);
            
            admin.jMenuItem1.addItemListener(this);
            
            admin.setSize(width, heigth);
            
            admin.setVisible(true);
            
            System.out.println("");
            break;
            }
            
            default :{
                System.out.println("cerrar en default");
            System.exit(0);
            }
        }    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
        System.out.println("");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        if(e.equals("mitem1")){
               System.exit(0);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}