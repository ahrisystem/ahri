package view.ferramentas;

import controller.cadastros.produtos.ProdutoController;
import java.awt.Color;
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTítulo = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtEAN = new javax.swing.JTextField();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JFormattedTextField();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();

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

        lblTítulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(0, 204, 51));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Backup do banco de dados");
        lblTítulo.setOpaque(true);
        getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código");
        painelPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 20));

        txtEAN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEAN.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtEAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 200, -1));

        lblPreco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(51, 105, 191));
        lblPreco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPreco.setText("Preço");
        painelPrincipal.add(lblPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 30));

        txtPreco.setForeground(new java.awt.Color(0, 153, 0));
        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPreco.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        painelPrincipal.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 30));

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
        painelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 80, 40));

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
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 80, 40));
        painelPrincipal.add(jFileChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 450, 160));

        getContentPane().add(painelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome!");
        } else {
            if (txtPreco.getText().equalsIgnoreCase("") || txtPreco.getText().equalsIgnoreCase("0,00")) {
                JOptionPane.showMessageDialog(null, "Verifique o preço!");
            } else {
                if (txtNCM.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Informe o NCM/NBS.");
                } else {
                    ProdutoModel pm = new ProdutoModel();
                    pm.setCod(Integer.parseInt(txtCodigo.getText()));
                    pm.setServico(txtServico.isEnabled());
                    pm.setCodigoBarras(txtEAN.getText());
                    pm.setNome(txtNome.getText());
                    pm.setInativo(false);
                    pm.setGrupo(txtGrupo.getSelectedItem().toString());
                    pm.setUnidadeMedida(txtUN.getSelectedItem().toString());
                    pm.setEstoque(0);
                    pm.setPreco(Double.parseDouble(txtPreco.getText().replaceAll(",", ".")));
                    pm.setCusto(Double.parseDouble(txtCusto.getText().replaceAll(",", ".")));
                    pm.setNcm(txtNCM.getText());
                    pm.setCest(txtCEST.getText());
                    pc.cadastraProduto(pm);
                    limpaCampos();
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        limpaCampos();
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

        System.out.println("aberta");
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField txtEAN;
    private javax.swing.JFormattedTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}