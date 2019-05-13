package view.ferramentas;

import com.sun.prism.impl.PrismSettings;
import controller.cadastros.produtos.ProdutoController;
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
        cbxAgendar.setSelected(um.getAgendado());
        if (um.getAgendado()) {
            if (um.getHr1()!="") {
                cbxHR1.setSelected(true);
                hr1.setText(um.getHr1());
                hr1.setEnabled(true);
            }
            if (um.getHr2()!="") {
                cbxHR2.setSelected(true);
                hr2.setText(um.getHr2());
                hr2.setEnabled(true);
            }
            if (um.getHr3()!="") {
                cbxHR3.setSelected(true);
                hr3.setText(um.getHr3());
                hr3.setEnabled(true);
            }
            if (um.getHr4()!="") {
                cbxHR4.setSelected(true);
                hr4.setText(um.getHr4());
                hr4.setEnabled(true);
            }
            if (um.getHr5()!="") {
                cbxHR5.setSelected(true);
                hr5.setText(um.getHr5());
                hr5.setEnabled(true);
            }
            if (um.getHr6()!="") {
                cbxHR6.setSelected(true);
                hr6.setText(um.getHr6());
                hr6.setEnabled(true);
            }
            cbxHR1.setEnabled(true);
            cbxHR2.setEnabled(true);
            cbxHR3.setEnabled(true);
            cbxHR4.setEnabled(true);
            cbxHR5.setEnabled(true);
            cbxHR6.setEnabled(true);
        }
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
        jPanel1 = new javax.swing.JPanel();
        cbxHR1 = new javax.swing.JCheckBox();
        hr1 = new javax.swing.JFormattedTextField();
        cbxHR2 = new javax.swing.JCheckBox();
        hr2 = new javax.swing.JFormattedTextField();
        cbxHR3 = new javax.swing.JCheckBox();
        hr3 = new javax.swing.JFormattedTextField();
        cbxHR4 = new javax.swing.JCheckBox();
        hr4 = new javax.swing.JFormattedTextField();
        cbxHR5 = new javax.swing.JCheckBox();
        hr5 = new javax.swing.JFormattedTextField();
        cbxHR6 = new javax.swing.JCheckBox();
        hr6 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        cbxAgendar = new javax.swing.JCheckBox();
        btnEfetuarBackup = new javax.swing.JLabel();
        lblCaminho = new javax.swing.JLabel();

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

            jDialog1.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 430, 190));

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
            jDialog1.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 430, 30));

            jLabel2.setBackground(new java.awt.Color(51, 153, 0));
            jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("Backup efetuado com sucesso!");
            jLabel2.setOpaque(true);
            jDialog1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 30));

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

                jPanel1.setBackground(new java.awt.Color(255, 255, 255));
                jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                jPanel1.setEnabled(false);
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                cbxHR1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                cbxHR1.setForeground(new java.awt.Color(51, 105, 191));
                cbxHR1.setEnabled(false);
                cbxHR1.setOpaque(false);
                cbxHR1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cbxHR1ActionPerformed(evt);
                    }
                });
                jPanel1.add(cbxHR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 20, -1));

                hr1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
                hr1.setText("00:00");
                hr1.setEnabled(false);
                hr1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                jPanel1.add(hr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 40, -1));
                hr1.getAccessibleContext().setAccessibleParent(cbxHR1);

                cbxHR2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                cbxHR2.setForeground(new java.awt.Color(51, 105, 191));
                cbxHR2.setEnabled(false);
                cbxHR2.setOpaque(false);
                cbxHR2.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cbxHR2ActionPerformed(evt);
                    }
                });
                jPanel1.add(cbxHR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 20, -1));

                hr2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
                hr2.setText("00:00");
                hr2.setEnabled(false);
                hr2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                jPanel1.add(hr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 40, -1));

                cbxHR3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                cbxHR3.setForeground(new java.awt.Color(51, 105, 191));
                cbxHR3.setEnabled(false);
                cbxHR3.setOpaque(false);
                cbxHR3.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cbxHR3ActionPerformed(evt);
                    }
                });
                jPanel1.add(cbxHR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 20, -1));

                hr3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
                hr3.setText("00:00");
                hr3.setEnabled(false);
                hr3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                jPanel1.add(hr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 40, -1));

                cbxHR4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                cbxHR4.setForeground(new java.awt.Color(51, 105, 191));
                cbxHR4.setEnabled(false);
                cbxHR4.setOpaque(false);
                cbxHR4.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cbxHR4ActionPerformed(evt);
                    }
                });
                jPanel1.add(cbxHR4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 20, -1));

                hr4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
                hr4.setText("00:00");
                hr4.setEnabled(false);
                hr4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                jPanel1.add(hr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, -1));

                cbxHR5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                cbxHR5.setForeground(new java.awt.Color(51, 105, 191));
                cbxHR5.setEnabled(false);
                cbxHR5.setOpaque(false);
                cbxHR5.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cbxHR5ActionPerformed(evt);
                    }
                });
                jPanel1.add(cbxHR5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 20, -1));

                hr5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
                hr5.setText("00:00");
                hr5.setEnabled(false);
                hr5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                jPanel1.add(hr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 40, -1));

                cbxHR6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                cbxHR6.setForeground(new java.awt.Color(51, 105, 191));
                cbxHR6.setEnabled(false);
                cbxHR6.setOpaque(false);
                cbxHR6.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cbxHR6ActionPerformed(evt);
                    }
                });
                jPanel1.add(cbxHR6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 20, -1));

                hr6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
                hr6.setText("00:00");
                hr6.setEnabled(false);
                hr6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                jPanel1.add(hr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 40, -1));

                painelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 220, 70));

                jButton1.setText("...");
                jButton1.setBorder(null);
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                    }
                });
                painelPrincipal.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 40, 20));

                cbxAgendar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
                cbxAgendar.setForeground(new java.awt.Color(51, 105, 191));
                cbxAgendar.setText("Agendar backup");
                cbxAgendar.setOpaque(false);
                cbxAgendar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cbxAgendarActionPerformed(evt);
                    }
                });
                painelPrincipal.add(cbxAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, -1));

                btnEfetuarBackup.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
                btnEfetuarBackup.setForeground(new java.awt.Color(51, 153, 255));
                btnEfetuarBackup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                btnEfetuarBackup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ferramentas/icon5.png"))); // NOI18N
                btnEfetuarBackup.setText("Fazer backup");
                btnEfetuarBackup.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                btnEfetuarBackup.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
                btnEfetuarBackup.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseReleased(java.awt.event.MouseEvent evt) {
                        btnEfetuarBackupMouseReleased(evt);
                    }
                });
                painelPrincipal.add(btnEfetuarBackup, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 90, 90));

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
            um.setAgendado(cbxAgendar.isSelected());
            if (cbxHR1.isSelected()) {
                um.setHr1(hr1.getText());
            } else {
                um.setHr1("");
            }
            if (cbxHR2.isSelected()) {
                um.setHr2(hr2.getText());
            } else {
                um.setHr2("");
            }
            if (cbxHR3.isSelected()) {
                um.setHr3(hr3.getText());
            } else {
                um.setHr3("");
            }
            if (cbxHR4.isSelected()) {
                um.setHr4(hr4.getText());
            } else {
                um.setHr4("");
            }
            if (cbxHR5.isSelected()) {
                um.setHr5(hr5.getText());
            } else {
                um.setHr5("");
            }
            if (cbxHR6.isSelected()) {
                um.setHr6(hr6.getText());
            } else {
                um.setHr6("");
            }
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
                    jDialog1.setSize(430, 250);
                    jDialog1.setVisible(true);
                    BackupController bc = new BackupController();
                    
                    //Gerar nome arquivo
                    Date dataHoraAtual = new Date();
                    String data = new SimpleDateFormat("ddMMyyyy").format(dataHoraAtual);
                    String hora = new SimpleDateFormat("HHmmss").format(dataHoraAtual);
                    String nomeArquivo = "\\B"+hora+data;
                    
                    txtLog.setText(bc.efetuarBackup(txtLocal.getText()+nomeArquivo, "C:\\PG\\pg96\\bin\\"));
                    JOptionPane.showMessageDialog(null, "Backup efetuado com sucesso.");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnEfetuarBackupMouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbxHR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHR1ActionPerformed
        if (cbxHR1.isSelected()) {
            hr1.setEnabled(true);
        } else {
            hr1.setEnabled(false);
        }
    }//GEN-LAST:event_cbxHR1ActionPerformed

    private void cbxHR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHR2ActionPerformed
        if (cbxHR2.isSelected()) {
            hr2.setEnabled(true);
        } else {
            hr2.setEnabled(false);
        }
    }//GEN-LAST:event_cbxHR2ActionPerformed

    private void cbxHR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHR3ActionPerformed
        if (cbxHR3.isSelected()) {
            hr3.setEnabled(true);
        } else {
            hr3.setEnabled(false);
        }
    }//GEN-LAST:event_cbxHR3ActionPerformed

    private void cbxHR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHR4ActionPerformed
        if (cbxHR4.isSelected()) {
            hr4.setEnabled(true);
        } else {
            hr4.setEnabled(false);
        }
    }//GEN-LAST:event_cbxHR4ActionPerformed

    private void cbxHR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHR5ActionPerformed
        if (cbxHR5.isSelected()) {
            hr5.setEnabled(true);
        } else {
            hr5.setEnabled(false);
        }
    }//GEN-LAST:event_cbxHR5ActionPerformed

    private void cbxHR6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHR6ActionPerformed
        if (cbxHR6.isSelected()) {
            hr6.setEnabled(true);
        } else {
            hr6.setEnabled(false);
        }
    }//GEN-LAST:event_cbxHR6ActionPerformed

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
    private javax.swing.JCheckBox cbxAgendar;
    private javax.swing.JCheckBox cbxHR1;
    private javax.swing.JCheckBox cbxHR2;
    private javax.swing.JCheckBox cbxHR3;
    private javax.swing.JCheckBox cbxHR4;
    private javax.swing.JCheckBox cbxHR5;
    private javax.swing.JCheckBox cbxHR6;
    private javax.swing.JFileChooser chooserDiretorio;
    private javax.swing.JFormattedTextField hr1;
    private javax.swing.JFormattedTextField hr2;
    private javax.swing.JFormattedTextField hr3;
    private javax.swing.JFormattedTextField hr4;
    private javax.swing.JFormattedTextField hr5;
    private javax.swing.JFormattedTextField hr6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaminho;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUltimo;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField txtLocal;
    private javax.swing.JTextArea txtLog;
    // End of variables declaration//GEN-END:variables
}