package view.ferramentas;

import controller.ferramentas.BackupController;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.ferramentas.BackupModel;

public class Backup extends javax.swing.JFrame {
    BackupController pc = new BackupController();
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
        puxarDados();
        icone();
    }
    public void icone() {
        URL url = this.getClass().getResource("/images/icon.ico");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }
    
    public void puxarDados(){
        BackupModel um = new BackupModel();
        pc.puxarDados(um);
        txtLocal.setText(um.getCaminho());
        lblUltimo.setText("Último backup efetuado: "+um.getUltimo());
    }
    public void PegarPasta(){
        String pasta = chooserDiretorio.getSelectedFile().getAbsolutePath();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooserDiretorio = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblTítulo = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        lblUltimo = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEfetuarBackup = new javax.swing.JLabel();
        lblCaminho = new javax.swing.JLabel();

        chooserDiretorio.setCurrentDirectory(new java.io.File("C:\\"));
            chooserDiretorio.setDialogTitle("Selecione um local");
            chooserDiretorio.setFileFilter(null);
            chooserDiretorio.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
            chooserDiretorio.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
            chooserDiretorio.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    chooserDiretorioActionPerformed(evt);
                }
            });

            jDialog1.setTitle("Efetuando backup, aguarde...");
            jDialog1.setResizable(false);
            jDialog1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            txtLog.setEditable(false);
            txtLog.setBackground(new java.awt.Color(102, 102, 102));
            txtLog.setColumns(20);
            txtLog.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
            txtLog.setForeground(new java.awt.Color(255, 255, 255));
            txtLog.setRows(5);
            txtLog.setToolTipText("Log.");
            txtLog.setBorder(null);
            txtLog.setFocusable(false);
            jScrollPane1.setViewportView(txtLog);

            jDialog1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 510, 160));

            jButton2.setBackground(new java.awt.Color(255, 255, 255));
            jButton2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jButton2.setForeground(new java.awt.Color(51, 153, 0));
            jButton2.setText("Fechar esta tela");
            jButton2.setBorder(null);
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });
            jDialog1.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 510, 30));

            jLabel2.setBackground(new java.awt.Color(51, 153, 0));
            jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Backup efetuado com sucesso!");
            jLabel2.setOpaque(true);
            jDialog1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 30));

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setTitle("Backup do sistema.");
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
            getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 30));

            painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
            painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            lblUltimo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            lblUltimo.setForeground(new java.awt.Color(51, 105, 191));
            lblUltimo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            lblUltimo.setText("Último backup efetuado:");
            painelPrincipal.add(lblUltimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 240, 20));

            txtLocal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
            txtLocal.setForeground(new java.awt.Color(102, 102, 102));
            txtLocal.setText("c:\\");
                txtLocal.setPreferredSize(new java.awt.Dimension(200, 20));
                painelPrincipal.add(txtLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 370, 20));

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
                painelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 80, 40));

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
                painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 80, 40));

                jButton1.setText("...");
                jButton1.setBorder(null);
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });
                painelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 40, 20));

                btnEfetuarBackup.setBackground(new java.awt.Color(255, 255, 255));
                btnEfetuarBackup.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
                btnEfetuarBackup.setForeground(new java.awt.Color(51, 153, 255));
                btnEfetuarBackup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                btnEfetuarBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ferramentas/icon5.png"))); // NOI18N
                btnEfetuarBackup.setText("Fazer backup");
                btnEfetuarBackup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btnEfetuarBackup.setOpaque(true);
                btnEfetuarBackup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                btnEfetuarBackup.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnEfetuarBackupMouseReleased(evt);
                    }
                });
                painelPrincipal.add(btnEfetuarBackup, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 410, 110));

                lblCaminho.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                lblCaminho.setForeground(new java.awt.Color(51, 105, 191));
                lblCaminho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
                lblCaminho.setText("Local onde será salvo o backup:");
                painelPrincipal.add(lblCaminho, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 20));

                getContentPane().add(painelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 430, 220));

                pack();
            }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtLocal.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha o local do backup!");
        } else {
            BackupModel um = new BackupModel();
            um.setCaminho(txtLocal.getText());
            pc.alterar(um);
            JOptionPane.showMessageDialog(null, "Salvo!");
        }
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

    private void btnEfetuarBackupMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEfetuarBackupMouseReleased
        int opcao = 2;
        if (txtLocal.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Caminho inválido.");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja efetuar um backup agora?",
                   "Backup do sistema?", opcao) == 0) {
                try {
                    jDialog1.setLocation(this.getX(), this.getY());
                    jDialog1.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                    jDialog1.setSize(520, 250);
                    jDialog1.setVisible(true);
                    BackupController bc = new BackupController();
                    
                    //Gerar nome arquivo
                    Date dataHoraAtual = new Date();
                    String data = new SimpleDateFormat("ddMMyyyy").format(dataHoraAtual);
                    String hora = new SimpleDateFormat("HHmmss").format(dataHoraAtual);
                    String nomeArquivo = "\\B"+hora+data+".backup";
                    
                    txtLog.setText(bc.efetuarBackup(txtLocal.getText()+nomeArquivo, "C:\\PG\\pg96\\bin\\"));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnEfetuarBackupMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Look and feel">
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
    private javax.swing.JLabel btnEfetuarBackup;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFileChooser chooserDiretorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaminho;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUltimo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
}