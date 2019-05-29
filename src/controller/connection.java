package controller;

import funcoes.BuscarPropriedadesConfiguradas;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.funcoes.PropertiesModel;

public class connection {
    public Connection obterConexao(String rotina){
        PropertiesModel pm = new PropertiesModel();
        BuscarPropriedadesConfiguradas bp = new BuscarPropriedadesConfiguradas();
        
        bp.dado(pm);
        
        String URL = "jdbc:postgresql://"+pm.getBaseip()+":"+pm.getBaseport()+"/"+pm.getBasenome();
        String DRIVER_CLASS = pm.getBasedriver();
        String USER = pm.getBaseuser();
        String PASS = pm.getBasepass();

        // Variavel contendo a conexao
        Connection conexao = null;

        // Tentar Realizar a conexao
        try {
            Class.forName(DRIVER_CLASS);
            conexao = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("BD: "+rotina);
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