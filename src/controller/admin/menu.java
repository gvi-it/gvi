package controller.admin;

import hibernate.Executive;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.menu.*;

public class menu implements ActionListener {

    private admin getView = new view.menu.admin();
    private JScrollPane container;
    
    Executive executive;
    JPanel tmp;
        
    public menu(Executive executive,JScrollPane container) {
           
    this.container = container;
    
    this.executive = executive;
    
//    getView.setBackground(Color.);
    
    getView.setSize(container.getSize());
    
    getView.setVisible(true);
    
    config(getView);
        
    }
    
    private void config(admin view){
    
    view.home.addActionListener(this);
    view.companies.addActionListener(this);
            
    }
    
    public JPanel getView(){ return getView; }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource().equals(getView.home)){
       
         tmp = new controller.admin.homec(executive).getView();   
        
         tmp.setPreferredSize(new Dimension(container.getWidth(),tmp.getHeight()));
         
         this.container.setViewportView(tmp);
         
        } else if(e.getSource().equals(getView.companies)) {
          
          tmp = new controller.admin.companies(executive).getView();   
        
         tmp.setPreferredSize(new Dimension(container.getWidth(),tmp.getHeight()));
         
         this.container.setViewportView(tmp);
        }      
    }   
}