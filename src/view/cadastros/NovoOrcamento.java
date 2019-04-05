package view.cadastros;

import javax.swing.JOptionPane;
import view.TelaInicial;


public class NovoOrcamento extends javax.swing.JFrame {
    int fisica = 0;
    private static final NovoOrcamento INSTANCIA = new NovoOrcamento();

    public static NovoOrcamento getInstancia() {
        return INSTANCIA;
    }

    private NovoOrcamento() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        painelPrincipal = new javax.swing.JPanel();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo3 = new javax.swing.JLabel();
        btnDescartar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        lblTitulo11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        lblTitulo2 = new javax.swing.JLabel();
        lblTitulo4 = new javax.swing.JLabel();
        lblTitulo5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblTitulo6 = new javax.swing.JLabel();
        lblTitulo7 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Bruto");
        lblTitulo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 105, 191)));
        painelPrincipal.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 110, 30));

        lblTitulo3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("P");
        lblTitulo3.setToolTipText("Campo para logar no sistema");
        painelPrincipal.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 30, 30));

        btnDescartar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDescartar.setText("Descartar");
        btnDescartar.setFocusable(false);
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Lançar");
        btnSalvar.setFocusable(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 80, 40));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 490, 30));

        lblTitulo11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo11.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo11.setText("Nº 1");
        painelPrincipal.add(lblTitulo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        tblClientes.setBackground(new java.awt.Color(204, 204, 204));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Produto", "Valor un.", "Qtd.", "Desconto", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setGridColor(new java.awt.Color(204, 204, 204));
        tblClientes.setOpaque(false);
        jScrollPane2.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        painelPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 710, 160));

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        painelPrincipal.add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 600, 30));

        lblTitulo2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("Nenhum");
        painelPrincipal.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 560, 30));

        lblTitulo4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo4.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo4.setText("Total");
        lblTitulo4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 105, 191)));
        painelPrincipal.add(lblTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 110, 30));

        lblTitulo5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo5.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo5.setText("Descontos");
        lblTitulo5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 105, 191)));
        painelPrincipal.add(lblTitulo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 110, 30));

        jScrollPane3.setAutoscrolls(true);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        painelPrincipal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 450, -1));

        lblTitulo6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo6.setText("Cliente");
        painelPrincipal.add(lblTitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, 30));

        lblTitulo7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo7.setText("0");
        painelPrincipal.add(lblTitulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 140, 30));

        jScrollPane1.setViewportView(painelPrincipal);

        lblTitulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 153, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("NOVO ORÇAMENTO");
        lblTitulo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed

    }//GEN-LAST:event_txtPesquisaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NovoOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoOrcamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoOrcamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo11;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo4;
    private javax.swing.JLabel lblTitulo5;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
