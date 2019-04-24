package view.cadastros.funcoes;

import controller.EntidadeController;
import controller.ProdutoController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.EntidadeModel;
import model.ProdutoModel;

public class RegistrosExcluidos extends javax.swing.JFrame {
    EntidadeController ec = new EntidadeController();
    ProdutoController pc = new ProdutoController();
    
    public RegistrosExcluidos(String titulo) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle(titulo);
        lblTitulo.setText(titulo);
        if (this.getTitle().equalsIgnoreCase("Clientes excluídos")) {
            listarClientes();
        }
        if (this.getTitle().equalsIgnoreCase("Produtos excluídos")) {
            listarProdutos();
        }
    }
    
    public void listarClientes(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (EntidadeModel e : ec.listaClientesExcluidos(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                e.getCod(),
                e.getNome(),
            });
        }
    }
    public void listarProdutos(){
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        for (ProdutoModel e : pc.listaProdutosExcluidos(txtPesquisa.getText())) {
            modelo.addRow(new Object[]{
                e.getCod(),
                e.getNome(),
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planoDeFundo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnCancelar = new javax.swing.JLabel();
        btnAtivar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        planoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        planoDeFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Nome do cadastro");
        lblTitulo.setOpaque(true);
        planoDeFundo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        txtPesquisa.setBackground(new java.awt.Color(102, 102, 102));
        txtPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
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
        planoDeFundo.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 30));

        tabela.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setFocusable(false);
        tabela.setGridColor(new java.awt.Color(204, 204, 204));
        tabela.setRowHeight(20);
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        planoDeFundo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 280));

        btnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCancelar.setText("Voltar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setOpaque(true);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnCancelarMouseReleased(evt);
            }
        });
        planoDeFundo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 100, 30));

        btnAtivar.setBackground(new java.awt.Color(102, 153, 255));
        btnAtivar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnAtivar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtivar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAtivar.setText("Ativar");
        btnAtivar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtivar.setOpaque(true);
        btnAtivar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnAtivarMouseReleased(evt);
            }
        });
        planoDeFundo.add(btnAtivar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 100, 30));

        getContentPane().add(planoDeFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseReleased

    }//GEN-LAST:event_tabelaMouseReleased

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed

    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btnAtivarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtivarMouseReleased
        if (this.getTitle().equalsIgnoreCase("Clientes excluídos")) {
            if (JOptionPane.showConfirmDialog(null, "Restaurar o cliente?",
                "Restaurar?", 2) == 0) {
                ec.restaurar(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
                listarClientes();
            }
        }
        if (this.getTitle().equalsIgnoreCase("Produtos excluídos")) {
            if (JOptionPane.showConfirmDialog(null, "Restaurar o produto?",
                "Restaurar?", 2) == 0) {
                pc.restaurar(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
                listarProdutos();
            }
        }
    }//GEN-LAST:event_btnAtivarMouseReleased

    private void btnCancelarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseReleased
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseReleased

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        if (this.getTitle().equalsIgnoreCase("Clientes excluídos")) {
            listarClientes();
        }
        if (this.getTitle().equalsIgnoreCase("Produtos excluídos")) {
            listarProdutos();
        }
    }//GEN-LAST:event_txtPesquisaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrosExcluidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrosExcluidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrosExcluidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrosExcluidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrosExcluidos("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAtivar;
    private javax.swing.JLabel btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel planoDeFundo;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
