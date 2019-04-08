package view.cadastros;

import javax.swing.JOptionPane;
import view.TelaInicial;


public class NovoCliente extends javax.swing.JFrame {
    int fisica = 0;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        painelPrincipal = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        lblTitulo7 = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        sldPessoa = new javax.swing.JSlider();
        lblTitulo10 = new javax.swing.JLabel();
        lblTitulo11 = new javax.swing.JLabel();
        lblTitulo12 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        lblTitulo6 = new javax.swing.JLabel();
        btnDescartar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblTitulo13 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblRazao = new javax.swing.JLabel();
        txtRazao = new javax.swing.JTextField();
        lblNomeFantasia5 = new javax.swing.JLabel();
        txtCNPJ1 = new javax.swing.JFormattedTextField();
        lblUF = new javax.swing.JLabel();
        txtUF1 = new javax.swing.JComboBox<>();
        lblTitulo14 = new javax.swing.JLabel();
        txtUF2 = new javax.swing.JComboBox<>();
        lblNomeFantasia2 = new javax.swing.JLabel();
        txtNomeFantasia2 = new javax.swing.JTextField();
        lblNomeFantasia1 = new javax.swing.JLabel();
        txtNomeFantasia1 = new javax.swing.JTextField();
        lblNomeFantasia3 = new javax.swing.JLabel();
        txtNomeFantasia3 = new javax.swing.JTextField();
        lblNomeFantasia4 = new javax.swing.JLabel();
        txtNomeFantasia4 = new javax.swing.JTextField();
        txtContato3 = new javax.swing.JFormattedTextField();
        txtContato4 = new javax.swing.JFormattedTextField();
        txtServico = new javax.swing.JCheckBox();
        lblTitulo15 = new javax.swing.JLabel();
        txtCodigo1 = new javax.swing.JTextField();
        lblTitulo16 = new javax.swing.JLabel();
        txtCodigo2 = new javax.swing.JTextField();
        lblTítulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 540, 20));

        lblTitulo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo1.setText("Nome*");
        painelPrincipal.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 20));

        lblTitulo3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("?");
        lblTitulo3.setToolTipText("Campo para logar no sistema");
        painelPrincipal.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 30, 20));

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setEnabled(false);
        txtCNPJ.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 210, 20));

        lblTitulo7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo7.setText("CPF");
        painelPrincipal.add(lblTitulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, 20));

        lblTitulo4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo4.setText("CNPJ");
        painelPrincipal.add(lblTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 100, 20));

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, 20));

        sldPessoa.setMaximum(1);
        sldPessoa.setValue(0);
        sldPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sldPessoaMouseReleased(evt);
            }
        });
        painelPrincipal.add(sldPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 470, 20));

        lblTitulo10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo10.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo10.setText("Código*");
        painelPrincipal.add(lblTitulo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        lblTitulo11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo11.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo11.setText("Física");
        painelPrincipal.add(lblTitulo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        lblTitulo12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo12.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo12.setText("Contato");
        painelPrincipal.add(lblTitulo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 20));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 20));

        lblTitulo6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo6.setText("Jurídica");
        painelPrincipal.add(lblTitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 100, 20));

        btnDescartar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDescartar.setText("Descartar");
        btnDescartar.setFocusable(false);
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setFocusable(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 80, -1));

        lblTitulo13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo13.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo13.setText("Email");
        painelPrincipal.add(lblTitulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, 20));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 550, 20));

        lblRazao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRazao.setForeground(new java.awt.Color(51, 105, 191));
        lblRazao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRazao.setText("Razão Social");
        painelPrincipal.add(lblRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));

        txtRazao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRazao.setEnabled(false);
        txtRazao.setPreferredSize(new java.awt.Dimension(200, 20));
        txtRazao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRazaoActionPerformed(evt);
            }
        });
        painelPrincipal.add(txtRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 550, 20));

        lblNomeFantasia5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia5.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia5.setText("CEP");
        painelPrincipal.add(lblNomeFantasia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, 20));

        try {
            txtCNPJ1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtCNPJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 110, 20));

        lblUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUF.setForeground(new java.awt.Color(51, 105, 191));
        lblUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUF.setText("UF");
        painelPrincipal.add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 40, 20));

        txtUF1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUF1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        painelPrincipal.add(txtUF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 70, 20));

        lblTitulo14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo14.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo14.setText("Município");
        painelPrincipal.add(lblTitulo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 70, 20));

        txtUF2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUF2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        painelPrincipal.add(txtUF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 230, 20));

        lblNomeFantasia2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia2.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia2.setText("Logradouro");
        painelPrincipal.add(lblNomeFantasia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 20));

        txtNomeFantasia2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeFantasia2.setToolTipText("Nome fantasia");
        txtNomeFantasia2.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNomeFantasia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 460, 20));

        lblNomeFantasia1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia1.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia1.setText("Nº");
        painelPrincipal.add(lblNomeFantasia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 30, 20));

        txtNomeFantasia1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeFantasia1.setToolTipText("Nome fantasia");
        txtNomeFantasia1.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNomeFantasia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 50, 20));

        lblNomeFantasia3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia3.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia3.setText("Complemento");
        painelPrincipal.add(lblNomeFantasia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 20));

        txtNomeFantasia3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeFantasia3.setToolTipText("Nome fantasia");
        txtNomeFantasia3.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNomeFantasia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 320, 20));

        lblNomeFantasia4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia4.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia4.setText("Bairro");
        painelPrincipal.add(lblNomeFantasia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 80, 20));

        txtNomeFantasia4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeFantasia4.setToolTipText("Nome fantasia");
        txtNomeFantasia4.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNomeFantasia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 170, 20));

        try {
            txtContato3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtContato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 160, 20));

        try {
            txtContato4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtContato4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 160, 20));

        txtServico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtServico.setText("Fornecedor");
        txtServico.setOpaque(false);
        txtServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtServicoMouseReleased(evt);
            }
        });
        painelPrincipal.add(txtServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 120, 20));

        lblTitulo15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo15.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo15.setText("IE");
        painelPrincipal.add(lblTitulo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, 20));

        txtCodigo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo1.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 170, 20));

        lblTitulo16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo16.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo16.setText("I. SUFRAMA");
        painelPrincipal.add(lblTitulo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 100, 20));

        txtCodigo2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo2.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 170, 20));

        jScrollPane1.setViewportView(painelPrincipal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 770, 380));

        lblTítulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Cadastro cliente");
        lblTítulo.setOpaque(true);
        getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

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

    private void txtServicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtServicoMouseReleased
        if (txtServico.isSelected()) {
            
        } else {
         
        }
    }//GEN-LAST:event_txtServicoMouseReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeFantasia1;
    private javax.swing.JLabel lblNomeFantasia2;
    private javax.swing.JLabel lblNomeFantasia3;
    private javax.swing.JLabel lblNomeFantasia4;
    private javax.swing.JLabel lblNomeFantasia5;
    private javax.swing.JLabel lblRazao;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo10;
    private javax.swing.JLabel lblTitulo11;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTitulo13;
    private javax.swing.JLabel lblTitulo14;
    private javax.swing.JLabel lblTitulo15;
    private javax.swing.JLabel lblTitulo16;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUF;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JSlider sldPessoa;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCNPJ1;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JFormattedTextField txtContato3;
    private javax.swing.JFormattedTextField txtContato4;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeFantasia1;
    private javax.swing.JTextField txtNomeFantasia2;
    private javax.swing.JTextField txtNomeFantasia3;
    private javax.swing.JTextField txtNomeFantasia4;
    private javax.swing.JTextField txtRazao;
    private javax.swing.JCheckBox txtServico;
    private javax.swing.JComboBox<String> txtUF1;
    private javax.swing.JComboBox<String> txtUF2;
    // End of variables declaration//GEN-END:variables
}
