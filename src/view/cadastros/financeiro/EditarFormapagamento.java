package view.cadastros.financeiro;

import controller.financeiro.FormapagamentoController;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.financeiro.FormapagamentoModel;

public class EditarFormapagamento extends javax.swing.JFrame {
    FormapagamentoController fc = new FormapagamentoController();
    String pesquisaAtual;
    
    private static final EditarFormapagamento INSTANCIA = new EditarFormapagamento();
    
    public static EditarFormapagamento getInstancia() {
        return INSTANCIA;
    }
    
    private EditarFormapagamento() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void limpaCampos(){
        txtCodigo.setText("");
        txtNome.setText("");
        cbxParcela.setSelected(false);
        cbxObrigaDoc.setSelected(false);
        cbxPermiteFiado.setSelected(false);
        txtNumerodeParcelas.setValue(0);
        txtCodigo.requestFocus();
    }
    
    public void puxarDados(int cod){
        FormapagamentoModel fm = new FormapagamentoModel();
        fc.puxarDados(fm, cod);
        txtCodigo.setText(Integer.toString(fm.getCod()));
        txtNome.setText(fm.getNome());
        cbxParcela.setSelected(fm.isParcela());
        if (fm.isParcela()) {
            txtNumerodeParcelas.setEnabled(true);
        } else {
            txtNumerodeParcelas.setEnabled(false);
        }
        cbxObrigaDoc.setSelected(fm.isObrigadoc());
        cbxPermiteFiado.setSelected(fm.isPermitefiado());
        txtNumerodeParcelas.setValue(fm.getParcelas());
        txtCodigo.requestFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTítulo = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cbxPermiteFiado = new javax.swing.JCheckBox();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblParcelas = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtNumerodeParcelas = new javax.swing.JSpinner();
        cbxParcela = new javax.swing.JCheckBox();
        cbxObrigaDoc = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produto");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTítulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Editando forma de pagamento");
        lblTítulo.setOpaque(true);
        getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 30));

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código");
        painelPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 20));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setToolTipText("Se você deixar o campo vazio e dar um enter, ele adiciona o próximo código!");
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 170, 20));

        cbxPermiteFiado.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxPermiteFiado.setText("Permite fiado?");
        cbxPermiteFiado.setOpaque(false);
        painelPrincipal.add(cbxPermiteFiado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, 30));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 105, 191));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome");
        painelPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 20));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 440, 20));

        lblParcelas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblParcelas.setForeground(new java.awt.Color(51, 105, 191));
        lblParcelas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblParcelas.setText("Parcelas");
        painelPrincipal.add(lblParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 70, 30));

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
        painelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 80, 40));

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
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 80, 40));

        txtNumerodeParcelas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNumerodeParcelas.setToolTipText("Número de parcelas");
        txtNumerodeParcelas.setEnabled(false);
        painelPrincipal.add(txtNumerodeParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 80, 30));

        cbxParcela.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxParcela.setText("Parcela?");
        cbxParcela.setOpaque(false);
        cbxParcela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbxParcelaMouseReleased(evt);
            }
        });
        painelPrincipal.add(cbxParcela, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 100, 30));

        cbxObrigaDoc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxObrigaDoc.setText("Obrigar nº documento");
        cbxObrigaDoc.setOpaque(false);
        painelPrincipal.add(cbxObrigaDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 190, 30));

        getContentPane().add(painelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtCodigo.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha o código!");
        } else {
            if (txtNome.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Preencha o nome!");
            } else {
                FormapagamentoModel fm = new FormapagamentoModel();
                fm.setNome(txtNome.getText());
                fm.setParcela(cbxParcela.isSelected());
                fm.setParcelas(Integer.parseInt(txtNumerodeParcelas.getValue().toString()));
                fm.setObrigadoc(cbxObrigaDoc.isSelected());
                fm.setPermitefiado(cbxPermiteFiado.isSelected());
                fc.alterar(fm, Integer.parseInt(txtCodigo.getText()));
                limpaCampos();
                this.dispose();
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

    private void cbxParcelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxParcelaMouseReleased
        if (cbxParcela.isSelected()) {
            txtNumerodeParcelas.setEnabled(true);
        } else {
            txtNumerodeParcelas.setEnabled(false);
        }
    }//GEN-LAST:event_cbxParcelaMouseReleased

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
            java.util.logging.Logger.getLogger(EditarFormapagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarFormapagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarFormapagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarFormapagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarFormapagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox cbxObrigaDoc;
    private javax.swing.JCheckBox cbxParcela;
    private javax.swing.JCheckBox cbxPermiteFiado;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblParcelas;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JSpinner txtNumerodeParcelas;
    // End of variables declaration//GEN-END:variables
}