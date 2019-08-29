package view.cadastros.produtos;

import controller.cadastros.produtos.ProdutoController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.cadastros.produtos.ProdutoModel;
import view.funcoes.RegistrosExcluidos;

public class Produtos extends javax.swing.JPanel {
    private static final Produtos INSTANCIA = new Produtos();
            
    public static Produtos getInstancia() {
        return INSTANCIA;
    }
    
    public Produtos() {
        initComponents();
        listar();
    }
    
    ProdutoController prodc = new ProdutoController();
    
    public void listar(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (ProdutoModel p : prodc.listaProdutos(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                p.getCod(),
                p.getCodigoBarras(),
                p.getNome(),
                p.getUnidadeMedida(),
                p.getPreco(),
                p.getGrupo(),
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estoque = new javax.swing.JDialog();
        painelEstoque = new javax.swing.JPanel();
        lblProdutoEstoque = new javax.swing.JLabel();
        txtProdutoEstoque = new javax.swing.JTextField();
        btnLimparProdutoEstoque = new javax.swing.JButton();
        lblEstoqueAtual = new javax.swing.JLabel();
        txtEstoqueAtual = new javax.swing.JFormattedTextField();
        txtAjusteEstoque = new javax.swing.JFormattedTextField();
        txtResultadoEstoque = new javax.swing.JFormattedTextField();
        lblResultadoEstoque = new javax.swing.JLabel();
        lblAjusteEstoque = new javax.swing.JLabel();
        lblTituloEstoque = new javax.swing.JLabel();
        btnSalvarEstoque = new javax.swing.JLabel();
        txtProduto2 = new javax.swing.JTextField();
        btnCancelarAjusteEstoque = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        lblAjusteEstoque1 = new javax.swing.JLabel();
        fundo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        painelBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JLabel();
        btnProdutosExcluidos = new javax.swing.JLabel();
        btnAlterarCodigo = new javax.swing.JLabel();
        btnAjusteDeEstoque = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        estoque.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        estoque.setAlwaysOnTop(true);
        estoque.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelEstoque.setBackground(new java.awt.Color(255, 255, 255));
        painelEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                painelEstoqueMouseReleased(evt);
            }
        });
        painelEstoque.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProdutoEstoque.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblProdutoEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutoEstoque.setText("Produto");
        painelEstoque.add(lblProdutoEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 20));

        txtProdutoEstoque.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtProdutoEstoque.setForeground(new java.awt.Color(51, 105, 191));
        txtProdutoEstoque.setOpaque(false);
        txtProdutoEstoque.setPreferredSize(new java.awt.Dimension(200, 20));
        txtProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoEstoqueActionPerformed(evt);
            }
        });
        painelEstoque.add(txtProdutoEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, 20));

        btnLimparProdutoEstoque.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        btnLimparProdutoEstoque.setText("X");
        btnLimparProdutoEstoque.setFocusable(false);
        btnLimparProdutoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparProdutoEstoqueActionPerformed(evt);
            }
        });
        painelEstoque.add(btnLimparProdutoEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, 20));

        lblEstoqueAtual.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblEstoqueAtual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstoqueAtual.setText("Estoque Atual");
        painelEstoque.add(lblEstoqueAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 170, 20));

        txtEstoqueAtual.setEditable(false);
        txtEstoqueAtual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtEstoqueAtual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstoqueAtual.setText("0,0");
        txtEstoqueAtual.setToolTipText("Total bruto");
        txtEstoqueAtual.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        painelEstoque.add(txtEstoqueAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 30));

        txtAjusteEstoque.setForeground(new java.awt.Color(51, 105, 191));
        txtAjusteEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtAjusteEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAjusteEstoque.setText("0,0");
        txtAjusteEstoque.setToolTipText("Total descontos");
        txtAjusteEstoque.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        txtAjusteEstoque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAjusteEstoqueFocusGained(evt);
            }
        });
        txtAjusteEstoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAjusteEstoqueKeyReleased(evt);
            }
        });
        painelEstoque.add(txtAjusteEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, 30));

        txtResultadoEstoque.setEditable(false);
        txtResultadoEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtResultadoEstoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtResultadoEstoque.setText("0,0");
        txtResultadoEstoque.setToolTipText("Total");
        txtResultadoEstoque.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        painelEstoque.add(txtResultadoEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 160, 30));

        lblResultadoEstoque.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblResultadoEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultadoEstoque.setText("Resultado");
        painelEstoque.add(lblResultadoEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 180, 20));

        lblAjusteEstoque.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblAjusteEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAjusteEstoque.setText("Ajuste");
        painelEstoque.add(lblAjusteEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 170, 20));

        lblTituloEstoque.setBackground(new java.awt.Color(51, 105, 191));
        lblTituloEstoque.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblTituloEstoque.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloEstoque.setText("Ajuste de estoque");
        lblTituloEstoque.setOpaque(true);
        painelEstoque.add(lblTituloEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 20));

        btnSalvarEstoque.setBackground(new java.awt.Color(0, 153, 51));
        btnSalvarEstoque.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSalvarEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalvarEstoque.setText("Salvar");
        btnSalvarEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarEstoque.setFocusCycleRoot(true);
        btnSalvarEstoque.setFocusTraversalPolicyProvider(true);
        btnSalvarEstoque.setOpaque(true);
        btnSalvarEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSalvarEstoqueMouseReleased(evt);
            }
        });
        painelEstoque.add(btnSalvarEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 170, 40));

        txtProduto2.setEditable(false);
        txtProduto2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtProduto2.setFocusable(false);
        txtProduto2.setPreferredSize(new java.awt.Dimension(200, 20));
        painelEstoque.add(txtProduto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 300, 20));

        btnCancelarAjusteEstoque.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelarAjusteEstoque.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCancelarAjusteEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarAjusteEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelarAjusteEstoque.setText("Cancelar");
        btnCancelarAjusteEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarAjusteEstoque.setFocusCycleRoot(true);
        btnCancelarAjusteEstoque.setFocusTraversalPolicyProvider(true);
        btnCancelarAjusteEstoque.setOpaque(true);
        btnCancelarAjusteEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarAjusteEstoqueMouseReleased(evt);
            }
        });
        painelEstoque.add(btnCancelarAjusteEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 170, 40));

        txtObs.setColumns(20);
        txtObs.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtObs.setRows(2);
        txtObs.setToolTipText("Observações");
        jScrollPane2.setViewportView(txtObs);

        painelEstoque.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 500, 40));

        lblAjusteEstoque1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblAjusteEstoque1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAjusteEstoque1.setText("Observação");
        painelEstoque.add(lblAjusteEstoque1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 500, 20));

        estoque.getContentPane().add(painelEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 250));

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        fundo.setBackground(new java.awt.Color(255, 255, 255));
        fundo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                fundoComponentHidden(evt);
            }
        });

        tabela.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cod. Barras", "Nome", "UN", "Valor", "Grupo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setFocusable(false);
        tabela.setGridColor(new java.awt.Color(204, 204, 204));
        tabela.setRowHeight(20);
        tabela.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(2).setPreferredWidth(160);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(40);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(40);
        }

        txtPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtPesquisa.setToolTipText("pesquise algum produto pelo nome...");
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        painelBotoes.setBackground(new java.awt.Color(204, 204, 204));

        btnNovo.setBackground(new java.awt.Color(255, 255, 255));
        btnNovo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(51, 51, 51));
        btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setOpaque(true);
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNovoMouseReleased(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(51, 51, 51));
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setOpaque(true);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditarMouseReleased(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(51, 51, 51));
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setOpaque(true);
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExcluirMouseReleased(evt);
            }
        });

        btnProdutosExcluidos.setBackground(new java.awt.Color(255, 102, 102));
        btnProdutosExcluidos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnProdutosExcluidos.setForeground(new java.awt.Color(255, 255, 255));
        btnProdutosExcluidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProdutosExcluidos.setText("Excluídos");
        btnProdutosExcluidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdutosExcluidos.setOpaque(true);
        btnProdutosExcluidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnProdutosExcluidosMouseReleased(evt);
            }
        });

        btnAlterarCodigo.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterarCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAlterarCodigo.setForeground(new java.awt.Color(51, 51, 51));
        btnAlterarCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAlterarCodigo.setText("Alt. código");
        btnAlterarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarCodigo.setOpaque(true);
        btnAlterarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAlterarCodigoMouseReleased(evt);
            }
        });

        btnAjusteDeEstoque.setBackground(new java.awt.Color(255, 255, 255));
        btnAjusteDeEstoque.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAjusteDeEstoque.setForeground(new java.awt.Color(51, 51, 51));
        btnAjusteDeEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAjusteDeEstoque.setText("Aj. estoque");
        btnAjusteDeEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjusteDeEstoque.setOpaque(true);
        btnAjusteDeEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAjusteDeEstoqueMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProdutosExcluidos, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAlterarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAjusteDeEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAjusteDeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProdutosExcluidos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outros/atualizar.png"))); // NOI18N
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizar.setOpaque(true);
        btnAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAtualizarMouseReleased(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Produtos");
        lblTitulo.setOpaque(true);

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addComponent(txtPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)))
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
                    .addGroup(fundoLayout.createSequentialGroup()
                        .addComponent(painelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseReleased
        NovoProduto novo = NovoProduto.getInstancia();
        novo.preencheGrupos();
        novo.setVisible(true);
        listar();
    }//GEN-LAST:event_btnNovoMouseReleased

    private void btnEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseReleased
        if (tabela.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(null, "Nenhum registro selecionado.");
        } else {
            EditarProduto novo = EditarProduto.getInstancia();
            novo.preencheGrupos();
            novo.puxarDados(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
            novo.setVisible(true);
            novo.alterarTitulo("Editando o produto "+tabela.getValueAt(tabela.getSelectedRow(), 2));
        }
    }//GEN-LAST:event_btnEditarMouseReleased

    private void btnExcluirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseReleased
        if (tabela.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(null, "Nenhum registro selecionado.");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir o produto?",
                "Excluir/Inativar?", 2) == 0) {
                prodc.excluir(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
                listar();
            }
        }
    }//GEN-LAST:event_btnExcluirMouseReleased

    private void tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseReleased
        
    }//GEN-LAST:event_tabelaMouseReleased

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void btnProdutosExcluidosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdutosExcluidosMouseReleased
        new RegistrosExcluidos("Produtos excluídos").setVisible(true);
    }//GEN-LAST:event_btnProdutosExcluidosMouseReleased

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        listar();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void btnAlterarCodigoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarCodigoMouseReleased
        if (tabela.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(null, "Nenhum registro selecionado.");
        }
    }//GEN-LAST:event_btnAlterarCodigoMouseReleased

    private void fundoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_fundoComponentHidden
        System.out.println("passou");
    }//GEN-LAST:event_fundoComponentHidden

    private void btnAtualizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseReleased
        listar();
    }//GEN-LAST:event_btnAtualizarMouseReleased

    private void btnAjusteDeEstoqueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjusteDeEstoqueMouseReleased
        estoque.setVisible(true);
        estoque.setLocation(200, 200);
        estoque.setSize(535,288);
    }//GEN-LAST:event_btnAjusteDeEstoqueMouseReleased

    private void txtProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoEstoqueActionPerformed
        
    }//GEN-LAST:event_txtProdutoEstoqueActionPerformed

    private void btnLimparProdutoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparProdutoEstoqueActionPerformed
        txtProdutoEstoque.setText("");
        txtProduto2.setText("");
    }//GEN-LAST:event_btnLimparProdutoEstoqueActionPerformed

    private void btnSalvarEstoqueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarEstoqueMouseReleased
        Double estoqueAtual = Double.parseDouble(txtEstoqueAtual.getText().replace(",", "."));
        int tipoMovimentoEstoque = 0;
        if (txtAjusteEstoque.getText().equalsIgnoreCase("") || txtAjusteEstoque.getText().equalsIgnoreCase("-")
                || Double.parseDouble(txtResultadoEstoque.getText().replace(",", ".")) < 0) {
            estoque.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null, "Ajuste inválido");
            estoque.setAlwaysOnTop(true);
            txtAjusteEstoque.setText("0,00");
            txtResultadoEstoque.setText(estoqueAtual.toString());
            txtAjusteEstoque.requestFocus();
            txtAjusteEstoque.selectAll();
        } else {
            if (Double.parseDouble(txtAjusteEstoque.getText()) < 0) {
                tipoMovimentoEstoque = 2;
            } else {
                tipoMovimentoEstoque = 1;
            }
            
        }
    }//GEN-LAST:event_btnSalvarEstoqueMouseReleased

    private void btnCancelarAjusteEstoqueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarAjusteEstoqueMouseReleased
        estoque.setVisible(false);
    }//GEN-LAST:event_btnCancelarAjusteEstoqueMouseReleased

    private void txtAjusteEstoqueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAjusteEstoqueKeyReleased
        Double estoqueAtual = Double.parseDouble(txtEstoqueAtual.getText().replace(",", "."));
        if (txtAjusteEstoque.getText().equalsIgnoreCase("") || txtAjusteEstoque.getText().equalsIgnoreCase("-")) {
            txtResultadoEstoque.setText(estoqueAtual.toString());
        } else {
            txtResultadoEstoque.setText(Double.toString(
                    estoqueAtual + Double.parseDouble(txtAjusteEstoque.getText().replace(",", "."))
            ).replace(",", "."));
        }
    }//GEN-LAST:event_txtAjusteEstoqueKeyReleased

    private void painelEstoqueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelEstoqueMouseReleased
        System.out.println(estoque.getSize());
    }//GEN-LAST:event_painelEstoqueMouseReleased

    private void txtAjusteEstoqueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAjusteEstoqueFocusGained
        txtAjusteEstoque.selectAll();
    }//GEN-LAST:event_txtAjusteEstoqueFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAjusteDeEstoque;
    private javax.swing.JLabel btnAlterarCodigo;
    private javax.swing.JLabel btnAtualizar;
    private javax.swing.JLabel btnCancelarAjusteEstoque;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnExcluir;
    private javax.swing.JButton btnLimparProdutoEstoque;
    private javax.swing.JLabel btnNovo;
    private javax.swing.JLabel btnProdutosExcluidos;
    private javax.swing.JLabel btnSalvarEstoque;
    private javax.swing.JDialog estoque;
    private javax.swing.JPanel fundo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAjusteEstoque;
    private javax.swing.JLabel lblAjusteEstoque1;
    private javax.swing.JLabel lblEstoqueAtual;
    private javax.swing.JLabel lblProdutoEstoque;
    private javax.swing.JLabel lblResultadoEstoque;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloEstoque;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JPanel painelEstoque;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField txtAjusteEstoque;
    private javax.swing.JFormattedTextField txtEstoqueAtual;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtProduto2;
    private javax.swing.JTextField txtProdutoEstoque;
    private javax.swing.JFormattedTextField txtResultadoEstoque;
    // End of variables declaration//GEN-END:variables
}
