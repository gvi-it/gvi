package controller;

import java.awt.Color;
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
import view.*;
import model.*;

public class cpanel implements ActionListener, ItemListener, MouseListener {

    Toolkit resource = Toolkit.getDefaultToolkit();
    
    int width = resource.getScreenSize().width;
    int heigth = resource.getScreenSize().height;
    
    tools admin;
    prueba children;
    
    public cpanel(executive model) {
        
        switch(model.getErole()) {
          //rtht
            case 1:
            {
                    
            this.admin = new tools();
            
            this.admin.setResizable(false);
            
            this.admin.setTitle("CPanel");
            
            this.admin.getContentPane().setBackground(Color.white);
            
           // admin.jMenuItem1.addActionListener(this);
            
          //  admin.jMenuItem1.addItemListener(this);
            
          //  admin.setSize(width, heigth);
            
          
          // admin.container.setSize(200,200);
           
          // admin.jpanelview.add(new view.prueba(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(0, 220, Short.MAX_VALUE);
      
            admin.setVisible(true);
            
            children = new prueba();
            
            children.setSize(admin.getSize());
            
            children.setBackground(Color.white);
            
           
            try{
            admin.container.add(children);
            } catch(Exception e){}
         //  admin.removeAll();
        

            admin.user_info.setText(model.getName()+" "+model.getLastname()+"  ");
            
            admin.user_info.addMouseListener(this);
            admin.logout.addMouseListener(this);
            
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
   
        if(e.getSource().equals(this.admin.logout)){
            this.admin.dispose();
            new access().execute();
        }
  
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
        if(e.equals("mitem1")){
               System.exit(0);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseClicked(MouseEvent e) {
  //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
       if(e.getComponent().equals(this.admin.logout)){
           
            if(JOptionPane.showConfirmDialog(null,"Deseas Salir?","Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            this.admin.container.remove(this.children);
            this.admin.container.repaint();
            this.admin.container.revalidate();
            //this.admin.dispose();
            //new access().execute();
        } 
            
       }
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        System.out.println("hola mundo");
        
        if(e.getComponent().equals(this.admin.user_info)){
            
/*            if(this.admin.logout.getBackground().equals(new java.awt.Color(200,200,200))){
                e.getComponent().setBackground(Color.white);
                } else {*/
                    e.getComponent().setBackground(new java.awt.Color(200,200,200));
               /*     this.admin.logout.setBackground(Color.white);
                }*/
      
        } else if(e.getComponent().equals(this.admin.logout)){
                    
/*                if(this.admin.user_info.getBackground().equals(new java.awt.Color(200,200,200))){
                e.getComponent().setBackground(Color.white);
                } else {
                    e.getComponent().setBackground(new java.awt.Color(200,200,200));
                }*/
               e.getComponent().setBackground(new java.awt.Color(200,200,200));
               this.admin.user_info.setBackground(new java.awt.Color(200,200,200));
        }
//        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/icon/user_white.png"));
        this.admin.logout.setVisible(true);
  //      this.admin.user_info.setIcon(icon);
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
                   // this.admin.user_info.setBackground(Color.white);
                    
                   
                    
                   // this.admin.user_info.setBackground(new java.awt.Color(200,200,200));
            //e.getComponent().setBackground(new java.awt.Color(200,200,200));
        } else if(e.getComponent().equals(this.admin.logout)){
             this.admin.user_info.setBackground(new java.awt.Color(255,255,255));
                     this.admin.logout.setVisible(false);
            e.getComponent().setBackground(new java.awt.Color(255,255,255));
        }
     //    ImageIcon icon = new ImageIcon(getClass().getResource("/resources/icon/user.png"));
       //   this.admin.user_info.setIcon(icon);
                
//         e.getComponent().setForeground(Color.black);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}