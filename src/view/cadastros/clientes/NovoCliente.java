package view.cadastros.clientes;

import javax.swing.JOptionPane;
import view.TelaInicial;


public class NovoCliente extends javax.swing.JFrame {
    final int fisica = 0;
    private static final NovoCliente INSTANCIA = new NovoCliente();

    public static NovoCliente getInstancia() {
        return INSTANCIA;
    }

    private NovoCliente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        painelPrincipal = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblAjudaCodigo = new javax.swing.JLabel();
        lblFisica = new javax.swing.JLabel();
        lblJuridica = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblRazao = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblCNPJ = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblUF = new javax.swing.JLabel();
        lblMun = new javax.swing.JLabel();
        lblLgr = new javax.swing.JLabel();
        lblNro = new javax.swing.JLabel();
        lblCpl = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblContato = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        IE = new javax.swing.JLabel();
        ISUF = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JCheckBox();
        sldPessoa = new javax.swing.JSlider();
        txtNome = new javax.swing.JTextField();
        txtRazao = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        txtUF = new javax.swing.JComboBox<>();
        txtMun = new javax.swing.JComboBox<>();
        txtLgr = new javax.swing.JTextField();
        txtNro = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtContato1 = new javax.swing.JFormattedTextField();
        txtContato2 = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        txtIE = new javax.swing.JTextField();
        txtISUF = new javax.swing.JTextField();
        btnDescartar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane.setBorder(null);
        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código*");
        painelPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        lblAjudaCodigo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblAjudaCodigo.setForeground(new java.awt.Color(51, 105, 191));
        lblAjudaCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAjudaCodigo.setText("?");
        lblAjudaCodigo.setToolTipText("Campo para logar no sistema");
        painelPrincipal.add(lblAjudaCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 30, 20));

        lblFisica.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFisica.setForeground(new java.awt.Color(51, 105, 191));
        lblFisica.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFisica.setText("Física");
        painelPrincipal.add(lblFisica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        lblJuridica.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblJuridica.setForeground(new java.awt.Color(51, 105, 191));
        lblJuridica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJuridica.setText("Jurídica");
        painelPrincipal.add(lblJuridica, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 100, 20));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 105, 191));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome*");
        painelPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 20));

        lblRazao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRazao.setForeground(new java.awt.Color(51, 105, 191));
        lblRazao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRazao.setText("Razão Social");
        painelPrincipal.add(lblRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));

        lblCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(51, 105, 191));
        lblCPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCPF.setText("CPF");
        painelPrincipal.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 20));

        lblCNPJ.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCNPJ.setForeground(new java.awt.Color(51, 105, 191));
        lblCNPJ.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCNPJ.setText("CNPJ");
        painelPrincipal.add(lblCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 100, 20));

        lblCEP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCEP.setForeground(new java.awt.Color(51, 105, 191));
        lblCEP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCEP.setText("CEP");
        painelPrincipal.add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 20));

        lblUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUF.setForeground(new java.awt.Color(51, 105, 191));
        lblUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUF.setText("UF");
        painelPrincipal.add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 40, 20));

        lblMun.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblMun.setForeground(new java.awt.Color(51, 105, 191));
        lblMun.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMun.setText("Município");
        painelPrincipal.add(lblMun, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 70, 20));

        lblLgr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblLgr.setForeground(new java.awt.Color(51, 105, 191));
        lblLgr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLgr.setText("Logradouro");
        painelPrincipal.add(lblLgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 20));

        lblNro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNro.setForeground(new java.awt.Color(51, 105, 191));
        lblNro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNro.setText("Nº");
        painelPrincipal.add(lblNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 30, 20));

        lblCpl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCpl.setForeground(new java.awt.Color(51, 105, 191));
        lblCpl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCpl.setText("Complemento");
        painelPrincipal.add(lblCpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 20));

        lblBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(51, 105, 191));
        lblBairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBairro.setText("Bairro");
        painelPrincipal.add(lblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 80, 20));

        lblContato.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblContato.setForeground(new java.awt.Color(51, 105, 191));
        lblContato.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContato.setText("Contato");
        painelPrincipal.add(lblContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 20));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 105, 191));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email");
        painelPrincipal.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, 20));

        IE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        IE.setForeground(new java.awt.Color(51, 105, 191));
        IE.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IE.setText("IE");
        painelPrincipal.add(IE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, 20));

        ISUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ISUF.setForeground(new java.awt.Color(51, 105, 191));
        ISUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ISUF.setText("I. SUFRAMA");
        painelPrincipal.add(ISUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 100, 20));

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, 20));

        txtFornecedor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFornecedor.setText("Fornecedor");
        txtFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtFornecedor.setOpaque(false);
        txtFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtFornecedorMouseReleased(evt);
            }
        });
        painelPrincipal.add(txtFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 120, 20));

        sldPessoa.setMaximum(1);
        sldPessoa.setValue(0);
        sldPessoa.setFocusable(false);
        sldPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sldPessoaMouseReleased(evt);
            }
        });
        painelPrincipal.add(sldPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 470, 20));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 550, 20));

        txtRazao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRazao.setEnabled(false);
        txtRazao.setPreferredSize(new java.awt.Dimension(200, 20));
        txtRazao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaoActionPerformed(evt);
            }
        });
        painelPrincipal.add(txtRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 550, 20));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 20));

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setEnabled(false);
        txtCNPJ.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 210, 20));

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 110, 20));

        txtUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        painelPrincipal.add(txtUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 70, 20));

        txtMun.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        painelPrincipal.add(txtMun, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 230, 20));

        txtLgr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtLgr.setToolTipText("Nome fantasia");
        txtLgr.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtLgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 460, 20));

        txtNro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNro.setToolTipText("Nome fantasia");
        txtNro.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 50, 20));

        txtComplemento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtComplemento.setToolTipText("Nome fantasia");
        txtComplemento.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 320, 20));

        txtBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBairro.setToolTipText("Nome fantasia");
        txtBairro.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 170, 20));

        try {
            txtContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtContato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 160, 20));

        try {
            txtContato2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtContato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 160, 20));

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 540, 20));

        txtIE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIE.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 170, 20));

        txtISUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtISUF.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtISUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 170, 20));

        btnDescartar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDescartar.setText("Descartar");
        btnDescartar.setFocusable(false);
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, 30));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setFocusable(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 80, 30));

        jScrollPane.setViewportView(painelPrincipal);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 750, 430));

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro cliente");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaInicial telainicial = new TelaInicial();
        telainicial.opcoes = false;
    }//GEN-LAST:event_formWindowClosed

    private void sldPessoaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldPessoaMouseReleased
        if (sldPessoa.getValue() == fisica) {
            txtCPF.setEnabled(true);
            txtCNPJ.setEnabled(false);
            txtRazao.setEnabled(false);
            lblRazao.setText("Razão Social");
        } else {
            txtCPF.setEnabled(false);
            txtCNPJ.setEnabled(true);
            txtRazao.setEnabled(true);
            lblRazao.setText("Razão Social*");
        }
    }//GEN-LAST:event_sldPessoaMouseReleased

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (sldPessoa.getValue()==fisica & txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome!");
            txtNome.requestFocus();
        } else {
            
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtRazaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRazaoActionPerformed

    private void txtFornecedorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFornecedorMouseReleased
        if (txtFornecedor.isSelected()) {
            
        } else {
         
        }
    }//GEN-LAST:event_txtFornecedorMouseReleased

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Look and feel">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IE;
    private javax.swing.JLabel ISUF;
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblAjudaCodigo;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblCpl;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFisica;
    private javax.swing.JLabel lblJuridica;
    private javax.swing.JLabel lblLgr;
    private javax.swing.JLabel lblMun;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNro;
    private javax.swing.JLabel lblRazao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUF;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JSlider sldPessoa;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtContato1;
    private javax.swing.JFormattedTextField txtContato2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JCheckBox txtFornecedor;
    private javax.swing.JTextField txtIE;
    private javax.swing.JTextField txtISUF;
    private javax.swing.JTextField txtLgr;
    private javax.swing.JComboBox<String> txtMun;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNro;
    private javax.swing.JTextField txtRazao;
    private javax.swing.JComboBox<String> txtUF;
    // End of variables declaration//GEN-END:variables
}
