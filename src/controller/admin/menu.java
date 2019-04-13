package controller.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.menu.*;

public class menu implements ActionListener {

    private admin getView = new view.menu.admin();
    private JScrollPane container;
        
    public menu(JScrollPane container) {
           
    this.container = container;
    
    getView.setSize(container.getSize());
    
    getView.setVisible(true);
    
    config(getView);
        
    }
    
    private void config(admin view){
    
    view.llamarPayroll.addActionListener(this);
            
    }
    
    public JPanel getView(){ return getView; }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource().equals(getView.llamarPayroll)) {
        this.container.setViewportView(new view.form.executive.payroll());
        }      
    }   
}