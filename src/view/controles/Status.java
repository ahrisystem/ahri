package view.controles;

import controller.controles.StatusController;

public class Status extends javax.swing.JPanel {
    StatusController sc = new StatusController();
    
    private static final Status INSTANCIA = new Status();
    
    
    public static Status getInstancia() {
        return INSTANCIA;
    }
    
    public Status() {
        initComponents();
        puxarValores();
    }
    public void puxarValores(){
        double valorTotal = Double.parseDouble(sc.select());
        valorTotal *= (Math.pow(10, 2));
        valorTotal = Math.ceil(valorTotal);
        valorTotal /= (Math.pow(10, 2));
        lblValorTotalVendas.setText("R$ " + valorTotal);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValorTotalVendas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        lblValorTotalVendas.setBackground(new java.awt.Color(204, 255, 204));
        lblValorTotalVendas.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lblValorTotalVendas.setForeground(new java.awt.Color(0, 204, 102));
        lblValorTotalVendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorTotalVendas.setText("R$ 0,00");
        lblValorTotalVendas.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total de vendas hoje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblValorTotalVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValorTotalVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        
    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblValorTotalVendas;
    // End of variables declaration//GEN-END:variables
}
