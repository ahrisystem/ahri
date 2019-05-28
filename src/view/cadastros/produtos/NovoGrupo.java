package view.cadastros.produtos;

import controller.cadastros.produtos.GrupoController;
import controller.cadastros.produtos.ProdutoController;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.cadastros.produtos.GrupoModel;
import model.cadastros.produtos.ProdutoModel;

public class NovoGrupo extends javax.swing.JFrame {
    GrupoController pc = new GrupoController();
    private static final NovoGrupo INSTANCIA = new NovoGrupo();
    
    
    public static NovoGrupo getInstancia() {
        return INSTANCIA;
    }
    
    public void alterarTitulo(String titulo){
        lblTítulo.setText(titulo);
    }

    private NovoGrupo() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void limpaCampos(){
        txtCodigo.setText("");
        txtNome.setText("");
        txtNCM.setText("");
        txtCEST.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTítulo = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        lblSubGrupo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPai = new javax.swing.JComboBox<>();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        painelAbas = new javax.swing.JTabbedPane();
        painelInformacoesFiscais = new javax.swing.JPanel();
        lblNCM = new javax.swing.JLabel();
        txtNCMdescricao = new javax.swing.JTextField();
        txtNCM = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        txtCEST = new javax.swing.JTextField();
        txtCESTdescricao = new javax.swing.JTextField();
        lblGrupo2 = new javax.swing.JLabel();
        txtServico = new javax.swing.JCheckBox();
        sldTipo = new javax.swing.JSlider();
        lblCodigo1 = new javax.swing.JLabel();
        lblPrincipal = new javax.swing.JLabel();

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

        lblTítulo.setBackground(new java.awt.Color(51, 153, 0));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Novo Grupo/Subgrupo");
        lblTítulo.setOpaque(true);
        getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSubGrupo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblSubGrupo.setForeground(new java.awt.Color(51, 105, 191));
        lblSubGrupo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubGrupo.setText("Subgrupo");
        painelPrincipal.add(lblSubGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 70, 20));

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setToolTipText("Se você deixar o campo vazio e dar um enter, ele adiciona o próximo código!");
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
        painelPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 170, 20));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 105, 191));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome");
        painelPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 330, 20));

        txtPai.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtPai, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 580, 20));

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
        painelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 80, 40));

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
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 80, 40));

        painelAbas.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        painelInformacoesFiscais.setBackground(new java.awt.Color(255, 255, 255));
        painelInformacoesFiscais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNCM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNCM.setForeground(new java.awt.Color(51, 105, 191));
        lblNCM.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNCM.setText("NCM");
        painelInformacoesFiscais.add(lblNCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        txtNCMdescricao.setEditable(false);
        txtNCMdescricao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNCMdescricao.setFocusable(false);
        txtNCMdescricao.setPreferredSize(new java.awt.Dimension(200, 20));
        txtNCMdescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNCMdescricaoKeyReleased(evt);
            }
        });
        painelInformacoesFiscais.add(txtNCMdescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 560, 20));

        txtNCM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNCM.setPreferredSize(new java.awt.Dimension(200, 20));
        txtNCM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNCMKeyReleased(evt);
            }
        });
        painelInformacoesFiscais.add(txtNCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, 20));

        lblCodigo2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo2.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo2.setText("CEST");
        painelInformacoesFiscais.add(lblCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        txtCEST.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCEST.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCEST.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCESTKeyReleased(evt);
            }
        });
        painelInformacoesFiscais.add(txtCEST, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 80, 20));

        txtCESTdescricao.setEditable(false);
        txtCESTdescricao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCESTdescricao.setFocusable(false);
        txtCESTdescricao.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCESTdescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCESTdescricaoKeyReleased(evt);
            }
        });
        painelInformacoesFiscais.add(txtCESTdescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 560, 20));

        painelAbas.addTab("Informações fiscais", painelInformacoesFiscais);

        painelPrincipal.add(painelAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 770, 150));

        lblGrupo2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblGrupo2.setForeground(new java.awt.Color(51, 105, 191));
        lblGrupo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGrupo2.setText("Pai");
        painelPrincipal.add(lblGrupo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 20));

        txtServico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtServico.setText("Grupo de serviços?");
        txtServico.setToolTipText("Será um grupo de serviços?");
        txtServico.setOpaque(false);
        txtServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtServicoMouseReleased(evt);
            }
        });
        painelPrincipal.add(txtServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 170, 20));

        sldTipo.setMaximum(1);
        sldTipo.setToolTipText("Controle que define se o grupo será Principal ou subgrupo.");
        sldTipo.setValue(0);
        sldTipo.setFocusable(false);
        sldTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sldTipoMouseReleased(evt);
            }
        });
        painelPrincipal.add(sldTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 60, 20));

        lblCodigo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo1.setText("Código");
        painelPrincipal.add(lblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 20));

        lblPrincipal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPrincipal.setForeground(new java.awt.Color(51, 105, 191));
        lblPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrincipal.setText("Principal");
        painelPrincipal.add(lblPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 70, 20));

        getContentPane().add(painelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome!");
        } else {
            GrupoModel pm = new GrupoModel();
            pm.setCod(Integer.parseInt(txtCodigo.getText()));
            pm.setServico(txtServico.isEnabled());
            pm.setNome(txtNome.getText());
            pm.setInativo(false);
            
            pm.setNcm(txtNCM.getText());
            pm.setCest(txtCEST.getText());
            pc.cadastraGrupo(pm);
            limpaCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        limpaCampos();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtNCMdescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNCMdescricaoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNCMdescricaoKeyReleased

    private void txtNCMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNCMKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNCMKeyReleased

    private void txtCESTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCESTKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCESTKeyReleased

    private void txtCESTdescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCESTdescricaoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCESTdescricaoKeyReleased

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

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        if (txtCodigo.getText().equalsIgnoreCase("")) {
            txtCodigo.setText(Integer.toString(pc.pegaCodigo()));
        }
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        if (txtCodigo.getText().equalsIgnoreCase("")) {
            txtCodigo.setText(Integer.toString(pc.pegaCodigo()));
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        System.out.println("aberta");
    }//GEN-LAST:event_formWindowOpened

    private void txtServicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtServicoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServicoMouseReleased

    private void sldTipoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldTipoMouseReleased
        if (sldTipo.getValue() == 0) {
            txtPai.setEnabled(false);
        } else {
            txtPai.setEnabled(true);
        }
    }//GEN-LAST:event_sldTipoMouseReleased

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
            java.util.logging.Logger.getLogger(NovoGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblGrupo2;
    private javax.swing.JLabel lblNCM;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPrincipal;
    private javax.swing.JLabel lblSubGrupo;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel painelInformacoesFiscais;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JSlider sldTipo;
    private javax.swing.JTextField txtCEST;
    private javax.swing.JTextField txtCESTdescricao;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNCM;
    private javax.swing.JTextField txtNCMdescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JComboBox<String> txtPai;
    private javax.swing.JCheckBox txtServico;
    // End of variables declaration//GEN-END:variables
}