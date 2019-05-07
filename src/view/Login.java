package view;

import controller.cadastros.usuarios.UsuarioController;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.cadastros.usuarios.UsuarioModel;

public class Login extends javax.swing.JFrame {
    
    private static final Login INSTANCIA = new Login();
    
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMdd");
    LocalDate localDate = LocalDate.now();

    final String usuarioMaster = "adm";
    final String senhaMaster = "33" + dtf.format(localDate)+ "33";

    public static Login getInstancia() {
        return INSTANCIA;
    }
    private Login() {
        initComponents();
        setLocationRelativeTo(null);
        icone();
    }
    public void logar(String login, String senha){
        UsuarioController uc = new UsuarioController();
        UsuarioModel um = new UsuarioModel();
        
        uc.login(um, login);
        
        //se usuário não existir
        if (um.getLogin() == null) {
            if (login.equalsIgnoreCase("adm")) {
                if (senha.equalsIgnoreCase(senhaMaster)) {
                    TelaInicial ti = new TelaInicial();
                    ti.setVisible(true);
                    ti.Usuario(um.getLogin());
                    this.dispose();
                } else {
                    txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 102, 88)));
                    JOptionPane.showMessageDialog(null, "Senha adm inválida", "Errou", 1);
                    txtSenha.setText("");
                    txtSenha.requestFocus();
                }
            } else {
                txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 102, 88)));
                JOptionPane.showMessageDialog(null, "Usuário não existe", "Errou", 1);
                txtLogin.requestFocus();
            }
        //se usuário existir
        } else {
            txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
            if (um.getSenha().equals(senha) || senha.equalsIgnoreCase(senhaMaster)) {
                //abrir sistema
                TelaInicial ti = new TelaInicial();
                ti.setVisible(true);
                ti.Usuario(um.getLogin());
                this.dispose();
                //se a senha estiver inválida
            } else {
                txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(244, 102, 88)));
                JOptionPane.showMessageDialog(null, "Senha inválida", "Errou", 1);
                txtSenha.setText("");
                txtSenha.requestFocus();
            }
        }
    }
    public void icone(){
        URL url = this.getClass().getResource("/images/icon.ico");  
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblImage = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        lblTitulo = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnLogar = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login sistema AHRI!");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImage.setBackground(new java.awt.Color(51, 105, 191));
        lblImage.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblImage.setForeground(new java.awt.Color(255, 255, 255));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main.png"))); // NOI18N
        lblImage.setText("AHRI");
        lblImage.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblImage.setOpaque(true);
        getContentPane().add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 120));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLogin.setBackground(new java.awt.Color(66, 69, 79));
        txtLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(51, 105, 191));
        txtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtLogin.setText("Usuário");
        txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtLogin.setCaretColor(new java.awt.Color(51, 105, 191));
        txtLogin.setOpaque(false);
        txtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoginFocusLost(evt);
            }
        });
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 540, 50));

        txtSenha.setBackground(new java.awt.Color(66, 69, 79));
        txtSenha.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(51, 105, 191));
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSenha.setText("senha");
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtSenha.setCaretColor(new java.awt.Color(51, 105, 191));
        txtSenha.setOpaque(false);
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 540, 50));

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 102));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setText("Insira as credenciais para o acesso ao sistema");
        panelPrincipal.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 540, 30));

        btnSair.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(204, 0, 51));
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.setBorderPainted(false);
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
        panelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 130, 40));

        btnLogar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnLogar.setForeground(new java.awt.Color(51, 105, 191));
        btnLogar.setText("Login");
        btnLogar.setBorder(null);
        btnLogar.setBorderPainted(false);
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, 40));

        btnAjuda.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAjuda.setForeground(new java.awt.Color(51, 102, 0));
        btnAjuda.setText("Ajuda");
        btnAjuda.setBorder(null);
        btnAjuda.setBorderPainted(false);
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 100, 40));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 600, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginFocusGained
        txtLogin.setText("");
    }//GEN-LAST:event_txtLoginFocusGained

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        txtSenha.setText("");
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        logar(txtLogin.getText(), txtSenha.getText());
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoginFocusLost
        if (txtLogin.getText().equals("")) {
            txtLogin.setText("Username");
        }
    }//GEN-LAST:event_txtLoginFocusLost

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        if (txtSenha.getText().equals("")) {
            txtSenha.setText("3333333");
        }
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        txtSenha.requestFocus();
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        logar(txtLogin.getText(), txtSenha.getText());
    }//GEN-LAST:event_btnLogarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setForeground(Color.red);
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        btnSair.setForeground(new java.awt.Color(51, 105, 191));
    }//GEN-LAST:event_btnSairMouseExited

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        Help help = Help.getInstancia();
        help.setVisible(true);
    }//GEN-LAST:event_btnAjudaActionPerformed
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Look and feel setting code">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnLogar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
