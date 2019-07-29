package view.funcoes;

import controller.funcoes.PesquisarController;
import funcoes.pesquisa.Buscar;
import javax.swing.table.DefaultTableModel;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.placa.PlacaModel;
import model.cadastros.produtos.ProdutoModel;

public class Pesquisar extends javax.swing.JFrame {
    Buscar buscar = new Buscar();
    PesquisarController pc = new PesquisarController();

    public Pesquisar(String titulo, String pesquisa) {
        initComponents();
        setLocationRelativeTo(null);
        pesquisar.setTitle(titulo);
        txtPesquisa.setText(pesquisa);
        listar(titulo, pesquisa);
    }

    public void listar(String titulo, String pesquisa) {
        if (titulo.equalsIgnoreCase("Clientes")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (EntidadeModel e : pc.listaEntidades("cliente", txtPesquisa.getText())) {
                modelo.addRow(new Object[]{
                    e.getCod(),
                    e.getxNome(),
                    e.getCNPJ(),});
            }
        }
        if (titulo.equalsIgnoreCase("Fornecedores")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (EntidadeModel e : pc.listaEntidades("fornecedor", txtPesquisa.getText())) {
                modelo.addRow(new Object[]{
                    e.getCod(),
                    e.getxNome(),
                    e.getCNPJ(),});
            };
        }
        if (titulo.equalsIgnoreCase("Produtos")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (PlacaModel p : pc.listaPlacas(txtPesquisa.getText())) {
                modelo.addRow(new Object[]{
                    p.getCod(),
                    p.getNome(),
                    p.getNomecliente(),});
            }
        }

        if (titulo.equalsIgnoreCase("Produtos")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (ProdutoModel p : pc.listaProdutos(txtPesquisa.getText())) {
                modelo.addRow(new Object[]{
                    p.getCod(),
                    p.getNome(),
                    p.getPreco(),});
            }
        }
    }


@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pesquisar = new javax.swing.JDialog();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnCancelar = new javax.swing.JLabel();
        btnSelecionar = new javax.swing.JLabel();

        pesquisar.setAlwaysOnTop(true);
        pesquisar.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPesquisa.setNextFocusableComponent(tabela);
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
        pesquisar.getContentPane().add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 580, 30));

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

        pesquisar.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 580, 220));

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
        pesquisar.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 150, 30));

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
        pesquisar.getContentPane().add(btnSelecionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 150, 30));

        setAlwaysOnTop(true);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

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
        listar(pesquisar.getTitle(), txtPesquisa.getText());
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
    public javax.swing.JDialog pesquisar;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
