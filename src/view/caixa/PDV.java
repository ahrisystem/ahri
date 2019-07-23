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
        abrircaixa.getClass().getResource("/images/icon.ico");
        pesquisar.getClass().getResource("/images/icon.ico");
        venda.getClass().getResource("/images/icon.ico");
        fecharcaixa.getClass().getResource("/images/icon.ico");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
        abrircaixa.setIconImage(iconeTitulo);
        venda.setIconImage(iconeTitulo);
        pesquisar.setIconImage(iconeTitulo);
        fecharcaixa.setIconImage(iconeTitulo);
    }
    
    public void atualizarTotalizadores() {
        double totalbruto = 0.00;
        double desconto = 0.00;
        double total = 0.00;
        for (int i = 0; i < tblProdutos.getRowCount(); i++) {
            totalbruto = totalbruto + Double.parseDouble(tblProdutos.getValueAt(i, 5).toString().replace(",", "."));
            desconto = desconto + Double.parseDouble(tblProdutos.getValueAt(i, 3).toString().replace(",", "."));
        }
        totalbruto *= (Math.pow(10, 2));
        totalbruto = Math.ceil(totalbruto);
        totalbruto /= (Math.pow(10, 2));
        
        desconto *= (Math.pow(10, 2));
        desconto = Math.ceil(desconto);
        desconto /= (Math.pow(10, 2));
        
        total = totalbruto - desconto;
        
        total *= (Math.pow(10, 2));
        total = Math.ceil(total);
        total /= (Math.pow(10, 2));
        
        txtValorBruto.setText(Double.toString(totalbruto).replace(".", ","));
        txtTotalDescontos.setText(Double.toString(desconto).replace(".", ","));
        txtTotal.setText(Double.toString(total).replace(".", ","));
    }
    
    public void jDialogFV(String nomeFormapagamento){
        if (nomeFormapagamento.equalsIgnoreCase("dinheiro")) {
            txtFormapagamento.setText("1");
            txtFormapagamento2.setText(nomeFormapagamento);
        }
        venda.setLocationRelativeTo(null);
        venda.setLocation(abrircaixa.getX()-120, abrircaixa.getY()-100);
        venda.setSize(400, 320);
        venda.setVisible(true);
    }
    public void jDialogAbrirCaixa(String data, String usuario){
        lblDataAbrirCaixa.setText(data);
        lblUsuarioAbrirCaixa.setText(usuario);
        abrircaixa.setVisible(true);
        abrircaixa.setLocationRelativeTo(null);
        abrircaixa.setLocation(abrircaixa.getX()-120, abrircaixa.getY()-100);
        abrircaixa.setSize(390,240);
    }
    public void jDialogFecharCaixa(String data, String usuario){
        lblDataFC.setText(data);
        lblUsuarioFC.setText(usuario);
        abrircaixa.setVisible(true);
        abrircaixa.setLocationRelativeTo(null);
        abrircaixa.setLocation(abrircaixa.getX()-120, abrircaixa.getY()-100);
        abrircaixa.setSize(400, 320);
    }
    
//Ações do caixa
    public void inicializar(String usuario, int acao, String data){
        txtUsuarioLogado.setText(usuario);
        txtDataCaixa.setText(data);
        setTela("inicio");
        lblTitulo.setText("CAIXA LIVRE");
        lblLogadoComo.setText("Logado como: "+usuario);
        
        //Novo caixa
        if (acao == 1) {
            jDialogAbrirCaixa(data, usuario);
        }
        //reabrir caixa
        if (acao == 2) {
            jDialogAbrirCaixa(data, usuario);
            lblDataAbrirCaixa.setText(data);
        }
        //caixa ainda aberto
        if (acao == 3) {
            this.setVisible(true);
        }
        
    }
    public void setTela(String tela){
        if (tela.equalsIgnoreCase("inicio")) {
            lblTitulo.setText("CAIXA LIVRE");
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
            F2.setText("\nF2\nCliente");
            F3.setText("\nF3\nOrçamento");
            F4.setText("\nF4\nPlaca");
            F5.setText("\nF5\nSubtotal");
            F6.setText("\nF6\nCancelar");
            F7.setText("\nF7\n");
            F8.setText("\nF8\n");
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
        if (tela.equalsIgnoreCase("subtotal")) {
            lblTitulo.setText("SUBTOTAL");
            F1.setText("\nF1\nDinheiro");
            F2.setText("\nF2\nPOS Débito");
            F3.setText("\nF3\nPOS Crédito");
            F4.setText("\nF4\nConta cliente");
            F5.setText("");
            F6.setText("");
            F7.setText("");
            F8.setText("");
        }
    }
    
    public void fecharCaixa(){
        CaixaModel cm = new CaixaModel();
        cm.setData(txtDataCaixa.getText());
        cc.verificar(cm);
        lblUsuarioFC.setText(txtUsuarioLogado.getText());
        lblDataFC.setText(txtDataCaixa.getText());
        txtFundoAtual.setText(Double.toString(cm.getFundo()));
        txtTotaldeVendas.setText("");
        txtTotalDinheiro.setText("");
        txtTotalCartao.setText("");
        fecharcaixa.setSize(390, 360);
        fecharcaixa.setVisible(true);
    }
    public void abrirVenda(){
        painelTela.add(painelVenda);
        painelVenda.setVisible(true);
        setTela("venda");
    }
    
    public void cancelarVenda(){
        if (JOptionPane.showConfirmDialog(null, "Cancelar a venda em aberto?\nFormulários não salvos podem ser perdidos",
                "Cancelar venda em aberto", 2) == 0) {
            setTela("inicio");
            painelTela.remove(painelVenda);
        }
    }
    
    /////////////////////Pesquisar
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
    
    public void valoresDefaultProduto(Double preco, String nome, int cod) {
        txtInput.setText(Integer.toString(cod));
        txtDescricaoProduto.setText(nome);
        txtValorUnitarioProduto.setText(Double.toString(preco).replace(".", ","));
        txtValorDescontoProduto.setText("0,00");
        txtQuantidadeProduto.setText("0");
    }
    
    public void buscarProduto() {
        ProdutoModel pm = new ProdutoModel();
        if (txtInput.getText().matches("[0-9]+")) {
            if (txtInput.getText().length() > 5) {
                pc.buscarProduto(pm, "\"codigoBarras\"", txtInput.getText());
                if (pm.getCod() == 0) {

                } else {
                    valoresDefaultProduto(pm.getPreco(), pm.getNome(), pm.getCod());
                    txtValorUnitarioProduto.requestFocus();
                    txtDescricaoProduto.setEnabled(false);
                }
            } else {
                pc.buscarProduto(pm, "cod", txtInput.getText());
                valoresDefaultProduto(pm.getPreco(), pm.getNome(), pm.getCod());
                txtValorUnitarioProduto.requestFocus();
                txtDescricaoProduto.setEnabled(false);
            }
        } else {
            pesquisar.setVisible(true);
            pesquisaAtual = "produtos";
            lblTituloPesquisa.setText("Produtos");
            listarProdutos();
            txtPesquisa.setText(txtInput.getText());
            pesquisar.setLocation(this.getX(), this.getY());
            pesquisar.setSize(this.getSize());
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
        abrircaixa = new javax.swing.JDialog();
        backgroundValoresCaixa = new javax.swing.JPanel();
        lblDataAbrirCaixa = new javax.swing.JLabel();
        lblSuprimento = new javax.swing.JLabel();
        txtSuprimento = new javax.swing.JFormattedTextField();
        lblUsuarioAbrirCaixa = new javax.swing.JLabel();
        lblFundoAtualAbrirCaixa = new javax.swing.JLabel();
        txtFundoAtualAbrirCaixa = new javax.swing.JFormattedTextField();
        btnAbrirCaixa = new javax.swing.JLabel();
        fecharcaixa = new javax.swing.JDialog();
        backgroundValoresCaixa2 = new javax.swing.JPanel();
        btnValoresCaixa1 = new javax.swing.JLabel();
        lblUsuarioFC = new javax.swing.JLabel();
        lblDataFC = new javax.swing.JLabel();
        lblSangria1 = new javax.swing.JLabel();
        lbltdv = new javax.swing.JLabel();
        txtFundoAtual = new javax.swing.JFormattedTextField();
        txtTotaldeVendas = new javax.swing.JFormattedTextField();
        txtSangria = new javax.swing.JFormattedTextField();
        lblfafc = new javax.swing.JLabel();
        lblTotaldeVendas5 = new javax.swing.JLabel();
        txtTotalDinheiro = new javax.swing.JFormattedTextField();
        lblTotaldeVendas6 = new javax.swing.JLabel();
        txtTotalCartao = new javax.swing.JFormattedTextField();
        venda = new javax.swing.JDialog();
        painelVenda = new javax.swing.JPanel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtPlaca2 = new javax.swing.JTextField();
        btnLimparPlaca = new javax.swing.JButton();
        lblTitulo12 = new javax.swing.JLabel();
        txtValorBruto = new javax.swing.JFormattedTextField();
        txtTotalDescontos = new javax.swing.JFormattedTextField();
        txtTotal = new javax.swing.JFormattedTextField();
        lblTitulo13 = new javax.swing.JLabel();
        lblTitulo14 = new javax.swing.JLabel();
        lblOrcamento3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnFinalizarVenda = new javax.swing.JLabel();
        lblTotaldeVendas2 = new javax.swing.JLabel();
        txtFormapagamento = new javax.swing.JTextField();
        txtFormapagamento2 = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtCliente2 = new javax.swing.JTextField();
        lblOrcamento1 = new javax.swing.JLabel();
        btnLimparOrcamento1 = new javax.swing.JButton();
        txtTotalDescontos2 = new javax.swing.JFormattedTextField();
        lblOrcamento2 = new javax.swing.JLabel();
        lblOrcamento4 = new javax.swing.JLabel();
        Itens = new javax.swing.JDialog();
        painelVenda1 = new javax.swing.JPanel();
        lblTituloProdutos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblTitulo15 = new javax.swing.JLabel();
        txtValorBruto1 = new javax.swing.JFormattedTextField();
        txtTotalDescontos1 = new javax.swing.JFormattedTextField();
        txtTotalProdutos = new javax.swing.JFormattedTextField();
        lblTotal = new javax.swing.JLabel();
        lblTotalDesconto = new javax.swing.JLabel();
        painelFuncoes = new javax.swing.JPanel();
        btnRemoverProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        btnAdicionarProduto = new javax.swing.JButton();
        btnLimparCamposProduto = new javax.swing.JButton();
        txtDescricaoProduto = new javax.swing.JTextField();
        lblValorUnProduto = new javax.swing.JLabel();
        txtValorUnitarioProduto = new javax.swing.JFormattedTextField();
        lblDescProduto = new javax.swing.JLabel();
        txtValorDescontoProduto = new javax.swing.JFormattedTextField();
        lblQtdProduto = new javax.swing.JLabel();
        txtQuantidadeProduto = new javax.swing.JTextField();
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
        painelTela = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        lblLogadoComo = new javax.swing.JLabel();
        lblFundoTroco = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtDataCaixa = new javax.swing.JLabel();
        txtFundoTroco = new javax.swing.JLabel();
        txtUsuarioLogado = new javax.swing.JLabel();

        pesquisar.setResizable(false);

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

        abrircaixa.setResizable(false);
        abrircaixa.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundValoresCaixa.setBackground(new java.awt.Color(255, 255, 255));
        backgroundValoresCaixa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDataAbrirCaixa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblDataAbrirCaixa.setForeground(new java.awt.Color(102, 102, 102));
        lblDataAbrirCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataAbrirCaixa.setText("01/07/2019");
        backgroundValoresCaixa.add(lblDataAbrirCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 380, 30));

        lblSuprimento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblSuprimento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSuprimento.setText("Suprimento");
        backgroundValoresCaixa.add(lblSuprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, 26));

        txtSuprimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtSuprimento.setText("0,00");
        txtSuprimento.setToolTipText("Total descontos");
        txtSuprimento.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backgroundValoresCaixa.add(txtSuprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 100, -1));

        lblUsuarioAbrirCaixa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblUsuarioAbrirCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioAbrirCaixa.setText("Usuário");
        backgroundValoresCaixa.add(lblUsuarioAbrirCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        lblFundoAtualAbrirCaixa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFundoAtualAbrirCaixa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFundoAtualAbrirCaixa.setText("Fundo atual");
        backgroundValoresCaixa.add(lblFundoAtualAbrirCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 100, 26));

        txtFundoAtualAbrirCaixa.setEditable(false);
        txtFundoAtualAbrirCaixa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtFundoAtualAbrirCaixa.setText("0,00");
        txtFundoAtualAbrirCaixa.setToolTipText("Total descontos");
        txtFundoAtualAbrirCaixa.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backgroundValoresCaixa.add(txtFundoAtualAbrirCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 100, -1));

        abrircaixa.getContentPane().add(backgroundValoresCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 148));

        btnAbrirCaixa.setBackground(new java.awt.Color(102, 153, 255));
        btnAbrirCaixa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAbrirCaixa.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAbrirCaixa.setText("Abrir caixa");
        btnAbrirCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirCaixa.setOpaque(true);
        btnAbrirCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAbrirCaixaMouseReleased(evt);
            }
        });
        abrircaixa.getContentPane().add(btnAbrirCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 380, 40));

        fecharcaixa.setResizable(false);

        backgroundValoresCaixa2.setBackground(new java.awt.Color(255, 255, 255));
        backgroundValoresCaixa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundValoresCaixa2MousePressed(evt);
            }
        });
        backgroundValoresCaixa2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnValoresCaixa1.setBackground(new java.awt.Color(102, 153, 255));
        btnValoresCaixa1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnValoresCaixa1.setForeground(new java.awt.Color(255, 255, 255));
        btnValoresCaixa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnValoresCaixa1.setText("Fechar!");
        btnValoresCaixa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValoresCaixa1.setOpaque(true);
        btnValoresCaixa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnValoresCaixa1MouseReleased(evt);
            }
        });
        backgroundValoresCaixa2.add(btnValoresCaixa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 380, 40));

        lblUsuarioFC.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblUsuarioFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioFC.setText("Usuário");
        backgroundValoresCaixa2.add(lblUsuarioFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 360, 30));

        lblDataFC.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDataFC.setForeground(new java.awt.Color(51, 51, 51));
        lblDataFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataFC.setText("data");
        lblDataFC.setToolTipText("Data");
        backgroundValoresCaixa2.add(lblDataFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, 26));

        lblSangria1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblSangria1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSangria1.setText("Sangria");
        backgroundValoresCaixa2.add(lblSangria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 100, 26));

        lbltdv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbltdv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltdv.setText("Total de vendas");
        backgroundValoresCaixa2.add(lbltdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, 26));

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
        backgroundValoresCaixa2.add(txtFundoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 100, -1));

        txtTotaldeVendas.setEditable(false);
        txtTotaldeVendas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotaldeVendas.setText("0,00");
        txtTotaldeVendas.setToolTipText("Total descontos");
        txtTotaldeVendas.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backgroundValoresCaixa2.add(txtTotaldeVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 100, -1));

        txtSangria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtSangria.setText("0,00");
        txtSangria.setToolTipText("Total descontos");
        txtSangria.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backgroundValoresCaixa2.add(txtSangria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 100, -1));

        lblfafc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblfafc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblfafc.setText("Fundo atual");
        backgroundValoresCaixa2.add(lblfafc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 100, 26));

        lblTotaldeVendas5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTotaldeVendas5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotaldeVendas5.setText("Total em dinheiro");
        backgroundValoresCaixa2.add(lblTotaldeVendas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, 26));

        txtTotalDinheiro.setEditable(false);
        txtTotalDinheiro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalDinheiro.setText("0,00");
        txtTotalDinheiro.setToolTipText("Total descontos");
        txtTotalDinheiro.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backgroundValoresCaixa2.add(txtTotalDinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 100, -1));

        lblTotaldeVendas6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTotaldeVendas6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotaldeVendas6.setText("Total em cartão");
        backgroundValoresCaixa2.add(lblTotaldeVendas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, 26));

        txtTotalCartao.setEditable(false);
        txtTotalCartao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalCartao.setText("0,00");
        txtTotalCartao.setToolTipText("Total descontos");
        txtTotalCartao.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        backgroundValoresCaixa2.add(txtTotalCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 100, -1));

        javax.swing.GroupLayout fecharcaixaLayout = new javax.swing.GroupLayout(fecharcaixa.getContentPane());
        fecharcaixa.getContentPane().setLayout(fecharcaixaLayout);
        fecharcaixaLayout.setHorizontalGroup(
            fecharcaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundValoresCaixa2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fecharcaixaLayout.setVerticalGroup(
            fecharcaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundValoresCaixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        venda.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        venda.setResizable(false);
        venda.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelVenda.setBackground(new java.awt.Color(255, 255, 255));
        painelVenda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPlaca.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaca.setText("Placa");
        painelVenda.add(lblPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 20));

        txtPlaca.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(51, 105, 191));
        txtPlaca.setOpaque(false);
        txtPlaca.setPreferredSize(new java.awt.Dimension(200, 20));
        painelVenda.add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, 20));

        txtPlaca2.setEditable(false);
        txtPlaca2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtPlaca2.setOpaque(false);
        txtPlaca2.setPreferredSize(new java.awt.Dimension(200, 20));
        painelVenda.add(txtPlaca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 30, 300, 20));

        btnLimparPlaca.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnLimparPlaca.setText("X");
        btnLimparPlaca.setFocusable(false);
        btnLimparPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparPlacaActionPerformed(evt);
            }
        });
        painelVenda.add(btnLimparPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, 20));

        lblTitulo12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTitulo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo12.setText("Total Bruto");
        painelVenda.add(lblTitulo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 170, 20));

        txtValorBruto.setEditable(false);
        txtValorBruto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorBruto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorBruto.setText("0,00");
        txtValorBruto.setToolTipText("Total bruto");
        txtValorBruto.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        painelVenda.add(txtValorBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 150, 30));

        txtTotalDescontos.setEditable(false);
        txtTotalDescontos.setForeground(new java.awt.Color(204, 0, 51));
        txtTotalDescontos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalDescontos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalDescontos.setText("0,00");
        txtTotalDescontos.setToolTipText("Total descontos");
        txtTotalDescontos.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtTotalDescontos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalDescontosFocusLost(evt);
            }
        });
        painelVenda.add(txtTotalDescontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 170, 30));

        txtTotal.setEditable(false);
        txtTotal.setForeground(new java.awt.Color(0, 153, 51));
        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("0,00");
        txtTotal.setToolTipText("Total");
        txtTotal.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        painelVenda.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 160, 30));

        lblTitulo13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTitulo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo13.setText("Total");
        painelVenda.add(lblTitulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 180, 20));

        lblTitulo14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTitulo14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo14.setText("Total desconto");
        painelVenda.add(lblTitulo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, 20));

        lblOrcamento3.setBackground(new java.awt.Color(51, 105, 191));
        lblOrcamento3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblOrcamento3.setForeground(new java.awt.Color(255, 255, 255));
        lblOrcamento3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrcamento3.setText("Finalização da venda");
        lblOrcamento3.setOpaque(true);
        painelVenda.add(lblOrcamento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 20));

        jCheckBox1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jCheckBox1.setText("Gerar nf-e");
        jCheckBox1.setEnabled(false);
        jCheckBox1.setOpaque(false);
        painelVenda.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 247, 100, 20));

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
        painelVenda.add(btnFinalizarVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 180, 40));

        lblTotaldeVendas2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTotaldeVendas2.setForeground(new java.awt.Color(0, 153, 51));
        lblTotaldeVendas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotaldeVendas2.setText("Pagamento");
        painelVenda.add(lblTotaldeVendas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 520, 20));

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
        painelVenda.add(txtFormapagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 80, 20));

        txtFormapagamento2.setEditable(false);
        txtFormapagamento2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtFormapagamento2.setFocusable(false);
        txtFormapagamento2.setPreferredSize(new java.awt.Dimension(200, 20));
        txtFormapagamento2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFormapagamento2KeyReleased(evt);
            }
        });
        painelVenda.add(txtFormapagamento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 340, 20));

        txtCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCliente.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClienteKeyReleased(evt);
            }
        });
        painelVenda.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 80, 20));

        txtCliente2.setEditable(false);
        txtCliente2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCliente2.setFocusable(false);
        txtCliente2.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCliente2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCliente2KeyReleased(evt);
            }
        });
        painelVenda.add(txtCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 340, 20));

        lblOrcamento1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblOrcamento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrcamento1.setText("Cliente");
        painelVenda.add(lblOrcamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 80, 20));

        btnLimparOrcamento1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnLimparOrcamento1.setText("Aplicar");
        btnLimparOrcamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparOrcamento1ActionPerformed(evt);
            }
        });
        painelVenda.add(btnLimparOrcamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        txtTotalDescontos2.setForeground(new java.awt.Color(204, 0, 51));
        txtTotalDescontos2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalDescontos2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalDescontos2.setText("0,00");
        txtTotalDescontos2.setToolTipText("Total descontos");
        txtTotalDescontos2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtTotalDescontos2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalDescontos2FocusLost(evt);
            }
        });
        painelVenda.add(txtTotalDescontos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 80, -1));

        lblOrcamento2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblOrcamento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrcamento2.setText("Forma");
        painelVenda.add(lblOrcamento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 80, 21));

        lblOrcamento4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblOrcamento4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOrcamento4.setText("Desconto");
        painelVenda.add(lblOrcamento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 80, 21));

        venda.getContentPane().add(painelVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, -1));

        Itens.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        Itens.setResizable(false);

        painelVenda1.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloProdutos.setBackground(new java.awt.Color(51, 105, 191));
        lblTituloProdutos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTituloProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloProdutos.setText("Produtos/Serviços");
        lblTituloProdutos.setOpaque(true);

        jScrollPane3.setBorder(null);
        jScrollPane3.setOpaque(false);

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
        jScrollPane3.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(0).setMaxWidth(60);
            tblProdutos.getColumnModel().getColumn(2).setMaxWidth(60);
            tblProdutos.getColumnModel().getColumn(3).setMaxWidth(60);
            tblProdutos.getColumnModel().getColumn(4).setMaxWidth(40);
            tblProdutos.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        lblTitulo15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTitulo15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo15.setText("Total Bruto");

        txtValorBruto1.setEditable(false);
        txtValorBruto1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorBruto1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtValorBruto1.setText("0,00");
        txtValorBruto1.setToolTipText("Total bruto");
        txtValorBruto1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        txtTotalDescontos1.setEditable(false);
        txtTotalDescontos1.setForeground(new java.awt.Color(204, 0, 51));
        txtTotalDescontos1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalDescontos1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalDescontos1.setText("0,00");
        txtTotalDescontos1.setToolTipText("Total descontos");
        txtTotalDescontos1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtTotalDescontos1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTotalDescontos1FocusLost(evt);
            }
        });

        txtTotalProdutos.setEditable(false);
        txtTotalProdutos.setForeground(new java.awt.Color(51, 153, 0));
        txtTotalProdutos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalProdutos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalProdutos.setText("0,00");
        txtTotalProdutos.setToolTipText("Total");
        txtTotalProdutos.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N

        lblTotal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total");

        lblTotalDesconto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTotalDesconto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalDesconto.setText("Total desconto");

        painelFuncoes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemoverProduto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRemoverProduto.setText("Remover");
        btnRemoverProduto.setFocusable(false);
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });
        painelFuncoes.add(btnRemoverProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, 40));

        btnEditarProduto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditarProduto.setText("Editar");
        btnEditarProduto.setFocusable(false);
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });
        painelFuncoes.add(btnEditarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 110, 40));

        btnAdicionarProduto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAdicionarProduto.setText("Adicionar");
        btnAdicionarProduto.setFocusable(false);
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });
        painelFuncoes.add(btnAdicionarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        btnLimparCamposProduto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnLimparCamposProduto.setText("Limpar");
        btnLimparCamposProduto.setFocusable(false);
        btnLimparCamposProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposProdutoActionPerformed(evt);
            }
        });
        painelFuncoes.add(btnLimparCamposProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 110, 40));

        txtDescricaoProduto.setEditable(false);
        txtDescricaoProduto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblValorUnProduto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblValorUnProduto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblValorUnProduto.setText("Preço");

        txtValorUnitarioProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorUnitarioProduto.setText("0,00");
        txtValorUnitarioProduto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtValorUnitarioProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorUnitarioProdutoFocusGained(evt);
            }
        });

        lblDescProduto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblDescProduto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescProduto.setText("Desc.");

        txtValorDescontoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorDescontoProduto.setText("0,00");
        txtValorDescontoProduto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtValorDescontoProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorDescontoProdutoFocusGained(evt);
            }
        });

        lblQtdProduto.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblQtdProduto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQtdProduto.setText("Qtd.");

        txtQuantidadeProduto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        txtQuantidadeProduto.setText("0");
        txtQuantidadeProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQuantidadeProdutoFocusGained(evt);
            }
        });
        txtQuantidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelVenda1Layout = new javax.swing.GroupLayout(painelVenda1);
        painelVenda1.setLayout(painelVenda1Layout);
        painelVenda1Layout.setHorizontalGroup(
            painelVenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVenda1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelVenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelVenda1Layout.createSequentialGroup()
                        .addGroup(painelVenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorBruto1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelVenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotalDesconto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalDescontos1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelVenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalProdutos)
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelVenda1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(painelFuncoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelVenda1Layout.createSequentialGroup()
                        .addComponent(lblValorUnProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorUnitarioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorDescontoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQtdProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDescricaoProduto)))
            .addComponent(lblTituloProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelVenda1Layout.setVerticalGroup(
            painelVenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelVenda1Layout.createSequentialGroup()
                .addComponent(lblTituloProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelVenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorUnProduto)
                    .addComponent(txtValorUnitarioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorDescontoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescProduto)
                    .addComponent(lblQtdProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelVenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(painelFuncoes, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelVenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo15)
                    .addComponent(lblTotal)
                    .addComponent(lblTotalDesconto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelVenda1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorBruto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalDescontos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout ItensLayout = new javax.swing.GroupLayout(Itens.getContentPane());
        Itens.getContentPane().setLayout(ItensLayout);
        ItensLayout.setHorizontalGroup(
            ItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelVenda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ItensLayout.setVerticalGroup(
            ItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelVenda1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        painelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelBotoes.setLayout(new java.awt.GridLayout(1, 8, 1, 1));

        F1.setEditable(false);
        F1.setColumns(20);
        F1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        F1.setRows(5);
        F1.setText("\nF1\nVenda");
        F1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        F2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        F3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        F4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        F5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        F6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        F7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
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
        F8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        F8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        F8.setFocusable(false);
        F8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                F8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                F8MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                F8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                F8MouseReleased(evt);
            }
        });
        painelBotoes.add(F8);

        painelTela.setBackground(new java.awt.Color(204, 204, 204));
        painelTela.setOpaque(false);
        painelTela.setLayout(new java.awt.GridLayout(1, 0));

        txtInput.setBackground(new java.awt.Color(204, 204, 204));
        txtInput.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        txtInput.setToolTipText("Entrada de dados");
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

        lblFundoTroco.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblFundoTroco.setText("Fundo de troco:");

        lblData.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblData.setText("Data do caixa");

        txtDataCaixa.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDataCaixa.setText("10/10/10");

        txtFundoTroco.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFundoTroco.setText("0,00");

        txtUsuarioLogado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTela, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtInput, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(lblLogadoComo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuarioLogado, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFundoTroco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFundoTroco, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataCaixa)
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTela, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(lblLogadoComo)
                    .addComponent(lblFundoTroco)
                    .addComponent(txtDataCaixa)
                    .addComponent(txtFundoTroco)
                    .addComponent(txtUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            if (lblTitulo.getText().equalsIgnoreCase("subtotal")) {
                setTela("venda");
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            if (lblTitulo.getText().equalsIgnoreCase("Caixa livre")) {
                abrirVenda();
            }
            if (lblTitulo.getText().equalsIgnoreCase("nova venda")) {
                jDialogFV("Dinheiro");
                venda.setVisible(true);
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F2) {
            if (lblTitulo.getText().equalsIgnoreCase("Caixa livre")) {
                
            }
            if (lblTitulo.getText().equalsIgnoreCase("nova venda")) {
                
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F3) {
            if (lblTitulo.getText().equalsIgnoreCase("nova venda")) {
                
            }
        }
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            System.out.println("F4");
        }
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            if (lblTitulo.getText().equalsIgnoreCase("nova venda")) {
                
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
            if (lblTitulo.getText().equalsIgnoreCase("caixa livre")) {
                fecharCaixa();
            }
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

    private void btnAbrirCaixaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirCaixaMouseReleased
        CaixaModel cm = new CaixaModel();
        cm.setUsuario(lblDataAbrirCaixa.getText());
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
        abrircaixa.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btnAbrirCaixaMouseReleased

    private void F1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F1MouseReleased
        abrirVenda();
    }//GEN-LAST:event_F1MouseReleased

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
        if (rootPaneCheckingEnabled) {
            fecharcaixa.setVisible(true);
        }
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

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteKeyReleased

    private void txtCliente2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCliente2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCliente2KeyReleased

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

    private void btnValoresCaixa1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValoresCaixa1MouseReleased
        if (JOptionPane.showConfirmDialog(null, "Deseja mesmo fechar o caixa?") == 1) {
            
        }
    }//GEN-LAST:event_btnValoresCaixa1MouseReleased

    private void txtFundoAtualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFundoAtualFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundoAtualFocusLost

    private void txtTotalDescontos1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalDescontos1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalDescontos1FocusLost

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void btnLimparCamposProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparCamposProdutoActionPerformed

    private void txtValorUnitarioProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorUnitarioProdutoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorUnitarioProdutoFocusGained

    private void txtValorDescontoProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorDescontoProdutoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorDescontoProdutoFocusGained

    private void txtQuantidadeProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeProdutoFocusGained

    private void txtQuantidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeProdutoActionPerformed

    private void btnLimparOrcamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparOrcamento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparOrcamento1ActionPerformed

    private void txtTotalDescontos2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTotalDescontos2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalDescontos2FocusLost

    private void F8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F8MousePressed
        fecharCaixa();
    }//GEN-LAST:event_F8MousePressed

    private void backgroundValoresCaixa2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundValoresCaixa2MousePressed
        System.out.println(fecharcaixa.getSize());
    }//GEN-LAST:event_backgroundValoresCaixa2MousePressed

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
    private javax.swing.JDialog Itens;
    private javax.swing.JDialog abrircaixa;
    private javax.swing.JPanel background;
    private javax.swing.JPanel backgroundPesquisa;
    private javax.swing.JPanel backgroundValoresCaixa;
    private javax.swing.JPanel backgroundValoresCaixa2;
    private javax.swing.JLabel btnAbrirCaixa;
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JLabel btnFinalizarVenda;
    private javax.swing.JButton btnLimparCamposProduto;
    private javax.swing.JButton btnLimparOrcamento1;
    private javax.swing.JButton btnLimparPlaca;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JLabel btnSelecionarPesquisa;
    private javax.swing.JLabel btnValoresCaixa1;
    private javax.swing.JDialog fecharcaixa;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDataAbrirCaixa;
    private javax.swing.JLabel lblDataFC;
    private javax.swing.JLabel lblDescProduto;
    private javax.swing.JLabel lblFundoAtualAbrirCaixa;
    private javax.swing.JLabel lblFundoTroco;
    private javax.swing.JLabel lblLogadoComo;
    private javax.swing.JLabel lblOrcamento1;
    private javax.swing.JLabel lblOrcamento2;
    private javax.swing.JLabel lblOrcamento3;
    private javax.swing.JLabel lblOrcamento4;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblQtdProduto;
    private javax.swing.JLabel lblSangria1;
    private javax.swing.JLabel lblSuprimento;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTitulo13;
    private javax.swing.JLabel lblTitulo14;
    private javax.swing.JLabel lblTitulo15;
    private javax.swing.JLabel lblTituloPesquisa;
    private javax.swing.JLabel lblTituloProdutos;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalDesconto;
    private javax.swing.JLabel lblTotaldeVendas2;
    private javax.swing.JLabel lblTotaldeVendas5;
    private javax.swing.JLabel lblTotaldeVendas6;
    private javax.swing.JLabel lblUsuarioAbrirCaixa;
    private javax.swing.JLabel lblUsuarioFC;
    private javax.swing.JLabel lblValorUnProduto;
    private javax.swing.JLabel lblfafc;
    private javax.swing.JLabel lbltdv;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelFuncoes;
    private javax.swing.JPanel painelTela;
    private javax.swing.JPanel painelVenda;
    private javax.swing.JPanel painelVenda1;
    private javax.swing.JDialog pesquisar;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCliente2;
    private javax.swing.JLabel txtDataCaixa;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtFormapagamento;
    private javax.swing.JTextField txtFormapagamento2;
    private javax.swing.JFormattedTextField txtFundoAtual;
    private javax.swing.JFormattedTextField txtFundoAtualAbrirCaixa;
    private javax.swing.JLabel txtFundoTroco;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPlaca2;
    private javax.swing.JTextField txtQuantidadeProduto;
    private javax.swing.JFormattedTextField txtSangria;
    private javax.swing.JFormattedTextField txtSuprimento;
    private javax.swing.JFormattedTextField txtTotal;
    private javax.swing.JFormattedTextField txtTotalCartao;
    private javax.swing.JFormattedTextField txtTotalDescontos;
    private javax.swing.JFormattedTextField txtTotalDescontos1;
    private javax.swing.JFormattedTextField txtTotalDescontos2;
    private javax.swing.JFormattedTextField txtTotalDinheiro;
    private javax.swing.JFormattedTextField txtTotalProdutos;
    private javax.swing.JFormattedTextField txtTotaldeVendas;
    private javax.swing.JLabel txtUsuarioLogado;
    private javax.swing.JFormattedTextField txtValorBruto;
    private javax.swing.JFormattedTextField txtValorBruto1;
    private javax.swing.JFormattedTextField txtValorDescontoProduto;
    private javax.swing.JFormattedTextField txtValorUnitarioProduto;
    private javax.swing.JDialog venda;
    // End of variables declaration//GEN-END:variables

}
