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
public class ListExecutives extends javax.swing.JPanel {

    /**
     * Creates new form executive
     */
    public ListExecutives() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        SearchText = new javax.swing.JTextField();
        toregister = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(720, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/iconExecutive.png"))); // NOI18N
        jLabel1.setText("Executives");
        jLabel1.setToolTipText("");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setIconTextGap(5);
        jLabel1.setVerifyInputWhenFocusTarget(false);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, -1, 40));
        jLabel1.getAccessibleContext().setAccessibleParent(null);

        Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/system/search.png"))); // NOI18N
        Search.setLabelFor(SearchText);
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 10, 30, 30));

        SearchText.setForeground(new java.awt.Color(51, 51, 51));
        SearchText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        SearchText.setMargin(new java.awt.Insets(2, 25, 2, 2));
        SearchText.setName(""); // NOI18N
        jPanel1.add(SearchText, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 10, 130, 30));

        toregister.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        toregister.setText("+");
        jPanel1.add(toregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 10, 40, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, -1));

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Executive", "Tools", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 470, 320));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Search;
    public javax.swing.JTextField SearchText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable;
    public static javax.swing.JButton toregister;
    // End of variables declaration//GEN-END:variables
}
