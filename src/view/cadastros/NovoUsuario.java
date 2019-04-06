package view.cadastros;

import javax.swing.JOptionPane;
import view.TelaInicial;


public class NovoUsuario extends javax.swing.JFrame {
    int fisica = 0;
    private static final NovoUsuario INSTANCIA = new NovoUsuario();

    public static NovoUsuario getInstancia() {
        return INSTANCIA;
    }

    private NovoUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lblTitulo1 = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblTitulo3 = new javax.swing.JLabel();
        lblTitulo7 = new javax.swing.JLabel();
        lblTitulo8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jTextField2 = new javax.swing.JTextField();
        lblTitulo10 = new javax.swing.JLabel();
        txtTelFixo = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        lblTitulo11 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        lblTitulo12 = new javax.swing.JLabel();
        btnSalvar1 = new javax.swing.JButton();
        btnDescartar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("NOVO USUÁRIO");
        lblTitulo.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo9.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo9.setText("?");
        lblTitulo9.setToolTipText("Permissões pré-definidas que usuário terá no sistema.");
        jPanel2.add(lblTitulo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 30, 20));

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 510, 20));

        lblTitulo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo1.setText("Nome");
        jPanel2.add(lblTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 80, 20));

        lblTitulo2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("Cidade");
        jPanel2.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 110, 20));

        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 430, 20));

        lblTitulo3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo3.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo3.setText("?");
        lblTitulo3.setToolTipText("Campo para logar no sistema");
        jPanel2.add(lblTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 30, 20));

        lblTitulo7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo7.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo7.setText("Login");
        jPanel2.add(lblTitulo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 20));

        lblTitulo8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo8.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo8.setText("UF");
        jPanel2.add(lblTitulo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 20));

        jComboBox2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 70, 20));

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(jFormattedTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 210, 20));

        jTextField2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 105, 191)));
        jTextField2.setPreferredSize(new java.awt.Dimension(200, 20));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 190, 20));

        lblTitulo10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo10.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo10.setText("Perfil");
        jPanel2.add(lblTitulo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, 20));

        try {
            txtTelFixo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelFixo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTelFixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelFixoActionPerformed(evt);
            }
        });
        jPanel2.add(txtTelFixo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 210, -1));

        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(jFormattedTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 210, -1));

        lblTitulo11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo11.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo11.setText("CPF");
        jPanel2.add(lblTitulo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 80, 20));

        jComboBox3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 330, 20));

        lblTitulo12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo12.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo12.setText("Contato");
        jPanel2.add(lblTitulo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 80, 20));

        btnSalvar1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar1.setText("Salvar");
        btnSalvar1.setFocusable(false);
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 80, 40));

        btnDescartar1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDescartar1.setText("Descartar");
        btnDescartar1.setFocusable(false);
        btnDescartar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartar1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnDescartar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaInicial telainicial = new TelaInicial();
        telainicial.opcoes = false;
    }//GEN-LAST:event_formWindowClosed

    private void txtTelFixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelFixoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelFixoActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        int opcao = 2;
        if (JOptionPane.showConfirmDialog(null, "Salvar alterações?", "Salvar", opcao) == 0) {
            if (JOptionPane.showInputDialog(null, "Senha do usuário", "Nova senha", 1).equalsIgnoreCase("")) {

            } else {
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnDescartar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartar1ActionPerformed
        int opcao = 2;
        if (JOptionPane.showConfirmDialog(null, "Descartar alterações?", "Cancelar", opcao) == 0) {
            this.dispose();
        }
    }//GEN-LAST:event_btnDescartar1ActionPerformed

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
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescartar1;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo10;
    private javax.swing.JLabel lblTitulo11;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo3;
    private javax.swing.JLabel lblTitulo7;
    private javax.swing.JLabel lblTitulo8;
    private javax.swing.JLabel lblTitulo9;
    private javax.swing.JFormattedTextField txtTelFixo;
    // End of variables declaration//GEN-END:variables
}
