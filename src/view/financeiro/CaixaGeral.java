package view.financeiro;

import view.cadastros.entidades.*;
import controller.cadastros.entidades.EntidadeController;
import javax.swing.table.DefaultTableModel;
import model.cadastros.entidades.EntidadeModel;

public class CaixaGeral extends javax.swing.JPanel {
    private static final CaixaGeral INSTANCIA = new CaixaGeral();
    EntidadeController ec = new EntidadeController();
    
    public static CaixaGeral getInstancia() {
        return INSTANCIA;
    }
    
    public CaixaGeral() {
        initComponents();
        listarCaixas();
    }
    
    public void listarCaixas(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (EntidadeModel e : ec.listaClientes(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                e.getCod(),
                e.getNome(),
                e.getCNPJ(),
                e.getUF(),
                e.getxMun(),
            });
        }
    }
    public void listarVendas(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (EntidadeModel e : ec.listaClientes(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                e.getCod(),
                e.getNome(),
                e.getCNPJ(),
                e.getUF(),
                e.getxMun(),
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnFecharCaixa = new javax.swing.JLabel();
        btnAbrirCaixa = new javax.swing.JLabel();
        btnFecharCaixa1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnAtualizarCaixas = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JLabel();
        btnNovo3 = new javax.swing.JLabel();
        btnNovo4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtPesquisa1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnAtualizarVendas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentHidden(evt);
            }
        });

        txtPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtPesquisa.setToolTipText("Pesquise pelo nome.");
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnFecharCaixa.setBackground(new java.awt.Color(51, 105, 191));
        btnFecharCaixa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnFecharCaixa.setForeground(new java.awt.Color(255, 255, 255));
        btnFecharCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFecharCaixa.setText("Fechar caixa");
        btnFecharCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharCaixa.setOpaque(true);
        btnFecharCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFecharCaixaMouseReleased(evt);
            }
        });

        btnAbrirCaixa.setBackground(new java.awt.Color(51, 105, 191));
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

        btnFecharCaixa1.setBackground(new java.awt.Color(51, 105, 191));
        btnFecharCaixa1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnFecharCaixa1.setForeground(new java.awt.Color(255, 255, 255));
        btnFecharCaixa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFecharCaixa1.setText("Visualizar");
        btnFecharCaixa1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharCaixa1.setOpaque(true);
        btnFecharCaixa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFecharCaixa1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbrirCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFecharCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btnFecharCaixa1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbrirCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFecharCaixa1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tabela.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
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

        btnAtualizarCaixas.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualizarCaixas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAtualizarCaixas.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarCaixas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAtualizarCaixas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outros/atualizar.png"))); // NOI18N
        btnAtualizarCaixas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizarCaixas.setOpaque(true);
        btnAtualizarCaixas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAtualizarCaixasMouseReleased(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Caixa geral");
        lblTitulo.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vendas");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Caixas");
        jLabel2.setOpaque(true);

        tabela1.setBackground(new java.awt.Color(204, 204, 204));
        tabela1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data", "Usuário", "Valor"
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
        tabela1.setRowHeight(25);
        tabela1.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tabela1.getTableHeader().setReorderingAllowed(false);
        tabela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabela1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tabela1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnNovo.setBackground(new java.awt.Color(51, 105, 191));
        btnNovo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovo.setText("Novo");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setOpaque(true);
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNovoMouseReleased(evt);
            }
        });

        btnNovo3.setBackground(new java.awt.Color(51, 105, 191));
        btnNovo3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnNovo3.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovo3.setText("Visualizar");
        btnNovo3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo3.setOpaque(true);
        btnNovo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNovo3MouseReleased(evt);
            }
        });

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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(btnNovo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovo4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNovo3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Data", "Usuario" }));

        txtPesquisa1.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtPesquisa1.setToolTipText("Pesquise pelo nome.");
        txtPesquisa1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisa1KeyReleased(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Data", "Usuario" }));

        btnAtualizarVendas.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualizarVendas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAtualizarVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAtualizarVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outros/atualizar.png"))); // NOI18N
        btnAtualizarVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizarVendas.setOpaque(true);
        btnAtualizarVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAtualizarVendasMouseReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Total");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPesquisa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizarCaixas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(btnAtualizarCaixas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPesquisa1)
                            .addComponent(btnAtualizarVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseReleased
        
    }//GEN-LAST:event_btnNovoMouseReleased

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void jPanel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentHidden
        
    }//GEN-LAST:event_jPanel1ComponentHidden

    private void tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseReleased

    }//GEN-LAST:event_tabelaMouseReleased

    private void btnAtualizarCaixasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarCaixasMouseReleased
        
    }//GEN-LAST:event_btnAtualizarCaixasMouseReleased

    private void tabela1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabela1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tabela1MouseReleased

    private void btnAbrirCaixaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirCaixaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirCaixaMouseReleased

    private void btnFecharCaixaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharCaixaMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharCaixaMouseReleased

    private void txtPesquisa1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisa1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisa1KeyReleased

    private void btnAtualizarVendasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarVendasMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarVendasMouseReleased

    private void btnNovo3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovo3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovo3MouseReleased

    private void btnNovo4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovo4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovo4MouseReleased

    private void btnFecharCaixa1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharCaixa1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharCaixa1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAbrirCaixa;
    private javax.swing.JLabel btnAtualizarCaixas;
    private javax.swing.JLabel btnAtualizarVendas;
    private javax.swing.JLabel btnFecharCaixa;
    private javax.swing.JLabel btnFecharCaixa1;
    private javax.swing.JLabel btnNovo;
    private javax.swing.JLabel btnNovo3;
    private javax.swing.JLabel btnNovo4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabela;
    private javax.swing.JTable tabela1;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPesquisa1;
    // End of variables declaration//GEN-END:variables
}
