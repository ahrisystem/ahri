package view.cadastrosUnicos;

import controller.cadastrosUnicos.ContabilidadeController;
import controller.cadastros.funcoes.LocalController;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.cadastrosUnicos.ContabilidadeModel;
    

public class Contabilidade extends javax.swing.JFrame {
    private static final Contabilidade INSTANCIA = new Contabilidade();

    public static Contabilidade getInstancia() {
        return INSTANCIA;
    }
    ContabilidadeController cc = new ContabilidadeController();
    
    public Contabilidade() {
        initComponents();
        setLocationRelativeTo(null);
        preencheCidades();
        puxarDados();
    }
    
    public void puxarDados(){
        ContabilidadeModel cm = new ContabilidadeModel();
        cc.puxarDados(cm);
        txtCNPJ.setText(cm.getCnpj());
        txtCPF.setText(cm.getCpf());
        txtNomeCont.setText(cm.getNomeCont());
        txtContabilidade.setText(cm.getContabilidade());
        txtLgr.setText(cm.getXlgr());
        txtNro.setText(Integer.toString(cm.getNro()));
        txtComplemento.setText(cm.getXcpl());
        txtBairro.setText(cm.getXbairro());
        txtMun.setSelectedItem(cm.getXmun());
        txtUF.setSelectedItem(cm.getUf());
        txtCEP.setText(cm.getCep());
        txtContato1.setText(cm.getFone());
        txtEmail.setText(cm.getEmail());
    }
    public void preencheCidades() {
        LocalController lc = new LocalController();
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(lc.listaCidades(txtUF.getSelectedItem().toString()).toArray());
        txtMun.setModel(defaultComboBox);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroEmpresa = new javax.swing.JPanel();
        lblTítulo = new javax.swing.JLabel();
        lblNomeCont = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblCRC = new javax.swing.JLabel();
        lblCont = new javax.swing.JLabel();
        lblCNPJ = new javax.swing.JLabel();
        lblFone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblUF = new javax.swing.JLabel();
        lblMun = new javax.swing.JLabel();
        lblLgr = new javax.swing.JLabel();
        lblNro = new javax.swing.JLabel();
        lblCpl = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        txtNomeCont = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtCRC = new javax.swing.JTextField();
        txtContabilidade = new javax.swing.JTextField();
        txtCNPJ = new javax.swing.JFormattedTextField();
        txtContato1 = new javax.swing.JFormattedTextField();
        cbxCel = new javax.swing.JCheckBox();
        txtEmail = new javax.swing.JTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        txtUF = new javax.swing.JComboBox<>();
        txtMun = new javax.swing.JComboBox<>();
        txtLgr = new javax.swing.JTextField();
        txtNro = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        btnDescartar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro da empresa");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastroEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        cadastroEmpresa.setMaximumSize(new java.awt.Dimension(670, 320));
        cadastroEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTítulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Cadastro da Contabilidade");
        lblTítulo.setOpaque(true);
        cadastroEmpresa.add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        lblNomeCont.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNomeCont.setForeground(new java.awt.Color(51, 105, 191));
        lblNomeCont.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeCont.setText("Nome contador");
        cadastroEmpresa.add(lblNomeCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, 20));

        lblCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(51, 105, 191));
        lblCPF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCPF.setText("CPF");
        cadastroEmpresa.add(lblCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 50, 20));

        lblCRC.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCRC.setForeground(new java.awt.Color(51, 105, 191));
        lblCRC.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCRC.setText("CRC");
        cadastroEmpresa.add(lblCRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 50, 20));

        lblCont.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCont.setForeground(new java.awt.Color(51, 105, 191));
        lblCont.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCont.setText("Contabilidade");
        cadastroEmpresa.add(lblCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 20));

        lblCNPJ.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCNPJ.setForeground(new java.awt.Color(51, 105, 191));
        lblCNPJ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCNPJ.setText("CNPJ");
        cadastroEmpresa.add(lblCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 40, 20));

        lblFone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblFone.setForeground(new java.awt.Color(51, 105, 191));
        lblFone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFone.setText("Telefone");
        cadastroEmpresa.add(lblFone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 70, 20));

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(51, 105, 191));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email");
        cadastroEmpresa.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 70, 20));

        lblCEP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCEP.setForeground(new java.awt.Color(51, 105, 191));
        lblCEP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCEP.setText("CEP");
        cadastroEmpresa.add(lblCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 20));

        lblUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUF.setForeground(new java.awt.Color(51, 105, 191));
        lblUF.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUF.setText("UF");
        cadastroEmpresa.add(lblUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 40, 20));

        lblMun.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblMun.setForeground(new java.awt.Color(51, 105, 191));
        lblMun.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMun.setText("Município");
        cadastroEmpresa.add(lblMun, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 70, 20));

        lblLgr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblLgr.setForeground(new java.awt.Color(51, 105, 191));
        lblLgr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLgr.setText("Logradouro");
        cadastroEmpresa.add(lblLgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, 20));

        lblNro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNro.setForeground(new java.awt.Color(51, 105, 191));
        lblNro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNro.setText("Nº");
        cadastroEmpresa.add(lblNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 30, 20));

        lblCpl.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCpl.setForeground(new java.awt.Color(51, 105, 191));
        lblCpl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCpl.setText("Complemento");
        cadastroEmpresa.add(lblCpl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 20));

        lblBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(51, 105, 191));
        lblBairro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBairro.setText("Bairro");
        cadastroEmpresa.add(lblBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 70, 20));

        txtNomeCont.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNomeCont.setToolTipText("Nome fantasia");
        txtNomeCont.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtNomeCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 580, 20));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 120, 20));

        txtCRC.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCRC.setToolTipText("Nome fantasia");
        txtCRC.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtCRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 120, 20));

        txtContabilidade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtContabilidade.setToolTipText("Nome fantasia");
        txtContabilidade.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtContabilidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 580, 20));

        try {
            txtCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCNPJ.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 140, 20));

        try {
            txtContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtContato1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtContato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 190, 20));

        cbxCel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cbxCel.setText("Cel.");
        cbxCel.setToolTipText("Marque caso ele seja também um fornecedor.");
        cbxCel.setFocusable(false);
        cbxCel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cbxCel.setOpaque(false);
        cbxCel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCelItemStateChanged(evt);
            }
        });
        cbxCel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbxCelMouseReleased(evt);
            }
        });
        cadastroEmpresa.add(cbxCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 60, 20));

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEmail.setToolTipText("Nome fantasia");
        txtEmail.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 580, 20));

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCEP.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cadastroEmpresa.add(txtCEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 120, 20));

        txtUF.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SC", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SP", "SE", "TO" }));
        cadastroEmpresa.add(txtUF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 70, 20));

        txtMun.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtMun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cadastroEmpresa.add(txtMun, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 220, 20));

        txtLgr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtLgr.setToolTipText("Nome fantasia");
        txtLgr.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtLgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 460, 20));

        txtNro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNro.setToolTipText("Nome fantasia");
        txtNro.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtNro, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 50, 20));

        txtComplemento.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtComplemento.setToolTipText("Nome fantasia");
        txtComplemento.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 290, 20));

        txtBairro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtBairro.setToolTipText("Nome fantasia");
        txtBairro.setPreferredSize(new java.awt.Dimension(200, 20));
        cadastroEmpresa.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 190, 20));

        btnDescartar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnDescartar.setText("Sair");
        btnDescartar.setFocusable(false);
        btnDescartar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarActionPerformed(evt);
            }
        });
        cadastroEmpresa.add(btnDescartar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 70, 40));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setFocusable(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        cadastroEmpresa.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, -1, 40));

        getContentPane().add(cadastroEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescartarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDescartarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            ContabilidadeModel cm = new ContabilidadeModel();
            cm.setCnpj(txtCNPJ.getText());
            cm.setCpf(txtCPF.getText());
            cm.setNomeCont(txtNomeCont.getText());
            cm.setContabilidade(txtContabilidade.getText());
            cm.setXlgr(txtLgr.getText());
            cm.setNro(Integer.parseInt(txtNro.getText()));
            cm.setXcpl(txtComplemento.getText());
            cm.setXbairro(txtBairro.getText());
            cm.setXmun(txtMun.getSelectedItem().toString());
            cm.setUf(txtUF.getSelectedItem().toString());
            cm.setCep(txtCEP.getText());
            cm.setFone(txtContato1.getText());
            cm.setEmail(txtEmail.getText());
            cc.salvarDados(cm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar dados\n"+e.getMessage());
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbxCelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCelItemStateChanged
        
    }//GEN-LAST:event_cbxCelItemStateChanged

    private void cbxCelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCelMouseReleased
        if (cbxCel.isSelected()) {
            try {
                txtContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
        } else {
            try {
                txtContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
            } catch (java.text.ParseException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_cbxCelMouseReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contabilidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDescartar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel cadastroEmpresa;
    private javax.swing.JCheckBox cbxCel;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCRC;
    private javax.swing.JLabel lblCont;
    private javax.swing.JLabel lblCpl;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFone;
    private javax.swing.JLabel lblLgr;
    private javax.swing.JLabel lblMun;
    private javax.swing.JLabel lblNomeCont;
    private javax.swing.JLabel lblNro;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUF;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCNPJ;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCRC;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtContabilidade;
    private javax.swing.JFormattedTextField txtContato1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLgr;
    private javax.swing.JComboBox<String> txtMun;
    private javax.swing.JTextField txtNomeCont;
    private javax.swing.JTextField txtNro;
    private javax.swing.JComboBox<String> txtUF;
    // End of variables declaration//GEN-END:variables
}
