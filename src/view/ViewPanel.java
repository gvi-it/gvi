package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import model.executive;

public class ViewPanel extends JFrame {

    public ViewPanel(){            
       
            initComponents();
            
                        
          try {
            setIconImage(new ImageIcon(getClass().getResource("../resources/system/gvi.png")).getImage());
            
            
          } catch(Exception e){
              
          }
            
            this.getContentPane().setBackground(Color.WHITE);
            this.logout.setVisible(false);
           
            //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            
            /*  double width = this.menu.getSize().getWidth() + this.container.getSize().getWidth();
            double heigth = this.menu.getSize().getHeight() + this.container.getHeight();*/
            
            this.setLocationRelativeTo(null);
            
            /*         Toolkit tool = Toolkit.getDefaultToolkit();
            double width = tool.getScreenSize().getWidth();
            double heigth = tool.getScreenSize().getHeight();*/
            
            
            //  this.setSize((int)width, (int)heigth);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        user_info = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        container = new javax.swing.JScrollPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        menu = new javax.swing.JScrollPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        user_info.setBackground(new java.awt.Color(255, 255, 255));
        user_info.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/user.png"))); // NOI18N
        user_info.setText("user_name  ");
        user_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_info.setFocusable(false);
        user_info.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        user_info.setMaximumSize(new java.awt.Dimension(200, 36));
        user_info.setOpaque(true);
        getContentPane().add(user_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/system/baseline_exit_to_app_black_18dp.png"))); // NOI18N
        logout.setText("Log Out");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setOpaque(true);
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 70, 30));

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        container.setViewportView(jLayeredPane2);

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 550, 350));

        jLayeredPane3.setBackground(new java.awt.Color(102, 153, 255));
        jLayeredPane3.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        menu.setViewportView(jLayeredPane3);

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 240, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tools().setVisible(true);
            }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPanel().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane container;
    private javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    public javax.swing.JLabel logout;
    public javax.swing.JScrollPane menu;
    public javax.swing.JLabel user_info;
    // End of variables declaration//GEN-END:variables
}
