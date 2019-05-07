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
        logout = new javax.swing.JLabel();
        container = new javax.swing.JScrollPane();
        user_info = new javax.swing.JLabel();
        menu = new javax.swing.JScrollPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, -1, -1));

        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 46, -1, -1));

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/system/baseline_exit_to_app_black_18dp.png"))); // NOI18N
        logout.setText("Log Out");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logout.setOpaque(true);
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 30));

        container.setMinimumSize(new java.awt.Dimension(700, 450));
        container.setPreferredSize(new java.awt.Dimension(700, 450));
        container.setRequestFocusEnabled(false);
        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 600, 450));

        user_info.setBackground(new java.awt.Color(255, 255, 255));
        user_info.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        user_info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/user.png"))); // NOI18N
        user_info.setText("user_name  ");
        user_info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        user_info.setFocusable(false);
        user_info.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        user_info.setMaximumSize(new java.awt.Dimension(200, 36));
        user_info.setOpaque(true);
        getContentPane().add(user_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

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
            .addGap(0, 431, Short.MAX_VALUE)
        );

        menu.setViewportView(jLayeredPane3);

        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane container;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    public javax.swing.JLabel logout;
    public javax.swing.JScrollPane menu;
    public javax.swing.JLabel user_info;
    // End of variables declaration//GEN-END:variables
}