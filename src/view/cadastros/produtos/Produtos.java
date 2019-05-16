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

        fundo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JLabel();
        btnEditar1 = new javax.swing.JLabel();
        btnAlterarCodigo = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

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

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

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

        btnEditar.setBackground(new java.awt.Color(51, 105, 191));
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

        btnExcluir.setBackground(new java.awt.Color(51, 105, 191));
        btnExcluir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setOpaque(true);
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnExcluirMouseReleased(evt);
            }
        });

        btnEditar1.setBackground(new java.awt.Color(255, 102, 102));
        btnEditar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar1.setText("Excluídos");
        btnEditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar1.setOpaque(true);
        btnEditar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditar1MouseReleased(evt);
            }
        });

        btnAlterarCodigo.setBackground(new java.awt.Color(51, 105, 191));
        btnAlterarCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAlterarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAlterarCodigo.setText("Alt. código");
        btnAlterarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarCodigo.setOpaque(true);
        btnAlterarCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAlterarCodigoMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnAlterarCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        novo.alterarTitulo("NOVO PRODUTO");
        novo.setVisible(true);
        listar();
    }//GEN-LAST:event_btnNovoMouseReleased

    private void btnEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseReleased
        if (tabela.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(null, "Nenhum registro selecionado.");
        } else {
            NovoProduto novo = NovoProduto.getInstancia();
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

    private void btnEditar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar1MouseReleased
        new RegistrosExcluidos("Produtos excluídos").setVisible(true);
    }//GEN-LAST:event_btnEditar1MouseReleased

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAlterarCodigo;
    private javax.swing.JLabel btnAtualizar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnEditar1;
    private javax.swing.JLabel btnExcluir;
    private javax.swing.JLabel btnNovo;
    private javax.swing.JPanel fundo;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
