package controller.admin;

import controller.DataBase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import libraries.Placeholder;
import libraries.TableSQL;
import view.form.admin.ListExecutives;

public class executives implements ActionListener, MouseListener{

    private ListExecutives content = new ListExecutives();
    
    public executives() {
        
          content.toregister.addActionListener(this);
          config(content);
             
          try {          
            //conexion               
            DataBase vgi =  new DataBase();

            ResultSet query = vgi.execute("select executive.id as id, executive.name as name,executive.lastname as lastname ,role.name as role from executive inner join role on role.id = executive.role");
            
           // ResultSetMetaData MetaData = query.getMetaData();
            
            TableSQL table = new TableSQL(content.jTable.getPreferredSize());
            
            table.Model(query,TableSQL.DEFAULT);
            
            int[] widthCell = {3,0,80,140,120,3};
            
            table.AdjustCell(widthCell);
            
            table.TransferModel(content.jTable);
            
            content.jTable.addMouseListener(this);
            
            
            
           // content.jTable.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(new JCheckBox()));
            
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
        new ExecutiveData();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    new ExecutiveData((int) content.jTable.getValueAt(content.jTable.getSelectedRow(),1));
    System.out.println(content.jTable.getValueAt(content.jTable.getSelectedRow(),1));
    }

    @Override
    public void mousePressed(MouseEvent e) {
      
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    private void config(ListExecutives window) {
        new Placeholder("Search",window.SearchText);
    }


}