package view.cadastros.produtos;

import controller.cadastros.produtos.GrupoController;
import controller.cadastros.produtos.ProdutoController;
import controller.funcoes.PesquisarController;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.cadastros.produtos.ProdutoModel;
import model.fiscal.TributacaoModel;

public class NovoProduto extends javax.swing.JFrame {
    ProdutoController pc = new ProdutoController();
    PesquisarController pec = new PesquisarController();
    String pesquisaAtual;
    
    private static final NovoProduto INSTANCIA = new NovoProduto();
    
    
    public static NovoProduto getInstancia() {
        return INSTANCIA;
    }

    private NovoProduto() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void limpaCampos(){
        txtCodigo.setText("");
        txtEAN.setText("");
        txtNome.setText("");
        txtPreco.setText("0,00");
        txtCusto.setText("0,00");
        txtNCM.setText("");
        txtCEST.setText("");
        txtTributacao.setText("");
        txtTributacao2.setText("");
        txtCodigo.requestFocus();
    }
    
    public void preencheGrupos() {
        GrupoController lc = new GrupoController();
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(lc.listaNomeGrupos().toArray());
        txtGrupo.setModel(defaultComboBox);
    }
    
    public void listarTributacoes() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (TributacaoModel e : pec.listaTributacao(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                e.getCod(),
                e.getDescricao()});
        }
    }
    public void buscarTributacao() {
        if (txtTributacao.getText().matches("[0-9]+")) {
            TributacaoModel em = new TributacaoModel();
            pec.buscarTributacao(em, txtTributacao.getText());
            txtTributacao.setText(em.getCod());
            txtTributacao2.setText(em.getDescricao());
        } else {
            if (txtTributacao.getText().isEmpty()) {
                txtTributacao2.setText("");
            }
            pesquisar.setVisible(true);
            pesquisaAtual = "tributacoes";
            lblTituloPesquisa.setText("Tributações");
            listarTributacoes();
            txtPesquisa.setText(txtTributacao.getText());
            pesquisar.setLocation(this.getX(), this.getY());
            pesquisar.setSize(this.getSize());
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
        btnSelecionar = new javax.swing.JLabel();
        lblTituloPesquisa = new javax.swing.JLabel();
        lblTítulo = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cbxServico = new javax.swing.JCheckBox();
        lblEAN = new javax.swing.JLabel();
        txtEAN = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblGrupo = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JComboBox<>();
        lblUN = new javax.swing.JLabel();
        txtUN = new javax.swing.JComboBox<>();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JFormattedTextField();
        lblCusto = new javax.swing.JLabel();
        txtCusto = new javax.swing.JFormattedTextField();
        cbxServico1 = new javax.swing.JCheckBox();
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
        painelTributacao = new javax.swing.JPanel();
        lblNCM1 = new javax.swing.JLabel();
        txtTributacao = new javax.swing.JTextField();
        txtTributacao2 = new javax.swing.JTextField();

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
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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

        btnSelecionar.setBackground(new java.awt.Color(102, 153, 255));
        btnSelecionar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSelecionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSelecionar.setText("Selecionar");
        btnSelecionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelecionar.setOpaque(true);
        btnSelecionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSelecionarMouseReleased(evt);
            }
        });

        lblTituloPesquisa.setBackground(new java.awt.Color(153, 153, 153));
        lblTituloPesquisa.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTituloPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPesquisa.setText("TITULO");
        lblTituloPesquisa.setOpaque(true);

        javax.swing.GroupLayout planoDeFundo1Layout = new javax.swing.GroupLayout(planoDeFundo1);
        planoDeFundo1.setLayout(planoDeFundo1Layout);
        planoDeFundo1Layout.setHorizontalGroup(
            planoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(planoDeFundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(planoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisa))
                .addContainerGap())
            .addComponent(lblTituloPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        planoDeFundo1Layout.setVerticalGroup(
            planoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoDeFundo1Layout.createSequentialGroup()
                .addComponent(lblTituloPesquisa)
                .addGap(10, 10, 10)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pesquisarLayout = new javax.swing.GroupLayout(pesquisar.getContentPane());
        pesquisar.getContentPane().setLayout(pesquisarLayout);
        pesquisarLayout.setHorizontalGroup(
            pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(planoDeFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pesquisarLayout.setVerticalGroup(
            pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(planoDeFundo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produto");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTítulo.setBackground(new java.awt.Color(51, 105, 191));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Novo Produto / Serviço");
        lblTítulo.setOpaque(true);
        getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 30));

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código");
        painelPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 20));

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

        cbxServico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxServico.setForeground(new java.awt.Color(51, 51, 51));
        cbxServico.setText("Serviço ?");
        cbxServico.setOpaque(false);
        cbxServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbxServicoMouseReleased(evt);
            }
        });
        painelPrincipal.add(cbxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 100, 20));

        lblEAN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEAN.setForeground(new java.awt.Color(51, 105, 191));
        lblEAN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEAN.setText("Código de Barras");
        painelPrincipal.add(lblEAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 150, 20));

        txtEAN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEAN.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtEAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 200, -1));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 105, 191));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome");
        painelPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 20));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 630, 20));

        lblGrupo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblGrupo.setForeground(new java.awt.Color(51, 105, 191));
        lblGrupo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGrupo.setText("Grupo");
        painelPrincipal.add(lblGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));

        txtGrupo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelPrincipal.add(txtGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 330, 20));

        lblUN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUN.setForeground(new java.awt.Color(51, 105, 191));
        lblUN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUN.setText("Unidade de medida");
        painelPrincipal.add(lblUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 190, 20));

        txtUN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UN", "PC", "HR" }));
        painelPrincipal.add(txtUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 80, 20));

        lblPreco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(51, 105, 191));
        lblPreco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPreco.setText("Preço");
        painelPrincipal.add(lblPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 30));

        txtPreco.setForeground(new java.awt.Color(0, 153, 0));
        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPreco.setText("0,00");
        txtPreco.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        painelPrincipal.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 30));

        lblCusto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCusto.setForeground(new java.awt.Color(51, 105, 191));
        lblCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCusto.setText("Custo");
        painelPrincipal.add(lblCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 70, 30));

        txtCusto.setForeground(new java.awt.Color(204, 0, 51));
        txtCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtCusto.setText("0,00");
        txtCusto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustoActionPerformed(evt);
            }
        });
        painelPrincipal.add(txtCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 100, 30));

        cbxServico1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxServico1.setForeground(new java.awt.Color(51, 51, 51));
        cbxServico1.setText("Controlar estoque");
        cbxServico1.setOpaque(false);
        cbxServico1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbxServico1MouseReleased(evt);
            }
        });
        painelPrincipal.add(cbxServico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 180, -1));

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
        painelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 80, 40));

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
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 80, 40));

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
        txtNCM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNCMActionPerformed(evt);
            }
        });
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
        txtCEST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCESTActionPerformed(evt);
            }
        });
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

        painelTributacao.setBackground(new java.awt.Color(255, 255, 255));
        painelTributacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tributação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        painelTributacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNCM1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNCM1.setForeground(new java.awt.Color(51, 105, 191));
        lblNCM1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNCM1.setText("Tributação");
        painelTributacao.add(lblNCM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 20));

        txtTributacao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTributacao.setPreferredSize(new java.awt.Dimension(200, 20));
        txtTributacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTributacaoActionPerformed(evt);
            }
        });
        txtTributacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTributacaoKeyReleased(evt);
            }
        });
        painelTributacao.add(txtTributacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, 20));

        txtTributacao2.setEditable(false);
        txtTributacao2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTributacao2.setFocusable(false);
        txtTributacao2.setPreferredSize(new java.awt.Dimension(200, 20));
        txtTributacao2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTributacao2KeyReleased(evt);
            }
        });
        painelTributacao.add(txtTributacao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 520, 20));

        painelInformacoesFiscais.add(painelTributacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 730, 120));

        painelAbas.addTab("Informações fiscais", painelInformacoesFiscais);

        painelPrincipal.add(painelAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 760, 220));

        getContentPane().add(painelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 760, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome!");
        } else {
            if (txtPreco.getText().equalsIgnoreCase("") || txtPreco.getText().equalsIgnoreCase("0,00")) {
                JOptionPane.showMessageDialog(null, "Verifique o preço!");
            } else {
                ProdutoModel pm = new ProdutoModel();
                pm.setCod(Integer.parseInt(txtCodigo.getText()));
                if (cbxServico.isSelected()) {
                    pm.setServico(true);
                } else {
                    pm.setServico(false);
                }
                pm.setCodigoBarras(txtEAN.getText());
                pm.setNome(txtNome.getText());
                pm.setInativo(false);
                pm.setGrupo(txtGrupo.getSelectedItem().toString());
                pm.setUnidadeMedida(txtUN.getSelectedItem().toString());
                pm.setEstoque(0);
                pm.setPreco(Double.parseDouble(txtPreco.getText().replaceAll(",", ".")));
                pm.setCusto(Double.parseDouble(txtCusto.getText().replaceAll(",", ".")));
                pm.setNcm(txtNCM.getText());
                pm.setCest(txtCEST.getText());
                pm.setTributacao(txtTributacao.getText());
                pm.setTributacaonome(txtTributacao2.getText());
                pc.cadastraProduto(pm);
                limpaCampos();
                txtCodigo.setText(Integer.toString(pc.pegaCodigo()));
                txtNome.requestFocus();
            }
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

    private void cbxServicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxServicoMouseReleased
        if (cbxServico.isSelected()) {
            txtEAN.setEnabled(false);
            lblNCM.setText("NBS");
        } else {
            txtEAN.setEnabled(true);
            lblNCM.setText("NCM");
        }
    }//GEN-LAST:event_cbxServicoMouseReleased

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

    private void txtCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustoActionPerformed

    private void txtCESTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCESTActionPerformed
            
    }//GEN-LAST:event_txtCESTActionPerformed

    private void txtNCMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNCMActionPerformed
        
    }//GEN-LAST:event_txtNCMActionPerformed

    private void txtTributacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTributacaoActionPerformed
        buscarTributacao();
    }//GEN-LAST:event_txtTributacaoActionPerformed

    private void txtTributacaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTributacaoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTributacaoKeyReleased

    private void txtTributacao2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTributacao2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTributacao2KeyReleased

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        if (pesquisaAtual.equalsIgnoreCase("tributacoes")) {
            listarTributacoes();
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

    private void btnSelecionarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecionarMouseReleased
        if (pesquisaAtual.equalsIgnoreCase("tributacoes")) {
            if (tabela.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(null, "Nenhuma tributação!");
            } else {
                txtTributacao.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
                txtTributacao2.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
                pesquisar.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnSelecionarMouseReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        limpaCampos();
    }//GEN-LAST:event_formWindowClosed

    private void cbxServico1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxServico1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxServico1MouseReleased

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
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel btnSelecionar;
    private javax.swing.JCheckBox cbxServico;
    private javax.swing.JCheckBox cbxServico1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCusto;
    private javax.swing.JLabel lblEAN;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblNCM;
    private javax.swing.JLabel lblNCM1;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTituloPesquisa;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUN;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel painelInformacoesFiscais;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelTributacao;
    private javax.swing.JDialog pesquisar;
    private javax.swing.JPanel planoDeFundo1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCEST;
    private javax.swing.JTextField txtCESTdescricao;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCusto;
    private javax.swing.JTextField txtEAN;
    private javax.swing.JComboBox<String> txtGrupo;
    private javax.swing.JTextField txtNCM;
    private javax.swing.JTextField txtNCMdescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JTextField txtTributacao;
    private javax.swing.JTextField txtTributacao2;
    private javax.swing.JComboBox<String> txtUN;
    // End of variables declaration//GEN-END:variables
}