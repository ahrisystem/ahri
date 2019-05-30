package view;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Help extends javax.swing.JFrame {
    private static final Help INSTANCIA = new Help();
    String tv = "C:/AHRI/tv.exe";
    
    public static Help getInstancia() {
        return INSTANCIA;
    }
    public Help() {
        initComponents();
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnTV = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajuda");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 80));

        btnTV.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnTV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teamviewer.png"))); // NOI18N
        btnTV.setText("Team Viewer");
        btnTV.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTVActionPerformed(evt);
            }
        });
        jPanel1.add(btnTV, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistema AHRI");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 230, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("(47) 99234-2074");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("eduardoegerr@gmail.com");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 262));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTVActionPerformed
        try {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            desktop.open(new File(tv));
        } catch (IOException ex) {
            Logger.getLogger(Help.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTVActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
