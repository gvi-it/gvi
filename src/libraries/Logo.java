package libraries;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Logo {
    
     public Logo() {}  
  
     public Image createIcon(){
            
         try {
             Image icon;
             // Image icontmp = ImageIO.read(imagetmp);
             return new ImageIcon(ImageIO.read(new File("src/resources/icon/gvi.png")).getScaledInstance(30,30, 100)).getImage();
         } catch (IOException ex) {
             Logger.getLogger(Logo.class.getName()).log(Level.SEVERE, null, ex);
         }
        return null;       
     }   
}
