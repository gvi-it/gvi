/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import controller.Connect_DB;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import view.form.admin.executive;

/**
 *
 * @author Preinstalleduser
 */
public class executives implements ActionListener{

    private executive content = new executive();
    
    public executives() {
        
          content.toregister.addActionListener(this);
        
          try {          
            //conexion               
            Connect_DB vgi =  new Connect_DB();

            ResultSet query = vgi.execute(" select executive.id as id,executive.name as name,executive.lastname as lastname ,role.name as role from executive inner join role on role.id = executive.role");
            
            ResultSetMetaData MetaData =query.getMetaData();
            
             DefaultTableModel modelo = new DefaultTableModel(){ public boolean isCellEditable(int rowIndex, int columnIndex) {
               if(columnIndex == 0){
               return true;    
               } else {
               return false;    
               }
            }};
            
            
           
            // Se obtiene el número de columnas.
            int numeroColumnas = MetaData.getColumnCount()+1;

            // Se crea un array de etiquetas para rellenar
            Object[] etiquetas = new Object[numeroColumnas];
            
            etiquetas[0] = " ";

            // Se obtiene cada una de las etiquetas para cada columna
            for (int i = 1; i < numeroColumnas; i++)
            {
            // Nuevamente, para ResultSetMetaData la primera columna es la 1. 
            etiquetas[i] = MetaData.getColumnLabel(i).toUpperCase();
                
               
            }
            
               modelo.setColumnIdentifiers(etiquetas);
               
                content.jTable.setModel(modelo);
                
                content.jTable.setSize(100,5);
                
                
               

            
            while(query.next()){
                
                
                Object[] data = new Object[numeroColumnas];
                
                //System.out.println(query.getString(1));
                
            //        data[0] = new JCheckBox();
                  
                 content.jTable.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(new JCheckBox()));
                
                 for (int i = 1; i < numeroColumnas; i++){
                
//                     System.out.println("result "+query.getObject(i));
                     data[i] = query.getObject(etiquetas[i].toString());
                     
                     
                     
                    
                 }
                
                
                modelo.addRow(data);
                
                modelo.fireTableDataChanged();
                
            }
           
            
         
            
          //  modelo.fireTableDataChanged();
            
  
            
          
            
            //model = new executive(query.getInt("id"),query.getString("name"),query.getString("lastname"),query.getString("ext"),query.getString("email"),query.getString("password"),query.getInt("erole"));                
 
        } catch(SQLException e){
            
            
            
        }
        
    }
    
      public JPanel getView(){ return content; }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(content.toregister)){
            JFrame window = new view.form.admin.addExecutive();
           window.setSize(window.getPreferredSize());
              
    window.setTitle("New Executive");
      
     window.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            
    window.setResizable(false);
            
    window.setLocationRelativeTo(null);
            
        window.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {

                view.menu.admin.personal.setEnabled(true);
                super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
            }
        });
          
    window.setVisible(true);  
        }
    }
     
}
