package view;

import controller.connection;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.Timer;

public class main extends javax.swing.JFrame {
    int temporizador = 0;
    Timer timer = new Timer(10, new hora());
    
    private static final main INSTANCIA = new main();
    
    public static main getInstancia() {
        return INSTANCIA;
    }
    public main() {
        initComponents();
        icone();
        setLocationRelativeTo(null);
        tempo();
    }
    
    public void tempo(){
        timer.start();
    }
    
    public void fechar(){
        this.dispose();
        Login login = Login.getInstancia();
        login.setVisible(true);
    }
    public void icone(){
        URL url = this.getClass().getResource("/images/icon.ico");  
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        lblRecurso = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Carregando...");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 160, 40));

        jPanel3.setBackground(new java.awt.Color(51, 105, 191));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setBackground(new java.awt.Color(204, 204, 204));
        jProgressBar1.setForeground(new java.awt.Color(51, 105, 191));
        jProgressBar1.setOpaque(true);
        jPanel3.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 740, 10));

        lblRecurso.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        lblRecurso.setForeground(new java.awt.Color(255, 255, 255));
        lblRecurso.setText("Recurso");
        jPanel3.add(lblRecurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 720, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 740, 60));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 110)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 105, 191));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main.png"))); // NOI18N
        jLabel1.setText(" AHRI");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 105, 191), 3));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lblRecurso;
    // End of variables declaration//GEN-END:variables
    class hora implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            temporizador++;
            jProgressBar1.setValue(temporizador);
            if (temporizador == 10) {
                temporizador++;
                lblRecurso.setText("Conectando ao banco de dados...");
                new connection().obterConexao("Conexão inicial.");
            }
            if (temporizador == 20) {
                lblRecurso.setText("");
                lblRecurso.setText("Abrindo sistema...");
            }
            if (temporizador == 100) {
                fechar();
                timer.stop();
            }
        }
    }
}
