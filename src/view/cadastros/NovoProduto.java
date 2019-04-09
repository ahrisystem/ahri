package view.cadastros;

import controller.ProdutoController;
import java.awt.Color;
import javax.swing.JOptionPane;
import model.ProdutoModel;
import view.TelaInicial;

public class NovoProduto extends javax.swing.JFrame {
    ProdutoController pc = new ProdutoController();
    private static final NovoProduto INSTANCIA = new NovoProduto();
    

    public static NovoProduto getInstancia() {
        return INSTANCIA;
    }

    private NovoProduto() {
        initComponents();
        setLocationRelativeTo(null);
        if (pc.getEditar() > 0) {
            System.out.println("editar");
        } else {
            System.out.println("novo");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        painelPrincipal = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblTitulo2 = new javax.swing.JLabel();
        txtGrupo = new javax.swing.JComboBox<>();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblTitulo12 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JFormattedTextField();
        lblEAN = new javax.swing.JLabel();
        txtEAN = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtServico = new javax.swing.JCheckBox();
        lblTitulo6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelInformacoesFiscais = new javax.swing.JPanel();
        lblCodigo1 = new javax.swing.JLabel();
        txtCodigo1 = new javax.swing.JTextField();
        txtNCM = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        txtCodigo3 = new javax.swing.JTextField();
        txtCodigo4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtCodigo5 = new javax.swing.JTextField();
        lblCodigo4 = new javax.swing.JLabel();
        txtCodigo6 = new javax.swing.JTextField();
        txtCodigo8 = new javax.swing.JTextField();
        txtTipoTributacao = new javax.swing.JComboBox<>();
        lblCodigo14 = new javax.swing.JLabel();
        lblCodigo15 = new javax.swing.JLabel();
        lblCodigo8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtCodigo9 = new javax.swing.JTextField();
        lblCodigo6 = new javax.swing.JLabel();
        txtCodigo10 = new javax.swing.JTextField();
        lblCodigo9 = new javax.swing.JLabel();
        lblCodigo11 = new javax.swing.JLabel();
        txtCodigo13 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        lblCodigo5 = new javax.swing.JLabel();
        txtCodigo11 = new javax.swing.JTextField();
        lblCodigo10 = new javax.swing.JLabel();
        txtCodigo12 = new javax.swing.JTextField();
        txtCodigo14 = new javax.swing.JTextField();
        txtCodigo15 = new javax.swing.JTextField();
        lblCodigo12 = new javax.swing.JLabel();
        lblCodigo13 = new javax.swing.JLabel();
        lblTitulo13 = new javax.swing.JLabel();
        txtCusto = new javax.swing.JFormattedTextField();
        txtUN = new javax.swing.JComboBox<>();
        lblTítulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 630, 20));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 105, 191));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome");
        painelPrincipal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 20));

        lblTitulo2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo2.setText("Unidade de medida");
        painelPrincipal.add(lblTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 190, 20));

        txtGrupo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lanches", "Bebidas", "Cigarros" }));
        painelPrincipal.add(txtGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 330, 20));

        txtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo.setToolTipText("Se você deixar o campo vazio e dar um enter, ele adiciona o próximo código!");
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 20));
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

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("Código");
        painelPrincipal.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 20));

        lblTitulo12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo12.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo12.setText("Preço");
        painelPrincipal.add(lblTitulo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, 30));

        txtPreco.setForeground(new java.awt.Color(0, 153, 0));
        txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        txtPreco.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        painelPrincipal.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 30));

        lblEAN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEAN.setForeground(new java.awt.Color(51, 105, 191));
        lblEAN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEAN.setText("Código de Barras");
        painelPrincipal.add(lblEAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 150, 20));

        txtEAN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEAN.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtEAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 200, -1));

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

        txtServico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtServico.setText("Serviço ?");
        txtServico.setOpaque(false);
        txtServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtServicoMouseReleased(evt);
            }
        });
        painelPrincipal.add(txtServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 100, 20));

        lblTitulo6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo6.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo6.setText("Grupo");
        painelPrincipal.add(lblTitulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));

        jTabbedPane1.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N

        painelInformacoesFiscais.setBackground(new java.awt.Color(255, 255, 255));
        painelInformacoesFiscais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo1.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo1.setText("NCM");
        painelInformacoesFiscais.add(lblCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 20));

        txtCodigo1.setEditable(false);
        txtCodigo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo1.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo1KeyReleased(evt);
            }
        });
        painelInformacoesFiscais.add(txtCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 560, 20));

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

        txtCodigo3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo3.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo3KeyReleased(evt);
            }
        });
        painelInformacoesFiscais.add(txtCodigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 80, 20));

        txtCodigo4.setEditable(false);
        txtCodigo4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo4.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo4KeyReleased(evt);
            }
        });
        painelInformacoesFiscais.add(txtCodigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 560, 20));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tributação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo5.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo5KeyReleased(evt);
            }
        });
        jPanel3.add(txtCodigo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 50, -1));

        lblCodigo4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo4.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo4.setText("CST/CSOSN:");
        jPanel3.add(lblCodigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 20));

        txtCodigo6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo6.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo6KeyReleased(evt);
            }
        });
        jPanel3.add(txtCodigo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 80, -1));

        txtCodigo8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo8.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo8KeyReleased(evt);
            }
        });
        jPanel3.add(txtCodigo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 80, -1));

        txtTipoTributacao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTipoTributacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T - Tributado", "F - Substituição Tributária", "I - Isento", "N - Não tributado" }));
        jPanel3.add(txtTipoTributacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 20));

        lblCodigo14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo14.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo14.setText("Alíquota:");
        jPanel3.add(lblCodigo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 70, 20));

        lblCodigo15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo15.setText("Entrada");
        jPanel3.add(lblCodigo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 80, 20));

        lblCodigo8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo8.setText("Saída");
        jPanel3.add(lblCodigo8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 80, 20));

        painelInformacoesFiscais.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 320, 120));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IPI", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo9.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo9KeyReleased(evt);
            }
        });
        jPanel4.add(txtCodigo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, -1));

        lblCodigo6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo6.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo6.setText("Saída");
        jPanel4.add(lblCodigo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 60, 20));

        txtCodigo10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo10.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo10KeyReleased(evt);
            }
        });
        jPanel4.add(txtCodigo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 80, -1));

        lblCodigo9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo9.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo9.setText("Entrada");
        jPanel4.add(lblCodigo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 20));

        lblCodigo11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo11.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo11.setText("Alíquota");
        jPanel4.add(lblCodigo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 20));

        txtCodigo13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo13.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo13KeyReleased(evt);
            }
        });
        jPanel4.add(txtCodigo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 80, -1));

        painelInformacoesFiscais.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 180, 120));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PIS/COFINS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo5.setText("Saída");
        jPanel5.add(lblCodigo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 80, 20));

        txtCodigo11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo11.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo11KeyReleased(evt);
            }
        });
        jPanel5.add(txtCodigo11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 80, -1));

        lblCodigo10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo10.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo10.setText("COFINS");
        jPanel5.add(lblCodigo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 60, 20));

        txtCodigo12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo12.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo12KeyReleased(evt);
            }
        });
        jPanel5.add(txtCodigo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 80, -1));

        txtCodigo14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo14.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo14KeyReleased(evt);
            }
        });
        jPanel5.add(txtCodigo14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 80, -1));

        txtCodigo15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtCodigo15.setPreferredSize(new java.awt.Dimension(200, 20));
        txtCodigo15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigo15KeyReleased(evt);
            }
        });
        jPanel5.add(txtCodigo15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 80, -1));

        lblCodigo12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo12.setForeground(new java.awt.Color(51, 105, 191));
        lblCodigo12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo12.setText("PIS");
        jPanel5.add(lblCodigo12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 60, 20));

        lblCodigo13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCodigo13.setText("Entrada");
        jPanel5.add(lblCodigo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 20));

        painelInformacoesFiscais.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 260, 120));

        jTabbedPane1.addTab("Informações fiscais", painelInformacoesFiscais);

        painelPrincipal.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 770, 220));

        lblTitulo13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTitulo13.setForeground(new java.awt.Color(51, 105, 191));
        lblTitulo13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitulo13.setText("Custo");
        painelPrincipal.add(lblTitulo13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 70, 30));

        txtCusto.setForeground(new java.awt.Color(204, 0, 51));
        txtCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        txtCusto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        painelPrincipal.add(txtCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 100, 30));

        txtUN.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UN", "PC", "KG" }));
        painelPrincipal.add(txtUN, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 80, 20));

        jScrollPane1.setViewportView(painelPrincipal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 770, 400));

        lblTítulo.setBackground(new java.awt.Color(51, 51, 51));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Novo Produto");
        lblTítulo.setOpaque(true);
        getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaInicial telainicial = new TelaInicial();
        telainicial.opcoes = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtNome.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Preencha o nome!");
        } else {
            ProdutoModel pm = new ProdutoModel();
            pm.setCod(Integer.parseInt(txtCodigo.getText()));
            pm.setCodigoBarras(Integer.parseInt(txtEAN.getText()));
            pm.setNome(txtNome.getText());
            pm.setInativo(false);
            pm.setGrupo(txtGrupo.getSelectedItem().toString());
            pm.setUnidadeMedida(txtUN.getSelectedItem().toString());
            pm.setEstoque(0);
            double preco = Double.parseDouble(txtPreco.getText().replaceAll(",", "."));
            pm.setPreco(preco);
            pm.setNcm(txtNCM.getText());
            pc.cadastraProduto(pm);
            this.dispose();
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        
    }//GEN-LAST:event_txtCodigoKeyReleased

    private void txtCodigo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo1KeyReleased

    private void txtNCMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNCMKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNCMKeyReleased

    private void txtCodigo3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo3KeyReleased

    private void txtCodigo4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo4KeyReleased

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

    private void txtCodigo5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo5KeyReleased

    private void txtCodigo6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo6KeyReleased

    private void txtCodigo8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo8KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo8KeyReleased

    private void txtCodigo9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo9KeyReleased

    private void txtCodigo10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo10KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo10KeyReleased

    private void txtCodigo13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo13KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo13KeyReleased

    private void txtCodigo11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo11KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo11KeyReleased

    private void txtCodigo12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo12KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo12KeyReleased

    private void txtCodigo14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo14KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo14KeyReleased

    private void txtCodigo15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigo15KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigo15KeyReleased

    private void txtServicoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtServicoMouseReleased
        if (txtServico.isSelected()) {
            txtEAN.setEnabled(false);
            painelInformacoesFiscais.setEnabled(false);
        } else {
            txtEAN.setEnabled(true);
        }
    }//GEN-LAST:event_txtServicoMouseReleased

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        if (txtCodigo.getText().equalsIgnoreCase("")) {
            txtCodigo.setText(Integer.toString(pc.pegaCodigo()));
        }
    }//GEN-LAST:event_txtCodigoActionPerformed

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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo10;
    private javax.swing.JLabel lblCodigo11;
    private javax.swing.JLabel lblCodigo12;
    private javax.swing.JLabel lblCodigo13;
    private javax.swing.JLabel lblCodigo14;
    private javax.swing.JLabel lblCodigo15;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCodigo4;
    private javax.swing.JLabel lblCodigo5;
    private javax.swing.JLabel lblCodigo6;
    private javax.swing.JLabel lblCodigo8;
    private javax.swing.JLabel lblCodigo9;
    private javax.swing.JLabel lblEAN;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo12;
    private javax.swing.JLabel lblTitulo13;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JLabel lblTitulo6;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JPanel painelInformacoesFiscais;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo10;
    private javax.swing.JTextField txtCodigo11;
    private javax.swing.JTextField txtCodigo12;
    private javax.swing.JTextField txtCodigo13;
    private javax.swing.JTextField txtCodigo14;
    private javax.swing.JTextField txtCodigo15;
    private javax.swing.JTextField txtCodigo3;
    private javax.swing.JTextField txtCodigo4;
    private javax.swing.JTextField txtCodigo5;
    private javax.swing.JTextField txtCodigo6;
    private javax.swing.JTextField txtCodigo8;
    private javax.swing.JTextField txtCodigo9;
    private javax.swing.JFormattedTextField txtCusto;
    private javax.swing.JTextField txtEAN;
    private javax.swing.JComboBox<String> txtGrupo;
    private javax.swing.JTextField txtNCM;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JCheckBox txtServico;
    private javax.swing.JComboBox<String> txtTipoTributacao;
    private javax.swing.JComboBox<String> txtUN;
    // End of variables declaration//GEN-END:variables
}
