package view;

public class login extends javax.swing.JFrame {
      
    public login() { 
    
    initComponents();  
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        form = new javax.swing.JLayeredPane();
        passinfo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(300, 300));

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setForeground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo.png"))); // NOI18N

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exit2.png"))); // NOI18N
        close.setBorder(null);
        close.setBorderPainted(false);
        close.setContentAreaFilled(false);
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        close.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close.setOpaque(true);
        close.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(close, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(close)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(close)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        form.setName("form"); // NOI18N
        form.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passinfo.setBackground(new java.awt.Color(255, 255, 255));
        passinfo.setForeground(new java.awt.Color(255, 255, 255));
        passinfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/visibility.png"))); // NOI18N
        passinfo.setBorder(null);
        passinfo.setBorderPainted(false);
        passinfo.setContentAreaFilled(false);
        passinfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passinfo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        passinfo.setMargin(new java.awt.Insets(2, 14, 10, 14));
        passinfo.setOpaque(true);
        passinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passinfoActionPerformed(evt);
            }
        });
        form.add(passinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 96, -1, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("user:");
        form.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 51, -1, 23));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("password:");
        form.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        btn.setText("Login");
        btn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        form.add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 142, 180, -1));

        email.setName("require"); // NOI18N
        form.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 180, 35));

        password.setText("dsffsdfsdfsdfsdfsdfsdf");
        password.setMargin(new java.awt.Insets(2, 2, 2, 30));
        password.setName("require"); // NOI18N
        form.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addComponent(form)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(form, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passinfoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn;
    public javax.swing.JButton close;
    public javax.swing.JTextField email;
    public javax.swing.JLayeredPane form;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JButton passinfo;
    public javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables

}