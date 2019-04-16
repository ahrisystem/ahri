package view;

import funcoes.ButtonTabComponent;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import view.cadastros.clientes.Clientes;
import view.pdv.PDV;
import view.cadastros.clientes.NovoCliente;
import view.cadastros.vendas.Orcamentos;
import view.cadastros.produtos.Produtos;

public class TelaInicial extends javax.swing.JFrame {

    boolean inicial = true;
    boolean cadastros = false;
    boolean estoque = false;
    boolean financeiro = false;
    boolean ferramentas = false;
    boolean vendas = false;
    boolean ajuda = false;
    public boolean opcoes;
    
    ////////////////////////
    Color itemBranco = Color.WHITE;
    Color itemAzul = new java.awt.Color(51, 105, 191);

    public TelaInicial() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        icone();
        
    }

    public String weekDay(Calendar cal) {
        return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)];
    }

    public void icone() {
        URL url = this.getClass().getResource("/images/icon.ico");
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(iconeTitulo);
    }

    public void alterarIcones(String i) {
        opcao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + i + "/icon1.png")));
        opcao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + i + "/icon2.png")));
        opcao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + i + "/icon3.png")));
        opcao4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + i + "/icon4.png")));
        opcao5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + i + "/icon5.png")));
        opcao6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + i + "/icon6.png")));
        opcao7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + i + "/icon7.png")));
        opcao8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + i + "/icon8.png")));
        opcao9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + i + "/icon9.png")));
        opcao10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/" + i + "/icon10.png")));
    }
    
    public void alterarTitulos() {
        if (inicial) {
            opcao1.setText("Caixa");
            opcao2.setText("Clientes");
            opcao3.setText("Orçamentos");
            opcao4.setText("Status");
            opcao5.setText("Devedores");
            opcao6.setText("Produtos");
            opcao7.setText("Estoque");
            opcao8.setText("N. Usuário");
            opcao9.setText("Entrada");
            opcao10.setText("Ajuda");
        }
        if (cadastros) {
            opcao1.setText("Produtos");
            opcao2.setText("Fornecedores");
            opcao3.setText("Clientes");
            opcao4.setText("Grupos");
            opcao5.setText("Formas de P.");
            opcao6.setText("Fiscal");
            opcao7.setText("Contábil");
            opcao8.setText("Usuários");
            opcao9.setText("Empresa");
            opcao10.setText("Relatórios");
        }
        if (estoque) {
            opcao1.setText("Entrada");
            opcao2.setText("Movimentação");
            opcao3.setText("Inventário");
            opcao4.setText("Conferência");
            opcao5.setText("Classif.");
            opcao6.setText("Consultas");
            opcao7.setText("");
            opcao8.setText("");
            opcao9.setText("");
            opcao10.setText("Relatórios");
        }
        if (financeiro) {
            opcao1.setText("Caixa");
            opcao2.setText("Devedores");
            opcao3.setText("Dinheiro");
            opcao4.setText("A pagar");
            opcao5.setText("A receber");
            opcao6.setText("Movimentação");
            opcao7.setText("");
            opcao8.setText("");
            opcao9.setText("");
            opcao10.setText("Relatórios");
        }
        if (ferramentas) {
            opcao1.setText("Ajustes");
            opcao2.setText("Ajustes");
            opcao3.setText("Ajustes");
            opcao4.setText("Ajustes");
            opcao5.setText("Ajustes");
            opcao6.setText("Ajustes");
            opcao7.setText("Ajustes");
            opcao8.setText("Ajustes");
            opcao9.setText("Ajustes");
            opcao10.setText("Ajustes");
        }
        if (vendas) {
            opcao1.setText("");
            opcao2.setText("");
            opcao3.setText("");
            opcao4.setText("");
            opcao5.setText("");
            opcao6.setText("");
            opcao7.setText("");
            opcao8.setText("");
            opcao9.setText("");
            opcao10.setText("");
        }
        if (ajuda) {
            opcao1.setText("");
            opcao2.setText("");
            opcao3.setText("");
            opcao4.setText("");
            opcao5.setText("");
            opcao6.setText("");
            opcao7.setText("");
            opcao8.setText("");
            opcao9.setText("");
            opcao10.setText("Sobre");
        }
    }
    
    public void alterarCorFundoIcones(JLabel opcao){
        opcao.setBackground(new java.awt.Color(163, 193, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPopupMenu();
        jmi1 = new javax.swing.JMenuItem();
        jmi2 = new javax.swing.JMenuItem();
        jmi3 = new javax.swing.JMenuItem();
        jmi4 = new javax.swing.JMenuItem();
        jmi5 = new javax.swing.JMenuItem();
        frontPanel2 = new javax.swing.JPanel();
        backPanel = new javax.swing.JPanel();
        btnOpcoes = new javax.swing.JLabel();
        btnInicial = new javax.swing.JLabel();
        btnCadastros = new javax.swing.JLabel();
        btnEstoque = new javax.swing.JLabel();
        btnFerramentas = new javax.swing.JLabel();
        btnFinanceiro = new javax.swing.JLabel();
        btnVendas = new javax.swing.JLabel();
        btnAjuda = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        painelMenu = new javax.swing.JPanel();
        opcao1 = new javax.swing.JLabel();
        opcao2 = new javax.swing.JLabel();
        opcao3 = new javax.swing.JLabel();
        opcao4 = new javax.swing.JLabel();
        opcao5 = new javax.swing.JLabel();
        opcao6 = new javax.swing.JLabel();
        opcao7 = new javax.swing.JLabel();
        opcao8 = new javax.swing.JLabel();
        opcao9 = new javax.swing.JLabel();
        opcao10 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        painelPrincipal = new javax.swing.JTabbedPane();

        jmi1.setText("jMenuItem1");
        menu.add(jmi1);

        jmi2.setText("jMenuItem2");
        menu.add(jmi2);

        jmi3.setText("jMenuItem3");
        menu.add(jmi3);

        jmi4.setText("jMenuItem1");
        menu.add(jmi4);

        jmi5.setText("jMenuItem1");
        menu.add(jmi5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AHRI! Gerenciamento avançado, do tipo de negócio que precisar!");

        frontPanel2.setBackground(new java.awt.Color(255, 255, 255));

        backPanel.setBackground(new java.awt.Color(51, 105, 191));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOpcoes.setBackground(new java.awt.Color(51, 105, 191));
        btnOpcoes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnOpcoes.setForeground(new java.awt.Color(255, 255, 255));
        btnOpcoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnOpcoes.setText("Opções");
        btnOpcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcoes.setOpaque(true);
        btnOpcoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnOpcoesMouseReleased(evt);
            }
        });
        backPanel.add(btnOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        btnInicial.setBackground(new java.awt.Color(255, 255, 255));
        btnInicial.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnInicial.setForeground(new java.awt.Color(51, 105, 191));
        btnInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInicial.setText("Página Inicial");
        btnInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicial.setOpaque(true);
        btnInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInicialMousePressed(evt);
            }
        });
        backPanel.add(btnInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 140, 30));

        btnCadastros.setBackground(new java.awt.Color(51, 105, 191));
        btnCadastros.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCadastros.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCadastros.setText("Cadastros");
        btnCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastros.setOpaque(true);
        btnCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadastrosMousePressed(evt);
            }
        });
        backPanel.add(btnCadastros, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 100, 30));

        btnEstoque.setBackground(new java.awt.Color(51, 105, 191));
        btnEstoque.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEstoque.setForeground(new java.awt.Color(255, 255, 255));
        btnEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEstoque.setText("Estoque");
        btnEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstoque.setOpaque(true);
        btnEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEstoqueMousePressed(evt);
            }
        });
        backPanel.add(btnEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 100, 30));

        btnFerramentas.setBackground(new java.awt.Color(51, 105, 191));
        btnFerramentas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnFerramentas.setForeground(new java.awt.Color(255, 255, 255));
        btnFerramentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFerramentas.setText("Ferramentas");
        btnFerramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFerramentas.setOpaque(true);
        btnFerramentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFerramentasMousePressed(evt);
            }
        });
        backPanel.add(btnFerramentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 100, 30));

        btnFinanceiro.setBackground(new java.awt.Color(51, 105, 191));
        btnFinanceiro.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        btnFinanceiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFinanceiro.setText("Financeiro");
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.setOpaque(true);
        btnFinanceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFinanceiroMousePressed(evt);
            }
        });
        backPanel.add(btnFinanceiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 100, 30));

        btnVendas.setBackground(new java.awt.Color(51, 105, 191));
        btnVendas.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVendas.setText("Vendas");
        btnVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendas.setOpaque(true);
        btnVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVendasMousePressed(evt);
            }
        });
        backPanel.add(btnVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 100, 30));

        btnAjuda.setBackground(new java.awt.Color(51, 105, 191));
        btnAjuda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAjuda.setForeground(new java.awt.Color(255, 255, 255));
        btnAjuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAjuda.setText("Ajuda");
        btnAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAjuda.setOpaque(true);
        btnAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAjudaMousePressed(evt);
            }
        });
        backPanel.add(btnAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 90, 30));

        btnLogout.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setFocusable(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        painelMenu.setBackground(new java.awt.Color(255, 255, 255));
        painelMenu.setLayout(new java.awt.GridLayout(1, 10));

        opcao1.setBackground(new java.awt.Color(255, 255, 255));
        opcao1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        opcao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcao1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/icon1.png"))); // NOI18N
        opcao1.setText("Caixa");
        opcao1.setToolTipText("");
        opcao1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcao1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcao1.setOpaque(true);
        opcao1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        opcao1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcao1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcao1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                opcao1MouseReleased(evt);
            }
        });
        painelMenu.add(opcao1);

        opcao2.setBackground(new java.awt.Color(255, 255, 255));
        opcao2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        opcao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/icon2.png"))); // NOI18N
        opcao2.setText("Clientes");
        opcao2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcao2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcao2.setOpaque(true);
        opcao2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        opcao2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcao2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcao2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                opcao2MousePressed(evt);
            }
        });
        painelMenu.add(opcao2);

        opcao3.setBackground(new java.awt.Color(255, 255, 255));
        opcao3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        opcao3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcao3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/icon3.png"))); // NOI18N
        opcao3.setText("Orçamentos");
        opcao3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcao3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcao3.setOpaque(true);
        opcao3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        opcao3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcao3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcao3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                opcao3MousePressed(evt);
            }
        });
        painelMenu.add(opcao3);

        opcao4.setBackground(new java.awt.Color(255, 255, 255));
        opcao4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        opcao4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcao4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/icon4.png"))); // NOI18N
        opcao4.setText("Status");
        opcao4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcao4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcao4.setOpaque(true);
        opcao4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        opcao4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcao4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcao4MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                opcao4MouseReleased(evt);
            }
        });
        painelMenu.add(opcao4);

        opcao5.setBackground(new java.awt.Color(255, 255, 255));
        opcao5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        opcao5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcao5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/icon5.png"))); // NOI18N
        opcao5.setText("Devedores");
        opcao5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcao5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcao5.setOpaque(true);
        opcao5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        opcao5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcao5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcao5MouseExited(evt);
            }
        });
        painelMenu.add(opcao5);

        opcao6.setBackground(new java.awt.Color(255, 255, 255));
        opcao6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        opcao6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcao6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/icon6.png"))); // NOI18N
        opcao6.setText("Produtos");
        opcao6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcao6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcao6.setOpaque(true);
        opcao6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        opcao6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcao6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcao6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                opcao6MousePressed(evt);
            }
        });
        painelMenu.add(opcao6);

        opcao7.setBackground(new java.awt.Color(255, 255, 255));
        opcao7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        opcao7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcao7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/icon7.png"))); // NOI18N
        opcao7.setText("Estoque");
        opcao7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcao7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcao7.setOpaque(true);
        opcao7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        opcao7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcao7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcao7MouseExited(evt);
            }
        });
        painelMenu.add(opcao7);

        opcao8.setBackground(new java.awt.Color(255, 255, 255));
        opcao8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        opcao8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcao8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/icon8.png"))); // NOI18N
        opcao8.setText("N. Usuário");
        opcao8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcao8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcao8.setOpaque(true);
        opcao8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        opcao8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcao8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcao8MouseExited(evt);
            }
        });
        painelMenu.add(opcao8);

        opcao9.setBackground(new java.awt.Color(255, 255, 255));
        opcao9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        opcao9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcao9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/icon9.png"))); // NOI18N
        opcao9.setText("Entrada");
        opcao9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcao9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcao9.setOpaque(true);
        opcao9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        opcao9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcao9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcao9MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                opcao9MouseReleased(evt);
            }
        });
        painelMenu.add(opcao9);

        opcao10.setBackground(new java.awt.Color(255, 255, 255));
        opcao10.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        opcao10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcao10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inicio/icon10.png"))); // NOI18N
        opcao10.setText("Ajuda");
        opcao10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcao10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        opcao10.setOpaque(true);
        opcao10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        opcao10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcao10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcao10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                opcao10MousePressed(evt);
            }
        });
        painelMenu.add(opcao10);

        btnExit.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.setFocusable(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout frontPanel2Layout = new javax.swing.GroupLayout(frontPanel2);
        frontPanel2.setLayout(frontPanel2Layout);
        frontPanel2Layout.setHorizontalGroup(
            frontPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(frontPanel2Layout.createSequentialGroup()
                .addComponent(painelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frontPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        frontPanel2Layout.setVerticalGroup(
            frontPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frontPanel2Layout.createSequentialGroup()
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(frontPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frontPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(painelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        painelPrincipal.setBackground(new java.awt.Color(51, 105, 191));
        painelPrincipal.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        painelPrincipal.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frontPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(frontPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicialMousePressed
        inicial = true;
        cadastros = false;
        estoque = false;
        financeiro = false;
        ferramentas = false;
        vendas = false;
        ajuda = false;
        btnInicial.setBackground(itemBranco);
        btnCadastros.setBackground(itemAzul);
        btnEstoque.setBackground(itemAzul);
        btnFinanceiro.setBackground(itemAzul);
        btnFerramentas.setBackground(itemAzul);
        btnVendas.setBackground(itemAzul);
        btnAjuda.setBackground(itemAzul);

        btnInicial.setForeground(itemAzul);
        btnCadastros.setForeground(itemBranco);
        btnEstoque.setForeground(itemBranco);
        btnFinanceiro.setForeground(itemBranco);
        btnFerramentas.setForeground(itemBranco);
        btnVendas.setForeground(itemBranco);
        btnAjuda.setForeground(itemBranco);

        alterarIcones("inicio");
        alterarTitulos();
    }//GEN-LAST:event_btnInicialMousePressed

    private void btnCadastrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrosMousePressed
        inicial = false;
        cadastros = true;
        estoque = false;
        financeiro = false;
        ferramentas = false;
        vendas = false;
        ajuda = false;
        btnInicial.setBackground(itemAzul);
        btnCadastros.setBackground(itemBranco);
        btnEstoque.setBackground(itemAzul);
        btnFinanceiro.setBackground(itemAzul);
        btnFerramentas.setBackground(itemAzul);
        btnVendas.setBackground(itemAzul);
        btnAjuda.setBackground(itemAzul);

        btnInicial.setForeground(itemBranco);
        btnCadastros.setForeground(itemAzul);
        btnEstoque.setForeground(itemBranco);
        btnFinanceiro.setForeground(itemBranco);
        btnFerramentas.setForeground(itemBranco);
        btnVendas.setForeground(itemBranco);
        btnAjuda.setForeground(itemBranco);

        alterarIcones("cadastros");
        alterarTitulos();
    }//GEN-LAST:event_btnCadastrosMousePressed

    private void btnEstoqueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMousePressed
        inicial = false;
        cadastros = false;
        estoque = true;
        financeiro = false;
        ferramentas = false;
        vendas = false;
        ajuda = false;
        btnInicial.setBackground(itemAzul);
        btnCadastros.setBackground(itemAzul);
        btnEstoque.setBackground(itemBranco);
        btnFinanceiro.setBackground(itemAzul);
        btnFerramentas.setBackground(itemAzul);
        btnVendas.setBackground(itemAzul);
        btnAjuda.setBackground(itemAzul);

        btnInicial.setForeground(itemBranco);
        btnCadastros.setForeground(itemBranco);
        btnEstoque.setForeground(itemAzul);
        btnFinanceiro.setForeground(itemBranco);
        btnFerramentas.setForeground(itemBranco);
        btnVendas.setForeground(itemBranco);
        btnAjuda.setForeground(itemBranco);
        alterarIcones("estoque");
        alterarTitulos();
    }//GEN-LAST:event_btnEstoqueMousePressed

    private void btnFerramentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFerramentasMousePressed
        inicial = false;
        cadastros = false;
        estoque = false;
        financeiro = false;
        ferramentas = true;
        vendas = false;
        ajuda = false;
        btnInicial.setBackground(itemAzul);
        btnCadastros.setBackground(itemAzul);
        btnEstoque.setBackground(itemAzul);
        btnFinanceiro.setBackground(itemAzul);
        btnFerramentas.setBackground(itemBranco);
        btnVendas.setBackground(itemAzul);
        btnAjuda.setBackground(itemAzul);

        btnInicial.setForeground(itemBranco);
        btnCadastros.setForeground(itemBranco);
        btnEstoque.setForeground(itemBranco);
        btnFinanceiro.setForeground(itemBranco);
        btnFerramentas.setForeground(itemAzul);
        btnVendas.setForeground(itemBranco);
        btnAjuda.setForeground(itemBranco);
        alterarIcones("ferramentas");
        alterarTitulos();
    }//GEN-LAST:event_btnFerramentasMousePressed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int opcao = 2;
        if (JOptionPane.showConfirmDialog(null, "Deseja entrar com outro usuário?", "Logout?", opcao) == 0) {
            this.dispose();
            Login login = Login.getInstancia();
            login.setVisible(true);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnOpcoesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpcoesMouseReleased
        
    }//GEN-LAST:event_btnOpcoesMouseReleased

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int opcao = 2;
        if (JOptionPane.showConfirmDialog(null, "Deseja sair do sistema?\nFormulários não salvos podem ser perdidos",
                "Sair?", opcao) == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void opcao1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao1MouseReleased
        if (inicial) {
           new PDV().setVisible(true); 
        }
        if (cadastros) {
            Produtos produtos = Produtos.getInstancia();
            painelPrincipal.add("Produtos", produtos);
            painelPrincipal.setSelectedIndex(painelPrincipal.getTabCount()-1);
            painelPrincipal.setTabComponentAt(painelPrincipal.getSelectedIndex(), new ButtonTabComponent(painelPrincipal));
        }
        
    }//GEN-LAST:event_opcao1MouseReleased

    private void opcao4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao4MouseReleased
        if (cadastros) {
            NovoCliente novoCliente = NovoCliente.getInstancia();
            novoCliente.setVisible(true);
        }
    }//GEN-LAST:event_opcao4MouseReleased

    private void btnFinanceiroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinanceiroMousePressed
        inicial = false;
        cadastros = false;
        estoque = false;
        financeiro = true;
        ferramentas = false;
        vendas = false;
        ajuda = false;
        btnInicial.setBackground(itemAzul);
        btnCadastros.setBackground(itemAzul);
        btnEstoque.setBackground(itemAzul);
        btnFinanceiro.setBackground(itemBranco);
        btnFerramentas.setBackground(itemAzul);
        btnVendas.setBackground(itemAzul);
        btnAjuda.setBackground(itemAzul);

        btnInicial.setForeground(itemBranco);
        btnCadastros.setForeground(itemBranco);
        btnEstoque.setForeground(itemBranco);
        btnFinanceiro.setForeground(itemAzul);
        btnFerramentas.setForeground(itemBranco);
        btnVendas.setForeground(itemBranco);
        btnAjuda.setForeground(itemBranco);
        alterarIcones("financeiro");
        alterarTitulos();
    }//GEN-LAST:event_btnFinanceiroMousePressed

    private void btnAjudaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAjudaMousePressed
        inicial = false;
        cadastros = false;
        estoque = false;
        financeiro = false;
        ferramentas = false;
        vendas = false;
        ajuda = true;
        btnInicial.setBackground(itemAzul);
        btnCadastros.setBackground(itemAzul);
        btnEstoque.setBackground(itemAzul);
        btnFinanceiro.setBackground(itemAzul);
        btnFerramentas.setBackground(itemAzul);
        btnVendas.setBackground(itemAzul);
        btnAjuda.setBackground(itemBranco);

        btnInicial.setForeground(itemBranco);
        btnCadastros.setForeground(itemBranco);
        btnEstoque.setForeground(itemBranco);
        btnFinanceiro.setForeground(itemBranco);
        btnFerramentas.setForeground(itemBranco);
        btnVendas.setForeground(itemBranco);
        btnAjuda.setForeground(itemAzul);
        alterarIcones("ajuda");
        alterarTitulos();
    }//GEN-LAST:event_btnAjudaMousePressed

    private void opcao3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao3MousePressed
        if (inicial) {
            Orcamentos orcamentos = Orcamentos.getInstancia();
            painelPrincipal.addTab("Orçamentos", orcamentos);
            painelPrincipal.setSelectedIndex(painelPrincipal.getTabCount()-1);
            painelPrincipal.setTabComponentAt(painelPrincipal.getSelectedIndex(), new ButtonTabComponent(painelPrincipal));
        }
        if (cadastros) {
            
        }
        if (vendas) {
            Orcamentos orcamentos = Orcamentos.getInstancia();
            painelPrincipal.addTab("Orçamentos", orcamentos);
            painelPrincipal.setSelectedIndex(painelPrincipal.getTabCount()-1);
            painelPrincipal.setTabComponentAt(painelPrincipal.getSelectedIndex(), new ButtonTabComponent(painelPrincipal));
        }
    }//GEN-LAST:event_opcao3MousePressed

    private void btnVendasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendasMousePressed
        inicial = false;
        cadastros = false;
        estoque = false;
        financeiro = false;
        ferramentas = false;
        vendas = true;
        ajuda = false;
        btnInicial.setBackground(itemAzul);
        btnCadastros.setBackground(itemAzul);
        btnEstoque.setBackground(itemAzul);
        btnFinanceiro.setBackground(itemAzul);
        btnFerramentas.setBackground(itemAzul);
        btnVendas.setBackground(itemBranco);
        btnAjuda.setBackground(itemAzul);

        btnInicial.setForeground(itemBranco);
        btnCadastros.setForeground(itemBranco);
        btnEstoque.setForeground(itemBranco);
        btnFinanceiro.setForeground(itemBranco);
        btnFerramentas.setForeground(itemBranco);
        btnVendas.setForeground(itemAzul);
        btnAjuda.setForeground(itemBranco);
        alterarIcones("vendas");
        alterarTitulos();
    }//GEN-LAST:event_btnVendasMousePressed

    private void opcao10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao10MousePressed
        if (inicial) {
            Help help = Help.getInstancia();
            help.setVisible(true);
        }
        if (ajuda) {
            Help help = Help.getInstancia();
            help.setVisible(true);
        }
    }//GEN-LAST:event_opcao10MousePressed

    private void opcao1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao1MouseEntered
        alterarCorFundoIcones(opcao1);
    }//GEN-LAST:event_opcao1MouseEntered

    private void opcao1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao1MouseExited
        opcao1.setBackground(Color.white);
    }//GEN-LAST:event_opcao1MouseExited

    private void opcao2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao2MouseEntered
        alterarCorFundoIcones(opcao2);
    }//GEN-LAST:event_opcao2MouseEntered

    private void opcao2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao2MouseExited
        opcao2.setBackground(Color.white);
    }//GEN-LAST:event_opcao2MouseExited

    private void opcao3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao3MouseEntered
        alterarCorFundoIcones(opcao3);
    }//GEN-LAST:event_opcao3MouseEntered

    private void opcao3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao3MouseExited
        opcao3.setBackground(Color.white);
    }//GEN-LAST:event_opcao3MouseExited

    private void opcao4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao4MouseEntered
        alterarCorFundoIcones(opcao4);
    }//GEN-LAST:event_opcao4MouseEntered

    private void opcao4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao4MouseExited
        opcao4.setBackground(Color.white);
    }//GEN-LAST:event_opcao4MouseExited

    private void opcao5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao5MouseEntered
        alterarCorFundoIcones(opcao5);
    }//GEN-LAST:event_opcao5MouseEntered

    private void opcao5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao5MouseExited
        opcao5.setBackground(Color.white);
    }//GEN-LAST:event_opcao5MouseExited

    private void opcao6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao6MouseEntered
        alterarCorFundoIcones(opcao6);
    }//GEN-LAST:event_opcao6MouseEntered

    private void opcao6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao6MouseExited
        opcao6.setBackground(Color.white);
    }//GEN-LAST:event_opcao6MouseExited

    private void opcao7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao7MouseEntered
        alterarCorFundoIcones(opcao7);
    }//GEN-LAST:event_opcao7MouseEntered

    private void opcao7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao7MouseExited
        opcao7.setBackground(Color.white);
    }//GEN-LAST:event_opcao7MouseExited

    private void opcao8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao8MouseEntered
        alterarCorFundoIcones(opcao8);
    }//GEN-LAST:event_opcao8MouseEntered

    private void opcao8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao8MouseExited
        opcao8.setBackground(Color.white);
    }//GEN-LAST:event_opcao8MouseExited

    private void opcao9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao9MouseEntered
        alterarCorFundoIcones(opcao9);
    }//GEN-LAST:event_opcao9MouseEntered

    private void opcao9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao9MouseExited
        opcao9.setBackground(Color.white);
    }//GEN-LAST:event_opcao9MouseExited

    private void opcao10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao10MouseEntered
        alterarCorFundoIcones(opcao10);
    }//GEN-LAST:event_opcao10MouseEntered

    private void opcao10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao10MouseExited
        opcao10.setBackground(Color.white);
    }//GEN-LAST:event_opcao10MouseExited

    private void opcao9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao9MouseReleased
        if (inicial) {
            
        }
        if (cadastros) {
            
        }
    }//GEN-LAST:event_opcao9MouseReleased

    private void opcao6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao6MousePressed
        if (inicial) {
            Produtos produtos = Produtos.getInstancia();
            painelPrincipal.add("Produtos", produtos);
            painelPrincipal.setSelectedIndex(painelPrincipal.getTabCount()-1);
            painelPrincipal.setTabComponentAt(painelPrincipal.getSelectedIndex(), new ButtonTabComponent(painelPrincipal));
        }
        if (cadastros) {
            
        }
    }//GEN-LAST:event_opcao6MousePressed

    private void opcao2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcao2MousePressed
        if (inicial) {
            Clientes clientes = Clientes.getInstancia();
            painelPrincipal.add("Clientes", clientes);
            painelPrincipal.setSelectedIndex(painelPrincipal.getTabCount()-1);
            painelPrincipal.setTabComponentAt(painelPrincipal.getSelectedIndex(), new ButtonTabComponent(painelPrincipal));
        }
    }//GEN-LAST:event_opcao2MousePressed
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Look and feel setting code">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backPanel;
    private javax.swing.JLabel btnAjuda;
    private javax.swing.JLabel btnCadastros;
    private javax.swing.JLabel btnEstoque;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel btnFerramentas;
    private javax.swing.JLabel btnFinanceiro;
    private javax.swing.JLabel btnInicial;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel btnOpcoes;
    private javax.swing.JLabel btnVendas;
    private javax.swing.JPanel frontPanel2;
    private javax.swing.JMenuItem jmi1;
    private javax.swing.JMenuItem jmi2;
    private javax.swing.JMenuItem jmi3;
    private javax.swing.JMenuItem jmi4;
    private javax.swing.JMenuItem jmi5;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JLabel opcao1;
    private javax.swing.JLabel opcao10;
    private javax.swing.JLabel opcao2;
    private javax.swing.JLabel opcao3;
    private javax.swing.JLabel opcao4;
    private javax.swing.JLabel opcao5;
    private javax.swing.JLabel opcao6;
    private javax.swing.JLabel opcao7;
    private javax.swing.JLabel opcao8;
    private javax.swing.JLabel opcao9;
    private javax.swing.JPanel painelMenu;
    public javax.swing.JTabbedPane painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
