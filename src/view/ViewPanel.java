package view;

import javax.swing.JFrame;

public class ViewPanel extends JFrame {

    public ViewPanel(){            
       
    initComponents();
          
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

        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        user_info.setBackground(new java.awt.Color(255, 255, 255));
        user_info.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/user.png"))); // NOI18N
        user_info.setText("user_name  ");
        user_info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        user_info.setFocusable(false);
        user_info.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        user_info.setMaximumSize(new java.awt.Dimension(200, 36));
        user_info.setOpaque(true);
        getContentPane().add(user_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/system/baseline_exit_to_app_black_18dp.png"))); // NOI18N
        logout.setText("Log Out");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logout.setOpaque(true);
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 70, 30));

        jLayeredPane2.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane2.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );

        container.setViewportView(jLayeredPane2);

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 580, 360));

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
            .addGap(0, 368, Short.MAX_VALUE)
        );

        menu.setViewportView(jLayeredPane3);

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 240, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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