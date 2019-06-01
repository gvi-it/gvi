package libraries;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class TableSQL {

    private ResultSet SQL = null;
  //  private DefaultTableModel model;
    private JTable Table,SecondTable;
    public static final Boolean WITH_CONTROLS = true;
    public static final Boolean ONLY_SELECTABLE = false;
    private Boolean resize = false, remove = false;
    private Point point;
    private Dimension dimension;
    private int[] dimen, hidden;
    ImageIcon update = null,delete = null;
    private int numrow = 0;
    
    public TableSQL(Dimension size, Point point){  this.dimension = size; this.point = point; }
    
    public TableSQL(Dimension size, int x, int y){ this.dimension = size; point = new Point(x,y); }
        
    public TableSQL(Dimension size){ this.dimension = size; this.point = new Point(0,0); }
            
    public void Model(ResultSet query, Boolean Model, ImageIcon update, ImageIcon delete) throws SQLException{
    this.update = update; this.delete = delete;
    Model(query,Model);
    }
    
    private class render extends DefaultTableCellRenderer{

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            
            JLabel tmp = new JLabel();
            tmp.setText("");
            tmp.setSize(40,20);
            tmp.setOpaque(true);
            tmp.setBackground(Color.red);
            
            tmp.setCursor(Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR));
            tmp.setIcon(new ImageIcon(update.getImage().getScaledInstance(20,20,java.awt.Image.SCALE_SMOOTH)));
            
            
            return tmp;
        }
        
    }
    
    public void Model(ResultSet query, Boolean Model) throws SQLException {
        
    Table = this.ModelTable();
    
    ResultSetMetaData MetaData = query.getMetaData();
    
   // System.out.println("nombre de la tabla "+MetaData.);
    int last = MetaData.getColumnCount();
    System.out.println(last);
    int first = 0;
    
    DefaultTableModel modelo;
    
    String[] etiquetas;
    
        if(Model){

         //etiquetas = new Object[last+2];    
        etiquetas = new String[last+2];
        etiquetas[first] = "";
        etiquetas[last+1] = "";
        
        int lastt = last+1;
        numrow = lastt;
        

        etiquetas = this.setLabels(etiquetas, MetaData,2);

            modelo = new DefaultTableModel(){

                   @Override
                   public boolean isCellEditable(int rowIndex, int columnIndex) { return(columnIndex == first);  }

                   
                   
                   public Class<?> getColumnClass(int column){
                       
                       if(column == lastt){
                        
                       System.out.println("Image");
                       
                       return Object.class;
                       } else if(column == 0){
                           return Boolean.class;
                       } else{
                           return String.class;
                       }
                       
                       /*switch(column){
                           
                           case 0: return Boolean.class;
                           
                          // default: return String.class;
                       }*/
                      
                   }
                   
                 };      
         } else  {

        //  etiquetas = new Object[last+1];    
          etiquetas = new String[last+1];
          etiquetas[first] = "@";

          etiquetas = this.setLabels(etiquetas, MetaData, 1);

           int lastt = last+1;
             modelo = new DefaultTableModel(){

                   @Override
                   public boolean isCellEditable(int rowIndex, int columnIndex) { return false; }//return (columnIndex == first || columnIndex == lastt);  }

                   public Class<?> getColumnClass(int column){
                       
                       switch(column){
                           
                           case 0: return Boolean.class;
                           
                           default: return String.class;
                       }
                      
                   }
                   
                 };      
        }
    
     modelo.setColumnIdentifiers(etiquetas);
     
     

     Table.setModel(modelo);
     
     while(query.next()){
                
                Object[] data = new Object[etiquetas.length];
                System.out.println(data.length);
 
               
                for (int i = 1; i <= last; i++) {   
                    System.out.println(etiquetas[i]+" pos: "+i);
                data[i] = query.getObject(etiquetas[i].toString());                                
                }
                
                int difference = etiquetas.length - last;
                
                if(difference == 2){
                  Table.getColumnModel().getColumn(etiquetas.length-1).setCellEditor(new DefaultCellEditor(new JCheckBox()));
                  
                } 
                
                           
            
                
                
                modelo.addRow(data);
                
                 //Table.setValueAt(update,0, last+1);
                modelo.fireTableDataChanged();   
                
                   
                
            }
     
      
     
                           
    }
    
    public JTable getView() { return Table; }
       
    public void AdjustCell(int[] WidthCell){ this.AdjustCells(Table, WidthCell); }
    
    private void AdjustCells(JTable table, int[] WidthCell){
         
    TableColumnModel row = table.getColumnModel();
    
    dimen = WidthCell;
    
    resize = true;
    
    for(int x = 0; x < WidthCell.length; x++) {
   
    row.getColumn(x).setPreferredWidth(WidthCell[x]);
         
    }    
    table.setColumnModel(row);

    }
    
    private String[] setLabels(String[] etiquetas, ResultSetMetaData MetaData, int Decrement){
            
        // Se obtiene cada una de las etiquetas para cada columna
            for (int i = 1; i <= etiquetas.length-Decrement; i++) {
                try {
                    // Nuevamente, para ResultSetMetaData la primera columna es la 1.
                    etiquetas[i] = MetaData.getColumnLabel(i).toUpperCase();
                } catch (SQLException ex) {
                    Logger.getLogger(TableSQL.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        return etiquetas;
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

    public void HiddenColumns(int[] position){
     
    hidden = position;
    
    remove = true;

    }
    
    public void TransferModel(JTable jTable) {
      
        jTable.setModel(Table.getModel());
        
        jTable.getColumnModel().getColumn(numrow).setCellRenderer(new render());
        
//        jTable.getTableHeader().co
        
        jTable.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
            //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                               
            if(jTable.columnAtPoint(e.getPoint()) == numrow || jTable.columnAtPoint(e.getPoint()) == 0){ 
            jTable.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            } else {
                jTable.setCursor(Cursor.getDefaultCursor());
            }
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
         jTable.getTableHeader().addMouseListener(new MouseListener(){
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            
                            if(jTable.getTableHeader().columnAtPoint(e.getPoint()) == 0){
                            
                            if(JOptionPane.showConfirmDialog(null,"Delete all selected items?","Multiple elimination", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
                            System.out.println("Eliminando");    
                            } else { System.out.println("cancelado"); }
                            }
                            
                            System.out.println("ok");
                           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }

            @Override
            public void mousePressed(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

                                      
                    });
        
        jTable.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                
                if(jTable.columnAtPoint(e.getPoint()) == numrow){
                    System.out.println("Click en el label de editar, row :"+jTable.getSelectedRow());
                }
                
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent e) {
              //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
             //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            
        });
        
        if(remove){
            
        for(int x = 0; x < hidden.length; x++) {
            
        System.out.println("numero: "+hidden[x]);
        
        jTable.getTableHeader().getColumnModel().getColumn(hidden[x]).setMaxWidth(0);
        
        jTable.getColumnModel().getColumn(hidden[x]).setPreferredWidth(0);
        jTable.getColumnModel().getColumn(hidden[x]).setWidth(0);
        jTable.getColumnModel().getColumn(hidden[x]).setMaxWidth(0);
        jTable.getColumnModel().getColumn(hidden[x]).setMinWidth(0);
        
        }    
            
        }
        
/*        jTable.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        
        jTable.getColumnModel().getColumn(1).setPreferredWidth(0);
                jTable.getColumnModel().getColumn(1).setWidth(0);
                        jTable.getColumnModel().getColumn(1).setMaxWidth(0);
                                jTable.getColumnModel().getColumn(1).setMinWidth(0);*/
    
      if(resize){
      this.AdjustCells(jTable,dimen); }
               // jTable.setLayout(null);
                 //jTable.getColumnModel().getColumn(0).setCellEditor(new DefaultCellEditor(check));
    }

    public ListSelectionModel getList() {
    
    JTable tmp = (SecondTable == null) ? Table : SecondTable;   
        
    tmp.setCellSelectionEnabled(true);
    ListSelectionModel cellSelectionModel = tmp.getSelectionModel();
    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    
    return cellSelectionModel;
    }  
}