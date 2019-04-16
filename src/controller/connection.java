package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class connection {

    private static final String URL = "jdbc:postgresql://localhost:5432/ahri";
    private static final String DRIVER_CLASS = "org.postgresql.Driver";
    private static final String USER = "postgres";
    private static final String PASS = "postgres";

    public Connection obterConexao(){

        // Variavel contendo a conexao
        Connection conexao = null;

        // Tentar Realizar a conexao
        try {
            Class.forName(DRIVER_CLASS);
            conexao = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexão com o banco efetuada.");
        } catch (SQLException e) {
            if (JOptionPane.showConfirmDialog(null, "Problema para conectar ao banco de dados.\n"
                    + "Verifique em SERVIÇOS se está iniciado o postgresql\n"
                    + "Verifique as credenciais de acesso ao banco de dados\n"
                    + "Veja se o FIREWALL está ativo (caso este não for o servidor).\n"
                    + "Mostrar o erro ocorrido?", "Ops, um problema!", 0)== 0) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } else {
                
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Retornar a conexão
        return conexao;
    }
}