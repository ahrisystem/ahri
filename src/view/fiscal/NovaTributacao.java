package view.fiscal;

import controller.fiscal.TributacaoController;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.fiscal.TributacaoModel;

public class NovaTributacao extends javax.swing.JFrame {
    TributacaoController tc = new TributacaoController();
    private static final NovaTributacao INSTANCIA = new NovaTributacao();
    
    
    public static NovaTributacao getInstancia() {
        return INSTANCIA;
    }
    
    public void alterarTitulo(String titulo){
        lblLegenda.setText(titulo);
    }

    private NovaTributacao() {
        initComponents();
        painelISSQN.setVisible(false);
        setLocationRelativeTo(null);
    }
    
    public void limpaCampos(){
        txtCodigo.setText("");
        txtNome.setText("");
        txtAliquota.setText("0");
        txtRedBase.setText("0");
        txtAliquotaFora.setText("0");
        txtAliquotaEfetiva.setText("0");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTítulo = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        lblLegenda = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jrdMercadoria = new javax.swing.JRadioButton();
        jrdServico = new javax.swing.JRadioButton();
        painelAbas = new javax.swing.JTabbedPane();
        painelInformacoesFiscais = new javax.swing.JPanel();
        painelCSTeCSOSN = new javax.swing.JPanel();
        txtCst = new javax.swing.JComboBox<>();
        lblCOFINS3 = new javax.swing.JLabel();
        lblOrigem = new javax.swing.JLabel();
        lblCOFINS4 = new javax.swing.JLabel();
        txtCsosn = new javax.swing.JComboBox<>();
        txtCstOrigem = new javax.swing.JComboBox<>();
        painelICMS = new javax.swing.JPanel();
        lblCOFINS = new javax.swing.JLabel();
        lblPIS = new javax.swing.JLabel();
        lblCOFINS1 = new javax.swing.JLabel();
        lblCOFINS2 = new javax.swing.JLabel();
        txtRedBase = new javax.swing.JTextField();
        txtAliquota = new javax.swing.JTextField();
        txtAliquotaFora = new javax.swing.JTextField();
        txtAliquotaEfetiva = new javax.swing.JTextField();
        painelISSQN = new javax.swing.JPanel();
        lblISSQN = new javax.swing.JLabel();
        lblAliqIssqn = new javax.swing.JLabel();
        txtCstIssqn = new javax.swing.JComboBox<>();
        txtAliqIssqn = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTítulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Nova Tributacao");
        lblTítulo.setOpaque(true);
        getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 30));

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLegenda.setBackground(new java.awt.Color(102, 102, 102));
        lblLegenda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblLegenda.setForeground(new java.awt.Color(255, 255, 255));
        lblLegenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLegenda.setText("Tributacão pré-configurada para uso em produtos ou serviços");
        lblLegenda.setOpaque(true);
        painelPrincipal.add(lblLegenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 20));

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código");
        painelPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 20));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 105, 191));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Descrição");
        painelPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 20));

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setToolTipText("Se você deixar o campo vazio e dar um enter, ele adiciona o próximo código!");
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 140, 20));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 380, 20));

        buttonGroup1.add(jrdMercadoria);
        jrdMercadoria.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jrdMercadoria.setSelected(true);
        jrdMercadoria.setText("Mercadoria (ICMS)");
        jrdMercadoria.setOpaque(false);
        jrdMercadoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdMercadoriaActionPerformed(evt);
            }
        });
        painelPrincipal.add(jrdMercadoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        buttonGroup1.add(jrdServico);
        jrdServico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jrdServico.setText("Serviço (ISSQN)");
        jrdServico.setOpaque(false);
        jrdServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrdServicoActionPerformed(evt);
            }
        });
        painelPrincipal.add(jrdServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        painelAbas.setFocusable(false);
        painelAbas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        painelInformacoesFiscais.setBackground(new java.awt.Color(255, 255, 255));
        painelInformacoesFiscais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painelCSTeCSOSN.setBackground(new java.awt.Color(255, 255, 255));
        painelCSTeCSOSN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CST/CSOSN ICMS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        painelCSTeCSOSN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCst.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00 - Tributada integralmente", "10 - Tributada e com cobrança do ICMS por substituição tributária", "20 - Com redução da BC", "30 - Isenta / não tributada e com cobrança do ICMS por substituição tributária", "40 - Isenta", "41 - Não tributada", "50 - Com suspensão", "51 - Com diferimento", "60 - ICMS cobrado anteriormente por substituição tributária", "70 - Com redução da BC e cobrança do ICMS por substituição tributária", "90 - Outras" }));
        painelCSTeCSOSN.add(txtCst, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 460, 20));

        lblCOFINS3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCOFINS3.setForeground(new java.awt.Color(51, 105, 191));
        lblCOFINS3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCOFINS3.setText("CST");
        painelCSTeCSOSN.add(lblCOFINS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, 20));

        lblOrigem.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblOrigem.setForeground(new java.awt.Color(51, 105, 191));
        lblOrigem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrigem.setText("Origem");
        painelCSTeCSOSN.add(lblOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        lblCOFINS4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCOFINS4.setForeground(new java.awt.Color(51, 105, 191));
        lblCOFINS4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCOFINS4.setText("CSOSN");
        painelCSTeCSOSN.add(lblCOFINS4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 70, 20));

        txtCsosn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCsosn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101 - Tributada pelo Simples Nacional com permissão de crédito", "102 - Tributada pelo Simples Nacional sem permissão de crédito", "103 - Isenção do ICMS no Simples Nacional para faixa de receita bruta", "201 - Tributada pelo Simples Nacional com permissão de crédito e com cobrança do ICMS por substituição tributária", "202 - Tributada pelo Simples Nacional sem permissão de crédito e com cobrança do ICMS por substituição tributária", "203 - Isenção do ICMS no Simples Nacional para faixa de receita bruta e com cobrança do ICMS por substituição tributária", "300 - Imune", "400 - Não tributada pelo Simples Nacional", "500 - ICMS cobrado anteriormente por substituição tributária (substituído) ou por antecipação", "900 - Outros" }));
        painelCSTeCSOSN.add(txtCsosn, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 460, 20));

        txtCstOrigem.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCstOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 - Nacional", "1 - Estrangeira", "2 - Estrangeira", "3 - Nacional", "4 - Nacional", "5 - Nacional", "6 - Estrangeira", "7 - Estrangeira" }));
        painelCSTeCSOSN.add(txtCstOrigem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 460, 20));

        painelInformacoesFiscais.add(painelCSTeCSOSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 130));

        painelICMS.setBackground(new java.awt.Color(255, 255, 255));
        painelICMS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRIBUTAÇÃO ICMS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        painelICMS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCOFINS.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCOFINS.setForeground(new java.awt.Color(51, 105, 191));
        lblCOFINS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCOFINS.setText("Aliq. Efetiva");
        painelICMS.add(lblCOFINS, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 150, 20));

        lblPIS.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPIS.setForeground(new java.awt.Color(51, 105, 191));
        lblPIS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPIS.setText("Alíquota");
        painelICMS.add(lblPIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 20));

        lblCOFINS1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCOFINS1.setForeground(new java.awt.Color(51, 105, 191));
        lblCOFINS1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCOFINS1.setText("Red. base");
        painelICMS.add(lblCOFINS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 80, 20));

        lblCOFINS2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCOFINS2.setForeground(new java.awt.Color(51, 105, 191));
        lblCOFINS2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCOFINS2.setText("Aliq. Interestadual");
        painelICMS.add(lblCOFINS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 150, 20));

        txtRedBase.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtRedBase.setText("0");
        txtRedBase.setToolTipText("");
        txtRedBase.setPreferredSize(new java.awt.Dimension(200, 20));
        txtRedBase.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRedBaseFocusLost(evt);
            }
        });
        txtRedBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtRedBaseKeyReleased(evt);
            }
        });
        painelICMS.add(txtRedBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 80, 20));

        txtAliquota.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAliquota.setText("0");
        txtAliquota.setToolTipText("");
        txtAliquota.setPreferredSize(new java.awt.Dimension(200, 20));
        txtAliquota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAliquotaFocusLost(evt);
            }
        });
        txtAliquota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAliquotaKeyReleased(evt);
            }
        });
        painelICMS.add(txtAliquota, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, 20));

        txtAliquotaFora.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAliquotaFora.setText("0");
        txtAliquotaFora.setToolTipText("");
        txtAliquotaFora.setPreferredSize(new java.awt.Dimension(200, 20));
        txtAliquotaFora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAliquotaForaFocusLost(evt);
            }
        });
        txtAliquotaFora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAliquotaForaKeyReleased(evt);
            }
        });
        painelICMS.add(txtAliquotaFora, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 80, 20));

        txtAliquotaEfetiva.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAliquotaEfetiva.setText("0");
        txtAliquotaEfetiva.setToolTipText("");
        txtAliquotaEfetiva.setPreferredSize(new java.awt.Dimension(200, 20));
        txtAliquotaEfetiva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAliquotaEfetivaFocusLost(evt);
            }
        });
        txtAliquotaEfetiva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAliquotaEfetivaKeyReleased(evt);
            }
        });
        painelICMS.add(txtAliquotaEfetiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 80, 20));

        painelInformacoesFiscais.add(painelICMS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 560, 120));

        painelISSQN.setBackground(new java.awt.Color(255, 255, 255));
        painelISSQN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TRIBUTAÇÃO ISSQN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        painelISSQN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblISSQN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblISSQN.setForeground(new java.awt.Color(51, 105, 191));
        lblISSQN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblISSQN.setText("CST ISS");
        painelISSQN.add(lblISSQN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 80, 20));

        lblAliqIssqn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblAliqIssqn.setForeground(new java.awt.Color(51, 105, 191));
        lblAliqIssqn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAliqIssqn.setText("Alíquota");
        painelISSQN.add(lblAliqIssqn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 100, 20));

        txtCstIssqn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCstIssqn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N - NORMAL", "R - RETIDA", "S - SUBSTITUÍDA", "I - ISENTA" }));
        painelISSQN.add(txtCstIssqn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 180, 20));

        txtAliqIssqn.setForeground(new java.awt.Color(0, 153, 0));
        txtAliqIssqn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtAliqIssqn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        painelISSQN.add(txtAliqIssqn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 25, 100, 30));

        painelInformacoesFiscais.add(painelISSQN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 70));

        painelAbas.addTab("Tributação", painelInformacoesFiscais);

        painelPrincipal.add(painelAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 590, 310));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalvarMouseExited(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 590, 40));

        getContentPane().add(painelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 590, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha a descrição!");
        } else {
            TributacaoModel t = new TributacaoModel();
            t.setCod(txtCodigo.getText());
            t.setDescricao(txtNome.getText());
            if (jrdMercadoria.isSelected()) {
                t.setTipo("mercadoria");
                t.setCst_origem(txtCstOrigem.getSelectedItem().toString());
                t.setCsosn(txtCsosn.getSelectedItem().toString());
                t.setReducao_base(Double.parseDouble(txtRedBase.getText().replace(",", ".")));
                t.setAliquota(Double.parseDouble(txtAliquota.getText().replace(",", ".")));
                t.setAliquota_fora(Double.parseDouble(txtAliquotaFora.getText().replace(",", ".")));
                t.setAliquota_efetivo(Double.parseDouble(txtAliquotaEfetiva.getText().replace(",", ".")));
            } else {
                t.setTipo("servico");
                t.setCst_iss(txtCstIssqn.getSelectedItem().toString());
                t.setAliquota_iss(Double.parseDouble(txtAliqIssqn.getText().replace(",", ".")));
            }
            tc.cadastra(t);
            limpaCampos();
            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        btnSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void txtRedBaseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRedBaseFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedBaseFocusLost

    private void txtRedBaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRedBaseKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRedBaseKeyReleased

    private void txtAliquotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAliquotaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliquotaFocusLost

    private void txtAliquotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAliquotaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliquotaKeyReleased

    private void txtAliquotaForaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAliquotaForaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliquotaForaFocusLost

    private void txtAliquotaForaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAliquotaForaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliquotaForaKeyReleased

    private void txtAliquotaEfetivaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAliquotaEfetivaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliquotaEfetivaFocusLost

    private void txtAliquotaEfetivaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAliquotaEfetivaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliquotaEfetivaKeyReleased

    private void jrdServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdServicoActionPerformed
        painelICMS.setVisible(false);
        painelCSTeCSOSN.setVisible(false);
        painelISSQN.setVisible(true);
    }//GEN-LAST:event_jrdServicoActionPerformed

    private void jrdMercadoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrdMercadoriaActionPerformed
        painelICMS.setVisible(true);
        painelCSTeCSOSN.setVisible(true);
        painelISSQN.setVisible(false);
    }//GEN-LAST:event_jrdMercadoriaActionPerformed

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
            java.util.logging.Logger.getLogger(NovaTributacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovaTributacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovaTributacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovaTributacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaTributacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jrdMercadoria;
    private javax.swing.JRadioButton jrdServico;
    private javax.swing.JLabel lblAliqIssqn;
    private javax.swing.JLabel lblCOFINS;
    private javax.swing.JLabel lblCOFINS1;
    private javax.swing.JLabel lblCOFINS2;
    private javax.swing.JLabel lblCOFINS3;
    private javax.swing.JLabel lblCOFINS4;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblISSQN;
    private javax.swing.JLabel lblLegenda;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JLabel lblPIS;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel painelCSTeCSOSN;
    private javax.swing.JPanel painelICMS;
    private javax.swing.JPanel painelISSQN;
    private javax.swing.JPanel painelInformacoesFiscais;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JFormattedTextField txtAliqIssqn;
    private javax.swing.JTextField txtAliquota;
    private javax.swing.JTextField txtAliquotaEfetiva;
    private javax.swing.JTextField txtAliquotaFora;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JComboBox<String> txtCsosn;
    private javax.swing.JComboBox<String> txtCst;
    private javax.swing.JComboBox<String> txtCstIssqn;
    private javax.swing.JComboBox<String> txtCstOrigem;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRedBase;
    // End of variables declaration//GEN-END:variables
}