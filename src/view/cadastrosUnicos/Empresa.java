package view.cadastrosUnicos;

import controller.EmpresaController;
import controller.LocalController;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.cadastros.cadastrosUnicos.EmpresaModel;
    

public class Empresa extends javax.swing.JFrame {
    private static final Empresa INSTANCIA = new Empresa();

    public static Empresa getInstancia() {
        return INSTANCIA;
    }
    
    EmpresaController ec = new EmpresaController();
    
    public Empresa() {
        initComponents();
        setLocationRelativeTo(null);
        preencheCidades();
        puxarDados();
    }
    
    public void puxarDados(){
        EmpresaModel em = new EmpresaModel();
        ec.puxarDados(em);
        //cnpj,cpf,xnome,xfant,xlgr,nro,xcpl,xbairro,xmun,uf,cep,xpais,fone,email,ie,iest,im,cnae,crt
        txtCNPJ.setText(em.getCNPJ());
        txtCPF.setText(em.getCPF());
        txtRazao.setText(em.getxNome());
        txtNome.setText(em.getxFant());
        txtLgr.setText(em.getxLgr());
        txtNro.setText(Integer.toString(em.getNro()));
        txtComplemento.setText(em.getxCpl());
        txtBairro.setText(em.getxBairro());
        txtMun.setSelectedItem(em.getxMun());
        txtUF.setSelectedItem(em.getUF());
        txtCEP.setText(em.getCEP());
        txtContato1.setText(em.getFone());
        txtEmail.setText(em.getEmail());
        txtIE.setText(em.getIE());
        txtIEST.setText(em.getIEST());
        txtIM.setText(em.getIM());
        txtCNAE.setText(em.getCNAE());
        txtCRT.setSelectedItem(em.getCRT());
    }
    public void preencheCidades() {
        LocalController lc = new LocalController();
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(lc.listaCidades(txtUF.getSelectedItem().toString()).toArray());
        txtMun.setModel(defaultComboBox);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroEmpresa = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        lblNomeFantasia = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblRazaoSocial = new javax.swing.JLabel();
        txtRazao = new javax.swing.JTextField();
        lblCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        lblIE = new javax.swing.JLabel();
        txtIE = new javax.swing.JFormattedTextField();
        lblUF = new javax.swing.JLabel();
        txtUF = new javax.swing.JComboBox<>();
        btnDescartar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblNomeFantasia1 = new javax.swing.JLabel();
        txtNro = new javax.swing.JTextField();
        txtLgr = new javax.swing.JTextField();
        lblNomeFantasia2 = new javax.swing.JLabel();
        lblNomeFantasia3 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblTitulo13 = new javax.swing.JLabel();
        txtMun = new javax.swing.JComboBox<>();
        lblNomeFantasia4 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblNomeFantasia5 = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        txtIM = new javax.swing.JFormattedTextField();
        lblIM = new javax.swing.JLabel();
        lblTitulo6 = new javax.swing.JLabel();
        lblTitulo16 = new javax.swing.JLabel();
        lblTitulo14 = new javax.swing.JLabel();
        txtCRT = new javax.swing.JComboBox<>();
        lblNomeFantasia6 = new javax.swing.JLabel();
        txtCNAE = new javax.swing.JTextField();
        lblIE1 = new javax.swing.JLabel();
        txtIEST = new javax.swing.JFormattedTextField();
        txtContato1 = new javax.swing.JFormattedTextField();
        lblCNPJ1 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        cbxCel = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro da empresa");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastroEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        cadastroEmpresa.setMaximumSize(new java.awt.Dimension(670, 320));
        cadastroEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTítulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Cadastro da Empresa/Emitente");
        lblTítulo.setOpaque(true);
        cadastroEmpresa.add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        lblNomeFantasia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia.setText("Nome");
        cadastroEmpresa.add(lblNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 100, 20));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setToolTipText("Nome fantasia");
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 580, 20));

        lblRazaoSocial.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRazaoSocial.setForeground(new java.awt.Color(51, 105, 191));
        lblRazaoSocial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRazaoSocial.setText("Razão Social");
        cadastroEmpresa.add(lblRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 100, 20));

        txtRazao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRazao.setToolTipText("Nome fantasia");
        txtRazao.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 580, 20));

        lblCNPJ.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCNPJ.setForeground(new java.awt.Color(51, 105, 191));
        lblCNPJ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCNPJ.setText("CNPJ");
        cadastroEmpresa.add(lblCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 40, 20));

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 140, 20));

        lblIE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIE.setForeground(new java.awt.Color(51, 105, 191));
        lblIE.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIE.setText("IE");
        cadastroEmpresa.add(lblIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 30, 20));

        txtIE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        txtIE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 100, 20));

        lblUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUF.setForeground(new java.awt.Color(51, 105, 191));
        lblUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUF.setText("UF");
        cadastroEmpresa.add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 40, 20));

        txtUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SC", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SE", "TO" }));
        cadastroEmpresa.add(txtUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 70, 20));

        btnDescartar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDescartar.setText("Sair");
        btnDescartar.setFocusable(false);
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        cadastroEmpresa.add(btnDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 70, 40));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setFocusable(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        cadastroEmpresa.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, 40));

        lblNomeFantasia1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia1.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia1.setText("Nº");
        cadastroEmpresa.add(lblNomeFantasia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 30, 20));

        txtNro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNro.setToolTipText("Nome fantasia");
        txtNro.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 50, 20));

        txtLgr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtLgr.setToolTipText("Nome fantasia");
        txtLgr.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtLgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 460, 20));

        lblNomeFantasia2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia2.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia2.setText("Logradouro");
        cadastroEmpresa.add(lblNomeFantasia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, 20));

        lblNomeFantasia3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia3.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia3.setText("Complemento");
        cadastroEmpresa.add(lblNomeFantasia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 20));

        txtComplemento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtComplemento.setToolTipText("Nome fantasia");
        txtComplemento.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 290, 20));

        lblTitulo13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo13.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo13.setText("Município");
        cadastroEmpresa.add(lblTitulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 70, 20));

        txtMun.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cadastroEmpresa.add(txtMun, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 220, 20));

        lblNomeFantasia4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia4.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia4.setText("Bairro");
        cadastroEmpresa.add(lblNomeFantasia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 70, 20));

        txtBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBairro.setToolTipText("Nome fantasia");
        txtBairro.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 190, 20));

        lblNomeFantasia5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia5.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia5.setText("CEP");
        cadastroEmpresa.add(lblNomeFantasia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 20));

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 120, 20));

        txtIM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtIM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 130, 20));

        lblIM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIM.setForeground(new java.awt.Color(51, 105, 191));
        lblIM.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIM.setText("IM");
        cadastroEmpresa.add(lblIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 50, 20));

        lblTitulo6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo6.setText("Telefone");
        cadastroEmpresa.add(lblTitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 20));

        lblTitulo16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo16.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo16.setText("Email");
        cadastroEmpresa.add(lblTitulo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 70, 20));

        lblTitulo14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo14.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo14.setText("Regime Tributário");
        cadastroEmpresa.add(lblTitulo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 140, 20));

        txtCRT.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCRT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 – Simples Nacional", "2 – Simples Nacional – Excesso de sublimite de receita bruta", "3 – Regime Normal" }));
        cadastroEmpresa.add(txtCRT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 560, 20));

        lblNomeFantasia6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia6.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia6.setText("CNAE");
        cadastroEmpresa.add(lblNomeFantasia6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 50, 20));

        txtCNAE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCNAE.setToolTipText("Nome fantasia");
        txtCNAE.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtCNAE, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 120, 20));

        lblIE1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIE1.setForeground(new java.awt.Color(51, 105, 191));
        lblIE1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIE1.setText("IEST");
        cadastroEmpresa.add(lblIE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 40, 20));

        txtIEST.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        txtIEST.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtIEST, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 140, 20));

        try {
            txtContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtContato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 190, 20));

        lblCNPJ1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCNPJ1.setForeground(new java.awt.Color(51, 105, 191));
        lblCNPJ1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCNPJ1.setText("CPF");
        cadastroEmpresa.add(lblCNPJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 50, 20));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 120, 20));

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setToolTipText("Nome fantasia");
        txtEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 580, 20));

        cbxCel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxCel.setText("Cel.");
        cbxCel.setToolTipText("Marque caso ele seja também um fornecedor.");
        cbxCel.setFocusable(false);
        cbxCel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cbxCel.setOpaque(false);
        cbxCel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCelItemStateChanged(evt);
            }
        });
        cbxCel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbxCelMouseReleased(evt);
            }
        });
        cadastroEmpresa.add(cbxCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 60, 20));

        getContentPane().add(cadastroEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            EmpresaModel em = new EmpresaModel();
            em.setCNPJ(txtCNPJ.getText());
            em.setCPF(txtCPF.getText());
            em.setxNome(txtRazao.getText());
            em.setxFant(txtNome.getText());
            em.setxLgr(txtLgr.getText());
            em.setNro(Integer.parseInt(txtNro.getText()));
            em.setxCpl(txtComplemento.getText());
            em.setxBairro(txtBairro.getText());
            em.setxMun(txtMun.getSelectedItem().toString());
            em.setUF(txtUF.getSelectedItem().toString());
            em.setCEP(txtCEP.getText());
            em.setFone(txtContato1.getText());
            em.setEmail(txtEmail.getText());
            em.setIE(txtIE.getText());
            em.setIEST(txtIEST.getText());
            em.setIM(txtIM.getText());
            em.setCNAE(txtCNAE.getText());
            int crt = 1;
            if (txtCRT.getSelectedItem().toString().equals("1 – Simples Nacional")) {
                crt = 1;
            }
            if (txtCRT.getSelectedItem().toString().equals("2 – Simples Nacional – Excesso de sublimite de receita bruta")) {
                crt = 2;
            }
            if (txtCRT.getSelectedItem().toString().equals("3 – Regime Normal")) {
                crt = 3;
            }
            em.setCRT(crt);
            ec.salvarDados(em);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados\n"+e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbxCelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCelItemStateChanged
        
    }//GEN-LAST:event_cbxCelItemStateChanged

    private void cbxCelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCelMouseReleased
        if (cbxCel.isSelected()) {
            try {
                txtContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                txtContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_cbxCelMouseReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel cadastroEmpresa;
    private javax.swing.JCheckBox cbxCel;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCNPJ1;
    private javax.swing.JLabel lblIE;
    private javax.swing.JLabel lblIE1;
    private javax.swing.JLabel lblIM;
    private javax.swing.JLabel lblNomeFantasia;
    private javax.swing.JLabel lblNomeFantasia1;
    private javax.swing.JLabel lblNomeFantasia2;
    private javax.swing.JLabel lblNomeFantasia3;
    private javax.swing.JLabel lblNomeFantasia4;
    private javax.swing.JLabel lblNomeFantasia5;
    private javax.swing.JLabel lblNomeFantasia6;
    private javax.swing.JLabel lblRazaoSocial;
    private javax.swing.JLabel lblTitulo13;
    private javax.swing.JLabel lblTitulo14;
    private javax.swing.JLabel lblTitulo16;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JTextField txtCNAE;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JComboBox<String> txtCRT;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtContato1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JFormattedTextField txtIE;
    private javax.swing.JFormattedTextField txtIEST;
    private javax.swing.JFormattedTextField txtIM;
    private javax.swing.JTextField txtLgr;
    private javax.swing.JComboBox<String> txtMun;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNro;
    private javax.swing.JTextField txtRazao;
    private javax.swing.JComboBox<String> txtUF;
    // End of variables declaration//GEN-END:variables
}
