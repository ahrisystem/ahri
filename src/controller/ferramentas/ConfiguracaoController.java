package controller.ferramentas;

import controller.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ferramentas.ConfiguracaoModel;

public class ConfiguracaoController {

    private final Connection conexao;

    public ConfiguracaoController() {
        this.conexao = new connection().obterConexao();
    }
    
    public void alterar(ConfiguracaoModel eModel, int cod) {
        String sql = "";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, eModel.getCod());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Configurações salvas!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar.\n" + e.getMessage());
        }
    }

    public List<ConfiguracaoModel> listar(String nome) {
        List<ConfiguracaoModel> clientes = new ArrayList<>();
        String sql = "Select cod,nome,cnpj,uf,xmun from entidade where inativo = false and cliente = 1 and nome like '%"+nome+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ConfiguracaoModel eModel = new ConfiguracaoModel();
                eModel.setCod(rs.getString("cod"));
                clientes.add(eModel);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return clientes;
    }

    public void puxarDados(ConfiguracaoModel eModel, int cod) {
        String sql = "SELECT cod, inativo, tipopessoa, cliente, fornecedor, cnpj, nome,xnome, xlgr, nro, xcpl, xbairro, xmun, uf, cep, xpais, fone1, fone2, fone3, ie, isuf, email FROM entidade where cod = " + cod + ";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                eModel.setCod(rs.getString("cod"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados.\n" + e.getMessage());
        }
    }
}
