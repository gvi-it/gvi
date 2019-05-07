package view.menu;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import view.form.executive.payroll;

public class admin extends javax.swing.JPanel {

    public admin() {
    initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        home = new javax.swing.JButton();
        companies = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(240, 425));
        setPreferredSize(new java.awt.Dimension(240, 425));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/visibility.png"))); // NOI18N
        home.setText("Home");
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home.setIconTextGap(10);
        add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 40));

        companies.setText("Companies");
        add(companies, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 230, 41));

        jButton4.setText("Payroll");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 230, 38));

        jButton5.setText("Inventory");
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, 42));

        jButton9.setText("Payroll Report");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Users", "Clients", "Executives" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton companies;
    public javax.swing.JButton home;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}
