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
        container = new javax.swing.JPanel();
        user_info = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        menu = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_info.setBackground(new java.awt.Color(102, 153, 255));
        user_info.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        user_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/user.png"))); // NOI18N
        user_info.setText("user_name  ");
        user_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_info.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        user_info.setMaximumSize(new java.awt.Dimension(200, 36));
        user_info.setOpaque(true);
        container.add(user_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, 50));

        logout.setBackground(new java.awt.Color(102, 153, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/system/baseline_exit_to_app_black_18dp.png"))); // NOI18N
        logout.setText("Log Out");
        logout.setOpaque(true);
        container.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 70, 30));

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 560, 410));

        jLayeredPane2.setBackground(new java.awt.Color(102, 153, 255));
        jLayeredPane2.setOpaque(true);

        menu.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        jLayeredPane2.setLayer(menu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 410));

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
    public javax.swing.JPanel container;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    public javax.swing.JLabel logout;
    private javax.swing.JPanel menu;
    public javax.swing.JLabel user_info;
    // End of variables declaration//GEN-END:variables
}
