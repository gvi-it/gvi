package view;

import java.awt.Color;
import java.awt.Toolkit;
import model.executive;

public class tools extends javax.swing.JFrame {

    public tools() {
        
        
        initComponents();
        
        this.getContentPane().setBackground(Color.WHITE);
        this.logout.setVisible(false);
       
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
         Toolkit tool = Toolkit.getDefaultToolkit();
         double width = tool.getScreenSize().getWidth();
         double heigth = tool.getScreenSize().getHeight();
        
        this.setSize((int)width, (int)heigth);
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
        jpanelview = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_info.setBackground(new java.awt.Color(255, 255, 255));
        user_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/user.png"))); // NOI18N
        user_info.setText("user_name  ");
        user_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_info.setMaximumSize(new java.awt.Dimension(200, 36));
        user_info.setOpaque(true);
        jLayeredPane1.add(user_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 50));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/system/baseline_exit_to_app_black_18dp.png"))); // NOI18N
        logout.setText("Log Out");
        logout.setOpaque(true);
        jLayeredPane1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 70, 30));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jpanelviewLayout = new javax.swing.GroupLayout(jpanelview);
        jpanelview.setLayout(jpanelviewLayout);
        jpanelviewLayout.setHorizontalGroup(
            jpanelviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jpanelviewLayout.setVerticalGroup(
            jpanelviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(jpanelview, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 620, 400));

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
            java.util.logging.Logger.getLogger(tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tools().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    public javax.swing.JPanel jpanelview;
    public javax.swing.JLabel logout;
    public javax.swing.JLabel user_info;
    // End of variables declaration//GEN-END:variables
}
