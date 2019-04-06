package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            throw new RuntimeException(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Retornar a conexão
        return conexao;
    }
}