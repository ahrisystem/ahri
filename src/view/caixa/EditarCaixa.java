package view.caixa;

import controller.cadastros.entidades.EntidadeController;
import controller.funcoes.PesquisarController;
import java.awt.event.KeyEvent;
import view.TelaInicial;


public class EditarCaixa extends javax.swing.JFrame {
    final int fisica = 0;
    EntidadeController ec = new EntidadeController();
    PesquisarController pc = new PesquisarController();
    String pesquisaAtual;
    
    private static final EditarCaixa INSTANCIA = new EditarCaixa();

    public static EditarCaixa getInstancia() {
        return INSTANCIA;
    }
    

    private EditarCaixa() {
        initComponents();
        setLocationRelativeTo(null);
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
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jTabbedPane = new javax.swing.JTabbedPane();
        abaFiscal = new javax.swing.JPanel();
        txtPreco = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        txtPreco1 = new javax.swing.JFormattedTextField();
        lblNome3 = new javax.swing.JLabel();
        txtPreco2 = new javax.swing.JFormattedTextField();
        lblNome4 = new javax.swing.JLabel();
        txtPreco3 = new javax.swing.JFormattedTextField();
        lblNome5 = new javax.swing.JLabel();
        txtPreco4 = new javax.swing.JFormattedTextField();
        lblNome6 = new javax.swing.JLabel();
        txtPreco5 = new javax.swing.JFormattedTextField();
        lblNome7 = new javax.swing.JLabel();
        txtPreco6 = new javax.swing.JFormattedTextField();
        abaPlacas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnNovo4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
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
        lblCodigo.setText("Data");
        painelPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigo.setText("01/01/2019");
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, 20));

        txtNome.setEditable(false);
        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setText("adm");
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 540, 20));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Fechar");
        btnSalvar.setFocusable(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 80, 30));

        jTabbedPane.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        abaFiscal.setOpaque(false);
        abaFiscal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPreco.setEditable(false);
        txtPreco.setForeground(new java.awt.Color(0, 153, 0));
        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPreco.setText("0,00");
        txtPreco.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 130, 30));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 105, 191));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Fundo de troco");
        abaFiscal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 30));

        lblNome2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(51, 105, 191));
        lblNome2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome2.setText("Suprimentos");
        abaFiscal.add(lblNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 30));

        txtPreco1.setEditable(false);
        txtPreco1.setForeground(new java.awt.Color(0, 153, 0));
        txtPreco1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPreco1.setText("0,00");
        txtPreco1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtPreco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 130, 30));

        lblNome3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome3.setForeground(new java.awt.Color(51, 105, 191));
        lblNome3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome3.setText("Sangria");
        abaFiscal.add(lblNome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 30));

        txtPreco2.setEditable(false);
        txtPreco2.setForeground(new java.awt.Color(0, 153, 0));
        txtPreco2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPreco2.setText("0,00");
        txtPreco2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtPreco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 130, 30));

        lblNome4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome4.setForeground(new java.awt.Color(51, 105, 191));
        lblNome4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome4.setText("Saídas");
        abaFiscal.add(lblNome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 140, 30));

        txtPreco3.setEditable(false);
        txtPreco3.setForeground(new java.awt.Color(0, 153, 0));
        txtPreco3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPreco3.setText("0,00");
        txtPreco3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtPreco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 130, 30));

        lblNome5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome5.setForeground(new java.awt.Color(51, 105, 191));
        lblNome5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome5.setText("Entradas");
        abaFiscal.add(lblNome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 140, 30));

        txtPreco4.setEditable(false);
        txtPreco4.setForeground(new java.awt.Color(0, 153, 0));
        txtPreco4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPreco4.setText("0,00");
        txtPreco4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtPreco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 130, 30));

        lblNome6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome6.setForeground(new java.awt.Color(51, 105, 191));
        lblNome6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome6.setText("Descontos");
        abaFiscal.add(lblNome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 140, 30));

        txtPreco5.setEditable(false);
        txtPreco5.setForeground(new java.awt.Color(0, 153, 0));
        txtPreco5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPreco5.setText("0,00");
        txtPreco5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtPreco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 130, 30));

        lblNome7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome7.setForeground(new java.awt.Color(51, 105, 191));
        lblNome7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome7.setText("Total vendas");
        abaFiscal.add(lblNome7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 140, 30));

        txtPreco6.setEditable(false);
        txtPreco6.setForeground(new java.awt.Color(0, 153, 0));
        txtPreco6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPreco6.setText("0,00");
        txtPreco6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtPreco6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 130, 30));

        jTabbedPane.addTab("Totais", abaFiscal);

        abaPlacas.setOpaque(false);
        abaPlacas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabela1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Tipo", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela1.setFocusable(false);
        tabela1.setGridColor(new java.awt.Color(204, 204, 204));
        tabela1.setRowHeight(20);
        tabela1.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tabela1.getTableHeader().setReorderingAllowed(false);
        tabela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabela1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela1);

        abaPlacas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 190));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        btnNovo4.setBackground(new java.awt.Color(51, 105, 191));
        btnNovo4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnNovo4.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovo4.setText("Visualizar");
        btnNovo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo4.setOpaque(true);
        btnNovo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNovo4MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        abaPlacas.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 10, 90, -1));

        jTabbedPane.addTab("Vendas", abaPlacas);

        painelPrincipal.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 240));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STATUS");
        painelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 10, 130, 20));

        lblNome1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(51, 105, 191));
        lblNome1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome1.setText("Usuário");
        painelPrincipal.add(lblNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        jScrollPane.setViewportView(painelPrincipal);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 750, 370));

        lblTitulo.setBackground(new java.awt.Color(0, 51, 102));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Visualizar caixa");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaInicial telainicial = new TelaInicial();
        telainicial.opcoes = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            pesquisar.setVisible(false);
        }
    }//GEN-LAST:event_tabelaKeyReleased

    private void btnSelecionarPesquisaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecionarPesquisaMouseReleased
        
    }//GEN-LAST:event_btnSelecionarPesquisaMouseReleased

    private void tabela1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela1MouseReleased

    }//GEN-LAST:event_tabela1MouseReleased

    private void btnNovo4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovo4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovo4MouseReleased

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Look and feel">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {java.util.logging.Logger.getLogger(EditarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {java.util.logging.Logger.getLogger(EditarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {java.util.logging.Logger.getLogger(EditarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {java.util.logging.Logger.getLogger(EditarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaFiscal;
    private javax.swing.JPanel abaPlacas;
    private javax.swing.JLabel btnNovo4;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel btnSelecionarPesquisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNome5;
    private javax.swing.JLabel lblNome6;
    private javax.swing.JLabel lblNome7;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloPesquisa;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JDialog pesquisar;
    private javax.swing.JPanel planoDeFundo1;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabela1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JFormattedTextField txtPreco1;
    private javax.swing.JFormattedTextField txtPreco2;
    private javax.swing.JFormattedTextField txtPreco3;
    private javax.swing.JFormattedTextField txtPreco4;
    private javax.swing.JFormattedTextField txtPreco5;
    private javax.swing.JFormattedTextField txtPreco6;
    // End of variables declaration//GEN-END:variables
}
