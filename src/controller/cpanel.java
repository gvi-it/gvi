package controller;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.*;
import model.*;
import view.menu.admin;

public class cpanel implements ActionListener, MouseListener {

    Toolkit resource = Toolkit.getDefaultToolkit();
    
    int width = resource.getScreenSize().width;
    int heigth = resource.getScreenSize().height;
    
    tools admin;
    JPanel ma,children;
    
    public cpanel(executive model) {
        
        switch(model.getErole()) {
  
            case 1:
            {
                    
            this.admin = new tools();           
            this.admin.setResizable(false);
            
            this.admin.setTitle("CPanel");
            
            this.admin.getContentPane().setBackground(Color.white);
            
            ma = new view.menu.admin(this.admin.container);
            
            ma.setVisible(true);
           
            ma.setSize(this.admin.menu.getSize());
            
            children = new view.form.admin.home();
               
            children.setVisible(true);

            children.setSize(this.admin.menu.getSize());
                        
            this.admin.menu.setViewportView(ma);
                 
            this.admin.container.setViewportView(children);
                
            admin.user_info.setText(model.getName()+" "+model.getLastname()+"  ");
            
            admin.user_info.addMouseListener(this);
            admin.logout.addMouseListener(this);
            
            admin.setVisible(true);
           
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
   
        if(e.getSource().equals(this.admin.logout)){
            this.admin.dispose();
            new access().execute();
        }
  
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        
       if(e.getComponent().equals(this.admin.logout)){
           
            if(JOptionPane.showConfirmDialog(null,"Deseas Cerrar Sesioin?","Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            this.admin.dispose();
            new access().execute();
        } 
            
       }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        System.out.println("hola mundo");
        
        if(e.getComponent().equals(this.admin.user_info)){
            
                    e.getComponent().setBackground(new java.awt.Color(200,200,200));
      
        } else if(e.getComponent().equals(this.admin.logout)){
                   
               e.getComponent().setBackground(new java.awt.Color(200,200,200));
               this.admin.user_info.setBackground(new java.awt.Color(200,200,200));
        }
        this.admin.logout.setVisible(true);
    }

    @Override
    public void mouseExited(MouseEvent e) {

         if(e.getComponent().equals(this.admin.user_info)){
                  
             if(this.admin.logout.getBackground().equals(new java.awt.Color(200,200,200))){
                 e.getComponent().setBackground(new java.awt.Color(200,200,200));
             } else{
                 e.getComponent().setBackground(new java.awt.Color(255,255,255));
             }
             
             this.admin.logout.setVisible(false);
             
        } else if(e.getComponent().equals(this.admin.logout)){
             this.admin.user_info.setBackground(new java.awt.Color(255,255,255));
                     this.admin.logout.setVisible(false);
            e.getComponent().setBackground(new java.awt.Color(255,255,255));
        }
    }
}