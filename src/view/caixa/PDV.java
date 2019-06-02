package view.caixa;

import controller.funcoes.PesquisarController;
import controller.vendas.VendasController;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.placa.PlacaModel;
import model.cadastros.produtos.ProdutoModel;

public class PDV extends javax.swing.JFrame{
    VendasController vc = new VendasController();
    PesquisarController pc = new PesquisarController();
    String pesquisaAtual;
    String situacaoCaixa;
    
    private static final PDV INSTANCIA = new PDV();

    public static PDV getInstancia() {
        return INSTANCIA;
    }
    
    public PDV() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        icone();
    }
    public void icone() {
        URL url = this.getClass().getResource("/images/icon.ico");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }
    //Açõs do caixa
    public void inicializar(String operacao, String usuario){
        painelVenda.setVisible(true);
        setBotoes("inicio");
        lblTitulo.setText("CAIXA LIVRE");
        lblLogadoComo.setText("Logado como: "+usuario);
        lblTituloValoresCaixa.setText(operacao);
        btnValoresCaixa.setText(operacao);
        valorescaixa.setVisible(true);
        valorescaixa.setSize(200, 200);
    }
    public void setBotoes(String tela){
        if (tela.equalsIgnoreCase("inicio")) {
            F1.setText("\nF1\nVenda");
            F2.setText("\nF2\nOrçamentos");
            F3.setText("\nF3\nClientes");
            F4.setText("\nF4\nConsulta");
            F5.setText("\nF5\nCaixa");
            F6.setText("\nF6\nSaídas");
            F7.setText("\nF7\nEntradas");
            F8.setText("\nF8\nFechamento");
        }
        if (tela.equalsIgnoreCase("venda")) {
            F1.setText("\nF1\nDinheiro");
            F2.setText("\nF2\nProduto");
            F3.setText("\nF3\nCliente");
            F4.setText("\nF4\nCancelar item");
            F5.setText("\nF5\nSubtotal");
            F6.setText("\nF6\nCancelar venda");
            F7.setText("");
            F8.setText("");
        }
        
    }
    public void abrirVenda(){
        setBotoes("venda");
        painelVenda.setVisible(true);
        lblTitulo.setText("NOVA VENDA");
    }
    public void cancelarVenda(){
        if (JOptionPane.showConfirmDialog(null, "Cancelar a venda em aberto?\nFormulários não salvos podem ser perdidos",
                "Cancelar venda em aberto", 2) == 0) {
            setBotoes("inicio");
            painelVenda.setVisible(false);
            lblTitulo.setText("CAIXA LIVRE");
        }
    }
    //Pesquisar
    public void listarClientes() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (EntidadeModel e : pc.listaClientes(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                e.getCod(),
                e.getxNome(),
                e.getCNPJ(),});
        }
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

    public void listarProdutos() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (ProdutoModel p : pc.listaProdutos(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                p.getCod(),
                p.getNome(),
                p.getPreco(),});
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisar = new javax.swing.JDialog();
        backgroundPesquisa = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnSelecionarPesquisa = new javax.swing.JLabel();
        lblTituloPesquisa = new javax.swing.JLabel();
        valorescaixa = new javax.swing.JDialog();
        backgroundPesquisa1 = new javax.swing.JPanel();
        btnValoresCaixa = new javax.swing.JLabel();
        lblTituloValoresCaixa = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTotaldeVendas = new javax.swing.JFormattedTextField();
        txtFundoAtual1 = new javax.swing.JFormattedTextField();
        txtSuprimento1 = new javax.swing.JFormattedTextField();
        txtSangria1 = new javax.swing.JFormattedTextField();
        background = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        painelVenda = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblTitulo12 = new javax.swing.JLabel();
        txtValorBruto = new javax.swing.JFormattedTextField();
        txtTotalDescontos = new javax.swing.JFormattedTextField();
        txtTotal = new javax.swing.JFormattedTextField();
        painelBotoes = new javax.swing.JPanel();
        F1 = new javax.swing.JTextArea();
        F2 = new javax.swing.JTextArea();
        F3 = new javax.swing.JTextArea();
        F4 = new javax.swing.JTextArea();
        F5 = new javax.swing.JTextArea();
        F6 = new javax.swing.JTextArea();
        F7 = new javax.swing.JTextArea();
        F8 = new javax.swing.JTextArea();
        lblLogadoComo = new javax.swing.JLabel();

        backgroundPesquisa.setBackground(new java.awt.Color(255, 255, 255));

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

        lblTituloPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTituloPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPesquisa.setText("Pesquisa");

        javax.swing.GroupLayout backgroundPesquisaLayout = new javax.swing.GroupLayout(backgroundPesquisa);
        backgroundPesquisa.setLayout(backgroundPesquisaLayout);
        backgroundPesquisaLayout.setHorizontalGroup(
            backgroundPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
            .addGroup(backgroundPesquisaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSelecionarPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesquisa))
                .addContainerGap())
            .addComponent(lblTituloPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgroundPesquisaLayout.setVerticalGroup(
            backgroundPesquisaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPesquisaLayout.createSequentialGroup()
                .addComponent(lblTituloPesquisa)
                .addGap(10, 10, 10)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionarPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pesquisarLayout = new javax.swing.GroupLayout(pesquisar.getContentPane());
        pesquisar.getContentPane().setLayout(pesquisarLayout);
        pesquisarLayout.setHorizontalGroup(
            pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(backgroundPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        pesquisarLayout.setVerticalGroup(
            pesquisarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pesquisarLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(backgroundPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        backgroundPesquisa1.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPesquisa1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnValoresCaixa.setBackground(new java.awt.Color(102, 153, 255));
        btnValoresCaixa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnValoresCaixa.setForeground(new java.awt.Color(255, 255, 255));
        btnValoresCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnValoresCaixa.setText("Operação");
        btnValoresCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValoresCaixa.setOpaque(true);
        btnValoresCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnValoresCaixaMouseReleased(evt);
            }
        });
        backgroundPesquisa1.add(btnValoresCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 357, 30));

        lblTituloValoresCaixa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTituloValoresCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloValoresCaixa.setText("Operação");
        backgroundPesquisa1.add(lblTituloValoresCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 377, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuário");
        backgroundPesquisa1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 350, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fundo atual");
        backgroundPesquisa1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 100, 26));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Suprimento");
        backgroundPesquisa1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 100, 26));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Sangria");
        backgroundPesquisa1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 100, 26));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Total de vendas");
        backgroundPesquisa1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 26));

        txtTotaldeVendas.setEditable(false);
        txtTotaldeVendas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotaldeVendas.setText("0,00");
        txtTotaldeVendas.setToolTipText("Total descontos");
        txtTotaldeVendas.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtTotaldeVendas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotaldeVendasFocusLost(evt);
            }
        });
        txtTotaldeVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotaldeVendasActionPerformed(evt);
            }
        });
        backgroundPesquisa1.add(txtTotaldeVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 100, -1));

        txtFundoAtual1.setEditable(false);
        txtFundoAtual1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtFundoAtual1.setText("0,00");
        txtFundoAtual1.setToolTipText("Total descontos");
        txtFundoAtual1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtFundoAtual1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFundoAtual1FocusLost(evt);
            }
        });
        txtFundoAtual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundoAtual1ActionPerformed(evt);
            }
        });
        backgroundPesquisa1.add(txtFundoAtual1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 100, -1));

        txtSuprimento1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtSuprimento1.setText("0,00");
        txtSuprimento1.setToolTipText("Total descontos");
        txtSuprimento1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtSuprimento1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSuprimento1FocusLost(evt);
            }
        });
        txtSuprimento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuprimento1ActionPerformed(evt);
            }
        });
        backgroundPesquisa1.add(txtSuprimento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 100, -1));

        txtSangria1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtSangria1.setText("0,00");
        txtSangria1.setToolTipText("Total descontos");
        txtSangria1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtSangria1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSangria1FocusLost(evt);
            }
        });
        txtSangria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSangria1ActionPerformed(evt);
            }
        });
        backgroundPesquisa1.add(txtSangria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, -1));

        javax.swing.GroupLayout valorescaixaLayout = new javax.swing.GroupLayout(valorescaixa.getContentPane());
        valorescaixa.getContentPane().setLayout(valorescaixaLayout);
        valorescaixaLayout.setHorizontalGroup(
            valorescaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPesquisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        valorescaixaLayout.setVerticalGroup(
            valorescaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valorescaixaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(backgroundPesquisa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ponto de venda");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setFocusable(false);

        txtInput.setBackground(new java.awt.Color(102, 102, 102));
        txtInput.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtInput.setForeground(new java.awt.Color(255, 255, 255));
        txtInput.setToolTipText("Entrada de dados");
        txtInput.setCaretColor(new java.awt.Color(255, 255, 255));
        txtInput.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtInput.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });
        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputKeyReleased(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CAIXA LIVRE");
        lblTitulo.setFocusable(false);
        lblTitulo.setOpaque(true);

        painelVenda.setBackground(new java.awt.Color(204, 204, 204));

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        tblProdutos.setBackground(new java.awt.Color(204, 204, 204));
        tblProdutos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Valor un.", "Desconto", "Qtd.", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.setToolTipText("Tabela de produtos");
        tblProdutos.setFocusable(false);
        tblProdutos.setGridColor(new java.awt.Color(204, 204, 204));
        tblProdutos.setOpaque(false);
        tblProdutos.setRowHeight(20);
        tblProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblProdutos);

        lblTitulo12.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblTitulo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo12.setText("Totais");

        txtValorBruto.setEditable(false);
        txtValorBruto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorBruto.setText("0,00");
        txtValorBruto.setToolTipText("Total bruto");
        txtValorBruto.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        txtTotalDescontos.setEditable(false);
        txtTotalDescontos.setForeground(new java.awt.Color(204, 0, 51));
        txtTotalDescontos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalDescontos.setText("0,00");
        txtTotalDescontos.setToolTipText("Total descontos");
        txtTotalDescontos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtTotalDescontos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalDescontosFocusLost(evt);
            }
        });
        txtTotalDescontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalDescontosActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setForeground(new java.awt.Color(51, 153, 0));
        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotal.setText("0,00");
        txtTotal.setToolTipText("Total");
        txtTotal.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        javax.swing.GroupLayout painelVendaLayout = new javax.swing.GroupLayout(painelVenda);
        painelVenda.setLayout(painelVendaLayout);
        painelVendaLayout.setHorizontalGroup(
            painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelVendaLayout.createSequentialGroup()
                        .addComponent(lblTitulo12, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        painelVendaLayout.setVerticalGroup(
            painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendaLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(txtTotalDescontos)
                        .addComponent(txtTotal)
                        .addComponent(txtValorBruto)))
                .addContainerGap())
        );

        painelBotoes.setOpaque(false);
        painelBotoes.setLayout(new java.awt.GridLayout(1, 8));

        F1.setEditable(false);
        F1.setColumns(20);
        F1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F1.setRows(5);
        F1.setText("\nF1\nVenda");
        F1.setFocusable(false);
        F1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                F1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                F1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                F1MouseReleased(evt);
            }
        });
        painelBotoes.add(F1);

        F2.setEditable(false);
        F2.setColumns(20);
        F2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F2.setRows(5);
        F2.setText("\nF2\nOrçamentos");
        F2.setFocusable(false);
        F2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                F2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                F2MouseExited(evt);
            }
        });
        painelBotoes.add(F2);

        F3.setEditable(false);
        F3.setColumns(20);
        F3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F3.setRows(5);
        F3.setText("\nF3\nClientes");
        F3.setFocusable(false);
        painelBotoes.add(F3);

        F4.setEditable(false);
        F4.setColumns(20);
        F4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F4.setRows(5);
        F4.setText("\nF4\nConsultar");
        F4.setFocusable(false);
        painelBotoes.add(F4);

        F5.setEditable(false);
        F5.setColumns(20);
        F5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F5.setRows(5);
        F5.setText("\nF5\nCaixa");
        F5.setFocusable(false);
        painelBotoes.add(F5);

        F6.setEditable(false);
        F6.setColumns(20);
        F6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F6.setRows(5);
        F6.setText("\nF6\nSaídas");
        F6.setFocusable(false);
        painelBotoes.add(F6);

        F7.setEditable(false);
        F7.setColumns(20);
        F7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F7.setRows(5);
        F7.setText("\nF7\nEntradas");
        F7.setFocusable(false);
        painelBotoes.add(F7);

        F8.setEditable(false);
        F8.setColumns(20);
        F8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F8.setRows(5);
        F8.setText("\nF8\nFechamento");
        F8.setFocusable(false);
        painelBotoes.add(F8);

        lblLogadoComo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblLogadoComo.setText("Logado como:");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 481, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(lblLogadoComo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(painelVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(lblLogadoComo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        if (txtInput.getText().matches("[0-9]+")) {
            if (txtInput.getText().equalsIgnoreCase("")) {
            } else {
                if (Integer.parseInt(txtInput.getText()) > 0) {
                    if (true) {
                        
                        
                    } else {
                        
                        
                    }
                }
            }
        }
        if (txtInput.getText().matches("[A-Za-z]+")) {
            System.out.println("letra");
            if (txtInput.getText().equalsIgnoreCase("")) {
            } else {
            }
        }
        if (txtInput.getText().equalsIgnoreCase("")) {
            
        }
        txtInput.setText("");
    }//GEN-LAST:event_txtInputActionPerformed

    private void txtInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            if (lblTitulo.getText().equalsIgnoreCase("Caixa livre")) {
                abrirVenda();
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            System.out.println("F2");
        }
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            System.out.println("F3");
        }
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            System.out.println("F4");
        }
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            System.out.println("F5");
        }
        if (evt.getKeyCode() == KeyEvent.VK_F6) {
            System.out.println("F6");
        }
        if (evt.getKeyCode() == KeyEvent.VK_F7) {
            System.out.println("F7");
        }
        if (evt.getKeyCode() == KeyEvent.VK_F8) {
            System.out.println("F8");
        }
    }//GEN-LAST:event_txtInputKeyReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtInput.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtInput.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        if (pesquisaAtual.equalsIgnoreCase("clientes")) {
            listarClientes();
        }
        if (pesquisaAtual.equalsIgnoreCase("placa")) {
            listarPlacas();
        }
        if (pesquisaAtual.equalsIgnoreCase("produtos")) {
            listarProdutos();
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
//        if (pesquisaAtual.equalsIgnoreCase("clientes")) {
//            if (tabela.getSelectedRow() < 0) {
//                JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado!");
//            } else {
//                txtCliente.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
//                txtCliente2.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
//                pesquisar.setVisible(false);
//                txtPlaca.requestFocus();
//            }
//        }
//        if (pesquisaAtual.equalsIgnoreCase("placa")) {
//            if (tabela.getSelectedRow() < 0) {
//                JOptionPane.showMessageDialog(null, "Nenhuma placa selecionada!");
//            } else {
//                txtPlaca.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
//                txtPlaca2.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
//                pesquisar.setVisible(false);
//                txtProduto.requestFocus();
//            }
//        }
//        if (pesquisaAtual.equalsIgnoreCase("produtos")) {
//            if (tabela.getSelectedRow() < 0) {
//                JOptionPane.showMessageDialog(null, "Nenhum produto selecionado!");
//            } else {
//                txtProduto.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
//                txtDescricaoProduto.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
//                txtValorUnitarioProduto.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString().replace(".", ","));
//                txtValorDescontoProduto.setText("0,00");
//                txtQuantidadeProduto.setText("0");
//                pesquisar.setVisible(false);
//                txtValorUnitarioProduto.requestFocus();
//            }
//        }
    }//GEN-LAST:event_btnSelecionarPesquisaMouseReleased

    private void txtTotalDescontosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalDescontosFocusLost

    }//GEN-LAST:event_txtTotalDescontosFocusLost

    private void txtTotalDescontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalDescontosActionPerformed

    }//GEN-LAST:event_txtTotalDescontosActionPerformed

    private void F1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F1MouseEntered
        F1.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_F1MouseEntered

    private void F1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F1MouseExited
        F1.setBackground(Color.WHITE);
    }//GEN-LAST:event_F1MouseExited

    private void F2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F2MouseEntered
        F2.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_F2MouseEntered

    private void F2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F2MouseExited
        F2.setBackground(Color.WHITE);
    }//GEN-LAST:event_F2MouseExited

    private void btnValoresCaixaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValoresCaixaMouseReleased
        if (lblTituloValoresCaixa.getText().equalsIgnoreCase("Fechar caixa")) {
            
        }
        if (lblTituloValoresCaixa.getText().equalsIgnoreCase("Abrir caixa")) {
            
        }
    }//GEN-LAST:event_btnValoresCaixaMouseReleased

    private void txtTotaldeVendasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotaldeVendasFocusLost

    }//GEN-LAST:event_txtTotaldeVendasFocusLost

    private void txtTotaldeVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotaldeVendasActionPerformed

    }//GEN-LAST:event_txtTotaldeVendasActionPerformed

    private void txtFundoAtual1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFundoAtual1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundoAtual1FocusLost

    private void txtFundoAtual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundoAtual1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundoAtual1ActionPerformed

    private void txtSuprimento1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSuprimento1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuprimento1FocusLost

    private void txtSuprimento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuprimento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuprimento1ActionPerformed

    private void txtSangria1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSangria1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSangria1FocusLost

    private void txtSangria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSangria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSangria1ActionPerformed

    private void F1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F1MouseReleased
        abrirVenda();
    }//GEN-LAST:event_F1MouseReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea F1;
    private javax.swing.JTextArea F2;
    private javax.swing.JTextArea F3;
    private javax.swing.JTextArea F4;
    private javax.swing.JTextArea F5;
    private javax.swing.JTextArea F6;
    private javax.swing.JTextArea F7;
    private javax.swing.JTextArea F8;
    private javax.swing.JPanel background;
    private javax.swing.JPanel backgroundPesquisa;
    private javax.swing.JPanel backgroundPesquisa1;
    private javax.swing.JLabel btnSelecionarPesquisa;
    private javax.swing.JLabel btnValoresCaixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblLogadoComo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTituloPesquisa;
    private javax.swing.JLabel lblTituloValoresCaixa;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelVenda;
    private javax.swing.JDialog pesquisar;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JFormattedTextField txtFundoAtual1;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtSangria1;
    private javax.swing.JFormattedTextField txtSuprimento1;
    private javax.swing.JFormattedTextField txtTotal;
    private javax.swing.JFormattedTextField txtTotalDescontos;
    private javax.swing.JFormattedTextField txtTotaldeVendas;
    private javax.swing.JFormattedTextField txtValorBruto;
    private javax.swing.JDialog valorescaixa;
    // End of variables declaration//GEN-END:variables

}
