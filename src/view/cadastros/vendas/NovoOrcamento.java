package view.cadastros.vendas;

import controller.PesquisarController;
import view.cadastros.clientes.NovoCliente;
import java.awt.Color;
import model.funcoes.PesquisarModel;
import view.TelaInicial;
import view.cadastros.funcoes.Pesquisar;


public class NovoOrcamento extends javax.swing.JFrame {
    private static final NovoOrcamento INSTANCIA = new NovoOrcamento();
    PesquisarModel pm = new PesquisarModel();

    public static NovoOrcamento getInstancia() {
        return INSTANCIA;
    }

    private NovoOrcamento() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        txtCliente2 = new javax.swing.JTextField();
        btnNovoCliente = new javax.swing.JButton();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        txtDescricaoProduto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnRemoverProduto = new javax.swing.JButton();
        btnEditarProduto = new javax.swing.JButton();
        btnAdicionarProduto = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        lblTitulo9 = new javax.swing.JLabel();
        txtQuantidadeProduto = new javax.swing.JTextField();
        lblTitulo8 = new javax.swing.JLabel();
        txtValorUnitarioProduto = new javax.swing.JFormattedTextField();
        txtValorDescontoProduto = new javax.swing.JFormattedTextField();
        lblTitulo10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        btnSalvar = new javax.swing.JButton();
        txtCliente = new javax.swing.JTextField();
        lblTitulo11 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        txtPlaca2 = new javax.swing.JTextField();
        txtTotal = new javax.swing.JFormattedTextField();
        txtTotalDescontos = new javax.swing.JFormattedTextField();
        txtValorBruto = new javax.swing.JFormattedTextField();
        lblTitulo12 = new javax.swing.JLabel();
        lblPlaca1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Novo orçamento");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("NOVO ORÇAMENTO");
        lblTitulo.setOpaque(true);

        lblCod.setBackground(new java.awt.Color(51, 51, 51));
        lblCod.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCod.setForeground(new java.awt.Color(255, 255, 255));
        lblCod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCod.setText("Nº 1");
        lblCod.setToolTipText("Número do orçamento");
        lblCod.setOpaque(true);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        txtCliente2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCliente2.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCliente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCliente2ActionPerformed(evt);
            }
        });

        btnNovoCliente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnNovoCliente.setText("+");
        btnNovoCliente.setToolTipText("Novo Cliente");
        btnNovoCliente.setFocusable(false);
        btnNovoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovoClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNovoClienteMouseExited(evt);
            }
        });
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        lblPlaca.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblPlaca.setForeground(new java.awt.Color(51, 105, 191));
        lblPlaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaca.setText("Cliente");

        txtPlaca.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtPlaca.setForeground(new java.awt.Color(51, 105, 191));
        txtPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlaca.setPreferredSize(new java.awt.Dimension(200, 20));

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        tblProdutos.setBackground(new java.awt.Color(204, 204, 204));
        tblProdutos.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Produto", "Valor un.", "Qtd.", "Desconto", "Total"
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
        tblProdutos.setGridColor(new java.awt.Color(204, 204, 204));
        tblProdutos.setOpaque(false);
        tblProdutos.setRowHeight(20);
        jScrollPane2.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        txtDescricaoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoProdutoActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemoverProduto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnRemoverProduto.setText("Remover");
        btnRemoverProduto.setFocusable(false);
        btnRemoverProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRemoverProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRemoverProdutoMouseExited(evt);
            }
        });
        btnRemoverProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoverProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 110, 40));

        btnEditarProduto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditarProduto.setText("Editar");
        btnEditarProduto.setFocusable(false);
        btnEditarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarProdutoMouseExited(evt);
            }
        });
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 110, 40));

        btnAdicionarProduto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAdicionarProduto.setText("Adicionar");
        btnAdicionarProduto.setFocusable(false);
        btnAdicionarProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdicionarProdutoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdicionarProdutoMouseExited(evt);
            }
        });
        btnAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdicionarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCheckBox1.setText("Placa");
        jCheckBox1.setFocusable(false);
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 110, 30));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Exibir");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 110, 20));

        jCheckBox2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCheckBox2.setText("Produtos");
        jCheckBox2.setFocusable(false);
        jCheckBox2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 110, 30));

        jCheckBox3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jCheckBox3.setText("Descontos");
        jCheckBox3.setFocusable(false);
        jCheckBox3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 110, 30));

        lblTitulo9.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblTitulo9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo9.setText("Quantidade:");

        txtQuantidadeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeProdutoActionPerformed(evt);
            }
        });

        lblTitulo8.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblTitulo8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo8.setText("Valor Un:");

        txtValorUnitarioProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        txtValorDescontoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        lblTitulo10.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblTitulo10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo10.setText("Desconto:");

        txtObs.setColumns(20);
        txtObs.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        txtObs.setRows(4);
        txtObs.setToolTipText("Observações");
        jScrollPane1.setViewportView(txtObs);

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
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

        txtCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCliente.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });

        lblTitulo11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo11.setText("Produtos");
        lblTitulo11.setOpaque(true);

        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        txtPlaca2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPlaca2.setPreferredSize(new java.awt.Dimension(200, 20));
        txtPlaca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca2ActionPerformed(evt);
            }
        });

        txtTotal.setEditable(false);
        txtTotal.setForeground(new java.awt.Color(51, 153, 0));
        txtTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotal.setText("0,00");
        txtTotal.setToolTipText("Total");
        txtTotal.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N

        txtTotalDescontos.setForeground(new java.awt.Color(204, 0, 51));
        txtTotalDescontos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotalDescontos.setText("0,00");
        txtTotalDescontos.setToolTipText("Total descontos");
        txtTotalDescontos.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtTotalDescontos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalDescontosActionPerformed(evt);
            }
        });

        txtValorBruto.setEditable(false);
        txtValorBruto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtValorBruto.setText("0,00");
        txtValorBruto.setToolTipText("total bruto");
        txtValorBruto.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtValorBruto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorBrutoActionPerformed(evt);
            }
        });

        lblTitulo12.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lblTitulo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo12.setText("Totais");

        lblPlaca1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblPlaca1.setForeground(new java.awt.Color(51, 105, 191));
        lblPlaca1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlaca1.setText("Placa");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProduto)
                                    .addComponent(lblTitulo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                                        .addComponent(txtValorUnitarioProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTitulo10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtValorDescontoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTitulo9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDescricaoProduto)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblTitulo12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalDescontos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPrincipalLayout.createSequentialGroup()
                                .addComponent(txtCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPlaca2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPlaca2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(lblPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo11)
                .addGap(5, 5, 5)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelPrincipalLayout.createSequentialGroup()
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblTitulo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValorDescontoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addComponent(txtValorUnitarioProduto)
                                .addComponent(lblTitulo10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTitulo9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValorBruto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalDescontos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitulo12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaInicial telainicial = new TelaInicial();
        telainicial.opcoes = false;
    }//GEN-LAST:event_formWindowClosed

    private void txtDescricaoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoActionPerformed

    }//GEN-LAST:event_txtDescricaoProdutoActionPerformed

    private void btnNovoClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoClienteMouseEntered
        btnNovoCliente.setForeground(Color.RED);
    }//GEN-LAST:event_btnNovoClienteMouseEntered

    private void btnNovoClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoClienteMouseExited
        btnNovoCliente.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnNovoClienteMouseExited

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        NovoCliente novo = NovoCliente.getInstancia();
        novo.setVisible(true);
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        btnSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCliente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCliente2ActionPerformed
        
    }//GEN-LAST:event_txtCliente2ActionPerformed

    private void txtQuantidadeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeProdutoActionPerformed

    private void btnRemoverProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverProdutoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverProdutoMouseEntered

    private void btnRemoverProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverProdutoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverProdutoMouseExited

    private void btnRemoverProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoverProdutoActionPerformed

    private void btnEditarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProdutoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarProdutoMouseEntered

    private void btnEditarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarProdutoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarProdutoMouseExited

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnAdicionarProdutoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarProdutoMouseEntered

    private void btnAdicionarProdutoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarProdutoMouseExited

    private void btnAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarProdutoActionPerformed
        double soma = 0;
        for (int i = 0; i < tblProdutos.getColumnCount(); i++) {
            Double valor = (Double) tblProdutos.getValueAt(i, 5);
            soma += valor.doubleValue();
        }
        txtTotal.setText(String.valueOf(soma));
    }//GEN-LAST:event_btnAdicionarProdutoActionPerformed

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        new Pesquisar("Clientes",txtCliente.getText()).setVisible(true);
        if (pm.getResultado() < 1) {
            
        } else {
            
        }
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        new Pesquisar("Produtos",txtProduto.getText()).setVisible(true);
        if (pm.getResultado() < 1) {
            
        } else {
            
        }
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtPlaca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca2ActionPerformed

    private void txtValorBrutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorBrutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorBrutoActionPerformed

    private void txtTotalDescontosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalDescontosActionPerformed
        txtTotal.setValue(Integer.parseInt(txtValorBruto.getText()) - Integer.parseInt(txtTotalDescontos.getText()));
    }//GEN-LAST:event_txtTotalDescontosActionPerformed

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
            java.util.logging.Logger.getLogger(NovoOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoOrcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarProduto;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnRemoverProduto;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPlaca1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo10;
    private javax.swing.JLabel lblTitulo11;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTitulo8;
    private javax.swing.JLabel lblTitulo9;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCliente2;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPlaca2;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    private javax.swing.JFormattedTextField txtTotal;
    private javax.swing.JFormattedTextField txtTotalDescontos;
    private javax.swing.JFormattedTextField txtValorBruto;
    private javax.swing.JFormattedTextField txtValorDescontoProduto;
    private javax.swing.JFormattedTextField txtValorUnitarioProduto;
    // End of variables declaration//GEN-END:variables
}
