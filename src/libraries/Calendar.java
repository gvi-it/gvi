
package libraries;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;


public class Calendar extends javax.swing.JPanel implements MouseListener{

   JPanel con;
    Point point;
    
    
    public Calendar(Point p, JPanel content) {
        initComponents();
       
     System.out.println("ok");
        con = content;
        point = new Point(p.x,p.y);
        
        setLocation(point);
        setSize(300,300);
      //  setLocationRelativeTo(null);
        
     //   backgroundclose.setBackground(Color.red);
        
        
        days.getTableHeader().setFont(new Font("Arial",2,9));
        
        FlowLayout layout = new FlowLayout();
        
        close.addMouseListener(this);
        
        close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        setLayout(null);
        
        
        
        JComboBox year = new JComboBox();
        
        year.setSize(75,40);
        
        year.setBorder(BorderFactory.createEmptyBorder());
        
        year.setBackground(new java.awt.Color(0.255f,0.255f,0.255f,0.0f));
        
        year.addItem("2019");
        
        year.setVisible(true);
        
            JComboBox month = new JComboBox();
        
        month.setSize(75,40);
        
        month.setBorder(BorderFactory.createEmptyBorder());
        
        month.setBackground(new java.awt.Color(0.255f,0.255f,0.255f,0.0f));
        
        month.addItem("Enero");
        month.addItem("Febrero");
        month.addItem("Marzo");
        month.addItem("Abril");
        month.addItem("Mayo");
        month.addItem("Junio");
        month.addItem("Julio");
        
       // month.setSelectedIndex(3);
        
        month.setVisible(true);
        
        year.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        month.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        header.add(year);
        header.add(month);
        
        setVisible(true);
        
        content.add(this);
        
    }
    
     @Override
    public void mouseClicked(MouseEvent e) {
        
        if(e.getSource().equals(close)){
            this.setVisible(false);
            con.remove(this);
        }
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
        if(e.getSource().equals(close)){
           close.setBackground(Color.gray);
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
         if(e.getSource().equals(close)){
            close.setBackground(Color.red);
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JLayeredPane();
        close = new javax.swing.JLabel();
        view = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        days = new javax.swing.JTable();

        header.setBackground(new java.awt.Color(204, 204, 204));
        header.setOpaque(true);
        header.setLayout(new java.awt.FlowLayout());

        close.setBackground(new java.awt.Color(255, 102, 102));
        close.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setOpaque(true);

        view.setBackground(new java.awt.Color(255, 255, 255));
        view.setOpaque(true);
        view.setLayout(new java.awt.BorderLayout());

        days.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        days.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(days);

        view.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JTable days;
    private javax.swing.JLayeredPane header;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLayeredPane view;
    // End of variables declaration//GEN-END:variables
}