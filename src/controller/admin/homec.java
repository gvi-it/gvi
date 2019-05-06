/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

/**
 *
 * @author Preinstalleduser
 */

import hibernate.Company;
import hibernate.Executive;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import view.form.admin.home;
import model.executive;

public class homec {

     private home content = new view.form.admin.home();
    
    public homec(Executive m) {
        
       // Object columnas[] = {"NOMBRES","CEDULA","DIRECCION","SEXO (M/F)","HOBBIES"};
  
       
        Iterator it = m.getCompanies().iterator();
     while(it.hasNext()){
     Company temp = (Company) it.next();
     System.out.println(temp.getCity());
     }

         
/*        DefaultTableModel models = new DefaultTableModel(0,0);

        
        String[] arrOfStrs = new String[5];
 
		// Initialize the array.
	Object[] recvArr = m.getCompanies().toArray(arrOfStrs);
        
        models.addRow(recvArr);
        
        content.jTable.setModel(models);
        
        models.fireTableDataChanged();
        
        content.jTable.revalidate();*/
        
        content.setVisible(true);
         
    }
    
     public JPanel getView(){ return content; }

}
