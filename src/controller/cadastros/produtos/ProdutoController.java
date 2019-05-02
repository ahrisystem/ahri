package controller.cadastros.produtos;

import controller.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.cadastros.produtos.ProdutoModel;

public class ProdutoController {

    private final Connection conexao;
    
    public ProdutoController() {
        this.conexao = new connection().obterConexao();
    }

    public void cadastraProduto(ProdutoModel pModel) {
        String sql = "INSERT INTO public.produto(cod,servico, \"codigoBarras\", inativo, nome, grupo, \"unidadeMedida\",estoque, preco, custo, ncm, cest) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, pModel.getCod());
            pstmt.setBoolean(2, pModel.isServico());
            pstmt.setString(3, pModel.getCodigoBarras());
            pstmt.setBoolean(4, pModel.isInativo());
            pstmt.setString(5, pModel.getNome());
            pstmt.setString(6, pModel.getGrupo());
            pstmt.setString(7, pModel.getUnidadeMedida());
            pstmt.setInt(8, pModel.getEstoque());
            pstmt.setDouble(9, pModel.getPreco());
            pstmt.setDouble(10, pModel.getCusto());
            pstmt.setString(11, pModel.getNcm());
            pstmt.setString(12, pModel.getCest());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Produto "+pModel.getNome()+" salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.\n" + e.getMessage());
        }
    }

    public List<ProdutoModel> listaProdutos(String nome) {
        List<ProdutoModel> produtos = new ArrayList<>();
        String sql = "SELECT cod, \"codigoBarras\", nome,\"unidadeMedida\",preco, grupo FROM produto where inativo=FALSE and nome LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProdutoModel p = new ProdutoModel();
                p.setCod(rs.getInt("cod"));
                p.setCodigoBarras(rs.getString("codigoBarras"));
                p.setNome(rs.getString("nome"));
                p.setUnidadeMedida(rs.getString("unidadeMedida"));
                p.setPreco(rs.getDouble("preco"));
                p.setGrupo(rs.getString("grupo"));
                produtos.add(p);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return produtos;
    }
    public List<ProdutoModel> listaProdutosExcluidos(String nome) {
        List<ProdutoModel> produtos = new ArrayList<>();
        String sql = "SELECT cod, \"codigoBarras\", nome,\"unidadeMedida\",preco, grupo FROM produto where inativo=TRUE and nome LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProdutoModel p = new ProdutoModel();
                p.setCod(rs.getInt("cod"));
                p.setCodigoBarras(rs.getString("codigoBarras"));
                p.setNome(rs.getString("nome"));
                p.setUnidadeMedida(rs.getString("unidadeMedida"));
                p.setPreco(rs.getDouble("preco"));
                p.setGrupo(rs.getString("grupo"));
                produtos.add(p);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return produtos;
    }
    
    public int pegaCodigo(){
        String sql = "select max(cod) from produto;";
        int cod = 1;
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            cod = cod + Integer.parseInt(rs.getString("max"));
            stmt.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha ao buscar código.\n" + e.getMessage());
        }
        return cod;
    }
    // id | cod | servico | codigoBarras | inativo | nome | grupo | unidadeMedida | estoque | preco | custo | ncm | cest
    public void puxarDados(ProdutoModel pModel, int cod) {
        String sql = "select * from produto where cod = "+cod+";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            pModel.setCod(rs.getInt("cod"));
            pModel.setServico(rs.getBoolean("servico"));
            pModel.setCodigoBarras(rs.getString("codigoBarras"));
            pModel.setNome(rs.getString("nome"));
            pModel.setGrupo(rs.getString("grupo"));
            pModel.setUnidadeMedida(rs.getString("unidadeMedida"));
            pModel.setEstoque(rs.getInt("estoque"));
            pModel.setPreco(rs.getDouble("preco"));
            pModel.setCusto(rs.getDouble("custo"));
            pModel.setNcm(rs.getString("ncm"));
            pModel.setCest(rs.getString("cest"));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha ao buscar código.\n" + e.getMessage());
        }
        
    }
    public void alterarProduto(ProdutoModel pModel, int cod) {
        String sql = "UPDATE public.produto SET cod=?, servico=?, \"codigoBarras\"=?, inativo=?, nome=?, grupo=?, \"unidadeMedida\"=?, estoque=?, preco=?, custo=?, ncm=?, cest=? WHERE cod = "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, pModel.getCod());
            pstmt.setBoolean(2, pModel.isServico());
            pstmt.setString(3, pModel.getCodigoBarras());
            pstmt.setBoolean(4, pModel.isInativo());
            pstmt.setString(5, pModel.getNome());
            pstmt.setString(6, pModel.getGrupo());
            pstmt.setString(7, pModel.getUnidadeMedida());
            pstmt.setInt(8, pModel.getEstoque());
            pstmt.setDouble(9, pModel.getPreco());
            pstmt.setDouble(10, pModel.getCusto());
            pstmt.setString(11, pModel.getNcm());
            pstmt.setString(12, pModel.getCest());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar dados.\n" + e.getMessage());
        }
    }

    public void excluir(int cod) {

        String sql = "update produto set inativo=true where cod= "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir.\n" + e.getMessage());
        }
    }
    public void restaurar(int cod) {

        String sql = "update produto set inativo=false where cod= "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao restaurar produto.\n" + e.getMessage());
        }
    }
}
