package view.cadastros.usuarios;

import controller.cadastros.usuarios.UsuarioController;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.cadastros.usuarios.UsuarioModel;
import view.TelaInicial;


public class EditarUsuario extends javax.swing.JFrame {
    UsuarioController pc = new UsuarioController();
    private static final EditarUsuario INSTANCIA = new EditarUsuario();

    public static EditarUsuario getInstancia() {
        return INSTANCIA;
    }

    private EditarUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public void limpaCampos(){
        txtLogin.setText("");
        txtNome.setText("");
        txtAdministrador.setSelected(false);
    }
    
    public void puxarDados(String cod){
        UsuarioModel um = new UsuarioModel();
        pc.puxarDados(um, cod);
        txtLogin.setText(um.getLogin());
        if (um.isAdministrador()) {
            txtAdministrador.setSelected(true);
            txtPerfil.setEditable(false);
        } else {
            txtAdministrador.setSelected(false);
            txtPerfil.setEditable(true);
        }
        txtNome.setText(um.getNome());
        txtPerfil.setSelectedItem(um.getPerfilUsuario());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        lblAjudaPerfil = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPerfil = new javax.swing.JComboBox<>();
        lblAjudaLogin = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblPerfil = new javax.swing.JLabel();
        txtAdministrador = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAjudaPerfil.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblAjudaPerfil.setForeground(new java.awt.Color(51, 105, 191));
        lblAjudaPerfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAjudaPerfil.setText("?");
        lblAjudaPerfil.setToolTipText("Permissões pré-definidas que usuário terá no sistema.\nCaso seja ADMINISTRADOR, não será necessário.");
        painelPrincipal.add(lblAjudaPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 30, 20));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 460, 20));

        txtPerfil.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 430, 20));

        lblAjudaLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblAjudaLogin.setForeground(new java.awt.Color(51, 105, 191));
        lblAjudaLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAjudaLogin.setText("?");
        lblAjudaLogin.setToolTipText("Na tela de edição, não é possível editar o login.");
        painelPrincipal.add(lblAjudaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 30, 20));

        lblLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(51, 105, 191));
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLogin.setText("Login");
        painelPrincipal.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 20));

        txtLogin.setEditable(false);
        txtLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 105, 191)));
        txtLogin.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 190, 20));

        lblPerfil.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPerfil.setForeground(new java.awt.Color(51, 105, 191));
        lblPerfil.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPerfil.setText("Perfil");
        painelPrincipal.add(lblPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 20));

        txtAdministrador.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAdministrador.setText("Administrador");
        txtAdministrador.setOpaque(false);
        txtAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtAdministradorMouseReleased(evt);
            }
        });
        txtAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdministradorActionPerformed(evt);
            }
        });
        painelPrincipal.add(txtAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 120, 20));

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
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 80, 40));

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
        painelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 80, 40));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 105, 191));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome");
        painelPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, 20));

        getContentPane().add(painelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 570, 210));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Editar usuário do sistema");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaInicial telainicial = new TelaInicial();
        telainicial.opcoes = false;
    }//GEN-LAST:event_formWindowClosed

    private void txtAdministradorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtAdministradorMouseReleased
        if (txtAdministrador.isSelected()) {
            txtPerfil.setEnabled(false);
        } else {
            txtPerfil.setEnabled(true);
        }
    }//GEN-LAST:event_txtAdministradorMouseReleased

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setForeground(Color.RED);
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        btnSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSairMouseExited

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        limpaCampos();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        btnSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome!");
        } else {
            UsuarioModel um = new UsuarioModel();
            um.setAdministrador(txtAdministrador.isSelected());
            um.setNome(txtNome.getText());
            if (txtPerfil.getSelectedItem() == null) {
                um.setPerfilUsuario("0");
            } else {
                um.setPerfilUsuario(txtPerfil.getSelectedItem().toString());
            }
            pc.alterar(um,txtLogin.getText());
            JOptionPane.showMessageDialog(null, "Usuário "+txtLogin.getText()+" alterado com sucesso!");
            limpaCampos();
            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdministradorActionPerformed
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
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblAjudaLogin;
    private javax.swing.JLabel lblAjudaPerfil;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPerfil;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JCheckBox txtAdministrador;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JComboBox<String> txtPerfil;
    // End of variables declaration//GEN-END:variables
}
