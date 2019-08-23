package view.caixa;

import controller.vendas.CaixaController;
import controller.vendas.VendasController;
import java.awt.event.KeyEvent;
import javax.swing.table.DefaultTableModel;
import model.vendas.CaixaModel;
import model.vendas.VendasModel;
import view.TelaInicial;


public class EditarCaixa extends javax.swing.JFrame {
    CaixaController cc = new CaixaController();
    VendasController vc = new VendasController();
    private static final EditarCaixa INSTANCIA = new EditarCaixa();

    public static EditarCaixa getInstancia() {
        return INSTANCIA;
    }
    

    private EditarCaixa() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void puxarDados(int id){
        CaixaModel cm = new CaixaModel();
        cc.puxarDadosCaixa(cm, id);
        
        txtData.setText(cm.getData());
        txtUsuario.setText(cm.getUsuario());
        
        if (cm.isFechado()) {
            lblStatus.setText("Fechado");
        } else {
            lblStatus.setText("Aberto");
        }
        
        txtFundodeTroco.setText(Double.toString(cm.getFundo()).replace(".", ","));
        txtSuprimento.setText(Double.toString(cm.getSuprimento()).replace(".", ","));
        txtSangria.setText(Double.toString(cm.getSangria()).replace(".", ","));
        txtSaidas.setText(Double.toString(cm.getSaida()).replace(".", ","));
        txtEntradas.setText(Double.toString(cm.getEntrada()).replace(".", ","));
        
        txtDesconto.setText(Double.toString(cm.getDescontos()).replace(".", ","));
        txtVendas.setText(Double.toString(cm.getTotal()).replace(".", ","));
        
        //vendas
        DefaultTableModel modelo = (DefaultTableModel) tabelaVendas.getModel();
        modelo.setNumRows(0);
        Double totalVendas = 0.0;
        for (VendasModel e : vc.listar("criacao", cm.getData(), 0)) {
            String status = "Finalizado";
            if (e.getStatus()==1) {
                status = "Emitido";
            }
            if (e.getStatus()==2) {
                status = "Finalizado";
            }
            if (e.getStatus()==3) {
                status = "Cancelado";
            }
            modelo.addRow(new Object[]{
                e.getCod(),
                status,
                e.getNomecliente(),
                e.getCnpjcliente(),
                e.getValorTotal()
            });
            totalVendas = totalVendas + e.getValorTotal();
        }
        //totais de venda (valor total das vendas somado)
        txtVendas.setText(totalVendas.toString());
        txtVendas1.setText(totalVendas.toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        painelPrincipal = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jTabbedPane = new javax.swing.JTabbedPane();
        abaFiscal = new javax.swing.JPanel();
        txtFundodeTroco = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        txtSuprimento = new javax.swing.JFormattedTextField();
        lblNome3 = new javax.swing.JLabel();
        txtSangria = new javax.swing.JFormattedTextField();
        lblNome4 = new javax.swing.JLabel();
        txtSaidas = new javax.swing.JFormattedTextField();
        lblNome5 = new javax.swing.JLabel();
        txtEntradas = new javax.swing.JFormattedTextField();
        lblNome6 = new javax.swing.JLabel();
        txtDesconto = new javax.swing.JFormattedTextField();
        lblNome7 = new javax.swing.JLabel();
        txtVendas = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        abaPlacas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnNovo4 = new javax.swing.JLabel();
        txtVendas1 = new javax.swing.JFormattedTextField();
        lblNome8 = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblUsuário = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar cliente");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane.setBorder(null);
        jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        painelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        painelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblData.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(51, 105, 191));
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblData.setText("Data");
        painelPrincipal.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 20));

        txtData.setEditable(false);
        txtData.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtData.setText("01/01/2019");
        txtData.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, 20));

        txtUsuario.setEditable(false);
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtUsuario.setText("adm");
        txtUsuario.setPreferredSize(new java.awt.Dimension(200, 20));
        painelPrincipal.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 540, 20));

        btnSalvar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnSalvar.setText("Fechar");
        btnSalvar.setFocusable(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        painelPrincipal.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 80, 30));

        jTabbedPane.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        abaFiscal.setOpaque(false);
        abaFiscal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFundodeTroco.setEditable(false);
        txtFundodeTroco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtFundodeTroco.setText("0,00");
        txtFundodeTroco.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtFundodeTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 130, 30));

        lblNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(51, 105, 191));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Fundo de troco");
        abaFiscal.add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 30));

        lblNome2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(51, 105, 191));
        lblNome2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome2.setText("Suprimentos");
        abaFiscal.add(lblNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 110, 30));

        txtSuprimento.setEditable(false);
        txtSuprimento.setForeground(new java.awt.Color(0, 153, 0));
        txtSuprimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtSuprimento.setText("0,00");
        txtSuprimento.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtSuprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 130, 30));

        lblNome3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome3.setForeground(new java.awt.Color(51, 105, 191));
        lblNome3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome3.setText("Sangria");
        abaFiscal.add(lblNome3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 30));

        txtSangria.setEditable(false);
        txtSangria.setForeground(new java.awt.Color(204, 51, 0));
        txtSangria.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtSangria.setText("0,00");
        txtSangria.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtSangria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 130, 30));

        lblNome4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome4.setForeground(new java.awt.Color(51, 105, 191));
        lblNome4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome4.setText("Saídas");
        abaFiscal.add(lblNome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 30));

        txtSaidas.setEditable(false);
        txtSaidas.setForeground(new java.awt.Color(204, 51, 0));
        txtSaidas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtSaidas.setText("0,00");
        txtSaidas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtSaidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 130, 30));

        lblNome5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome5.setForeground(new java.awt.Color(51, 105, 191));
        lblNome5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome5.setText("Entradas");
        abaFiscal.add(lblNome5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 140, 30));

        txtEntradas.setEditable(false);
        txtEntradas.setForeground(new java.awt.Color(0, 153, 0));
        txtEntradas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtEntradas.setText("0,00");
        txtEntradas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 130, 30));

        lblNome6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome6.setForeground(new java.awt.Color(51, 105, 191));
        lblNome6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome6.setText("Descontos");
        abaFiscal.add(lblNome6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 30));

        txtDesconto.setEditable(false);
        txtDesconto.setForeground(new java.awt.Color(204, 153, 0));
        txtDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtDesconto.setText("0,00");
        txtDesconto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtDesconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 130, 30));

        lblNome7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome7.setForeground(new java.awt.Color(51, 105, 191));
        lblNome7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome7.setText("Total vendas");
        abaFiscal.add(lblNome7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 140, 30));

        txtVendas.setEditable(false);
        txtVendas.setForeground(new java.awt.Color(0, 153, 0));
        txtVendas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtVendas.setText("0,00");
        txtVendas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaFiscal.add(txtVendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 130, 30));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        abaFiscal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 750, 20));

        jTabbedPane.addTab("Totais", abaFiscal);

        abaPlacas.setOpaque(false);
        abaPlacas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaVendas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Status", "Cliente", "CPF CNPJ", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVendas.setFocusable(false);
        tabelaVendas.setGridColor(new java.awt.Color(204, 204, 204));
        tabelaVendas.setRowHeight(20);
        tabelaVendas.setSelectionBackground(new java.awt.Color(102, 153, 255));
        tabelaVendas.getTableHeader().setReorderingAllowed(false);
        tabelaVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaVendasMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaVendas);

        abaPlacas.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 150));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNovo4.setBackground(new java.awt.Color(51, 105, 191));
        btnNovo4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnNovo4.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNovo4.setText("Visualizar");
        btnNovo4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo4.setOpaque(true);
        btnNovo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnNovo4MouseReleased(evt);
            }
        });
        jPanel4.add(btnNovo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 38));

        abaPlacas.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 10, 90, 190));

        txtVendas1.setEditable(false);
        txtVendas1.setForeground(new java.awt.Color(0, 153, 0));
        txtVendas1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtVendas1.setText("0,00");
        txtVendas1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        abaPlacas.add(txtVendas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 130, 30));

        lblNome8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome8.setForeground(new java.awt.Color(51, 105, 191));
        lblNome8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome8.setText("Total vendas");
        abaPlacas.add(lblNome8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 140, 30));

        jTabbedPane.addTab("Vendas", abaPlacas);

        painelPrincipal.add(jTabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 750, 240));

        lblStatus.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("STATUS");
        painelPrincipal.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 10, 130, 20));

        lblUsuário.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblUsuário.setForeground(new java.awt.Color(51, 105, 191));
        lblUsuário.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuário.setText("Usuário");
        painelPrincipal.add(lblUsuário, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        jScrollPane.setViewportView(painelPrincipal);

        getContentPane().add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 750, 370));

        lblTitulo.setBackground(new java.awt.Color(0, 51, 102));
        lblTitulo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Visualizar caixa");
        lblTitulo.setOpaque(true);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        TelaInicial telainicial = new TelaInicial();
        telainicial.opcoes = false;
    }//GEN-LAST:event_formWindowClosed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tabelaVendasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVendasMouseReleased

    }//GEN-LAST:event_tabelaVendasMouseReleased

    private void btnNovo4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovo4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovo4MouseReleased

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc="Look and feel">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {java.util.logging.Logger.getLogger(EditarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {java.util.logging.Logger.getLogger(EditarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {java.util.logging.Logger.getLogger(EditarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {java.util.logging.Logger.getLogger(EditarCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);}
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel abaFiscal;
    private javax.swing.JPanel abaPlacas;
    private javax.swing.JLabel btnNovo4;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblNome3;
    private javax.swing.JLabel lblNome4;
    private javax.swing.JLabel lblNome5;
    private javax.swing.JLabel lblNome6;
    private javax.swing.JLabel lblNome7;
    private javax.swing.JLabel lblNome8;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuário;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTable tabelaVendas;
    private javax.swing.JTextField txtData;
    private javax.swing.JFormattedTextField txtDesconto;
    private javax.swing.JFormattedTextField txtEntradas;
    private javax.swing.JFormattedTextField txtFundodeTroco;
    private javax.swing.JFormattedTextField txtSaidas;
    private javax.swing.JFormattedTextField txtSangria;
    private javax.swing.JFormattedTextField txtSuprimento;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JFormattedTextField txtVendas;
    private javax.swing.JFormattedTextField txtVendas1;
    // End of variables declaration//GEN-END:variables
}
