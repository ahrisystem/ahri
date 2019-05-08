package view.ferramentas;

import controller.cadastros.produtos.ProdutoController;
import java.awt.Color;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.cadastros.produtos.ProdutoModel;

public class Backup extends javax.swing.JFrame {
    ProdutoController pc = new ProdutoController();
    private static final Backup INSTANCIA = new Backup();
    
    
    public static Backup getInstancia() {
        return INSTANCIA;
    }
    
    public void alterarTitulo(String titulo){
        lblTítulo.setText(titulo);
    }

    private Backup() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    
    public void PegarPasta(){
        String pasta = chooserDiretorio.getSelectedFile().getAbsolutePath();
        System.out.println(pasta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooserDiretorio = new javax.swing.JFileChooser();
        lblTítulo = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cbxHR1 = new javax.swing.JCheckBox();
        cbxHR2 = new javax.swing.JCheckBox();
        cbxHR3 = new javax.swing.JCheckBox();
        cbxHR4 = new javax.swing.JCheckBox();
        cbxHR5 = new javax.swing.JCheckBox();
        cbxHR6 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        cbxAgendar = new javax.swing.JCheckBox();

        chooserDiretorio.setCurrentDirectory(new java.io.File("C:\\"));
            chooserDiretorio.setDialogTitle("Selecione um local");
            chooserDiretorio.setFileFilter(null);
            chooserDiretorio.setFileHidingEnabled(true);
            chooserDiretorio.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
            chooserDiretorio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
            chooserDiretorio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    chooserDiretorioActionPerformed(evt);
                }
            });

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Produto");
            setUndecorated(true);
            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosed(java.awt.event.WindowEvent evt) {
                    formWindowClosed(evt);
                }
                public void windowOpened(java.awt.event.WindowEvent evt) {
                    formWindowOpened(evt);
                }
            });
            getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            lblTítulo.setBackground(new java.awt.Color(102, 102, 102));
            lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
            lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            lblTítulo.setText("Backup do banco de dados");
            lblTítulo.setOpaque(true);
            getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 30));

            painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
            painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            lblCodigo.setForeground(new java.awt.Color(51, 105, 191));
            lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            lblCodigo.setText("Local onde será salvo o backup:");
            painelPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 20));

            txtLocal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            txtLocal.setForeground(new java.awt.Color(102, 102, 102));
            txtLocal.setPreferredSize(new java.awt.Dimension(200, 20));
            painelPrincipal.add(txtLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 440, 20));

            btnSair.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            btnSair.setText("Sair");
            btnSair.setFocusable(false);
            btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    btnSairMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    btnSairMouseExited(evt);
                }
            });
            btnSair.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSairActionPerformed(evt);
                }
            });
            painelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 80, 40));

            btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            btnSalvar.setText("Salvar");
            btnSalvar.setFocusable(false);
            btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    btnSalvarMouseEntered(evt);
                }
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    btnSalvarMouseExited(evt);
                }
            });
            btnSalvar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnSalvarActionPerformed(evt);
                }
            });
            painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 80, 40));

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jPanel1.setEnabled(false);

            cbxHR1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            cbxHR1.setForeground(new java.awt.Color(51, 105, 191));
            cbxHR1.setText("00:00");
            cbxHR1.setEnabled(false);
            cbxHR1.setOpaque(false);
            jPanel1.add(cbxHR1);

            cbxHR2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            cbxHR2.setForeground(new java.awt.Color(51, 105, 191));
            cbxHR2.setText("06:00");
            cbxHR2.setEnabled(false);
            cbxHR2.setOpaque(false);
            jPanel1.add(cbxHR2);

            cbxHR3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            cbxHR3.setForeground(new java.awt.Color(51, 105, 191));
            cbxHR3.setText("09:00");
            cbxHR3.setEnabled(false);
            cbxHR3.setOpaque(false);
            jPanel1.add(cbxHR3);

            cbxHR4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            cbxHR4.setForeground(new java.awt.Color(51, 105, 191));
            cbxHR4.setText("12:00");
            cbxHR4.setEnabled(false);
            cbxHR4.setOpaque(false);
            jPanel1.add(cbxHR4);

            cbxHR5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            cbxHR5.setForeground(new java.awt.Color(51, 105, 191));
            cbxHR5.setText("18:00");
            cbxHR5.setEnabled(false);
            cbxHR5.setOpaque(false);
            jPanel1.add(cbxHR5);

            cbxHR6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            cbxHR6.setForeground(new java.awt.Color(51, 105, 191));
            cbxHR6.setText("22:00");
            cbxHR6.setEnabled(false);
            cbxHR6.setOpaque(false);
            jPanel1.add(cbxHR6);

            painelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 210, 70));

            jButton1.setText("...");
            jButton1.setBorder(null);
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });
            painelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 30, 20));

            cbxAgendar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            cbxAgendar.setForeground(new java.awt.Color(51, 105, 191));
            cbxAgendar.setText("Agendar backup");
            cbxAgendar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            cbxAgendar.setOpaque(false);
            cbxAgendar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cbxAgendarActionPerformed(evt);
                }
            });
            painelPrincipal.add(cbxAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 480, -1));

            getContentPane().add(painelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 490, 220));

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        JOptionPane.showMessageDialog(null, "Salvo!");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setForeground(Color.RED);
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        btnSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSairMouseExited

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        btnSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    private void chooserDiretorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooserDiretorioActionPerformed
        PegarPasta();
    }//GEN-LAST:event_chooserDiretorioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        chooserDiretorio.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        chooserDiretorio.showOpenDialog(getParent());
        String pasta = chooserDiretorio.getSelectedFile().getAbsolutePath();
        txtLocal.setText(pasta);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAgendarActionPerformed
        if (cbxAgendar.isSelected()) {
            cbxHR1.setEnabled(true);
            cbxHR2.setEnabled(true);
            cbxHR3.setEnabled(true);
            cbxHR4.setEnabled(true);
            cbxHR5.setEnabled(true);
            cbxHR6.setEnabled(true);
        } else {
            cbxHR1.setEnabled(false);
            cbxHR2.setEnabled(false);
            cbxHR3.setEnabled(false);
            cbxHR4.setEnabled(false);
            cbxHR5.setEnabled(false);
            cbxHR6.setEnabled(false);
        }
    }//GEN-LAST:event_cbxAgendarActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Backup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Backup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbxAgendar;
    private javax.swing.JCheckBox cbxHR1;
    private javax.swing.JCheckBox cbxHR2;
    private javax.swing.JCheckBox cbxHR3;
    private javax.swing.JCheckBox cbxHR4;
    private javax.swing.JCheckBox cbxHR5;
    private javax.swing.JCheckBox cbxHR6;
    private javax.swing.JFileChooser chooserDiretorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField txtLocal;
    // End of variables declaration//GEN-END:variables
}