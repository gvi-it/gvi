package libraries;

import controller.access;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Logo {

    public Logo(JFrame window) {
    
    File imagetmp =  new File("src/resources/icon/gvi.png");
    Image icon;
    
        try {
           
            Image icontmp = ImageIO.read(imagetmp);
            window.setIconImage(new ImageIcon(icontmp.getScaledInstance(30, 30, 100)).getImage());
            
        } catch (IOException ex) {
            Logger.getLogger(access.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }  
}
