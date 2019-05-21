package controller.admin;

import controller.DataBase;
import ds.desktop.notify.DesktopNotify;
import java.awt.Dimension;
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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import libraries.TableSQL;
import view.form.admin.ListExecutives;

public class executives implements ActionListener{

    private ListExecutives content = new ListExecutives();
    
    public executives() {
        
          content.toregister.addActionListener(this);
             
          try {          
            //conexion               
            DataBase vgi =  new DataBase();

            ResultSet query = vgi.execute("select executive.id as id,executive.name as name,executive.lastname as lastname ,role.name as role from executive inner join role on role.id = executive.role");
            
           // ResultSetMetaData MetaData = query.getMetaData();
            
            TableSQL table = new TableSQL(content.jTable.getPreferredSize());
            
            table.Model(query,TableSQL.DEFAULT);
            
            int[] widthCell = {5,5,80,120,120,30};
            
            table.AdjustCell(widthCell);
            
            content.jTable.setModel(table.getView().getModel());
            
            //table.Model(query,TableSQL.DEFAULT);
         
            
            /*
            DefaultTableModel modelo = new DefaultTableModel(){
                
               @Override
               public boolean isCellEditable(int rowIndex, int columnIndex) { return (columnIndex == 0) ? true : false; }
            
            };
                        
            // Se obtiene el número de columnas.
            int numeroColumnas = MetaData.getColumnCount()+1;

            // Se crea un array de etiquetas para rellenar
            Object[] etiquetas = new Object[numeroColumnas];
            
            etiquetas[0] = " ";

            // Se obtiene cada una de las etiquetas para cada columna
            for (int i = 1; i < numeroColumnas; i++) {
            // Nuevamente, para ResultSetMetaData la primera columna es la 1. 
            etiquetas[i] = MetaData.getColumnLabel(i).toUpperCase(); 
            }
            
                modelo.setColumnIdentifiers(etiquetas);
               
                content.jTable.setModel(modelo);
                
                content.jTable.setSize(100,5);
                
                int[] widthCell = {5,5,80,120,150};
                
                this.AdjustCells(content.jTable,widthCell);
                
            while(query.next()){
                
                Object[] data = new Object[numeroColumnas];
                  
                content.jTable.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(new JCheckBox()));
                
                for (int i = 1; i < numeroColumnas; i++) {             
                data[i] = query.getObject(etiquetas[i].toString());    
                }
                 
                modelo.addRow(data);
                
                modelo.fireTableDataChanged();   
            }*/

        } catch(SQLException e){ }  
    }
    
     public JPanel getView(){ return content; }
     
     private void AdjustCells(JTable table, int[] WidthCell){
         
    TableColumnModel row = table.getColumnModel();
    
    for(int x = 0; x < WidthCell.length; x++) {
    
    row.getColumn(x).setPreferredWidth(WidthCell[x]);
         
    }
    
    table.setColumnModel(row);
    
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(content.toregister)){
            
            JFrame window = new view.form.admin.addExecutive();
            
            ListExecutives.toregister.setEnabled(false);
    
            window.setSize(window.getPreferredSize());
              
            window.setTitle("New Executive");

             window.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

            window.setResizable(false);

            window.setLocationRelativeTo(null);
            
            window.addWindowListener(new java.awt.event.WindowAdapter() {

                @Override
                public void windowClosing(WindowEvent e) {

                 ListExecutives.toregister.setEnabled(true);
                super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
                }
            });
            
        window.setVisible(true);  
        
        }
    }
}