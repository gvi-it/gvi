package view.form.admin;

public class addExecutive extends javax.swing.JFrame {

    public addExecutive() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        container = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        role = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        JLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hours = new javax.swing.JSpinner();
        password = new javax.swing.JPasswordField();
        cancel = new javax.swing.JButton();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 290));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        container.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Executive Register", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        container.setPreferredSize(new java.awt.Dimension(400, 350));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setName("require"); // NOI18N
        container.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, 30));

        lastname.setName("require"); // NOI18N
        container.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 120, 30));

        jLabel1.setText("Lastname :");
        container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, 20));

        jLabel2.setText("Name :");
        container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 40, 20));

        role.setName("require"); // NOI18N
        container.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 140, 30));
        role.getAccessibleContext().setAccessibleName("Role");

        jLabel3.setText("Role :");
        container.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 40, 20));

        jLabel4.setText("Salary :");
        container.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 40, 30));

        show.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/visibility.png"))); // NOI18N
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        container.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 170, 25, 30));

        salary.setName("require"); // NOI18N
        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });
        container.add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 70, 30));
        salary.getAccessibleContext().setAccessibleName("");
        salary.getAccessibleContext().setAccessibleDescription("int");

        jLabel5.setText("Email :");
        container.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 60, 20));

        email.setName("require"); // NOI18N
        container.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 120, 30));

        JLabel1.setText("hours :");
        container.add(JLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 50, 20));

        jLabel6.setText("Password : ");
        container.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 20));

        hours.setName("require"); // NOI18N
        container.add(hours, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 40, 30));

        password.setMargin(new java.awt.Insets(2, 2, 2, 25));
        password.setMinimumSize(new java.awt.Dimension(6, 43));
        container.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 120, 30));

        getContentPane().add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 440, 220));

        cancel.setText("Cancel");
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 80, 30));

        Save.setText("Save");
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryActionPerformed

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
            java.util.logging.Logger.getLogger(addExecutive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addExecutive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addExecutive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addExecutive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addExecutive().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    public javax.swing.JButton Save;
    public javax.swing.JButton cancel;
    public javax.swing.JPanel container;
    public javax.swing.JTextField email;
    public javax.swing.JSpinner hours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JTextField lastname;
    public javax.swing.JTextField name;
    public javax.swing.JPasswordField password;
    public javax.swing.JComboBox<String> role;
    public javax.swing.JTextField salary;
    public javax.swing.JLabel show;
    // End of variables declaration//GEN-END:variables
}
