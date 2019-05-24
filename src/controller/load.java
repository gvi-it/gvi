package controller;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import view.ChargingScreen;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import libraries.Logo;

public class load {
    
private final ChargingScreen screen = new ChargingScreen();  
private final String server = "192.168.77.101"; // Ip de la máquina remota 
private final String SO = System.getProperty("os.name").substring(0,7);
private String pingCmd;
private int count;

    public void load(){ }
    
    public void run(){
     
        screen.setIconImage(new Logo().createIcon());
        screen.setShape(new RoundRectangle2D.Double(0, 0, screen.getWidth(),screen.getHeight(), 5, 5));
        screen.setLocationRelativeTo(null);
        screen.getContentPane().setBackground(new Color(0,0,0,0.8f));
        screen.setVisible(true);
        screen.setResizable(false);
        screen.progress.setBackground(Color.darkGray);
        //en windows es -n para mandar el numero de paquetes en linux -c
        pingCmd = ("Windows".equals(SO)) ? "ping -n 1 " : "ping -c 1 ";        
        
        for(int x = 0; x <= 10; x++) {
         
            try { // preparamos el proceso de ping hacia el servidor
                  Process p = Runtime.getRuntime().exec(pingCmd+server);

                try { // usando el waitfor en vez de sleep lo metemos dentro del bucle
                    int val = p.waitFor();

                    if(val == 0) {
                        // Inicializa el lector del buffer
                        try (BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
                           
                            Thread.sleep(100);
                            screen.progress.setValue(count);
                            count+=10;

                            if(screen.progress.getValue() == screen.progress.getMaximum()) {

                                new access().checkSession();
                                screen.dispose();
                                break;
                            }
                        }

                    } else {
                        JOptionPane.showMessageDialog(null,"Sin conexion con el servidor");
                        System.exit(0);
                    }
                    
                } catch (InterruptedException ex) { Logger.getLogger(load.class.getName()).log(Level.SEVERE, null, ex); }
                
            } catch (IOException e) { System.out.println(e); }         
        }
    }
}