package view.caixa;

import controller.vendas.CaixaController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.vendas.CaixaModel;

public class Caixas extends javax.swing.JPanel {
    CaixaController cc = new CaixaController();
    private static final Caixas INSTANCIA = new Caixas();
    
    public static Caixas getInstancia() {
        return INSTANCIA;
    }
    
    public Caixas() {
        initComponents();
        listar();
    }
    
    public void fecharCaixa(){
        CaixaModel cm = new CaixaModel();
        cc.puxarDadosCaixa(cm, Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
        lblId.setText(Integer.toString(cm.getId()));
        lblDataFC.setText(cm.getData());
        lblUsuarioFC.setText(lblUsuario.getText());
        txtFundoAtual.setText(Double.toString(cm.getFundo()));
        txtTotaldeVendas.setText(Double.toString(cm.getTotal()));
        fecharcaixa.setSize(380, 250);
        fecharcaixa.setVisible(true);
    }
    
    public void listar(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (CaixaModel e : cc.listaCaixas(cbxFechado.isSelected())) {
            String status = "";
            if (e.isFechado()) {
                status = "Fechado";
            } else {
                status = "Aberto";
            }
            modelo.addRow(new Object[]{
                e.getId(),
                e.getData(),
                status,
                e.getUsuario(),
                e.getEntrada(),
                e.getSaida()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fecharcaixa = new javax.swing.JDialog();
        painelFecharCaixa = new javax.swing.JPanel();
        btnFecharCaixa = new javax.swing.JLabel();
        lblDataFC = new javax.swing.JLabel();
        lblUsuarioFC = new javax.swing.JLabel();
        lblSangriaFC = new javax.swing.JLabel();
        lbltdv = new javax.swing.JLabel();
        txtFundoAtual = new javax.swing.JFormattedTextField();
        txtTotaldeVendas = new javax.swing.JFormattedTextField();
        txtSangria = new javax.swing.JFormattedTextField();
        lblfafc = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JLabel();
        btnFechar = new javax.swing.JLabel();
        btnVisualizar = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        cbxFechado = new javax.swing.JCheckBox();

        fecharcaixa.setResizable(false);
        fecharcaixa.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelFecharCaixa.setBackground(new java.awt.Color(255, 255, 255));
        painelFecharCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                painelFecharCaixaMousePressed(evt);
            }
        });
        painelFecharCaixa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFecharCaixa.setBackground(new java.awt.Color(102, 153, 255));
        btnFecharCaixa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnFecharCaixa.setForeground(new java.awt.Color(255, 255, 255));
        btnFecharCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFecharCaixa.setText("Fechar!");
        btnFecharCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFecharCaixa.setOpaque(true);
        btnFecharCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFecharCaixaMouseReleased(evt);
            }
        });
        painelFecharCaixa.add(btnFecharCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 380, 40));

        lblDataFC.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDataFC.setForeground(new java.awt.Color(51, 51, 51));
        lblDataFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataFC.setText("Data");
        lblDataFC.setToolTipText("Data");
        painelFecharCaixa.add(lblDataFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 270, 26));

        lblUsuarioFC.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUsuarioFC.setForeground(new java.awt.Color(51, 51, 51));
        lblUsuarioFC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioFC.setText("adm");
        lblUsuarioFC.setToolTipText("Data");
        painelFecharCaixa.add(lblUsuarioFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 360, 26));

        lblSangriaFC.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblSangriaFC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSangriaFC.setText("Sangria");
        painelFecharCaixa.add(lblSangriaFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 156, 100, 30));

        lbltdv.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbltdv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltdv.setText("Total de vendas");
        painelFecharCaixa.add(lbltdv, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, 26));

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
        painelFecharCaixa.add(txtFundoAtual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 100, -1));

        txtTotaldeVendas.setEditable(false);
        txtTotaldeVendas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtTotaldeVendas.setText("0,00");
        txtTotaldeVendas.setToolTipText("Total descontos");
        txtTotaldeVendas.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        painelFecharCaixa.add(txtTotaldeVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 100, -1));

        txtSangria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtSangria.setText("0,00");
        txtSangria.setToolTipText("Total descontos");
        txtSangria.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        painelFecharCaixa.add(txtSangria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 158, 100, 30));

        lblfafc.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblfafc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblfafc.setText("Fundo atual");
        painelFecharCaixa.add(lblfafc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 100, 26));

        lblId.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblId.setText("0");
        painelFecharCaixa.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 20));

        fecharcaixa.getContentPane().add(painelFecharCaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        btnEditar.setBackground(new java.awt.Color(102, 102, 102));
        btnEditar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setOpaque(true);
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditarMouseReleased(evt);
            }
        });

        btnFechar.setBackground(new java.awt.Color(102, 102, 102));
        btnFechar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFechar.setText("Fechar");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.setOpaque(true);
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnFecharMouseReleased(evt);
            }
        });

        btnVisualizar.setBackground(new java.awt.Color(51, 105, 191));
        btnVisualizar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnVisualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVisualizar.setText("Visualizar");
        btnVisualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizar.setOpaque(true);
        btnVisualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVisualizarMouseReleased(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario");
        lblUsuario.setToolTipText("Usuário logado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addContainerGap())
        );

        tabela.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Data do caixa", "Status", "Usuário", "Entradas", "Saídas"
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
            tabela.getColumnModel().getColumn(0).setMaxWidth(50);
            tabela.getColumnModel().getColumn(1).setMaxWidth(80);
            tabela.getColumnModel().getColumn(4).setMaxWidth(80);
            tabela.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        btnAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/outros/atualizar.png"))); // NOI18N
        btnAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAtualizarMouseReleased(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Caixas");
        lblTitulo.setOpaque(true);

        cbxFechado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbxFechado.setText("Fechados");
        cbxFechado.setToolTipText("Marque caso ele seja também um fornecedor.");
        cbxFechado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cbxFechado.setOpaque(false);
        cbxFechado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFechadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxFechado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxFechado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void jPanel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentHidden
        
    }//GEN-LAST:event_jPanel1ComponentHidden

    private void tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseReleased

    }//GEN-LAST:event_tabelaMouseReleased

    private void btnAtualizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseReleased
        listar();
    }//GEN-LAST:event_btnAtualizarMouseReleased

    private void btnEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseReleased
        
    }//GEN-LAST:event_btnEditarMouseReleased

    private void btnFecharMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseReleased
        if (tabela.getSelectedRow() > -1 & tabela.getValueAt(tabela.getSelectedRow(), 2).toString().equalsIgnoreCase("aberto")) {
            fecharCaixa();
        } else {
            JOptionPane.showMessageDialog(null, "Selecine algum caixa em aberto!");
        }
    }//GEN-LAST:event_btnFecharMouseReleased

    private void btnVisualizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarMouseReleased
        if (tabela.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(null, "Nenhum orçamento selecionado.");
        } else {
            if (tabela.getValueAt(tabela.getSelectedRow(), 1).toString().equalsIgnoreCase("Finalizado")) {
                JOptionPane.showMessageDialog(null, "Não é possível alterar orçamentos FINALIZADOS.");
            } else {
                EditarCaixa edit = EditarCaixa.getInstancia();
                edit.puxarDados(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
                edit.setVisible(true);
                listar();
            }
        }
    }//GEN-LAST:event_btnVisualizarMouseReleased

    private void cbxFechadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFechadoActionPerformed
        listar();
    }//GEN-LAST:event_cbxFechadoActionPerformed

    private void btnFecharCaixaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharCaixaMouseReleased
        CaixaModel cm = new CaixaModel();
        cm.setId(Integer.parseInt(lblId.getText()));
        cc.fecharCaixa(cm, Integer.parseInt(lblId.getText()));
    }//GEN-LAST:event_btnFecharCaixaMouseReleased

    private void txtFundoAtualFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFundoAtualFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundoAtualFocusLost

    private void painelFecharCaixaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_painelFecharCaixaMousePressed

    }//GEN-LAST:event_painelFecharCaixaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAtualizar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnFechar;
    private javax.swing.JLabel btnFecharCaixa;
    private javax.swing.JLabel btnVisualizar;
    private javax.swing.JCheckBox cbxFechado;
    private javax.swing.JDialog fecharcaixa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataFC;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblSangriaFC;
    private javax.swing.JLabel lblTitulo;
    public javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuarioFC;
    private javax.swing.JLabel lblfafc;
    private javax.swing.JLabel lbltdv;
    private javax.swing.JPanel painelFecharCaixa;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField txtFundoAtual;
    private javax.swing.JFormattedTextField txtSangria;
    private javax.swing.JFormattedTextField txtTotaldeVendas;
    // End of variables declaration//GEN-END:variables
}
