package libraries;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ResourceBundle.Control;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.tools.DocumentationTool.Location;

public class TableSQL {

    private ResultSet SQL = null;
  //  private DefaultTableModel model;
    private JTable Table;
    public static final Boolean DEFAULT = true;
    public static final Boolean ONLY_SELECTABLE = false;
    private Point point;
    private Dimension dimension;
    
    public TableSQL(Dimension size, Point point){  this.dimension = size; this.point = point; }
    
    public TableSQL(Dimension size, int x, int y){ this.dimension = size; point = new Point(x,y); }
        
    public TableSQL(Dimension size){ this.dimension = size; this.point = new Point(0,0); }
            
    public void Model(ResultSet query, Boolean Model) throws SQLException {
        
    Table = this.ModelTable();
    
    ResultSetMetaData MetaData = query.getMetaData();
    
    int last = MetaData.getColumnCount();
    System.out.println(last);
    int first = 0;
    
    DefaultTableModel modelo;
    
    Object[] etiquetas;
    
        if(Model){

         etiquetas = new Object[last+2];    

         etiquetas[first] = "@";
        etiquetas[last+1] = "Tools";
        
        int lastt = last+1;

        etiquetas = this.setLabels(etiquetas, MetaData,1);

            modelo = new DefaultTableModel(){

                   @Override
                   public boolean isCellEditable(int rowIndex, int columnIndex) { return (columnIndex == first || columnIndex == lastt);  }

                 };      
         } else  {


          etiquetas = new Object[last+1];    

          etiquetas[first] = "@";

          etiquetas = this.setLabels(etiquetas, MetaData, 0);

           int lastt = last+1;
            modelo = new DefaultTableModel(){

                   @Override
                   public boolean isCellEditable(int rowIndex, int columnIndex) { return (lastt == columnIndex || columnIndex == first);  }

                 };      
        }
    
     modelo.setColumnIdentifiers(etiquetas);

     Table.setModel(modelo);
     
     while(query.next()){
                
                Object[] data = new Object[etiquetas.length];
                System.out.println(data.length);
                  
                Table.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(new JCheckBox()));
                
                for (int i = 1; i <= last; i++) {   
                    System.out.println(etiquetas[i]+" pos: "+i);
                data[i] = query.getObject(etiquetas[i].toString());    
                }
                
                int difference = etiquetas.length - last;
                
                if(difference == 2){
                  Table.getColumnModel().getColumn(etiquetas.length-1).setCellEditor(new DefaultCellEditor(new JCheckBox()));
                }
                  
                modelo.addRow(data);

                
                modelo.fireTableDataChanged();   
            }
    }
    
    public JTable getView() { return Table; }
    
    public void AdjustCell(int[] WidthCell){ this.AdjustCells(Table, WidthCell); }
    
    private void AdjustCells(JTable table, int[] WidthCell){
         
    TableColumnModel row = table.getColumnModel();
    
    for(int x = 0; x < WidthCell.length; x++) {
    
    row.getColumn(x).setPreferredWidth(WidthCell[x]);
         
    }    
    table.setColumnModel(row);
    
    
    }
    
    private Object[] setLabels(Object[] etiquetas, ResultSetMetaData MetaData, int Decrement){
        
        // Se obtiene cada una de las etiquetas para cada columna
            for (int i = 1; i < etiquetas.length-Decrement; i++) {
                try {
                    // Nuevamente, para ResultSetMetaData la primera columna es la 1.
                    etiquetas[i] = MetaData.getColumnLabel(i).toUpperCase();
                } catch (SQLException ex) {
                    Logger.getLogger(TableSQL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return etiquetas;
    }
    
    public TableSQL(ResultSet SQL, DefaultTableModel Model, Boolean Controls) {
        
    this.SQL = SQL;
    
          
    }
    
    public void setEditIcon(ImageIcon image) {
        
    }
    
    public void setRemoveIcon(ImageIcon image){
        
    }

    private JTable ModelTable() {
       
        Table = new JTable();
       
        Table.setSize(dimension);
        
        Table.setPreferredSize(dimension);
       
        if(!this.point.equals(null)){
        Table.setLocation(point);
        }
        
       return Table;
    }
  
}