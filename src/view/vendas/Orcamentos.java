package view.vendas;

import view.cadastros.usuarios.*;
import controller.vendas.VendasController;
import funcoes.GerarOrçamentoPDF;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.vendas.VendasModel;

public class Orcamentos extends javax.swing.JPanel {
    private static final Orcamentos INSTANCIA = new Orcamentos();
    VendasController ec = new VendasController();
    GerarOrçamentoPDF go = new GerarOrçamentoPDF();
    
    public static Orcamentos getInstancia() {
        return INSTANCIA;
    }
    
    public Orcamentos() {
        initComponents();
        listar();
    }
    
    public void listar(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        String filtro = txtFiltro.getSelectedItem().toString();
        for (VendasModel e : ec.listaOrcamentos(filtro,txtPesquisa.getText())) {
            String status = "";
            if (e.getStatus()==1) {
                status = "Emitido";
            }
            if (e.getStatus()==2) {
                status = "Finalizado";
            }
            if (e.getStatus()==3) {
                status = "Cancelado";
            }
            modelo.addRow(new Object[]{
                e.getCod(),
                status,
                e.getNomecliente(),
                e.getCnpjcliente(),
                e.getValorTotal()
            });
        }
    }
    public void usuario(String usuario){
        lblUsuario.setText(usuario);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alterarStatus = new javax.swing.JDialog();
        planoDeFundo1 = new javax.swing.JPanel();
        lblTituloAlterarStatus = new javax.swing.JLabel();
        btnSelecionarPesquisa = new javax.swing.JLabel();
        jTextArea1 = new javax.swing.JTextArea();
        txtStatus = new javax.swing.JComboBox<>();
        lblCodOrcamento = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JLabel();
        btnEditar = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        btnGerarPDF = new javax.swing.JLabel();
        btnAlterarStatus = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JComboBox<>();

        planoDeFundo1.setBackground(new java.awt.Color(255, 255, 255));

        lblTituloAlterarStatus.setBackground(new java.awt.Color(153, 153, 153));
        lblTituloAlterarStatus.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTituloAlterarStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloAlterarStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTituloAlterarStatus.setText("Alterar status do orçamento Nº ");
        lblTituloAlterarStatus.setOpaque(true);

        btnSelecionarPesquisa.setBackground(new java.awt.Color(102, 153, 255));
        btnSelecionarPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSelecionarPesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarPesquisa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSelecionarPesquisa.setText("Feito");
        btnSelecionarPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelecionarPesquisa.setOpaque(true);
        btnSelecionarPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSelecionarPesquisaMouseReleased(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setText("STATUS seria a situação na qual encontra-se o orçamento, quando ele é salvo primeiramente fica como EMITIDO, após realmente efetuar a venda ele fica como FINALIZADO, caso não seja finalizado ele fica como CANCELADO. Escolha abaixo qual o novo STATUS do orçamento.\n");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setFocusable(false);

        txtStatus.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emitido", "Finalizado", "Cancelado" }));

        lblCodOrcamento.setBackground(new java.awt.Color(153, 153, 153));
        lblCodOrcamento.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblCodOrcamento.setForeground(new java.awt.Color(255, 255, 255));
        lblCodOrcamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodOrcamento.setText("0");
        lblCodOrcamento.setOpaque(true);

        javax.swing.GroupLayout planoDeFundo1Layout = new javax.swing.GroupLayout(planoDeFundo1);
        planoDeFundo1.setLayout(planoDeFundo1Layout);
        planoDeFundo1Layout.setHorizontalGroup(
            planoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoDeFundo1Layout.createSequentialGroup()
                .addComponent(lblTituloAlterarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCodOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(planoDeFundo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(planoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextArea1)
                    .addGroup(planoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSelecionarPesquisa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, 431, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        planoDeFundo1Layout.setVerticalGroup(
            planoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planoDeFundo1Layout.createSequentialGroup()
                .addGroup(planoDeFundo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTituloAlterarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSelecionarPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout alterarStatusLayout = new javax.swing.GroupLayout(alterarStatus.getContentPane());
        alterarStatus.getContentPane().setLayout(alterarStatusLayout);
        alterarStatusLayout.setHorizontalGroup(
            alterarStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoDeFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        alterarStatusLayout.setVerticalGroup(
            alterarStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(planoDeFundo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
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

        btnNovo.setBackground(new java.awt.Color(102, 102, 102));
        btnNovo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
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

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 102, 102));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setOpaque(true);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario");
        lblUsuario.setToolTipText("Usuário logado");

        btnGerarPDF.setBackground(new java.awt.Color(102, 102, 102));
        btnGerarPDF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnGerarPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnGerarPDF.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGerarPDF.setText("Gerar PDF");
        btnGerarPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGerarPDF.setOpaque(true);
        btnGerarPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGerarPDFMouseReleased(evt);
            }
        });

        btnAlterarStatus.setBackground(new java.awt.Color(102, 102, 102));
        btnAlterarStatus.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAlterarStatus.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterarStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAlterarStatus.setText("Alterar status");
        btnAlterarStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarStatus.setOpaque(true);
        btnAlterarStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAlterarStatusMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGerarPDF, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(btnAlterarStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addContainerGap())
        );

        jScrollPane1.setBorder(null);

        tabela.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nº", "Status", "Cliente", "CPF CNPJ", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 51));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("ORÇAMENTOS");
        lblTitulo.setOpaque(true);

        txtFiltro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CNPJ" }));
        txtFiltro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)))
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                            .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFiltro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        NovoOrcamento novo = NovoOrcamento.getInstancia();
        novo.usuario = lblUsuario.getText();
        novo.setVisible(true);
        listar();
    }//GEN-LAST:event_btnNovoMouseReleased

    private void btnEditarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseReleased
        if (tabela.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(null, "Nenhum orçamento selecionado.");
        } else {
            EditarOrcamento edit = EditarOrcamento.getInstancia();
            edit.puxarDados(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
            edit.setVisible(true);
            listar();
        }
    }//GEN-LAST:event_btnEditarMouseReleased

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        if (tabela.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(null, "Nenhum orçamento selecionado.");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Cancelar o orçamento?",
                "Cancelar?", 2) == 0) {
                ec.alteraStatusOrcamento(3, Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
                listar();
            }
        }
    }//GEN-LAST:event_btnCancelarMouseReleased

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        listar();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void jPanel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentHidden
        
    }//GEN-LAST:event_jPanel1ComponentHidden

    private void tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseReleased

    }//GEN-LAST:event_tabelaMouseReleased

    private void btnAtualizarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtualizarMouseReleased
        listar();
    }//GEN-LAST:event_btnAtualizarMouseReleased

    private void btnGerarPDFMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGerarPDFMouseReleased
        VendasModel vm = new VendasModel();
        boolean gerarProdutos = true;
        boolean gerarPlaca = true;
        
        if (tabela.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(null, "Nenhum orçamento selecionado.");
        } else {
            if (JOptionPane.showConfirmDialog(null, "Gerar o PDF?",
                "GERAR PDF?", 2) == 0) {
                if (JOptionPane.showConfirmDialog(null, "Imprimir produtos?","Imprimir produtos?", 2) == 0) {
                    gerarProdutos = true;
                } else {
                    gerarProdutos = false;
                }
                if (JOptionPane.showConfirmDialog(null, "Imprimir placa?","Imprimir placa?", 2) == 0) {
                    gerarPlaca = true;
                } else {
                    gerarPlaca = false;
                }
                ec.puxarDadosOrcamento(vm, Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
                go.Orcamento(vm, gerarProdutos,gerarPlaca, ec.puxarDadosProdutosOrcamento(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString())));
            }
        }
    }//GEN-LAST:event_btnGerarPDFMouseReleased

    private void btnAlterarStatusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarStatusMouseReleased
        if (tabela.getSelectedRow()<0) {
            JOptionPane.showMessageDialog(null, "Nenhum orçamento selecionado.");
        } else {
            txtStatus.setSelectedItem(tabela.getValueAt(tabela.getSelectedRow(),1));
            alterarStatus.setVisible(true);
            alterarStatus.setLocationRelativeTo(null);
            alterarStatus.setLocation(alterarStatus.getX()-50, alterarStatus.getY()-200);
            alterarStatus.setTitle("Alterar status do orçamento");
            lblCodOrcamento.setText(tabela.getValueAt(tabela.getSelectedRow(),0).toString());
            alterarStatus.setSize(500, 240);
        }
    }//GEN-LAST:event_btnAlterarStatusMouseReleased

    private void btnSelecionarPesquisaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecionarPesquisaMouseReleased
        ec.alteraStatusOrcamento(txtStatus.getSelectedIndex(), Integer.parseInt(lblCodOrcamento.getText()));
        JOptionPane.showMessageDialog(null, "Status do orçamento alterado com sucesso!");
        alterarStatus.setVisible(false);
    }//GEN-LAST:event_btnSelecionarPesquisaMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog alterarStatus;
    private javax.swing.JLabel btnAlterarStatus;
    private javax.swing.JLabel btnAtualizar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnEditar;
    private javax.swing.JLabel btnGerarPDF;
    private javax.swing.JLabel btnNovo;
    private javax.swing.JLabel btnSelecionarPesquisa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCodOrcamento;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloAlterarStatus;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel planoDeFundo1;
    private javax.swing.JTable tabela;
    private javax.swing.JComboBox<String> txtFiltro;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JComboBox<String> txtStatus;
    // End of variables declaration//GEN-END:variables
}
