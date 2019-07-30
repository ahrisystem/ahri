package controller.controles;

import controller.vendas.*;
import controller.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.vendas.CaixaModel;
import model.vendas.VendasItensModel;
import model.vendas.VendasModel;

public class StatusController {

    private final Connection conexao;

    public StatusController(){
        this.conexao = new connection().obterConexao("Status.");
    }
    
    public String select() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String data = dtf.format(localDate);
        String valor = "";
        String sql = "SELECT sum(valortotal) FROM public.vendas where criacao = '" + data + "';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                valor = rs.getString("sum");
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar total de vendas.\n" + e.getMessage());
        }
        return valor;
    }
}