/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.form.admin;

/**
 *
 * @author Preinstalleduser
 */
public class company extends javax.swing.JPanel {

    /**
     * Creates new form home
     */
    
    public static void main(String[] args){
      
    }
    
   
    
    public company() {
        
        initComponents();
       // this.setSize(width,this.getSize().height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JPanel();
        inactive = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        active = new javax.swing.JProgressBar();
        slopes = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inactive1 = new javax.swing.JProgressBar();
        total = new javax.swing.JLabel();

        pane.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inactive.setValue(75);
        pane.add(inactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 137, 23));

        jLabel3.setText("Active Companies");
        pane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel4.setText("Inactive Companies");
        pane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        active.setValue(75);
        pane.add(active, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 137, 23));

        slopes.setValue(75);
        pane.add(slopes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 137, 23));

        jLabel5.setText("slopes");
        pane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        jLabel6.setText("Annual Accounting");
        pane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        inactive1.setValue(75);
        pane.add(inactive1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 137, 23));

        total.setText("total of companies");
        pane.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar active;
    private javax.swing.JProgressBar inactive;
    private javax.swing.JProgressBar inactive1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel pane;
    private javax.swing.JProgressBar slopes;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
