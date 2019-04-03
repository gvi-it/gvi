/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

import javax.swing.JFrame;
import javax.swing.text.View;
import view.login;

/**
 *
 * @author Preinstalleduser
 */
public class require {

   login e = null;
    
    public require(login w) {
    this.e = w;    
    //this.e = e;    
    }
    
    public void placeholder(int position, String text) {
    e.email.setText("hola mundo");
    }
    
    
}
