package view.cadastrosUnicos;

import javax.swing.JOptionPane;


public class Empresa extends javax.swing.JFrame {
    public Empresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroEmpresa = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        lblNomeFantasia = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        lblRazaoSocial = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        lblCNPJ = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JFormattedTextField();
        lblIE = new javax.swing.JLabel();
        txtIE = new javax.swing.JFormattedTextField();
        lblUF = new javax.swing.JLabel();
        txtUF = new javax.swing.JComboBox<>();
        btnDescartar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblNomeFantasia1 = new javax.swing.JLabel();
        txtNomeFantasia1 = new javax.swing.JTextField();
        txtNomeFantasia2 = new javax.swing.JTextField();
        lblNomeFantasia2 = new javax.swing.JLabel();
        lblNomeFantasia3 = new javax.swing.JLabel();
        txtNomeFantasia3 = new javax.swing.JTextField();
        lblTitulo13 = new javax.swing.JLabel();
        txtUF2 = new javax.swing.JComboBox<>();
        lblNomeFantasia4 = new javax.swing.JLabel();
        txtNomeFantasia4 = new javax.swing.JTextField();
        lblNomeFantasia5 = new javax.swing.JLabel();
        txtCNPJ1 = new javax.swing.JFormattedTextField();
        txtIM = new javax.swing.JFormattedTextField();
        lblIM = new javax.swing.JLabel();
        txtFone = new javax.swing.JFormattedTextField();
        lblTitulo6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JFormattedTextField();
        lblTitulo16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastroEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        cadastroEmpresa.setMaximumSize(new java.awt.Dimension(670, 320));
        cadastroEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTítulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Cadastro da Empresa/Emitente");
        lblTítulo.setOpaque(true);
        cadastroEmpresa.add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        lblNomeFantasia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia.setText("Nome");
        cadastroEmpresa.add(lblNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        txtNomeFantasia.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeFantasia.setToolTipText("Nome fantasia");
        txtNomeFantasia.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 540, 20));

        lblRazaoSocial.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblRazaoSocial.setForeground(new java.awt.Color(51, 105, 191));
        lblRazaoSocial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRazaoSocial.setText("Razão Social");
        cadastroEmpresa.add(lblRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 20));

        txtRazaoSocial.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRazaoSocial.setToolTipText("Nome fantasia");
        txtRazaoSocial.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtRazaoSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 540, 20));

        lblCNPJ.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCNPJ.setForeground(new java.awt.Color(51, 105, 191));
        lblCNPJ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCNPJ.setText("CNPJ");
        cadastroEmpresa.add(lblCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 20));

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 150, 20));

        lblIE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIE.setForeground(new java.awt.Color(51, 105, 191));
        lblIE.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIE.setText("IE");
        cadastroEmpresa.add(lblIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 50, 20));

        txtIE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        txtIE.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtIE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 120, 20));

        lblUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUF.setForeground(new java.awt.Color(51, 105, 191));
        lblUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUF.setText("UF");
        cadastroEmpresa.add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 40, 20));

        txtUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cadastroEmpresa.add(txtUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 70, 20));

        btnDescartar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDescartar.setText("Sair");
        btnDescartar.setFocusable(false);
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        cadastroEmpresa.add(btnDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 70, 40));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setFocusable(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        cadastroEmpresa.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, -1, 40));

        lblNomeFantasia1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia1.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia1.setText("Nº");
        cadastroEmpresa.add(lblNomeFantasia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 30, 20));

        txtNomeFantasia1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeFantasia1.setToolTipText("Nome fantasia");
        txtNomeFantasia1.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtNomeFantasia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 50, 20));

        txtNomeFantasia2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeFantasia2.setToolTipText("Nome fantasia");
        txtNomeFantasia2.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtNomeFantasia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 450, 20));

        lblNomeFantasia2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia2.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia2.setText("Logradouro");
        cadastroEmpresa.add(lblNomeFantasia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 20));

        lblNomeFantasia3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia3.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia3.setText("Complemento");
        cadastroEmpresa.add(lblNomeFantasia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 20));

        txtNomeFantasia3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeFantasia3.setToolTipText("Nome fantasia");
        txtNomeFantasia3.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtNomeFantasia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 280, 20));

        lblTitulo13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo13.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo13.setText("Município");
        cadastroEmpresa.add(lblTitulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 70, 20));

        txtUF2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUF2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cadastroEmpresa.add(txtUF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 220, 20));

        lblNomeFantasia4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia4.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia4.setText("Bairro");
        cadastroEmpresa.add(lblNomeFantasia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 80, 20));

        txtNomeFantasia4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeFantasia4.setToolTipText("Nome fantasia");
        txtNomeFantasia4.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtNomeFantasia4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 170, 20));

        lblNomeFantasia5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeFantasia5.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeFantasia5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeFantasia5.setText("CEP");
        cadastroEmpresa.add(lblNomeFantasia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, 20));

        try {
            txtCNPJ1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtCNPJ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 110, 20));

        txtIM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtIM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 150, 20));

        lblIM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIM.setForeground(new java.awt.Color(51, 105, 191));
        lblIM.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIM.setText("IM");
        cadastroEmpresa.add(lblIM, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 50, 20));

        txtFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("(##)####-####"))));
        txtFone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 150, 20));

        lblTitulo6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo6.setText("Telefone");
        cadastroEmpresa.add(lblTitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 70, 20));

        txtEmail.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("(##)####-####"))));
        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 320, 20));

        lblTitulo16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo16.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo16.setText("Email");
        cadastroEmpresa.add(lblTitulo16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 70, 20));

        getContentPane().add(cadastroEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        JOptionPane.showMessageDialog(null, "Alterações salvas!", "Salvo", 1);
    }//GEN-LAST:event_btnSalvarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel cadastroEmpresa;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblIE;
    private javax.swing.JLabel lblIM;
    private javax.swing.JLabel lblNomeFantasia;
    private javax.swing.JLabel lblNomeFantasia1;
    private javax.swing.JLabel lblNomeFantasia2;
    private javax.swing.JLabel lblNomeFantasia3;
    private javax.swing.JLabel lblNomeFantasia4;
    private javax.swing.JLabel lblNomeFantasia5;
    private javax.swing.JLabel lblRazaoSocial;
    private javax.swing.JLabel lblTitulo13;
    private javax.swing.JLabel lblTitulo16;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUF;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCNPJ1;
    private javax.swing.JFormattedTextField txtEmail;
    private javax.swing.JFormattedTextField txtFone;
    private javax.swing.JFormattedTextField txtIE;
    private javax.swing.JFormattedTextField txtIM;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtNomeFantasia1;
    private javax.swing.JTextField txtNomeFantasia2;
    private javax.swing.JTextField txtNomeFantasia3;
    private javax.swing.JTextField txtNomeFantasia4;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JComboBox<String> txtUF;
    private javax.swing.JComboBox<String> txtUF2;
    // End of variables declaration//GEN-END:variables
}
