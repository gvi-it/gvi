package controller;

import hibernate.Executive;
import java.awt.event.WindowEvent;
import libraries.Logo;
import view.form.agenda.personal;

public class agenda {
    
    personal window = new personal();
 
    public agenda(Executive e) {
    
    view.menu.admin.personal.setEnabled(false);
    
    window.setIconImage(new Logo().createIcon());
              
    window.setSize(window.getPreferredSize());
              
    window.setTitle("Electronic Agenda - "+e.getName());
      
    window.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            
    window.setResizable(false);
            
    window.setLocationRelativeTo(null);
            
        window.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {

                view.menu.admin.personal.setEnabled(true);
                super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
            }
        });
          
    window.setVisible(true);  
    }
}
