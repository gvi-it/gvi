package view;

public class ChargingScreen extends javax.swing.JFrame {

    public ChargingScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/gvi.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(170, 60, 40, 40);

        jLabel2.setText("Loading...");
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(160, 110, 80, 15);
        jLayeredPane1.add(progress);
        progress.setBounds(120, 140, 148, 14);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    public javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
