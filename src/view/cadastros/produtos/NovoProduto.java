package view.cadastros.produtos;

import controller.ProdutoController;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.cadastros.produtos.ProdutoModel;

public class NovoProduto extends javax.swing.JFrame {
    ProdutoController pc = new ProdutoController();
    private static final NovoProduto INSTANCIA = new NovoProduto();
    
    
    public static NovoProduto getInstancia() {
        return INSTANCIA;
    }
    
    public void alterarTitulo(String titulo){
        lblTítulo.setText(titulo);
    }

    private NovoProduto() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void limpaCampos(){
        txtCodigo.setText("");
        txtEAN.setText("");
        txtNome.setText("");
        txtPreco.setText("0,00");
        txtCusto.setText("0,00");
        txtNCM.setText("");
        txtCEST.setText("");
        txtAliquota.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTítulo = new javax.swing.JLabel();
        painelPrincipal = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtServico = new javax.swing.JCheckBox();
        lblEAN = new javax.swing.JLabel();
        txtEAN = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblGrupo = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JComboBox<>();
        lblUN = new javax.swing.JLabel();
        txtUN = new javax.swing.JComboBox<>();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JFormattedTextField();
        lblCusto = new javax.swing.JLabel();
        txtCusto = new javax.swing.JFormattedTextField();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        painelAbas = new javax.swing.JTabbedPane();
        painelInformacoesFiscais = new javax.swing.JPanel();
        lblNCM = new javax.swing.JLabel();
        txtNCMdescricao = new javax.swing.JTextField();
        txtNCM = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        txtCEST = new javax.swing.JTextField();
        txtCESTdescricao = new javax.swing.JTextField();
        painelTributacao = new javax.swing.JPanel();
        txtAliquota = new javax.swing.JTextField();
        lblCodigo4 = new javax.swing.JLabel();
        txtTipoTributacao = new javax.swing.JComboBox<>();
        lblCodigo14 = new javax.swing.JLabel();
        txtTipoTributacao1 = new javax.swing.JComboBox<>();
        painelPisCofins = new javax.swing.JPanel();
        lblCodigo5 = new javax.swing.JLabel();
        lblCOFINS = new javax.swing.JLabel();
        lblPIS = new javax.swing.JLabel();
        lblCodigo13 = new javax.swing.JLabel();
        painelIPI = new javax.swing.JPanel();
        txtCodigo9 = new javax.swing.JTextField();
        lblCodigo6 = new javax.swing.JLabel();
        txtCodigo10 = new javax.swing.JTextField();
        lblCodigo9 = new javax.swing.JLabel();
        lblCodigo11 = new javax.swing.JLabel();
        txtCodigo13 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produto");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTítulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Novo Produto");
        lblTítulo.setOpaque(true);
        getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código");
        painelPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 20));

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
        painelPrincipal.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 170, 20));

        txtServico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtServico.setText("Serviço ?");
        txtServico.setOpaque(false);
        txtServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtServicoMouseReleased(evt);
            }
        });
        painelPrincipal.add(txtServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 100, 20));

        lblEAN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEAN.setForeground(new java.awt.Color(51, 105, 191));
        lblEAN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEAN.setText("Código de Barras");
        painelPrincipal.add(lblEAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 150, 20));

        txtEAN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEAN.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtEAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 200, -1));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 105, 191));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome");
        painelPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 20));

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 630, 20));

        lblGrupo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblGrupo.setForeground(new java.awt.Color(51, 105, 191));
        lblGrupo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGrupo.setText("Grupo");
        painelPrincipal.add(lblGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));

        txtGrupo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lanches", "Bebidas", "Cigarros" }));
        painelPrincipal.add(txtGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 330, 20));

        lblUN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUN.setForeground(new java.awt.Color(51, 105, 191));
        lblUN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUN.setText("Unidade de medida");
        painelPrincipal.add(lblUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 190, 20));

        txtUN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UN", "PC", "KG" }));
        painelPrincipal.add(txtUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 80, 20));

        lblPreco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPreco.setForeground(new java.awt.Color(51, 105, 191));
        lblPreco.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPreco.setText("Preço");
        painelPrincipal.add(lblPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 30));

        txtPreco.setForeground(new java.awt.Color(0, 153, 0));
        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPreco.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        painelPrincipal.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 30));

        lblCusto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCusto.setForeground(new java.awt.Color(51, 105, 191));
        lblCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCusto.setText("Custo");
        painelPrincipal.add(lblCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 70, 30));

        txtCusto.setForeground(new java.awt.Color(204, 0, 51));
        txtCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtCusto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustoActionPerformed(evt);
            }
        });
        painelPrincipal.add(txtCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 100, 30));

        btnSair.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setFocusable(false);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSairMouseExited(evt);
            }
        });
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 80, 40));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setFocusable(false);
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
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 80, 40));

        painelAbas.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        painelInformacoesFiscais.setBackground(new java.awt.Color(255, 255, 255));
        painelInformacoesFiscais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNCM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNCM.setForeground(new java.awt.Color(51, 105, 191));
        lblNCM.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNCM.setText("NCM");
        painelInformacoesFiscais.add(lblNCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        txtNCMdescricao.setEditable(false);
        txtNCMdescricao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNCMdescricao.setFocusable(false);
        txtNCMdescricao.setPreferredSize(new java.awt.Dimension(200, 20));
        txtNCMdescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNCMdescricaoKeyReleased(evt);
            }
        });
        painelInformacoesFiscais.add(txtNCMdescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 560, 20));

        txtNCM.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNCM.setPreferredSize(new java.awt.Dimension(200, 20));
        txtNCM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNCMKeyReleased(evt);
            }
        });
        painelInformacoesFiscais.add(txtNCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, 20));

        lblCodigo2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo2.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo2.setText("CEST");
        painelInformacoesFiscais.add(lblCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, 20));

        txtCEST.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCEST.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCEST.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCESTKeyReleased(evt);
            }
        });
        painelInformacoesFiscais.add(txtCEST, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 80, 20));

        txtCESTdescricao.setEditable(false);
        txtCESTdescricao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCESTdescricao.setFocusable(false);
        txtCESTdescricao.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCESTdescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCESTdescricaoKeyReleased(evt);
            }
        });
        painelInformacoesFiscais.add(txtCESTdescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 560, 20));

        painelTributacao.setBackground(new java.awt.Color(255, 255, 255));
        painelTributacao.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tributação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        painelTributacao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAliquota.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtAliquota.setPreferredSize(new java.awt.Dimension(200, 20));
        txtAliquota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAliquotaKeyReleased(evt);
            }
        });
        painelTributacao.add(txtAliquota, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 50, -1));

        lblCodigo4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo4.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo4.setText("CST/CSOSN:");
        painelTributacao.add(lblCodigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 20));

        txtTipoTributacao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTipoTributacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 - Nacional", "1 - Estrangeira", "2 - Estrangeira", "3 - Nacional", "4 - Nacional", "5 - Nacional", "6 - Estrangeira", "7 - Estrangeira" }));
        painelTributacao.add(txtTipoTributacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 130, 20));

        lblCodigo14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo14.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo14.setText("Alíquota:");
        painelTributacao.add(lblCodigo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 70, 20));

        txtTipoTributacao1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTipoTributacao1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T - Tributado", "F - Substituição Tributária", "I - Isento", "N - Não tributado" }));
        painelTributacao.add(txtTipoTributacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 20));

        painelInformacoesFiscais.add(painelTributacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 280, 120));

        painelPisCofins.setBackground(new java.awt.Color(255, 255, 255));
        painelPisCofins.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PIS/COFINS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        painelPisCofins.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo5.setText("Saída");
        painelPisCofins.add(lblCodigo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 70, 20));

        lblCOFINS.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCOFINS.setForeground(new java.awt.Color(51, 105, 191));
        lblCOFINS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCOFINS.setText("COFINS");
        painelPisCofins.add(lblCOFINS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 60, 20));

        lblPIS.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPIS.setForeground(new java.awt.Color(51, 105, 191));
        lblPIS.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPIS.setText("PIS");
        painelPisCofins.add(lblPIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, 20));

        lblCodigo13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo13.setText("Entrada");
        painelPisCofins.add(lblCodigo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 70, 20));

        painelInformacoesFiscais.add(painelPisCofins, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 230, 120));

        painelIPI.setBackground(new java.awt.Color(255, 255, 255));
        painelIPI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IPI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        painelIPI.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo9.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo9KeyReleased(evt);
            }
        });
        painelIPI.add(txtCodigo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, -1));

        lblCodigo6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo6.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo6.setText("Saída");
        painelIPI.add(lblCodigo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, 20));

        txtCodigo10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo10.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo10KeyReleased(evt);
            }
        });
        painelIPI.add(txtCodigo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 80, -1));

        lblCodigo9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo9.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo9.setText("Entrada");
        painelIPI.add(lblCodigo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 20));

        lblCodigo11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo11.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo11.setText("Alíquota");
        painelIPI.add(lblCodigo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 20));

        txtCodigo13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo13.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo13KeyReleased(evt);
            }
        });
        painelIPI.add(txtCodigo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 80, -1));

        painelInformacoesFiscais.add(painelIPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 180, 120));

        painelAbas.addTab("Informações fiscais", painelInformacoesFiscais);

        painelPrincipal.add(painelAbas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 770, 220));

        getContentPane().add(painelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome!");
        } else {
            if (txtPreco.getText().equalsIgnoreCase("") || txtPreco.getText().equalsIgnoreCase("0,00")) {
                JOptionPane.showMessageDialog(null, "Verifique o preço!");
            } else {
                if (txtNCM.getText().equalsIgnoreCase("")) {
                    JOptionPane.showMessageDialog(null, "Informe o NCM/NBS.");
                } else {
                    ProdutoModel pm = new ProdutoModel();
                    pm.setCod(Integer.parseInt(txtCodigo.getText()));
                    pm.setServico(txtServico.isEnabled());
                    pm.setCodigoBarras(txtEAN.getText());
                    pm.setNome(txtNome.getText());
                    pm.setInativo(false);
                    pm.setGrupo(txtGrupo.getSelectedItem().toString());
                    pm.setUnidadeMedida(txtUN.getSelectedItem().toString());
                    pm.setEstoque(0);
                    pm.setPreco(Double.parseDouble(txtPreco.getText().replaceAll(",", ".")));
                    pm.setCusto(Double.parseDouble(txtCusto.getText().replaceAll(",", ".")));
                    pm.setNcm(txtNCM.getText());
                    pm.setCest(txtCEST.getText());
                    pc.cadastraProduto(pm);
                    limpaCampos();
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        limpaCampos();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtNCMdescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNCMdescricaoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNCMdescricaoKeyReleased

    private void txtNCMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNCMKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNCMKeyReleased

    private void txtCESTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCESTKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCESTKeyReleased

    private void txtCESTdescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCESTdescricaoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCESTdescricaoKeyReleased

    private void btnSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseEntered
        btnSair.setForeground(Color.RED);
    }//GEN-LAST:event_btnSairMouseEntered

    private void btnSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseExited
        btnSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSairMouseExited

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setForeground(Color.GREEN);
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        btnSalvar.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSalvarMouseExited

    private void txtAliquotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAliquotaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAliquotaKeyReleased

    private void txtCodigo9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo9KeyReleased

    private void txtCodigo10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo10KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo10KeyReleased

    private void txtCodigo13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo13KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo13KeyReleased

    private void txtServicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtServicoMouseReleased
        if (txtServico.isSelected()) {
            txtEAN.setEnabled(false);
            lblNCM.setText("NBS");
        } else {
            txtEAN.setEnabled(true);
            lblNCM.setText("NCM");
        }
    }//GEN-LAST:event_txtServicoMouseReleased

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

    private void txtCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        System.out.println("aberta");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCOFINS;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo11;
    private javax.swing.JLabel lblCodigo13;
    private javax.swing.JLabel lblCodigo14;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCodigo4;
    private javax.swing.JLabel lblCodigo5;
    private javax.swing.JLabel lblCodigo6;
    private javax.swing.JLabel lblCodigo9;
    private javax.swing.JLabel lblCusto;
    private javax.swing.JLabel lblEAN;
    private javax.swing.JLabel lblGrupo;
    private javax.swing.JLabel lblNCM;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPIS;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblUN;
    private javax.swing.JTabbedPane painelAbas;
    private javax.swing.JPanel painelIPI;
    private javax.swing.JPanel painelInformacoesFiscais;
    private javax.swing.JPanel painelPisCofins;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JPanel painelTributacao;
    private javax.swing.JTextField txtAliquota;
    private javax.swing.JTextField txtCEST;
    private javax.swing.JTextField txtCESTdescricao;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo10;
    private javax.swing.JTextField txtCodigo13;
    private javax.swing.JTextField txtCodigo9;
    private javax.swing.JFormattedTextField txtCusto;
    private javax.swing.JTextField txtEAN;
    private javax.swing.JComboBox<String> txtGrupo;
    private javax.swing.JTextField txtNCM;
    private javax.swing.JTextField txtNCMdescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JCheckBox txtServico;
    private javax.swing.JComboBox<String> txtTipoTributacao;
    private javax.swing.JComboBox<String> txtTipoTributacao1;
    private javax.swing.JComboBox<String> txtUN;
    // End of variables declaration//GEN-END:variables
}