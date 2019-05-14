package view.cadastros.funcoes;

import controller.cadastros.funcoes.PesquisarController;
import javax.swing.table.DefaultTableModel;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.produtos.ProdutoModel;

public class Pesquisar extends javax.swing.JFrame {
    PesquisarController pc = new PesquisarController();
    
    public Pesquisar(String titulo, String pesquisa) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle(titulo);
        txtPesquisa.setText(pesquisa);
        if (titulo.equalsIgnoreCase("Clientes")) {
            listarClientes();
        }
        if (titulo.equalsIgnoreCase("Fornecedores")) {
            listarFornecedores();
        }
        if (titulo.equalsIgnoreCase("Produtos")) {
            listarProdutos();
        }
    }
    
    public void listarClientes(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (EntidadeModel e : pc.listaClientes(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                e.getCod(),
                e.getxNome(),
                e.getCNPJ(),
            });
        }
    }
    public void listarFornecedores(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (ProdutoModel p : pc.listaProdutos(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                p.getCod(),
                p.getNome(),
                p.getPreco(),
            });
        }
    }
    public void listarProdutos(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (ProdutoModel p : pc.listaProdutos(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                p.getCod(),
                p.getNome(),
                p.getPreco(),
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planoDeFundo = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnCancelar = new javax.swing.JLabel();
        btnSelecionar = new javax.swing.JLabel();

        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        planoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        planoDeFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        planoDeFundo.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 580, 30));

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
        jScrollPane1.setViewportView(tabela);

        planoDeFundo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 580, 220));

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setOpaque(true);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });
        planoDeFundo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 150, 30));

        btnSelecionar.setBackground(new java.awt.Color(102, 153, 255));
        btnSelecionar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSelecionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSelecionar.setText("Selecionar");
        btnSelecionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelecionar.setOpaque(true);
        btnSelecionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSelecionarMouseReleased(evt);
            }
        });
        planoDeFundo.add(btnSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 150, 30));

        getContentPane().add(planoDeFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed
        
    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btnSelecionarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelecionarMouseReleased
        
    }//GEN-LAST:event_btnSelecionarMouseReleased

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseReleased

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        if (this.getTitle().equalsIgnoreCase("Clientes")) {
            listarClientes();
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesquisar("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JLabel btnSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel planoDeFundo;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
