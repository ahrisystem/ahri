package controller.cadastros.funcoes;

import controller.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ProdutoModel;

public class LocalController {

    private final Connection conexao;
    
    public LocalController() {
        this.conexao = new connection().obterConexao();
    }

    public void cadastraLocal(ProdutoModel pModel) {
        String sql = "";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, pModel.getCod());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.\n" + e.getMessage());
        }
    }
    
    public List<String> listaCidades(String uf) {
        List<String> cidades = new ArrayList<>();
        String sql = "SELECT nome from municipio where UF = '"+uf+"' order by nome;";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                cidades.add(rs.getString("nome"));
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar cidades!\n" + s.getMessage());
        }
        return cidades;
    }
    
}
