package view.cadastros.entidades;

import controller.cadastros.entidades.EntidadeController;
import controller.funcoes.LocalController;
import controller.funcoes.PesquisarController;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.placa.PlacaModel;
import view.TelaInicial;
import view.cadastros.placa.NovaPlaca;


public class NovoCliente extends javax.swing.JFrame {
    final int fisica = 0;
    EntidadeController ec = new EntidadeController();
    PesquisarController pc = new PesquisarController();
    String pesquisaAtual;

    private static final NovoCliente INSTANCIA = new NovoCliente();
    public static NovoCliente getInstancia() {
        return INSTANCIA;
    }

    private NovoCliente() {
        initComponents();
        setLocationRelativeTo(null);
        preencheCidades();
        buscaCodigo();
    }
    
    public void limpaCampos(){
        buscaCodigo();
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
    public void buscaCodigo(){
        txtCodigo.setText(Integer.toString(ec.pegaCodigo()));
    }
    public void listarPlacas() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (PlacaModel p : pc.listaPlacas(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                p.getCod(),
                p.getNome(),
                p.getNomecliente()
            });
        }
    }
    public void buscarPlaca() {
        PlacaModel pm = new PlacaModel();
        pc.buscarPlaca(pm, txtPlaca.getText());
        if (pm.getCod().isEmpty()) {

        } else {
            txtPlaca.setText(pm.getCod());
            txtPlaca2.setText(pm.getNome());
            txtPlaca2.setEnabled(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisar = new javax.swing.JDialog();
        planoDeFundo1 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnSelecionarPesquisa = new javax.swing.JLabel();
        lblTituloPesquisa = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        painelPrincipal = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblFisica = new javax.swing.JLabel();
        lblJuridica = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblRazao = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblCNPJ = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JCheckBox();
        sldPessoa = new javax.swing.JSlider();
        txtNome = new javax.swing.JTextField();
        txtRazao = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        btnDescartar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblCEP = new javax.swing.JLabel();
        lblUF = new javax.swing.JLabel();
        lblMun = new javax.swing.JLabel();
        lblLgr = new javax.swing.JLabel();
        lblNro = new javax.swing.JLabel();
        lblCpl = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        txtCEP = new javax.swing.JFormattedTextField();
        txtUF = new javax.swing.JComboBox<>();
        txtMun = new javax.swing.JComboBox<>();
        txtLgr = new javax.swing.JTextField();
        txtNro = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        lblContato = new javax.swing.JLabel();
        abaEndCont = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtContato1 = new javax.swing.JFormattedTextField();
        txtContato2 = new javax.swing.JFormattedTextField();
        txtContato3 = new javax.swing.JFormattedTextField();
        abaFiscal = new javax.swing.JPanel();
        txtISUF = new javax.swing.JTextField();
        ISUF = new javax.swing.JLabel();
        txtIE = new javax.swing.JTextField();
        IE = new javax.swing.JLabel();
        abaPlacas = new javax.swing.JPanel();
        txtPlaca = new javax.swing.JTextField();
        txtPlaca2 = new javax.swing.JTextField();
        btnNovaPlaca = new javax.swing.JButton();
        ISUF1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();

        planoDeFundo1.setBackground(new java.awt.Color(255, 255, 255));

        txtPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setFocusable(false);
        tabela.setGridColor(new java.awt.Color(204, 204, 204));
        tabela.setRowHeight(18);
        tabela.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tabela);

        btnSelecionarPesquisa.setBackground(new java.awt.Color(102, 153, 255));
        btnSelecionarPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSelecionarPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSelecionarPesquisa.setText("Selecionar");
        btnSelecionarPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelecionarPesquisa.setOpaque(true);
        btnSelecionarPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSelecionarPesquisaMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout planoDeFundo1Layout = new javax.swing.GroupLayout(planoDeFundo1);
        planoDeFundo1.setLayout(planoDeFundo1Layout);
        planoDeFundo1Layout.setHorizontalGroup(
            planoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
            .addGroup(planoDeFundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(planoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelecionarPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisa))
                .addContainerGap())
        );
        planoDeFundo1Layout.setVerticalGroup(
            planoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoDeFundo1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionarPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblTituloPesquisa.setBackground(new java.awt.Color(153, 153, 153));
        lblTituloPesquisa.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTituloPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPesquisa.setText("NOVO ORÇAMENTO");
        lblTituloPesquisa.setOpaque(true);

        javax.swing.GroupLayout pesquisarLayout = new javax.swing.GroupLayout(pesquisar.getContentPane());
        pesquisar.getContentPane().setLayout(pesquisarLayout);
        pesquisarLayout.setHorizontalGroup(
            pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTituloPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pesquisarLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(planoDeFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        pesquisarLayout.setVerticalGroup(
            pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarLayout.createSequentialGroup()
                .addComponent(lblTituloPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 266, Short.MAX_VALUE))
            .addGroup(pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pesquisarLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(planoDeFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Cliente");
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
        lblJuridica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblJuridica.setText("Jurídica");
        painelPrincipal.add(lblJuridica, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 100, 20));

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
        painelPrincipal.add(sldPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 30, 20));

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

        btnDescartar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDescartar.setText("Descartar");
        btnDescartar.setFocusable(false);
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, 30));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setFocusable(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 80, 30));

        jTabbedPane.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCEP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCEP.setForeground(new java.awt.Color(51, 105, 191));
        lblCEP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCEP.setText("CEP");
        jPanel1.add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        lblUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUF.setForeground(new java.awt.Color(51, 105, 191));
        lblUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUF.setText("UF");
        jPanel1.add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 40, 20));

        lblMun.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblMun.setForeground(new java.awt.Color(51, 105, 191));
        lblMun.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMun.setText("Município");
        jPanel1.add(lblMun, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 70, 20));

        lblLgr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblLgr.setForeground(new java.awt.Color(51, 105, 191));
        lblLgr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLgr.setText("Logradouro");
        jPanel1.add(lblLgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        lblNro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNro.setForeground(new java.awt.Color(51, 105, 191));
        lblNro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNro.setText("Nº");
        jPanel1.add(lblNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 30, 20));

        lblCpl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCpl.setForeground(new java.awt.Color(51, 105, 191));
        lblCpl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCpl.setText("Complemento");
        jPanel1.add(lblCpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        lblBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(51, 105, 191));
        lblBairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBairro.setText("Bairro");
        jPanel1.add(lblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 50, 20));

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, 20));

        txtUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SC", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SE", "TO" }));
        txtUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUFActionPerformed(evt);
            }
        });
        jPanel1.add(txtUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 70, 20));

        txtMun.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel1.add(txtMun, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 280, 20));

        txtLgr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtLgr.setToolTipText("Nome fantasia");
        txtLgr.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(txtLgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 510, -1));

        txtNro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNro.setToolTipText("Nome fantasia");
        txtNro.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(txtNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 50, -1));

        txtComplemento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtComplemento.setToolTipText("Nome fantasia");
        txtComplemento.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 320, -1));

        txtBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBairro.setToolTipText("Nome fantasia");
        txtBairro.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 220, -1));

        lblContato.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblContato.setForeground(new java.awt.Color(51, 105, 191));
        lblContato.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblContato.setText("Contato");
        jPanel1.add(lblContato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 20));

        abaEndCont.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        abaEndCont.setForeground(new java.awt.Color(51, 105, 191));
        abaEndCont.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        abaEndCont.setText("Email");
        jPanel1.add(abaEndCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, 20));

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 540, -1));

        try {
            txtContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato1.setToolTipText("Telefone");
        txtContato1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(txtContato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 140, -1));

        try {
            txtContato2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato2.setToolTipText("Celular 1");
        txtContato2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(txtContato2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 140, -1));

        try {
            txtContato3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato3.setToolTipText("Celular 2");
        txtContato3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel1.add(txtContato3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 140, -1));

        jTabbedPane.addTab("Endereço/Contato", jPanel1);

        abaFiscal.setOpaque(false);
        abaFiscal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtISUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtISUF.setPreferredSize(new java.awt.Dimension(200, 20));
        abaFiscal.add(txtISUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 170, -1));

        ISUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ISUF.setForeground(new java.awt.Color(51, 105, 191));
        ISUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ISUF.setText("I. SUFRAMA");
        abaFiscal.add(ISUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 100, 20));

        txtIE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtIE.setPreferredSize(new java.awt.Dimension(200, 20));
        abaFiscal.add(txtIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 170, -1));

        IE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        IE.setForeground(new java.awt.Color(51, 105, 191));
        IE.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IE.setText("IE");
        abaFiscal.add(IE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 20));

        jTabbedPane.addTab("Fiscal", abaFiscal);

        abaPlacas.setOpaque(false);
        abaPlacas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPlaca.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(51, 105, 191));
        txtPlaca.setPreferredSize(new java.awt.Dimension(200, 20));
        txtPlaca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlacaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlacaFocusLost(evt);
            }
        });
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlacaKeyReleased(evt);
            }
        });
        abaPlacas.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 100, -1));

        txtPlaca2.setEditable(false);
        txtPlaca2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPlaca2.setPreferredSize(new java.awt.Dimension(200, 20));
        abaPlacas.add(txtPlaca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 420, -1));

        btnNovaPlaca.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnNovaPlaca.setText("+");
        btnNovaPlaca.setToolTipText("Novo Cliente");
        btnNovaPlaca.setFocusable(false);
        btnNovaPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPlacaActionPerformed(evt);
            }
        });
        abaPlacas.add(btnNovaPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, 20));

        ISUF1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ISUF1.setForeground(new java.awt.Color(51, 105, 191));
        ISUF1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ISUF1.setText("Placa");
        abaPlacas.add(ISUF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 90, 20));

        txtObs.setColumns(20);
        txtObs.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtObs.setRows(4);
        txtObs.setToolTipText("Observações");
        jScrollPane1.setViewportView(txtObs);

        abaPlacas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 610, 140));

        jTabbedPane.addTab("Placas", abaPlacas);

        painelPrincipal.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 750, 240));

        jScrollPane.setViewportView(painelPrincipal);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 750, 460));

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
        limpaCampos();
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int fornecedor;
        if (txtFornecedor.isSelected()) {
            fornecedor = 1;
        } else {
            fornecedor = 0;
        }
        //Formatando cnpj
        String cnpj = "";
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
                    ec.cadastraEntidade(em);
                    limpaCampos();
                    em.limparModel();
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtRazaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRazaoActionPerformed
        
    }//GEN-LAST:event_txtRazaoActionPerformed

    private void txtUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUFActionPerformed
        preencheCidades();
    }//GEN-LAST:event_txtUFActionPerformed

    private void txtPlacaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaFocusGained
        txtPlaca2.setEnabled(true);
    }//GEN-LAST:event_txtPlacaFocusGained

    private void txtPlacaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlacaFocusLost
        if (txtPlaca.getText().equalsIgnoreCase("")) {

        } else {
            if (txtPlaca.getText().length() != 8) {
                JOptionPane.showMessageDialog(null, "Placa inválida");
                txtPlaca.setText("");
                txtPlaca.requestFocus();
            } else {
                buscarPlaca();
                txtPlaca2.setEnabled(false);
            }
        }
    }//GEN-LAST:event_txtPlacaFocusLost

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        pesquisar.setVisible(true);
        pesquisaAtual = "placa";
        lblTituloPesquisa.setText("Placas");
        listarPlacas();
        txtPesquisa.setText(txtPlaca.getText());
        pesquisar.setLocation(this.getX(), this.getY());
        pesquisar.setSize(this.getSize());
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void txtPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyReleased
        txtPlaca.setText(txtPlaca.getText().toUpperCase());
    }//GEN-LAST:event_txtPlacaKeyReleased

    private void btnNovaPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPlacaActionPerformed
        NovaPlaca novo = NovaPlaca.getInstancia();
        novo.setVisible(true);
    }//GEN-LAST:event_btnNovaPlacaActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        if (pesquisaAtual.equalsIgnoreCase("placa")) {
            listarPlacas();
        }
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            pesquisar.setVisible(false);
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            pesquisar.setVisible(false);
        }
    }//GEN-LAST:event_tabelaKeyReleased

    private void btnSelecionarPesquisaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecionarPesquisaMouseReleased
        if (pesquisaAtual.equalsIgnoreCase("placa")) {
            if (tabela.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(null, "Nenhuma placa selecionada!");
            } else {
                txtPlaca.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
                txtPlaca2.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
                pesquisar.setVisible(false);
                txtObs.requestFocus();
            }
        }
    }//GEN-LAST:event_btnSelecionarPesquisaMouseReleased

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
    private javax.swing.JLabel ISUF1;
    private javax.swing.JLabel abaEndCont;
    private javax.swing.JPanel abaFiscal;
    private javax.swing.JPanel abaPlacas;
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnNovaPlaca;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel btnSelecionarPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblContato;
    private javax.swing.JLabel lblCpl;
    private javax.swing.JLabel lblFisica;
    private javax.swing.JLabel lblJuridica;
    private javax.swing.JLabel lblLgr;
    private javax.swing.JLabel lblMun;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNro;
    private javax.swing.JLabel lblRazao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloPesquisa;
    private javax.swing.JLabel lblUF;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JDialog pesquisar;
    private javax.swing.JPanel planoDeFundo1;
    private javax.swing.JSlider sldPessoa;
    private javax.swing.JTable tabela;
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
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPlaca2;
    private javax.swing.JTextField txtRazao;
    private javax.swing.JComboBox<String> txtUF;
    // End of variables declaration//GEN-END:variables
}
