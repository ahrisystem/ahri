package view.cadastrosUnicos;

import controller.cadastrosUnicos.ContabilidadeController;
import controller.cadastrosUnicos.EmpresaController;
import model.cadastrosUnicos.EmpresaModel;
    

public class Licenciamento extends javax.swing.JFrame {
    private static final Licenciamento INSTANCIA = new Licenciamento();
    EmpresaController ec = new EmpresaController();

    public static Licenciamento getInstancia() {
        return INSTANCIA;
    }
    ContabilidadeController cc = new ContabilidadeController();
    
    public Licenciamento() {
        initComponents();
        setLocationRelativeTo(null);
        carregarLicenciamento();
    }
    
    public void carregarLicenciamento(){
        EmpresaModel em = new EmpresaModel();
        ec.puxarDados(em);
        lblNomeEmpresa.setText(em.getxNome());
        lblCNPJEmpresa1.setText(em.getCNPJ());
        
        if (em.getCNPJ().equalsIgnoreCase("33.380.927/0001-53")) {
            lblTipoLicenca.setText("LICENÇA VITALÍCIA");
            lblDuracaoLicenca.setText("CLIENTE PILOTO");
        } else {
            lblTipoLicenca.setText("INVÁLIDA");
            lblDuracaoLicenca.setText("VENCIDA");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroEmpresa = new javax.swing.JPanel();
        lblNomeEmpresa = new javax.swing.JLabel();
        lblCNPJEmpresa1 = new javax.swing.JLabel();
        lblTipoLicenca = new javax.swing.JLabel();
        lblDuracaoLicenca = new javax.swing.JLabel();
        lblTítulo1 = new javax.swing.JLabel();
        lblTítulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Licenciamento do sistema");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastroEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        cadastroEmpresa.setMaximumSize(new java.awt.Dimension(670, 320));
        cadastroEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomeEmpresa.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblNomeEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeEmpresa.setText("...");
        cadastroEmpresa.add(lblNomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 510, 30));

        lblCNPJEmpresa1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCNPJEmpresa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCNPJEmpresa1.setText("...");
        cadastroEmpresa.add(lblCNPJEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 510, 30));

        lblTipoLicenca.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblTipoLicenca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipoLicenca.setText("...");
        cadastroEmpresa.add(lblTipoLicenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 510, 30));

        lblDuracaoLicenca.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDuracaoLicenca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDuracaoLicenca.setText("...");
        cadastroEmpresa.add(lblDuracaoLicenca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 510, 30));

        lblTítulo1.setBackground(new java.awt.Color(51, 153, 0));
        lblTítulo1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo1.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo1.setText("Licenciamento");
        lblTítulo1.setOpaque(true);
        cadastroEmpresa.add(lblTítulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 30));

        getContentPane().add(cadastroEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 220));

        lblTítulo.setBackground(new java.awt.Color(51, 153, 0));
        lblTítulo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblTítulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTítulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTítulo.setText("Nada consta");
        lblTítulo.setOpaque(true);
        getContentPane().add(lblTítulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 530, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Licenciamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cadastroEmpresa;
    private javax.swing.JLabel lblCNPJEmpresa1;
    private javax.swing.JLabel lblDuracaoLicenca;
    private javax.swing.JLabel lblNomeEmpresa;
    private javax.swing.JLabel lblTipoLicenca;
    private javax.swing.JLabel lblTítulo;
    private javax.swing.JLabel lblTítulo1;
    // End of variables declaration//GEN-END:variables
}
