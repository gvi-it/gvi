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

import controller.DataBase;
import hibernate.Company;
import hibernate.Executive;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.form.admin.*;

public class homec {

     private ListCompanies content = new view.form.admin.ListCompanies();
    
    public homec(Executive executive) {
        
         DataBase gvi =  new DataBase();

            ResultSet query = gvi.execute("SELECT id FROM company_status ");

         try {
             //model = new executive(query.getInt("id"),query.getString("name"),query.getString("lastname"),query.getString("ext"),query.getString("email"),query.getString("password"),query.getInt("erole"));
             
            while(query.next()) {
                 
            ResultSet company = gvi.execute("select count(id) from company where status ="+query.getInt("id"));
            
         //   ListCompanies.next();
            
            this.setPercentage(query.getInt("id"),company);
                 
             }
             
             
             // Object columnas[] = {"NOMBRES","CEDULA","DIRECCION","SEXO (M/F)","HOBBIES"};
             
             /*   try {
             //conexion
             DataBase vgi =  new DataBase();
             
             ResultSet query = vgi.execute("select name,city,type as status from ListCompanies inner join company_status on company_status.id = ListCompanies.status and executive = "+executive.getId());
             
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
             
             
             
             /*    Iterator it = executive.getCompanies().iterator();
             while(it.hasNext()){
             Company temp = (Company) it.next();
             System.out.println(temp.getCity());
             }*/
             
             
             /*        DefaultTableModel models = new DefaultTableModel(0,0);
             
             
             String[] arrOfStrs = new String[5];
             
             // Initialize the array.
             Object[] recvArr = m.getCompanies().toArray(arrOfStrs);
             
             models.addRow(recvArr);
             
             content.jTable.setModel(models);
             
             models.fireTableDataChanged();
             
             content.jTable.revalidate();*/
         } catch (SQLException ex) {
             Logger.getLogger(homec.class.getName()).log(Level.SEVERE, null, ex);
         }
        
       

        content.setVisible(true);
         
    }
    
     public JPanel getView(){ return content; }

    private void setPercentage(int type,ResultSet company) {
     
         try {
              
             
            DataBase gvi =  new DataBase();

            ResultSet general = gvi.execute("SELECT count(id) FROM company_status");
            
            general.next();
            company.next();
            
            int GeneralCompany = general.getInt("count(id)");
            
            content.general.setText("Companies "+GeneralCompany);
            
            System.out.println(GeneralCompany);
             
             switch(type){
                 
                 case 1: {
                    int value = (company.getInt("count(id)") * 100)/GeneralCompany;
                    System.out.println("porcentaje"+value);

                    content.active.setStringPainted(true);
                    content.active.setForeground(Color.green);
                    content.active.setBackground(Color.white);
                    content.active.setMaximum(100);
                    //content.active.setStringPainted(true);
                    //value-=20;
                    content.active.setValue(value);
                    content.active.setString("Total: "+company.getInt("count(id)")+" ("+value+"%)");
                     
                 }
                 
             }} catch (SQLException ex) {
             Logger.getLogger(homec.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
}
