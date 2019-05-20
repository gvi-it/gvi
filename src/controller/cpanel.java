package controller;

import view.*;
import libraries.*;
import hibernate.*;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.util.Set;

public class cpanel implements ActionListener, MouseListener {

    Toolkit resource = Toolkit.getDefaultToolkit();
    
    int width = resource.getScreenSize().width;
    int heigth = resource.getScreenSize().height;
    
    ViewPanel panel = new ViewPanel();
    JPanel ma,children;
    
    public cpanel(Set n) {

/*        while(model.iterator().hasNext()){
            
        }*/
        
        Executive model = (Executive) n.iterator().next();
            
        switch(model.getRole().getId()) {
       
            case 1:
            {
              
            panel.setIconImage(new Logo().createIcon());
                
            panel.setResizable(false); panel.setTitle(model.getRole().getName());
            
            panel.getContentPane().setBackground(Color.white);

            panel.setLocationRelativeTo(null);
            
            panel.menu.getHorizontalScrollBar().setVisible(false);
            
            panel.logout.setVisible(false);
                       
            children =  new view.form.admin.home();
                 
            children.setVisible(true);

            children.setSize(this.panel.menu.getSize());
                        
            JPanel jm = new controller.admin.menu(model,panel.container).getView(), jc = new controller.admin.homec(model).getView();
            
            jm.setPreferredSize(new Dimension(panel.menu.getWidth()-20,panel.menu.getHeight()-40));
            
           // jc.setPreferredSize(new Dimension(panel.container.getWidth(),jc.getHeight()));
            
            panel.menu.setViewportView(jm);
                 
            panel.container.setViewportView(jc);
                
            panel.user_info.setText(model.getName()+" "+model.getLastname()+"  ");
            
            panel.user_info.addMouseListener(this);
            panel.logout.addMouseListener(this);
            
            panel.setVisible(true);
           
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
   
        if(e.getSource().equals(this.panel.logout)){
            this.panel.dispose();
            new access().execute();
        }  
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        
       if(e.getComponent().equals(this.panel.logout)){
           
            if(JOptionPane.showConfirmDialog(null,"Deseas Cerrar Sesioin?","Warning",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            this.panel.dispose();
            new access().execute();
            } 
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
  
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        System.out.println("hola mundo");
        
        if(e.getComponent().equals(this.panel.user_info)){
            
                    e.getComponent().setBackground(new java.awt.Color(200,200,200));
      
        } else if(e.getComponent().equals(this.panel.logout)){
                   
               e.getComponent().setBackground(new java.awt.Color(200,200,200));
               this.panel.user_info.setBackground(new java.awt.Color(200,200,200));
        }
        this.panel.logout.setVisible(true);
    }

    @Override
    public void mouseExited(MouseEvent e) {

         if(e.getComponent().equals(this.panel.user_info)){
                  
             if(this.panel.logout.getBackground().equals(new java.awt.Color(200,200,200))){
                 e.getComponent().setBackground(new java.awt.Color(200,200,200));
             } else{
                 e.getComponent().setBackground(new java.awt.Color(255,255,255));
             }
             
             this.panel.logout.setVisible(false);
             
        } else if(e.getComponent().equals(this.panel.logout)){
             this.panel.user_info.setBackground(new java.awt.Color(255,255,255));
                     this.panel.logout.setVisible(false);
            e.getComponent().setBackground(new java.awt.Color(255,255,255));
        }
    }
}