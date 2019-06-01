package view.cadastros.entidades;

import controller.cadastros.entidades.EntidadeController;
import controller.funcoes.LocalController;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.cadastros.entidades.EntidadeModel;
import view.TelaInicial;


public class EditarCliente extends javax.swing.JFrame {
    final int fisica = 0;
    static String title;
    EntidadeController ec = new EntidadeController();
    
    private static final EditarCliente INSTANCIA = new EditarCliente();

    public static EditarCliente getInstancia() {
        return INSTANCIA;
    }
    

    private EditarCliente() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void puxarDados(int cod){
        EntidadeModel em = new EntidadeModel();
        ec.puxarDados(em, cod);
        txtCodigo.setText(Integer.toString(em.getCod()));
        if (em.getFornecedor() == 0) {
            txtFornecedor.setSelected(false);
        } else {
            txtFornecedor.setSelected(true);
        }
        txtNome.setText(em.getNome());
        txtRazao.setText(em.getxNome());
        if (em.getTipoPessoa() == fisica) {
            txtCPF.setText(em.getCNPJ());
        } else {
            txtCNPJ.setText(em.getCNPJ());
        }
        txtCEP.setText(em.getCEP());
        txtLgr.setText(em.getxLgr());
        txtUF.setSelectedItem(em.getUF());
        txtMun.setSelectedItem(em.getxMun());
        txtNro.setText(Integer.toString(em.getNro()));
        txtComplemento.setText(em.getxCpl());
        txtBairro.setText(em.getxBairro());
        txtContato1.setText(em.getFone1());
        txtContato2.setText(em.getFone2());
        txtContato3.setText(em.getFone3());
        txtEmail.setText(em.getEmail());
        txtIE.setText(em.getIE());
        txtISUF.setText(em.getISUF());
    }
    public void limpaCampos(){
        txtCodigo.setText("");
        txtFornecedor.setSelected(false);
        txtNome.setText("");
        txtRazao.setText("");
        txtCPF.setText("");
        txtCNPJ.setText("");
        txtCEP.setText("");
        txtLgr.setText("");
        txtNro.setText("");
        txtComplemento.setText("");
        txtBairro.setText("");
        txtContato1.setText("");
        txtContato2.setText("");
        txtContato3.setText("");
        txtEmail.setText("");
        txtIE.setText("");
        txtISUF.setText("");
    }
    public void preencheCidades() {
        LocalController lc = new LocalController();
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(lc.listaCidades(txtUF.getSelectedItem().toString()).toArray());
        txtMun.setModel(defaultComboBox);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        painelPrincipal = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
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
        txtEmail = new javax.swing.JTextField();
        txtIE = new javax.swing.JTextField();
        txtISUF = new javax.swing.JTextField();
        btnDescartar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtContato1 = new javax.swing.JFormattedTextField();
        txtContato2 = new javax.swing.JFormattedTextField();
        txtContato3 = new javax.swing.JFormattedTextField();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar cliente");
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
        lblCodigo.setText("Código");
        painelPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

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
        painelPrincipal.add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 20));

        lblUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUF.setForeground(new java.awt.Color(51, 105, 191));
        lblUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUF.setText("UF");
        painelPrincipal.add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 40, 20));

        lblMun.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblMun.setForeground(new java.awt.Color(51, 105, 191));
        lblMun.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMun.setText("Município");
        painelPrincipal.add(lblMun, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 70, 20));

        lblLgr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblLgr.setForeground(new java.awt.Color(51, 105, 191));
        lblLgr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLgr.setText("Logradouro");
        painelPrincipal.add(lblLgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 20));

        lblNro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNro.setForeground(new java.awt.Color(51, 105, 191));
        lblNro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNro.setText("Nº");
        painelPrincipal.add(lblNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 30, 20));

        lblCpl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCpl.setForeground(new java.awt.Color(51, 105, 191));
        lblCpl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCpl.setText("Complemento");
        painelPrincipal.add(lblCpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 20));

        lblBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(51, 105, 191));
        lblBairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBairro.setText("Bairro");
        painelPrincipal.add(lblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 50, 20));

        lblContato.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblContato.setForeground(new java.awt.Color(51, 105, 191));
        lblContato.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContato.setText("Contato");
        painelPrincipal.add(lblContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, 20));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 105, 191));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email");
        painelPrincipal.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 100, 20));

        IE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        IE.setForeground(new java.awt.Color(51, 105, 191));
        IE.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IE.setText("IE");
        painelPrincipal.add(IE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 100, 20));

        ISUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ISUF.setForeground(new java.awt.Color(51, 105, 191));
        ISUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ISUF.setText("I. SUFRAMA");
        painelPrincipal.add(ISUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 100, 20));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 20));

        txtFornecedor.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFornecedor.setText("Fornecedor");
        txtFornecedor.setToolTipText("Marque caso ele seja também um fornecedor.");
        txtFornecedor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtFornecedor.setOpaque(false);
        painelPrincipal.add(txtFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 120, 20));

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
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
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
        painelPrincipal.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 110, 20));

        txtUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SC", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SE", "TO" }));
        txtUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUFActionPerformed(evt);
            }
        });
        painelPrincipal.add(txtUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 70, 20));

        txtMun.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        painelPrincipal.add(txtMun, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 280, 20));

        txtLgr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtLgr.setToolTipText("Nome fantasia");
        txtLgr.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtLgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 510, 20));

        txtNro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNro.setToolTipText("Nome fantasia");
        txtNro.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 50, 20));

        txtComplemento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtComplemento.setToolTipText("Nome fantasia");
        txtComplemento.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 320, 20));

        txtBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBairro.setToolTipText("Nome fantasia");
        txtBairro.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 220, 20));

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 540, 20));

        txtIE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIE.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 170, 20));

        txtISUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtISUF.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtISUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 170, 20));

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
        painelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 750, 10));
        painelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 750, 10));

        try {
            txtContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato1.setToolTipText("Telefone");
        txtContato1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtContato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 140, -1));

        try {
            txtContato2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato2.setToolTipText("Celular 1");
        txtContato2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtContato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 140, -1));

        try {
            txtContato3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato3.setToolTipText("Celular 2");
        txtContato3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtContato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 140, -1));

        jScrollPane.setViewportView(painelPrincipal);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 750, 430));

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Editando cliente");
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
        limpaCampos();
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int fornecedor;
        if (txtFornecedor.isSelected()) {
            fornecedor = 1;
        } else {
            fornecedor = 0;
        }
        //cnpj
        String cnpj;
        if (sldPessoa.getValue()==fisica) {
            cnpj = txtCPF.getText();
        } else {
            cnpj = txtCNPJ.getText();
        }
        //Formatando cep
        String cep;
        cep = txtCEP.getText().replaceAll(".", "");
        cep = cep.replaceAll("-", "");
        //Zerando valores int nulos
        if (txtNro.getText().equalsIgnoreCase("")) {
            txtNro.setText("0");
        }
        if (sldPessoa.getValue()==fisica & txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome!");
            txtNome.requestFocus();
        } else {
            if (sldPessoa.getValue()!=fisica & txtNome.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Preencha o nome!");
                txtNome.requestFocus();
            } else {
                if (sldPessoa.getValue()!=fisica & txtRazao.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Preencha a razão social!");
                    txtRazao.requestFocus();
                } else {
                    /*Salvamento das informações
                    cod,inativo,tipopessoa,cliente,fornecedor,cnpj,nome,xnome,xlgr,nro,xcpl,xbairro,xmun,uf,cep,xpais,fone1,fone2,fone3,ie,isuf,email
                    */
                    EntidadeModel em = new EntidadeModel();
                    em.setCod(Integer.parseInt(txtCodigo.getText()));
                    em.setTipoPessoa(sldPessoa.getValue());
                    em.setCliente(1);
                    em.setFornecedor(fornecedor);
                    em.setCNPJ(cnpj);
                    em.setNome(txtNome.getText());
                    em.setxNome(txtRazao.getText());
                    em.setxLgr(txtLgr.getText());
                    em.setNro(Integer.parseInt(txtNro.getText()));
                    em.setxCpl(txtComplemento.getText());
                    em.setxBairro(txtBairro.getText());
                    em.setxMun(txtMun.getSelectedItem().toString());
                    em.setUF(txtUF.getSelectedItem().toString());
                    em.setCEP(txtCEP.getText());
                    em.setxPais("BRASIL");
                    em.setFone1(txtContato1.getText());
                    em.setFone2(txtContato2.getText());
                    em.setFone3(txtContato3.getText());
                    em.setIE(txtIE.getText());
                    em.setISUF(txtISUF.getText());
                    em.setEmail(txtEmail.getText());
                    ec.alteraEntidade(em, em.getCod());
                    limpaCampos();
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtRazaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoActionPerformed
        
    }//GEN-LAST:event_txtRazaoActionPerformed

    private void txtUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUFActionPerformed
        preencheCidades();
    }//GEN-LAST:event_txtUFActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Look and feel">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {java.util.logging.Logger.getLogger(EditarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IE;
    private javax.swing.JLabel ISUF;
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
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
    private javax.swing.JFormattedTextField txtContato3;
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
