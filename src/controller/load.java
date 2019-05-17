package controller;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import view.ChargingScreen;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import libraries.Logo;
import libraries.radius;
import javax.management.*;

public class load {
    
private ChargingScreen screen = new ChargingScreen();     
/*private InetAddress ping;
private String ip = "172.217.8.142"; // Ip de la máquina remota  */

    public void load(){
          
        
    }
    
    public void run(){
        
        
        this.screen.setIconImage(new Logo().createIcon());
        
        String SO = System.getProperty("os.name").substring(0,7);
        System.out.println(SO);
        
       // screen.setUndecorated(true);
        screen.setShape(new RoundRectangle2D.Double(0, 0, screen.getWidth(),screen.getHeight(), 5, 5));
        screen.setLocationRelativeTo(null);
        screen.getContentPane().setBackground(new Color(0,0,0,0.8f));
        screen.setVisible(true);
        screen.setResizable(false);
        screen.progress.setBackground(Color.darkGray);
        //screen.progress.setBorder(null);
       
        
        //screen.progress.setBackground(Color.white);

                String ip = "www.google.com";
                           int ban = 0;
                
                for(int x = 0; x <= 10; x++){
                
                String pingResult = "";
            
                //en windows es -n para mandar el numero de paquetes en linux -c
                 String pingCmd;
                 
                 if(SO.equals("Windows"))
                 {
                     pingCmd = "ping -n 1 " + ip;
                 } else {
                     pingCmd = "ping -c 1 " + ip;
                 }
                 
                    try

                {
                    

            Runtime r = Runtime.getRuntime();

            Process p = r.exec(pingCmd);
            System.out.println("ok");
            
            int val;
            
            try {
                val = p.waitFor();
                boolean reachable = (val == 0);
                
                if(reachable){
                    
                     // Inicializa el lector del buffer

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String inputLine;

                   // usando el waitfor en vez de sleep lo metemos dentro del bucle
               
                    Thread.sleep(100);
                    screen.progress.setValue(ban);
                    ban+=10;
                    
                    if(screen.progress.getValue() == screen.progress.getMaximum()){
                           screen.dispose();
                           
                           
/*                           String[] cmd = { "/usr/bin/notify-send",
                "-t",
                "10000",
                "Sesion Iniciada",
                "Bievenido"};
                System.out.println("This is said : Hello OSD");
                Runtime.getRuntime().exec(cmd);*/
              //  Notification notification = new Notification();
          
                
                           
                        new access().checkSession();
                     
                        break;
                    }
                    

             //   System.out.println(inputLine);
                

              //  pingResult += inputLine;
               
            
                    
                     in.close();
       
                } else {
                    JOptionPane.showMessageDialog(null,"Sin conexion con el servidor");
                    System.exit(0);
                }
                
                System.out.println(reachable);
            } catch (InterruptedException ex) {
                Logger.getLogger(load.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (IOException e) {

            System.out.println(e);

        }
            
            }

    }
}
