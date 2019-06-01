package controller.admin;

import controller.DataBase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import libraries.Placeholder;
import libraries.TableSQL;
import view.form.admin.ListExecutives;

public class executives implements ActionListener, MouseListener{

    private ListExecutives view = new ListExecutives();
    
    public executives() {
        
          ListExecutives.toregister.addActionListener(this);
          config(view);
             
          try {          
            //conexion               
            DataBase vgi =  new DataBase();

            ResultSet query = vgi.execute("select executive.id as id, executive.name as name,executive.lastname as lastname ,role.name as role from executive inner join role on role.id = executive.role");
            
           // ResultSetMetaData MetaData = query.getMetaData();
            
            TableSQL table = new TableSQL(view.jTable.getPreferredSize());
            
//            table.Model(query, TableSQL.WITH_CONTROLS);

            ImageIcon update = null;
              try {
                  update = new ImageIcon(ImageIO.read(new File("src/resources/icon/gvi.png")).getScaledInstance(30,30, 100));
              } catch (IOException ex) {
                  Logger.getLogger(executives.class.getName()).log(Level.SEVERE, null, ex);
              }
            
            table.Model(query,TableSQL.WITH_CONTROLS, update, update);
            
            int[] widthCell = {30,0,80,140,120,5};
            
            table.AdjustCell(widthCell);
             table.HiddenColumns(new int[]{0,1});
            table.TransferModel(view.jTable);
            
           

            
           // view.jTable.addMouseListener(this);

        } catch(SQLException e){ }  
    }
    
     public JPanel getView(){ return view; }
     
     private void AdjustCells(JTable table, int[] WidthCell){
         
    TableColumnModel row = table.getColumnModel();
    
    for(int x = 0; x < WidthCell.length; x++) {
    
    row.getColumn(x).setPreferredWidth(WidthCell[x]);
         
    }
    
    table.setColumnModel(row);
    
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals(view.toregister)){
        new ExecutiveData();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
  //  new ExecutiveData((int) view.jTable.getValueAt(view.jTable.getSelectedRow(),1));
    System.out.println(view.jTable.getValueAt(view.jTable.getSelectedRow(),1));
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