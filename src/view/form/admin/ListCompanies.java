package view.form.admin;

public class ListCompanies extends javax.swing.JPanel {
    
    public ListCompanies() {
        
        initComponents();
       // this.setSize(width,this.getSize().height);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JPanel();
        inactive = new javax.swing.JProgressBar();
        LabelActive = new javax.swing.JLabel();
        LabelInactive = new javax.swing.JLabel();
        active = new javax.swing.JProgressBar();
        slopes = new javax.swing.JProgressBar();
        LabelSlope = new javax.swing.JLabel();
        LabelAccounting = new javax.swing.JLabel();
        inactive1 = new javax.swing.JProgressBar();
        general = new javax.swing.JLabel();

        pane.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inactive.setValue(75);
        pane.add(inactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 137, 23));

        LabelActive.setText("Active Companies");
        pane.add(LabelActive, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        LabelInactive.setText("Inactive Companies");
        pane.add(LabelInactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        active.setBackground(new java.awt.Color(204, 0, 0));
        active.setForeground(new java.awt.Color(0, 0, 0));
        active.setValue(75);
        pane.add(active, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 137, 23));

        slopes.setValue(75);
        pane.add(slopes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 137, 23));

        LabelSlope.setText("slopes");
        pane.add(LabelSlope, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        LabelAccounting.setText("Annual Accounting");
        pane.add(LabelAccounting, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        inactive1.setValue(75);
        pane.add(inactive1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 137, 23));

        general.setText("total of companies");
        pane.add(general, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAccounting;
    private javax.swing.JLabel LabelActive;
    private javax.swing.JLabel LabelInactive;
    private javax.swing.JLabel LabelSlope;
    public javax.swing.JProgressBar active;
    public javax.swing.JLabel general;
    public javax.swing.JProgressBar inactive;
    public javax.swing.JProgressBar inactive1;
    public javax.swing.JPanel pane;
    public javax.swing.JProgressBar slopes;
    // End of variables declaration//GEN-END:variables
}
