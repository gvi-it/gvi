package controller;

import java.awt.Color;
import view.ChargingScreen;
/*import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;*/
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
               
        screen.setVisible(true);
        screen.setLocationRelativeTo(null);
        screen.getContentPane().setBackground(Color.white);
        
                String ip = "www.google.com";

        String pingResult = "";

 

        // Contiene la instruccion a ejecutar...

        // Esta instruccion podria ser cambiada por cualquier otra

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

            // Bucle mientas reciba parametros del buffer

                    
                    while ((inputLine = in.readLine()) != null)

            {
                
                try {
                    Thread.sleep(60);
                    screen.progress.setValue(ban);
                    ban+=10;
                    
                    if(screen.progress.getValue() == screen.progress.getMaximum()){
                        new access().execute();
                                                screen.dispose();
                    }
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(load.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Muestra por pantalla cada una de las lineas que recibe

                System.out.println(inputLine);
                
                

                // Si deseamos capturar el resultado para posteriormente

                // utilizarlo en nuestra aplicacion

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
    }/*   
        try {
        
            ping = InetAddress.getByName(ip);
                
           if(ping.isReachable(1000)) {
            System.out.println(ip+" - responde!");
           
            for(int x = 0; x <= 100; x++){
                try {
                    Thread.sleep(60);
                } catch (InterruptedException ex) {
                    Logger.getLogger(load.class.getName()).log(Level.SEVERE, null, ex);
                }
                screen.progress.setValue(x);
                
                if(screen.progress.getValue() == 100){
                screen.dispose();
                new access().execute();
                }
            }
            
            }else {
            System.out.println(ip+" - no responde!");
            }
        } catch (IOException ex) { System.out.println(ex); } 
    }*/
    
}
