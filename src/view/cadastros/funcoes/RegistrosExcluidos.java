package view.cadastros.funcoes;

public class RegistrosExcluidos extends javax.swing.JFrame {
    public RegistrosExcluidos(String titulo) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle(titulo);
        lblTitulo.setText(titulo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        planoDeFundo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        btnEditar1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JLabel();

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        planoDeFundo.setBackground(new java.awt.Color(255, 255, 255));
        planoDeFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(153, 0, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Nome do cadastro");
        planoDeFundo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 30));

        txtPesquisa.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        planoDeFundo.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 400, 25));

        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Valor", "Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.setFocusable(false);
        tblProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblProdutosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblProdutos);

        planoDeFundo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 280));

        btnEditar1.setBackground(new java.awt.Color(255, 102, 102));
        btnEditar1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEditar1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEditar1.setText("Voltar");
        btnEditar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar1.setOpaque(true);
        btnEditar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnEditar1MouseReleased(evt);
            }
        });
        planoDeFundo.add(btnEditar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 100, 30));

        btnNovo.setBackground(new java.awt.Color(102, 153, 255));
        btnNovo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovo.setText("Ativar");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setOpaque(true);
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNovoMouseReleased(evt);
            }
        });
        planoDeFundo.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 100, 30));

        getContentPane().add(planoDeFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblProdutosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutosMouseReleased

    }//GEN-LAST:event_tblProdutosMouseReleased

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed

    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btnNovoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseReleased
        
    }//GEN-LAST:event_btnNovoMouseReleased

    private void btnEditar1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditar1MouseReleased
        this.dispose();
    }//GEN-LAST:event_btnEditar1MouseReleased

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
    private javax.swing.JLabel btnEditar1;
    private javax.swing.JLabel btnNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel planoDeFundo;
    private javax.swing.JTable tblProdutos;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
