package controller.cadastros.funcoes;

import controller.connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.cadastros.entidades.EntidadeModel;
import model.ProdutoModel;

public class PesquisarController {

    private final Connection conexao;
    
    public PesquisarController() {
        this.conexao = new connection().obterConexao();
    }

    public List<EntidadeModel> listaClientes(String nome) {
        List<EntidadeModel> clientes = new ArrayList<>();
        String sql = "SELECT cod,xnome,cnpj FROM entidade where cliente=1 and xnome LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                EntidadeModel e = new EntidadeModel();
                e.setCod(rs.getInt("cod"));
                e.setxNome(rs.getString("xnome"));
                e.setCNPJ(rs.getString("cnpj"));
                clientes.add(e);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar clientes!\n" + s.getMessage());
        }
        return clientes;
    }
    public List<ProdutoModel> listaProdutos(String nome) {
        List<ProdutoModel> produtos = new ArrayList<>();
        String sql = "SELECT cod,nome,preco, FROM produto where inativo=FALSE and nome LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProdutoModel p = new ProdutoModel();
                p.setCod(rs.getInt("cod"));
                p.setCodigoBarras(rs.getString("nome"));
                p.setNome(rs.getString("preco"));
                produtos.add(p);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar produtos!\n" + s.getMessage());
        }
        return produtos;
    }
    
    
}
