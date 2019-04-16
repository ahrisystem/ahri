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
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtInput = new javax.swing.JTextField();
        lblCaixa = new javax.swing.JLabel();
        scpTabelaItens = new javax.swing.JScrollPane();
        tabelaItens = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        lblTotal1 = new javax.swing.JLabel();
        lblTotal3 = new javax.swing.JLabel();
        lblTotal4 = new javax.swing.JLabel();
        scpTabelaItens1 = new javax.swing.JScrollPane();
        tabelaItens1 = new javax.swing.JTable();

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

        txtInput.setBackground(new java.awt.Color(102, 102, 102));
        txtInput.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        txtInput.setForeground(new java.awt.Color(255, 255, 255));
        txtInput.setCaretColor(new java.awt.Color(0, 102, 204));
        txtInput.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtInput.setSelectedTextColor(new java.awt.Color(204, 204, 255));
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

        lblCaixa.setBackground(new java.awt.Color(51, 51, 51));
        lblCaixa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblCaixa.setForeground(new java.awt.Color(255, 255, 255));
        lblCaixa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCaixa.setText("CAIXA LIVRE");
        lblCaixa.setFocusable(false);
        lblCaixa.setOpaque(true);

        scpTabelaItens.setFocusable(false);
        scpTabelaItens.setOpaque(false);

        tabelaItens.setBackground(new java.awt.Color(102, 102, 102));
        tabelaItens.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tabelaItens.setForeground(new java.awt.Color(255, 255, 255));
        tabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        if (tabelaItens.getColumnModel().getColumnCount() > 0) {
            tabelaItens.getColumnModel().getColumn(1).setPreferredWidth(130);
        }

        jPanel2.setLayout(new java.awt.GridLayout(5, 1, 0, 5));

        lblTotal.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 204, 0));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Valores");
        lblTotal.setFocusable(false);
        jPanel2.add(lblTotal);

        lblTotal1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTotal1.setForeground(new java.awt.Color(0, 204, 0));
        lblTotal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal1.setText("0,00");
        lblTotal1.setFocusable(false);
        jPanel2.add(lblTotal1);

        lblTotal3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTotal3.setForeground(new java.awt.Color(0, 204, 0));
        lblTotal3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal3.setText("15,00");
        lblTotal3.setFocusable(false);
        jPanel2.add(lblTotal3);

        lblTotal4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblTotal4.setForeground(new java.awt.Color(0, 204, 0));
        lblTotal4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal4.setText("15,00");
        lblTotal4.setFocusable(false);
        jPanel2.add(lblTotal4);

        scpTabelaItens1.setFocusable(false);
        scpTabelaItens1.setOpaque(false);

        tabelaItens1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tabelaItens1.setForeground(new java.awt.Color(255, 255, 255));
        tabelaItens1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaItens1.setFocusable(false);
        tabelaItens1.setGridColor(new java.awt.Color(102, 102, 102));
        tabelaItens1.setOpaque(false);
        tabelaItens1.setRowHeight(20);
        tabelaItens1.setSelectionBackground(new java.awt.Color(0, 102, 204));
        scpTabelaItens1.setViewportView(tabelaItens1);
        if (tabelaItens1.getColumnModel().getColumnCount() > 0) {
            tabelaItens1.getColumnModel().getColumn(1).setPreferredWidth(130);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInput)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scpTabelaItens, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(scpTabelaItens1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(scpTabelaItens, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scpTabelaItens1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        
                        
                    } else {
                        
                        
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

    private void txtInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            
        }
    }//GEN-LAST:event_txtInputKeyReleased

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        txtInput.requestFocus();
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtInput.requestFocus();
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCaixa;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal1;
    private javax.swing.JLabel lblTotal3;
    private javax.swing.JLabel lblTotal4;
    private javax.swing.JScrollPane scpTabelaItens;
    private javax.swing.JScrollPane scpTabelaItens1;
    private javax.swing.JTable tabelaItens;
    private javax.swing.JTable tabelaItens1;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables

}
