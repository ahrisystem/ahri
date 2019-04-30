package view.fiscal;

import controller.ProdutoController;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.cadastros.produtos.ProdutoModel;

public class NovaTributacao extends javax.swing.JFrame {
    ProdutoController pc = new ProdutoController();
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
        txtTipoTributacao1 = new javax.swing.JComboBox<>();
        lblCOFINS3 = new javax.swing.JLabel();
        lblOrigem = new javax.swing.JLabel();
        lblCOFINS4 = new javax.swing.JLabel();
        txtTipoTributacao2 = new javax.swing.JComboBox<>();
        txtOrigemCSOSN1 = new javax.swing.JComboBox<>();
        painelICMS = new javax.swing.JPanel();
        lblCOFINS = new javax.swing.JLabel();
        lblPIS = new javax.swing.JLabel();
        lblCOFINS1 = new javax.swing.JLabel();
        lblCOFINS2 = new javax.swing.JLabel();
        txtCodigo1 = new javax.swing.JTextField();
        txtCodigo2 = new javax.swing.JTextField();
        txtCodigo3 = new javax.swing.JTextField();
        txtCodigo4 = new javax.swing.JTextField();
        painelISSQN = new javax.swing.JPanel();
        lblISSQN = new javax.swing.JLabel();
        lblAliqIssqn = new javax.swing.JLabel();
        txtCstIssqn = new javax.swing.JComboBox<>();
        txtAliqIssqn = new javax.swing.JFormattedTextField();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        lblNome.setText("Nome");
        painelPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setToolTipText("Se você deixar o campo vazio e dar um enter, ele adiciona o próximo código!");
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
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

        txtTipoTributacao1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTipoTributacao1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00 - Tributada integralmente", "10 - Tributada e com cobrança do ICMS por substituição tributária", "20 - Com redução da BC", "30 - Isenta / não tributada e com cobrança do ICMS por substituição tributária", "40 - Isenta", "41 - Não tributada", "50 - Com suspensão", "51 - Com diferimento", "60 - ICMS cobrado anteriormente por substituição tributária", "70 - Com redução da BC e cobrança do ICMS por substituição tributária", "90 - Outras" }));
        painelCSTeCSOSN.add(txtTipoTributacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 460, 20));

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

        txtTipoTributacao2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTipoTributacao2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "101 - Tributada pelo Simples Nacional com permissão de crédito", "102 - Tributada pelo Simples Nacional sem permissão de crédito", "103 - Isenção do ICMS no Simples Nacional para faixa de receita bruta", "201 - Tributada pelo Simples Nacional com permissão de crédito e com cobrança do ICMS por substituição tributária", "202 - Tributada pelo Simples Nacional sem permissão de crédito e com cobrança do ICMS por substituição tributária", "203 - Isenção do ICMS no Simples Nacional para faixa de receita bruta e com cobrança do ICMS por substituição tributária", "300 - Imune", "400 - Não tributada pelo Simples Nacional", "500 - ICMS cobrado anteriormente por substituição tributária (substituído) ou por antecipação", "900 - Outros" }));
        painelCSTeCSOSN.add(txtTipoTributacao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 460, 20));

        txtOrigemCSOSN1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtOrigemCSOSN1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 - Nacional", "1 - Estrangeira", "2 - Estrangeira", "3 - Nacional", "4 - Nacional", "5 - Nacional", "6 - Estrangeira", "7 - Estrangeira" }));
        painelCSTeCSOSN.add(txtOrigemCSOSN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 460, 20));

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

        txtCodigo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo1.setText("0");
        txtCodigo1.setToolTipText("Se você deixar o campo vazio e dar um enter, ele adiciona o próximo código!");
        txtCodigo1.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigo1FocusLost(evt);
            }
        });
        txtCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo1ActionPerformed(evt);
            }
        });
        txtCodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo1KeyReleased(evt);
            }
        });
        painelICMS.add(txtCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 80, 20));

        txtCodigo2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo2.setText("0");
        txtCodigo2.setToolTipText("Se você deixar o campo vazio e dar um enter, ele adiciona o próximo código!");
        txtCodigo2.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigo2FocusLost(evt);
            }
        });
        txtCodigo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo2ActionPerformed(evt);
            }
        });
        txtCodigo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo2KeyReleased(evt);
            }
        });
        painelICMS.add(txtCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, 20));

        txtCodigo3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo3.setText("0");
        txtCodigo3.setToolTipText("Se você deixar o campo vazio e dar um enter, ele adiciona o próximo código!");
        txtCodigo3.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigo3FocusLost(evt);
            }
        });
        txtCodigo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo3ActionPerformed(evt);
            }
        });
        txtCodigo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo3KeyReleased(evt);
            }
        });
        painelICMS.add(txtCodigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 80, 20));

        txtCodigo4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo4.setText("0");
        txtCodigo4.setToolTipText("Se você deixar o campo vazio e dar um enter, ele adiciona o próximo código!");
        txtCodigo4.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigo4FocusLost(evt);
            }
        });
        txtCodigo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigo4ActionPerformed(evt);
            }
        });
        txtCodigo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo4KeyReleased(evt);
            }
        });
        painelICMS.add(txtCodigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 80, 20));

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
            JOptionPane.showMessageDialog(null, "Preencha o nome!");
        } else {
            ProdutoModel pm = new ProdutoModel();
            pm.setCod(Integer.parseInt(txtCodigo.getText()));
            pc.cadastraProduto(pm);
            limpaCampos();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        btnSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        if (txtCodigo.getText().equalsIgnoreCase("")) {
            txtCodigo.setText(Integer.toString(pc.pegaCodigo()));
        }
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        if (txtCodigo.getText().equalsIgnoreCase("")) {
            txtCodigo.setText(Integer.toString(pc.pegaCodigo()));
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void txtCodigo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigo1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo1FocusLost

    private void txtCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo1ActionPerformed

    private void txtCodigo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo1KeyReleased

    private void txtCodigo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigo2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo2FocusLost

    private void txtCodigo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo2ActionPerformed

    private void txtCodigo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo2KeyReleased

    private void txtCodigo3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigo3FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo3FocusLost

    private void txtCodigo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo3ActionPerformed

    private void txtCodigo3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo3KeyReleased

    private void txtCodigo4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigo4FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo4FocusLost

    private void txtCodigo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo4ActionPerformed

    private void txtCodigo4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo4KeyReleased

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
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtCodigo3;
    private javax.swing.JTextField txtCodigo4;
    private javax.swing.JComboBox<String> txtCstIssqn;
    private javax.swing.JTextField txtNome;
    private javax.swing.JComboBox<String> txtOrigemCSOSN1;
    private javax.swing.JComboBox<String> txtTipoTributacao1;
    private javax.swing.JComboBox<String> txtTipoTributacao2;
    // End of variables declaration//GEN-END:variables
}