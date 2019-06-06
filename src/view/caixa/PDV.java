package view.caixa;

import controller.funcoes.PesquisarController;
import controller.vendas.CaixaController;
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
import model.financeiro.FormapagamentoModel;
import model.vendas.CaixaModel;
import model.vendas.VendasModel;

public class PDV extends javax.swing.JFrame{
    VendasController vc = new VendasController();
    PesquisarController pc = new PesquisarController();
    CaixaController cc = new CaixaController();
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
        valorescaixa.getClass().getResource("/images/icon.ico");
        pesquisar.getClass().getResource("/images/icon.ico");
        finalizarvenda.getClass().getResource("/images/icon.ico");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
        valorescaixa.setIconImage(iconeTitulo);
        finalizarvenda.setIconImage(iconeTitulo);
        pesquisar.setIconImage(iconeTitulo);
    }
    
    public void jDialogFV(String nomeFormapagamento){
        if (nomeFormapagamento.equalsIgnoreCase("dinheiro")) {
            txtFormapagamento.setText("1");
            txtFormapagamento2.setText(nomeFormapagamento);
        }
        valorescaixa.setLocationRelativeTo(null);
        valorescaixa.setLocation(valorescaixa.getX()-120, valorescaixa.getY()-100);
        valorescaixa.setSize(400, 320);
        valorescaixa.setVisible(true);
    }
    public void jDialogValoresCaixa(String title, String botao, String data, String usuario){
        valorescaixa.setTitle(title);
        btnValoresCaixa.setText(botao);
        lblDataValoresCaixa.setText(data);
        lblUsuarioValorescaixa.setText(usuario);
        valorescaixa.setVisible(true);
        valorescaixa.setLocationRelativeTo(null);
        valorescaixa.setLocation(valorescaixa.getX()-120, valorescaixa.getY()-100);
        valorescaixa.setSize(400, 320);
    }
    
//Ações do caixa
    public void inicializar(String usuario, int acao, String data){
        lblCliente.setVisible(false);
        txtCliente.setVisible(false);
        txtCliente2.setVisible(false);
        btnLimparCliente.setVisible(false);
        lblPlaca.setVisible(false);
        txtPlaca.setVisible(false);
        txtPlaca2.setVisible(false);
        btnLimparPlaca.setVisible(false);
        lblData.setText(data);
        setTela("inicio");
        lblTitulo.setText("CAIXA LIVRE");
        lblLogadoComo.setText("Logado como: "+usuario);
        
        //Novo caixa
        if (acao == 1) {
            jDialogValoresCaixa("Novo caixa", "Abrir novo caixa", data, usuario);
            lblFundoAtual.setVisible(false);
            txtFundoAtual.setVisible(false);
            lblSangria.setVisible(false);
            txtSangria.setVisible(false);
            lblTotaldeVendas.setVisible(false);
            txtTotaldeVendas.setVisible(false);
        }
        if (acao == 2) {
            jDialogValoresCaixa("Caixa já fechado", "Reabrir caixa", data, usuario);
            lblFundoAtual.setVisible(true);
            txtFundoAtual.setVisible(true);
            lblSangria.setVisible(false);
            txtSangria.setVisible(false);
            lblTotaldeVendas.setVisible(true);
            txtTotaldeVendas.setVisible(true);
        }
        if (acao == 3) {
            this.setVisible(true);
        }
        
    }
    public void setTela(String tela){
        if (tela.equalsIgnoreCase("inicio")) {
            lblTitulo.setText("CAIXA LIVRE");
            painelVenda.setVisible(false);
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
            lblTitulo.setText("NOVA VENDA");
            F1.setText("\nF1\nDinheiro");
            F2.setText("\nF2\nPlaca");
            F3.setText("\nF3\nCliente");
            F4.setText("\nF4\nCancelar item");
            F5.setText("\nF5\nSubtotal");
            F6.setText("\nF6\nCancelar venda");
            F7.setText("");
            F8.setText("");
        }
        if (tela.equalsIgnoreCase("caixa")) {
            lblTitulo.setText("CAIXA");
            F1.setText("\nF1\nSuprimento");
            F2.setText("\nF2\nSangria");
            F3.setText("");
            F4.setText("");
            F5.setText("");
            F6.setText("");
            F7.setText("");
            F8.setText("");
        }
    }
    public void abrirVenda(){
        setTela("venda");
        painelVenda.setVisible(true);
    }
    public void cancelarVenda(){
        if (JOptionPane.showConfirmDialog(null, "Cancelar a venda em aberto?\nFormulários não salvos podem ser perdidos",
                "Cancelar venda em aberto", 2) == 0) {
            setTela("inicio");
            painelVenda.setVisible(false);
        }
    }
    public void suprirSangrar(int operacao){
        if (operacao == 0){
            
        } 
        if (operacao == 1) {
            
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
    public void listarFormasPagamento() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (FormapagamentoModel e : pc.listaFormapagamento(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                e.getCod(),
                e.getNome(),
                e.isParcela()});
        }
    }
    public void listarOrcamentos() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (VendasModel e : pc.listaOrcamentos(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                e.getCod(),
                e.getNomecliente(),
                e.getValorTotal()});
        }
    }
    public void listarPlacas() {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (PlacaModel p : pc.listaPlacas(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                p.getCod(),
                p.getNome(),
                p.getNomecliente()});
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
    
    public void buscarCliente() {
        if (txtInput.getText().matches("[0-9]+")) {
            EntidadeModel em = new EntidadeModel();
            pc.buscarCliente(em, txtInput.getText());
            txtCliente.setText(Integer.toString(em.getCod()));
            txtCliente2.setText(em.getNome());
        } else {
            if (txtInput.getText().isEmpty()) {
                txtCliente2.setText("");
            }
            pesquisar.setVisible(true);
            pesquisaAtual = "clientes";
            lblTituloPesquisa.setText("Clientes");
            listarClientes();
            txtPesquisa.setText(txtInput.getText());
            pesquisar.setLocationRelativeTo(null);
            pesquisar.setLocation(pesquisar.getLocation().x-300,pesquisar.getLocation().y-30);
            pesquisar.setSize(600,300);
        }
    }
    public void buscarFormaPagamento() {
        if (txtInput.getText().matches("[0-9]+")) {
            FormapagamentoModel fp = new FormapagamentoModel();
            pc.buscarFormapagamento(fp, Integer.parseInt(txtFormapagamento.getText()));
            txtFormapagamento.setText(Integer.toString(fp.getCod()));
            txtFormapagamento2.setText(fp.getNome());
        } else {
            if (txtFormapagamento2.getText().isEmpty()) {
                txtPlaca2.setText("");
            }
            pesquisar.setVisible(true);
            pesquisaAtual = "formapagamento";
            lblTituloPesquisa.setText("Forma de pagamento");
            listarFormasPagamento();
            txtPesquisa.setText(txtFormapagamento.getText());
            pesquisar.setLocationRelativeTo(null);
            pesquisar.setLocation(pesquisar.getLocation().x-300,pesquisar.getLocation().y-30);
            pesquisar.setSize(600,300);
        }
    }
    
    public void buscarPlaca() {
        if (txtInput.getText().length()==8) {
            PlacaModel pl = new PlacaModel();
            pc.buscarPlaca(pl, txtInput.getText());
            txtPlaca.setText(pl.getCod());
            txtPlaca2.setText(pl.getNome());
        } else {
            if (txtInput.getText().isEmpty()) {
                txtPlaca2.setText("");
            }
            pesquisar.setVisible(true);
            pesquisaAtual = "placas";
            lblTituloPesquisa.setText("Placas");
            listarPlacas();
            txtPesquisa.setText(txtInput.getText());
            pesquisar.setLocationRelativeTo(null);
            pesquisar.setLocation(pesquisar.getLocation().x-300,pesquisar.getLocation().y-30);
            pesquisar.setSize(600,300);
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
        backgroundValoresCaixa = new javax.swing.JPanel();
        btnValoresCaixa = new javax.swing.JLabel();
        lblUsuarioValorescaixa = new javax.swing.JLabel();
        lblDataValoresCaixa = new javax.swing.JLabel();
        lblSuprimento = new javax.swing.JLabel();
        lblSangria = new javax.swing.JLabel();
        lblTotaldeVendas = new javax.swing.JLabel();
        txtTotaldeVendas = new javax.swing.JFormattedTextField();
        txtFundoAtual = new javax.swing.JFormattedTextField();
        txtSuprimento = new javax.swing.JFormattedTextField();
        txtSangria = new javax.swing.JFormattedTextField();
        lblFundoAtual = new javax.swing.JLabel();
        finalizarvenda = new javax.swing.JDialog();
        backgroundValoresCaixa1 = new javax.swing.JPanel();
        btnFinalizarVenda = new javax.swing.JLabel();
        lblDataValoresCaixa1 = new javax.swing.JLabel();
        lblTotaldeVendas1 = new javax.swing.JLabel();
        txtTotalFV = new javax.swing.JFormattedTextField();
        lblTotaldeVendas2 = new javax.swing.JLabel();
        txtDescontoFV = new javax.swing.JFormattedTextField();
        txtFormapagamento = new javax.swing.JTextField();
        txtFormapagamento2 = new javax.swing.JTextField();
        lblTotaldeVendas3 = new javax.swing.JLabel();
        txtClienteFinalizarVenda = new javax.swing.JTextField();
        txtCliente2FinalizarVenda = new javax.swing.JTextField();
        background = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        painelBotoes = new javax.swing.JPanel();
        F1 = new javax.swing.JTextArea();
        F2 = new javax.swing.JTextArea();
        F3 = new javax.swing.JTextArea();
        F4 = new javax.swing.JTextArea();
        F5 = new javax.swing.JTextArea();
        F6 = new javax.swing.JTextArea();
        F7 = new javax.swing.JTextArea();
        F8 = new javax.swing.JTextArea();
        txtInput = new javax.swing.JTextField();
        lblLogadoComo = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        painelVendaInferior = new javax.swing.JPanel();
        painelVenda = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtCliente2 = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtPlaca2 = new javax.swing.JTextField();
        btnLimparCliente = new javax.swing.JButton();
        btnLimparPlaca = new javax.swing.JButton();
        lblTitulo12 = new javax.swing.JLabel();
        txtValorBruto = new javax.swing.JFormattedTextField();
        txtTotalDescontos = new javax.swing.JFormattedTextField();
        txtTotal = new javax.swing.JFormattedTextField();
        lblOrcamento = new javax.swing.JLabel();
        txtOrcamento = new javax.swing.JTextField();
        txtOrcamento2 = new javax.swing.JTextField();
        btnLimparOrcamento = new javax.swing.JButton();
        lblFundoTroco = new javax.swing.JLabel();

        pesquisar.setTitle("Finalizar venda");

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
                "Código", "Nome", ""
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

        backgroundValoresCaixa.setBackground(new java.awt.Color(255, 255, 255));
        backgroundValoresCaixa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        backgroundValoresCaixa.add(btnValoresCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 357, 30));

        lblUsuarioValorescaixa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblUsuarioValorescaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioValorescaixa.setText("Usuário");
        backgroundValoresCaixa.add(lblUsuarioValorescaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 350, 40));

        lblDataValoresCaixa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDataValoresCaixa.setForeground(new java.awt.Color(51, 51, 51));
        lblDataValoresCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataValoresCaixa.setText("Fundo atual");
        lblDataValoresCaixa.setToolTipText("Data");
        backgroundValoresCaixa.add(lblDataValoresCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 350, 26));

        lblSuprimento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblSuprimento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSuprimento.setText("Suprimento");
        backgroundValoresCaixa.add(lblSuprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, 26));

        lblSangria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblSangria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSangria.setText("Sangria");
        backgroundValoresCaixa.add(lblSangria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 100, 26));

        lblTotaldeVendas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTotaldeVendas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotaldeVendas.setText("Total de vendas");
        backgroundValoresCaixa.add(lblTotaldeVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, 26));

        txtTotaldeVendas.setEditable(false);
        txtTotaldeVendas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotaldeVendas.setText("0,00");
        txtTotaldeVendas.setToolTipText("Total descontos");
        txtTotaldeVendas.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backgroundValoresCaixa.add(txtTotaldeVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 100, -1));

        txtFundoAtual.setEditable(false);
        txtFundoAtual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtFundoAtual.setText("0,00");
        txtFundoAtual.setToolTipText("Total descontos");
        txtFundoAtual.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtFundoAtual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFundoAtualFocusLost(evt);
            }
        });
        backgroundValoresCaixa.add(txtFundoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 100, -1));

        txtSuprimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtSuprimento.setText("0,00");
        txtSuprimento.setToolTipText("Total descontos");
        txtSuprimento.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backgroundValoresCaixa.add(txtSuprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 100, -1));

        txtSangria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtSangria.setText("0,00");
        txtSangria.setToolTipText("Total descontos");
        txtSangria.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backgroundValoresCaixa.add(txtSangria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 100, -1));

        lblFundoAtual.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFundoAtual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFundoAtual.setText("Fundo atual");
        backgroundValoresCaixa.add(lblFundoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 100, 26));

        javax.swing.GroupLayout valorescaixaLayout = new javax.swing.GroupLayout(valorescaixa.getContentPane());
        valorescaixa.getContentPane().setLayout(valorescaixaLayout);
        valorescaixaLayout.setHorizontalGroup(
            valorescaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundValoresCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
        );
        valorescaixaLayout.setVerticalGroup(
            valorescaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valorescaixaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(backgroundValoresCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        backgroundValoresCaixa1.setBackground(new java.awt.Color(255, 255, 255));
        backgroundValoresCaixa1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFinalizarVenda.setBackground(new java.awt.Color(0, 153, 51));
        btnFinalizarVenda.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnFinalizarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinalizarVenda.setText("Finalizar");
        btnFinalizarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarVenda.setOpaque(true);
        btnFinalizarVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFinalizarVendaMouseReleased(evt);
            }
        });
        backgroundValoresCaixa1.add(btnFinalizarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 380, 40));

        lblDataValoresCaixa1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDataValoresCaixa1.setForeground(new java.awt.Color(51, 51, 51));
        lblDataValoresCaixa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataValoresCaixa1.setText("Finalização de venda");
        lblDataValoresCaixa1.setToolTipText("Data");
        backgroundValoresCaixa1.add(lblDataValoresCaixa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 30));

        lblTotaldeVendas1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTotaldeVendas1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotaldeVendas1.setText("Total");
        backgroundValoresCaixa1.add(lblTotaldeVendas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 120, 26));

        txtTotalFV.setEditable(false);
        txtTotalFV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalFV.setText("0,00");
        txtTotalFV.setToolTipText("Total descontos");
        txtTotalFV.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backgroundValoresCaixa1.add(txtTotalFV, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 100, -1));

        lblTotaldeVendas2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTotaldeVendas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotaldeVendas2.setText("Forma de pagamento");
        backgroundValoresCaixa1.add(lblTotaldeVendas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 330, 30));

        txtDescontoFV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtDescontoFV.setText("0,00");
        txtDescontoFV.setToolTipText("Total descontos");
        txtDescontoFV.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backgroundValoresCaixa1.add(txtDescontoFV, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, -1));

        txtFormapagamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFormapagamento.setPreferredSize(new java.awt.Dimension(200, 20));
        txtFormapagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormapagamentoActionPerformed(evt);
            }
        });
        txtFormapagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFormapagamentoKeyReleased(evt);
            }
        });
        backgroundValoresCaixa1.add(txtFormapagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 80, 20));

        txtFormapagamento2.setEditable(false);
        txtFormapagamento2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFormapagamento2.setFocusable(false);
        txtFormapagamento2.setPreferredSize(new java.awt.Dimension(200, 20));
        txtFormapagamento2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFormapagamento2KeyReleased(evt);
            }
        });
        backgroundValoresCaixa1.add(txtFormapagamento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 250, 20));

        lblTotaldeVendas3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTotaldeVendas3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotaldeVendas3.setText("Desconto");
        backgroundValoresCaixa1.add(lblTotaldeVendas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 120, 26));

        txtClienteFinalizarVenda.setEditable(false);
        txtClienteFinalizarVenda.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtClienteFinalizarVenda.setPreferredSize(new java.awt.Dimension(200, 20));
        txtClienteFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteFinalizarVendaActionPerformed(evt);
            }
        });
        txtClienteFinalizarVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteFinalizarVendaKeyReleased(evt);
            }
        });
        backgroundValoresCaixa1.add(txtClienteFinalizarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 80, 20));

        txtCliente2FinalizarVenda.setEditable(false);
        txtCliente2FinalizarVenda.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCliente2FinalizarVenda.setFocusable(false);
        txtCliente2FinalizarVenda.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCliente2FinalizarVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCliente2FinalizarVendaKeyReleased(evt);
            }
        });
        backgroundValoresCaixa1.add(txtCliente2FinalizarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 250, 20));

        javax.swing.GroupLayout finalizarvendaLayout = new javax.swing.GroupLayout(finalizarvenda.getContentPane());
        finalizarvenda.getContentPane().setLayout(finalizarvendaLayout);
        finalizarvendaLayout.setHorizontalGroup(
            finalizarvendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundValoresCaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        finalizarvendaLayout.setVerticalGroup(
            finalizarvendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalizarvendaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(backgroundValoresCaixa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CAIXA LIVRE");
        lblTitulo.setFocusable(false);
        lblTitulo.setOpaque(true);

        painelBotoes.setBackground(new java.awt.Color(204, 204, 204));
        painelBotoes.setLayout(new java.awt.GridLayout(1, 8, 1, 1));

        F1.setEditable(false);
        F1.setColumns(20);
        F1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F1.setRows(5);
        F1.setText("\nF1\nVenda");
        F1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        F1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        F2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        F2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        F3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        F3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F3.setFocusable(false);
        F3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                F3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                F3MouseExited(evt);
            }
        });
        painelBotoes.add(F3);

        F4.setEditable(false);
        F4.setColumns(20);
        F4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F4.setRows(5);
        F4.setText("\nF4\nConsultar");
        F4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        F4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F4.setFocusable(false);
        F4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                F4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                F4MouseExited(evt);
            }
        });
        painelBotoes.add(F4);

        F5.setEditable(false);
        F5.setColumns(20);
        F5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F5.setRows(5);
        F5.setText("\nF5\nCaixa");
        F5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        F5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F5.setFocusable(false);
        F5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                F5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                F5MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                F5MouseReleased(evt);
            }
        });
        painelBotoes.add(F5);

        F6.setEditable(false);
        F6.setColumns(20);
        F6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F6.setRows(5);
        F6.setText("\nF6\nSaídas");
        F6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        F6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F6.setFocusable(false);
        F6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                F6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                F6MouseExited(evt);
            }
        });
        painelBotoes.add(F6);

        F7.setEditable(false);
        F7.setColumns(20);
        F7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F7.setRows(5);
        F7.setText("\nF7\nEntradas");
        F7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        F7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F7.setFocusable(false);
        F7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                F7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                F7MouseExited(evt);
            }
        });
        painelBotoes.add(F7);

        F8.setEditable(false);
        F8.setColumns(20);
        F8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F8.setRows(5);
        F8.setText("\nF8\nFechamento");
        F8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        F8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F8.setFocusable(false);
        F8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                F8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                F8MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                F8MouseReleased(evt);
            }
        });
        painelBotoes.add(F8);

        txtInput.setBackground(new java.awt.Color(204, 204, 204));
        txtInput.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        txtInput.setToolTipText("Entrada de dados");
        txtInput.setCaretColor(new java.awt.Color(255, 255, 255));
        txtInput.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtInput.setNextFocusableComponent(txtInput);
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

        lblLogadoComo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblLogadoComo.setText("Logado como:");

        lblData.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblData.setText("Data do caixa");

        painelVendaInferior.setOpaque(false);

        painelVenda.setBackground(new java.awt.Color(204, 204, 204));
        painelVenda.setOpaque(false);

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
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(0).setMaxWidth(60);
            tblProdutos.getColumnModel().getColumn(2).setMaxWidth(60);
            tblProdutos.getColumnModel().getColumn(3).setMaxWidth(60);
            tblProdutos.getColumnModel().getColumn(4).setMaxWidth(40);
            tblProdutos.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        lblCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente.setText("Cliente");

        txtCliente.setEditable(false);
        txtCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCliente.setToolTipText("Código do cliente, caso não esteja cadastrado deixe em branco.");
        txtCliente.setOpaque(false);
        txtCliente.setPreferredSize(new java.awt.Dimension(200, 20));

        txtCliente2.setEditable(false);
        txtCliente2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCliente2.setOpaque(false);
        txtCliente2.setPreferredSize(new java.awt.Dimension(200, 20));

        lblPlaca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaca.setText("Placa");

        txtPlaca.setEditable(false);
        txtPlaca.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(51, 105, 191));
        txtPlaca.setOpaque(false);
        txtPlaca.setPreferredSize(new java.awt.Dimension(200, 20));

        txtPlaca2.setEditable(false);
        txtPlaca2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPlaca2.setOpaque(false);
        txtPlaca2.setPreferredSize(new java.awt.Dimension(200, 20));

        btnLimparCliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnLimparCliente.setText("Limpar");
        btnLimparCliente.setFocusable(false);
        btnLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparClienteActionPerformed(evt);
            }
        });

        btnLimparPlaca.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnLimparPlaca.setText("Limpar");
        btnLimparPlaca.setFocusable(false);
        btnLimparPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPlacaActionPerformed(evt);
            }
        });

        lblTitulo12.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lblTitulo12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo12.setText("Totais:");

        txtValorBruto.setEditable(false);
        txtValorBruto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorBruto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorBruto.setText("0,00");
        txtValorBruto.setToolTipText("Total bruto");
        txtValorBruto.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        txtTotalDescontos.setEditable(false);
        txtTotalDescontos.setForeground(new java.awt.Color(204, 0, 51));
        txtTotalDescontos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalDescontos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalDescontos.setText("0,00");
        txtTotalDescontos.setToolTipText("Total descontos");
        txtTotalDescontos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtTotalDescontos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalDescontosFocusLost(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setForeground(new java.awt.Color(51, 153, 0));
        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("0,00");
        txtTotal.setToolTipText("Total");
        txtTotal.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        lblOrcamento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblOrcamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrcamento.setText("Orçam.");

        txtOrcamento.setEditable(false);
        txtOrcamento.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtOrcamento.setForeground(new java.awt.Color(51, 105, 191));
        txtOrcamento.setOpaque(false);
        txtOrcamento.setPreferredSize(new java.awt.Dimension(200, 20));

        txtOrcamento2.setEditable(false);
        txtOrcamento2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtOrcamento2.setOpaque(false);
        txtOrcamento2.setPreferredSize(new java.awt.Dimension(200, 20));

        btnLimparOrcamento.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnLimparOrcamento.setText("Limpar");
        btnLimparOrcamento.setFocusable(false);
        btnLimparOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparOrcamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelVendaLayout = new javax.swing.GroupLayout(painelVenda);
        painelVenda.setLayout(painelVendaLayout);
        painelVendaLayout.setHorizontalGroup(
            painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelVendaLayout.createSequentialGroup()
                        .addComponent(lblOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrcamento2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimparOrcamento))
                    .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendaLayout.createSequentialGroup()
                            .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelVendaLayout.createSequentialGroup()
                                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(lblTitulo12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtValorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTotalDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelVendaLayout.createSequentialGroup()
                                .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPlaca2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimparCliente)
                                    .addComponent(btnLimparPlaca, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        painelVendaLayout.setVerticalGroup(
            painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendaLayout.createSequentialGroup()
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPlaca2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblOrcamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOrcamento2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrcamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        javax.swing.GroupLayout painelVendaInferiorLayout = new javax.swing.GroupLayout(painelVendaInferior);
        painelVendaInferior.setLayout(painelVendaInferiorLayout);
        painelVendaInferiorLayout.setHorizontalGroup(
            painelVendaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVendaInferiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelVendaInferiorLayout.setVerticalGroup(
            painelVendaInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblFundoTroco.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblFundoTroco.setText("Fundo de troco:");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelVendaInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(lblLogadoComo, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFundoTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelVendaInferior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(lblLogadoComo)
                    .addComponent(lblFundoTroco)))
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
            if (lblTitulo.getText().equalsIgnoreCase("caixa")) {
                setTela("inicio");
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            if (lblTitulo.getText().equalsIgnoreCase("Caixa livre")) {
                abrirVenda();
            }
            if (lblTitulo.getText().equalsIgnoreCase("caixa")) {
                
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            if (lblTitulo.getText().equalsIgnoreCase("Caixa livre")) {
                
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            if (lblTitulo.getText().equalsIgnoreCase("nova venda")) {
                buscarCliente();
                lblCliente.setVisible(true);
                txtCliente.setVisible(true);
                txtCliente2.setVisible(true);
                btnLimparCliente.setVisible(true);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            System.out.println("F4");
        }
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            if (lblTitulo.getText().equalsIgnoreCase("nova venda")) {
                jDialogFV("Dinheiro");
                finalizarvenda.setVisible(true);
            }
            if (lblTitulo.getText().equalsIgnoreCase("caixa livre")) {
                lblTitulo.setText("CAIXA");
                setTela("caixa");
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F6) {
            if (lblTitulo.getText().equalsIgnoreCase("nova venda")) {
                cancelarVenda();
            }
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
        if (pesquisaAtual.equalsIgnoreCase("formapagamento")) {
            listarFormasPagamento();
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
        if (pesquisaAtual.equalsIgnoreCase("clientes")) {
            if (tabela.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado!");
            } else {
                txtCliente.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
                txtCliente2.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
                pesquisar.setVisible(false);
            }
        }
        if (pesquisaAtual.equalsIgnoreCase("placa")) {
            if (tabela.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(null, "Nenhuma placa selecionada!");
            } else {
                txtPlaca.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
                txtPlaca2.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
                pesquisar.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnSelecionarPesquisaMouseReleased

    private void txtTotalDescontosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalDescontosFocusLost

    }//GEN-LAST:event_txtTotalDescontosFocusLost

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
        if (btnValoresCaixa.getText().equalsIgnoreCase("Abrir novo caixa")) {
            //usuario,fechado,fundo,sangria,suprimento,saida,entrada,descontos,bruto,total
            CaixaModel cm = new CaixaModel();
            cm.setUsuario(lblUsuarioValorescaixa.getText());
            cm.setFechado(false);
            cm.setFundo(Double.parseDouble(txtSuprimento.getText().replace(",", ".")));
            cm.setSangria(0.00);
            cm.setSuprimento(Double.parseDouble(txtSuprimento.getText().replace(",", ".")));
            cm.setSaida(0.00);
            cm.setEntrada(Double.parseDouble(txtSuprimento.getText().replace(",", ".")));
            cm.setDescontos(0.00);
            cm.setBruto(0.00);
            cm.setTotal(0.00);
            cc.novoCaixa(cm);
            valorescaixa.setVisible(false);
            this.setVisible(true);
        }
    }//GEN-LAST:event_btnValoresCaixaMouseReleased

    private void txtFundoAtualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFundoAtualFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundoAtualFocusLost

    private void F1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F1MouseReleased
        abrirVenda();
    }//GEN-LAST:event_F1MouseReleased

    private void btnLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparClienteActionPerformed
        txtCliente.setText("");
        txtCliente2.setText("");
        txtCliente.setVisible(false);
        txtCliente2.setVisible(false);
        btnLimparCliente.setVisible(false);
    }//GEN-LAST:event_btnLimparClienteActionPerformed

    private void btnLimparPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparPlacaActionPerformed
        txtPlaca.setText("");
        txtPlaca2.setText("");
        txtPlaca.setVisible(false);
        txtPlaca2.setVisible(false);
        btnLimparPlaca.setVisible(false);
    }//GEN-LAST:event_btnLimparPlacaActionPerformed

    private void F3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F3MouseEntered
        F3.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_F3MouseEntered

    private void F3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F3MouseExited
        F3.setBackground(Color.WHITE);
    }//GEN-LAST:event_F3MouseExited

    private void F5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F5MouseReleased
        if (rootPaneCheckingEnabled) {
            
        }
    }//GEN-LAST:event_F5MouseReleased

    private void F8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F8MouseReleased
        
    }//GEN-LAST:event_F8MouseReleased

    private void btnFinalizarVendaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinalizarVendaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFinalizarVendaMouseReleased

    private void txtFormapagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormapagamentoActionPerformed
        buscarFormaPagamento();
    }//GEN-LAST:event_txtFormapagamentoActionPerformed

    private void txtFormapagamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFormapagamentoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormapagamentoKeyReleased

    private void txtFormapagamento2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFormapagamento2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormapagamento2KeyReleased

    private void txtClienteFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteFinalizarVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteFinalizarVendaActionPerformed

    private void txtClienteFinalizarVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteFinalizarVendaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteFinalizarVendaKeyReleased

    private void txtCliente2FinalizarVendaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCliente2FinalizarVendaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCliente2FinalizarVendaKeyReleased

    private void F4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F4MouseEntered
        F4.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_F4MouseEntered

    private void F5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F5MouseEntered
        F5.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_F5MouseEntered

    private void F6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F6MouseEntered
        F6.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_F6MouseEntered

    private void F7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F7MouseEntered
        F7.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_F7MouseEntered

    private void F8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F8MouseEntered
        F8.setBackground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_F8MouseEntered

    private void F4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F4MouseExited
        F4.setBackground(Color.WHITE);
    }//GEN-LAST:event_F4MouseExited

    private void F5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F5MouseExited
        F5.setBackground(Color.WHITE);
    }//GEN-LAST:event_F5MouseExited

    private void F6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F6MouseExited
        F6.setBackground(Color.WHITE);
    }//GEN-LAST:event_F6MouseExited

    private void F7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F7MouseExited
        F7.setBackground(Color.WHITE);
    }//GEN-LAST:event_F7MouseExited

    private void F8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F8MouseExited
        F8.setBackground(Color.WHITE);
    }//GEN-LAST:event_F8MouseExited

    private void btnLimparOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparOrcamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparOrcamentoActionPerformed

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
    private javax.swing.JPanel backgroundValoresCaixa;
    private javax.swing.JPanel backgroundValoresCaixa1;
    private javax.swing.JLabel btnFinalizarVenda;
    private javax.swing.JButton btnLimparCliente;
    private javax.swing.JButton btnLimparOrcamento;
    private javax.swing.JButton btnLimparPlaca;
    private javax.swing.JLabel btnSelecionarPesquisa;
    private javax.swing.JLabel btnValoresCaixa;
    private javax.swing.JDialog finalizarvenda;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDataValoresCaixa;
    private javax.swing.JLabel lblDataValoresCaixa1;
    private javax.swing.JLabel lblFundoAtual;
    private javax.swing.JLabel lblFundoTroco;
    private javax.swing.JLabel lblLogadoComo;
    private javax.swing.JLabel lblOrcamento;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblSangria;
    private javax.swing.JLabel lblSuprimento;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTituloPesquisa;
    private javax.swing.JLabel lblTotaldeVendas;
    private javax.swing.JLabel lblTotaldeVendas1;
    private javax.swing.JLabel lblTotaldeVendas2;
    private javax.swing.JLabel lblTotaldeVendas3;
    private javax.swing.JLabel lblUsuarioValorescaixa;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelVenda;
    private javax.swing.JPanel painelVendaInferior;
    private javax.swing.JDialog pesquisar;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCliente2;
    private javax.swing.JTextField txtCliente2FinalizarVenda;
    private javax.swing.JTextField txtClienteFinalizarVenda;
    private javax.swing.JFormattedTextField txtDescontoFV;
    private javax.swing.JTextField txtFormapagamento;
    private javax.swing.JTextField txtFormapagamento2;
    private javax.swing.JFormattedTextField txtFundoAtual;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtOrcamento;
    private javax.swing.JTextField txtOrcamento2;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPlaca2;
    private javax.swing.JFormattedTextField txtSangria;
    private javax.swing.JFormattedTextField txtSuprimento;
    private javax.swing.JFormattedTextField txtTotal;
    private javax.swing.JFormattedTextField txtTotalDescontos;
    private javax.swing.JFormattedTextField txtTotalFV;
    private javax.swing.JFormattedTextField txtTotaldeVendas;
    private javax.swing.JFormattedTextField txtValorBruto;
    private javax.swing.JDialog valorescaixa;
    // End of variables declaration//GEN-END:variables

}
