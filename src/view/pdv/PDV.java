package view.pdv;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PDV extends javax.swing.JFrame{

    int numeroContas = 20;
    JLabel[] meulabel = new JLabel[numeroContas];
    
    
    public PDV() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        criarComponentesContas();
        foraDaConta();
    }

    public void criarComponentesContas() {
        for (int i = 1; i < numeroContas; i++) {
            meulabel[i] = new JLabel("m" + i);
            meulabel[i].setBackground(new java.awt.Color(204, 204, 204));
            meulabel[i].setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
            meulabel[i].setForeground(new java.awt.Color(102,102,102));
            meulabel[i].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            meulabel[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modulos/snack/PDV/mesa.png"))); // NOI18N
            meulabel[i].setText(i + " - 0,00");
            meulabel[i].setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            meulabel[i].setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            meulabel[i].setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
            meulabel[i].setVisible(false);
            painelContas.add(meulabel[i]);
        }
        pack();
    }
    public void dentroDaConta(){
        tabelaItens.setVisible(true);
        scpTabelaItens.setVisible(true);
        lblPagar.setVisible(true);
        lblConta.setVisible(true);
        lblTotal.setVisible(true);
    }
    public void foraDaConta(){
        tabelaItens.setVisible(false);
        scpTabelaItens.setVisible(false);
        lblPagar.setVisible(false);
        lblConta.setVisible(false);
        lblTotal.setVisible(false);
    }

    public void novaConta(int numeroConta) {
        meulabel[numeroConta].setVisible(true);
        System.out.println("adicionou " + numeroConta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        m = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        scpTabelaItens = new javax.swing.JScrollPane();
        tabelaItens = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        lblConta = new javax.swing.JLabel();
        lblPagar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        painelContas = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        m.setBackground(new java.awt.Color(204, 204, 204));
        m.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        m.setForeground(new java.awt.Color(102, 102, 102));
        m.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        m.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/modulos/snack/PDV/mesa.png"))); // NOI18N
        m.setText("11 - 0,00");
        m.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        m.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ponto de venda");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setFocusable(false);

        scpTabelaItens.setFocusable(false);
        scpTabelaItens.setOpaque(false);

        tabelaItens.setBackground(new java.awt.Color(102, 102, 102));
        tabelaItens.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tabelaItens.setForeground(new java.awt.Color(255, 255, 255));
        tabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"X - BURGUER", "1", "11,00"},
                {"COCA COLA LATA 350ML", "1", "4,00"},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produto", "Quantidade", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaItens.setFocusable(false);
        tabelaItens.setGridColor(new java.awt.Color(102, 102, 102));
        tabelaItens.setOpaque(false);
        tabelaItens.setRowHeight(20);
        tabelaItens.setSelectionBackground(new java.awt.Color(0, 102, 204));
        scpTabelaItens.setViewportView(tabelaItens);

        lblTotal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("15,00");
        lblTotal.setFocusable(false);

        lblConta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblConta.setForeground(new java.awt.Color(255, 255, 255));
        lblConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblConta.setText("CONTA");
        lblConta.setFocusable(false);

        lblPagar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblPagar.setForeground(new java.awt.Color(255, 255, 255));
        lblPagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPagar.setText("PAGAR");
        lblPagar.setFocusable(false);
        lblPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblPagarMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpTabelaItens, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(lblPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(99, 99, 99)
                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
            .addComponent(lblConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(lblConta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpTabelaItens, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel4.setFocusable(false);
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        painelContas.setFocusable(false);
        painelContas.setOpaque(false);
        painelContas.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 25, 5));
        jPanel4.add(painelContas);

        txtInput.setBackground(new java.awt.Color(0, 0, 0));
        txtInput.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtInput.setForeground(new java.awt.Color(0, 102, 204));
        txtInput.setCaretColor(new java.awt.Color(0, 102, 204));
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });
        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtInputKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONTAS EM ABERTO");
        jLabel1.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Deletar");
        jLabel2.setFocusable(false);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInput)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        if (txtInput.getText().matches("[0-9]+")) {
            if (txtInput.getText().equalsIgnoreCase("")) {
            } else {
                if (Integer.parseInt(txtInput.getText()) > 0) {
                    if (meulabel[Integer.parseInt(txtInput.getText())].isVisible()) {
                        lblConta.setText("CONTA "+txtInput.getText());
                        dentroDaConta();
                    } else {
                        lblConta.setText("CONTA "+txtInput.getText());
                        novaConta(Integer.parseInt(txtInput.getText()));
                        dentroDaConta();
                    }
                }
            }
        }
        if (txtInput.getText().matches("[A-Za-z]+")) {
            System.out.println("letra");
            if (txtInput.getText().equalsIgnoreCase("")) {
            } else {
            }
        }
        txtInput.setText("");
    }//GEN-LAST:event_txtInputActionPerformed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        int deletar = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja deletar qual conta?"));
        meulabel[deletar].setVisible(false);
        foraDaConta();
    }//GEN-LAST:event_jLabel2MouseReleased

    private void txtInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            lblConta.setText("CONTA");
            foraDaConta();
        }
    }//GEN-LAST:event_txtInputKeyReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtInput.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtInput.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void lblPagarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPagarMouseReleased
        
    }//GEN-LAST:event_lblPagarMouseReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblConta;
    private javax.swing.JLabel lblPagar;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel m;
    private javax.swing.JPanel painelContas;
    private javax.swing.JScrollPane scpTabelaItens;
    private javax.swing.JTable tabelaItens;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables

}
