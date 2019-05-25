package controller;

import ds.desktop.notify.DesktopNotify;
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
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class cpanel implements ActionListener, MouseListener {

    Toolkit resource = Toolkit.getDefaultToolkit();
    
    int width = resource.getScreenSize().width;
    int heigth = resource.getScreenSize().height;
    
    ViewPanel panel = new ViewPanel();
    JPanel ma,children;
    
    public cpanel(Set n) {

    /*        while(model.iterator().hasNext()){  }*/
        
        Executive model = (Executive) n.iterator().next();
            System.out.println(model.getRole().getId());
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
            
            this.message(model);
           
            break;
            }
  
            default :
            {
            
            if(AccountSession.File.delete()) {
                new access().checkSession();
                JOptionPane.showMessageDialog(panel,"The user exists but has not assigned a role, please contact the IT department.","Problem with account",JOptionPane.WARNING_MESSAGE);
            } else{
                System.exit(0);
            }
            break;
            }
        }     
    }
    
    private void message(Executive model){
        try {
                    //            DesktopNotify.showDesktopMessage("Gerencia Virtual Inc","Bienvenido "+model.getName(),DesktopNotify.INFORMATION);
            DesktopNotify.showDesktopMessage("Gerencia Virtual Inc","Bienvenido "+model.getName(), DesktopNotify.DEFAULT,new ImageIcon(ImageIO.read(new File("src/resources/logo_gvi.png")).getScaledInstance(200,200, 100)).getImage(), null,10000);
            } catch (IOException ex) {
            Logger.getLogger(access.class.getName()).log(Level.SEVERE, null, ex);
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