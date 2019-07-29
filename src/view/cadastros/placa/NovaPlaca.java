package view.cadastros.placa;

import controller.cadastros.placa.PlacaController;
import controller.funcoes.PesquisarController;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.placa.PlacaModel;
import view.TelaInicial;


public class NovaPlaca extends javax.swing.JFrame {
    PesquisarController pc = new PesquisarController();
    PlacaController pl = new PlacaController();
    private static final NovaPlaca INSTANCIA = new NovaPlaca();

    public static NovaPlaca getInstancia() {
        return INSTANCIA;
    }

    private NovaPlaca() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void limpaCampos(){
        txtCodigo.requestFocus();
        txtCodigo.setText("");
        txtNome.setText("");
        txtCliente.setText("");
        txtCliente2.setText("");
        txtDetalhes.setText("");
    }
    public void listarClientes(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (EntidadeModel e : pc.listaEntidades("cliente",txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                e.getCod(),
                e.getxNome(),
                e.getCNPJ(),
            });
        }
    }
    public void buscarCliente(){
        if (txtCliente.getText().matches("[0-9]+")) {
            EntidadeModel em = new EntidadeModel();
            pc.buscarCliente(em, txtCliente.getText());
            txtCliente.setText(Integer.toString(em.getCod()));
            txtCliente2.setText(em.getNome());
            txtDetalhes.requestFocus();
            txtCliente2.setEnabled(false);
        } else {
            if (txtCliente.getText().isEmpty()) {
                txtCliente2.setText("");
            }
            pesquisar.setVisible(true);
            lblTituloPesquisa.setText("Clientes");
            listarClientes();
            txtPesquisa.setText(txtCliente.getText());
            pesquisar.setLocation(this.getX(), this.getY());
            pesquisar.setSize(this.getSize());
        }
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
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnDescartar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        lblDetalhes = new javax.swing.JLabel();
        txtCliente2 = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetalhes = new javax.swing.JTextArea();
        lblNome3 = new javax.swing.JLabel();
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
        setTitle("Novo Cliente");
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

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 105, 191));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome*");
        painelPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 100, 20));

        lblCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(51, 105, 191));
        lblCPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCPF.setText("PLACA*");
        painelPrincipal.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 30));

        txtCodigo.setColumns(8);
        txtCodigo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(204, 51, 0));
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
        painelPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 160, 30));

        btnDescartar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDescartar.setText("Descartar");
        btnDescartar.setFocusable(false);
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, -1, 30));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setFocusable(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 80, 30));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 370, 20));

        lblDetalhes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDetalhes.setForeground(new java.awt.Color(51, 105, 191));
        lblDetalhes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDetalhes.setText("Detalhes");
        painelPrincipal.add(lblDetalhes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 20));

        txtCliente2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCliente2.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtCliente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 300, 20));

        txtCliente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCliente.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClienteFocusLost(evt);
            }
        });
        txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteActionPerformed(evt);
            }
        });
        painelPrincipal.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 60, 20));

        txtDetalhes.setColumns(20);
        txtDetalhes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDetalhes.setLineWrap(true);
        txtDetalhes.setRows(5);
        txtDetalhes.setToolTipText("");
        txtDetalhes.setBorder(null);
        jScrollPane1.setViewportView(txtDetalhes);

        painelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 370, 90));

        lblNome3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome3.setForeground(new java.awt.Color(51, 105, 191));
        lblNome3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome3.setText("Cliente");
        painelPrincipal.add(lblNome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 20));

        jScrollPane.setViewportView(painelPrincipal);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 520, 260));

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Nova placa");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaInicial telainicial = new TelaInicial();
        telainicial.opcoes = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtCodigo.getText().equalsIgnoreCase("") || txtCodigo.getText().length() > 8) {
            JOptionPane.showMessageDialog(null, "Código da placa inválido!");
        } else {
            if (txtNome.getText().equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "Preencha o nome correspondente a placa.");
            } else {
                PlacaModel em = new PlacaModel();
                em.setCod(txtCodigo.getText());
                em.setNome(txtNome.getText());
                int codigoCliente;
                if (txtCliente.getText().isEmpty()) {
                    codigoCliente = 0;
                } else {
                    codigoCliente = Integer.parseInt(txtCliente.getText());
                }
                em.setCodcliente(codigoCliente);
                em.setNomecliente(txtCliente2.getText());
                em.setDetalhes(txtDetalhes.getText());
                pl.cadastra(em);
                limpaCampos();
            }
        } 
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        if (txtCodigo.getText().length() > 8) {
            txtCodigo.setText(txtCodigo.getText());
        }
        String texto = "";
        texto = txtCodigo.getText().toUpperCase();
        txtCodigo.setText(texto);
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteActionPerformed
        buscarCliente();
    }//GEN-LAST:event_txtClienteActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        listarClientes();
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
        if (tabela.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Nenhum registro selecionado.");
        } else {
            txtCliente.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            txtCliente2.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            pesquisar.setVisible(false);
            txtDetalhes.requestFocus();
        }
    }//GEN-LAST:event_btnSelecionarPesquisaMouseReleased

    private void txtClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClienteFocusGained
        txtCliente2.setEnabled(true);
    }//GEN-LAST:event_txtClienteFocusGained

    private void txtClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClienteFocusLost
        if (txtCliente.getText().matches("[0-9]+")) {
            EntidadeModel em = new EntidadeModel();
            pc.buscarCliente(em, txtCliente.getText());
            txtCliente.setText(Integer.toString(em.getCod()));
            txtCliente2.setText(em.getNome());                                                                       txtCliente2.setEnabled(false);
        } else {
            
        }
    }//GEN-LAST:event_txtClienteFocusLost

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        String texto = "";
        texto = txtNome.getText().toUpperCase();
        txtNome.setText(texto);
    }//GEN-LAST:event_txtNomeKeyReleased

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Look and feel">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {java.util.logging.Logger.getLogger(NovaPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {java.util.logging.Logger.getLogger(NovaPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {java.util.logging.Logger.getLogger(NovaPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {java.util.logging.Logger.getLogger(NovaPlaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaPlaca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel btnSelecionarPesquisa;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDetalhes;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloPesquisa;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JDialog pesquisar;
    private javax.swing.JPanel planoDeFundo1;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCliente2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDetalhes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
