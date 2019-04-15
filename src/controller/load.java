package controller;

import java.awt.Color;
import view.ChargingScreen;
import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class load {
    
private ChargingScreen screen = new ChargingScreen();     
/*private InetAddress ping;
private String ip = "172.217.8.142"; // Ip de la máquina remota  */

    public void load(){
          

    }
    
    public void run(){
               

        screen.setLocationRelativeTo(null);
        screen.getContentPane().setBackground(Color.white);
                screen.setVisible(true);
        
                String ip = "www.google.com";

        String pingResult = "";

        String pingCmd = "ping -c 10 " + ip;

        try

        {

            Runtime r = Runtime.getRuntime();

            Process p = r.exec(pingCmd);
            
            int val;
            
            try {
                val = p.waitFor();
                boolean reachable = (val == 0);
                
                if(reachable){
                    
                     // Inicializa el lector del buffer

            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String inputLine;
            
            int ban = 0;
       
                    while ((inputLine = in.readLine()) != null)

            {
                   // usando el waitfor en vez de sleep lo metemos dentro del bucle
               
                    Thread.sleep(60);
                    screen.progress.setValue(ban);
                    ban+=10;
                    
                    if(screen.progress.getValue() == screen.progress.getMaximum()){
                        new access().execute();
                        screen.dispose();
                        break;
                    }
                    

                System.out.println(inputLine);
                

                pingResult += inputLine;
               
            }
                    
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
