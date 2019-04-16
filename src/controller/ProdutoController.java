package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import model.ProdutoModel;

public class ProdutoController {

    private final Connection conexao;
    
    public ProdutoController() {
        this.conexao = new connection().obterConexao();
    }

    public void cadastraProduto(ProdutoModel pModel) {
        String sql = "INSERT INTO public.produto(cod, \"codigoBarras\", inativo, nome, grupo, \"unidadeMedida\", estoque, preco, ncm) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, pModel.getCod());
            pstmt.setString(2, pModel.getCodigoBarras());
            pstmt.setBoolean(3, pModel.isInativo());
            pstmt.setString(4, pModel.getNome());
            pstmt.setString(5, pModel.getGrupo());
            pstmt.setString(6, pModel.getUnidadeMedida());
            pstmt.setInt(7, pModel.getEstoque());
            pstmt.setDouble(8, pModel.getPreco());
            pstmt.setString(9, pModel.getNcm());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Produto "+pModel.getNome()+" salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto.\n" + e.getMessage());
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
            JOptionPane.showMessageDialog(null, "Falha ao listar os produtos!\n" + s.getMessage());
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
            e.printStackTrace();
        }
        return cod;
    }

    public void alterarProduto(ProdutoModel produtoModel) {

        String sql = "UPDATE cliente SET nome = ?, email = ?, telefone = ? WHERE idcliente = ?";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, produtoModel.getCod());
            pstmt.setString(2, produtoModel.getCodigoBarras());
            pstmt.setString(3, produtoModel.getNome());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar dados" + e.getMessage());
        }
    }

    public void excluirProduto(String cod) {

        String sql = "update produto set inativo=true where cod= "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir produto" + e.getMessage());
        }
    }
    public void restaurarProduto(String cod) {

        String sql = "update produto set inativo=false where cod= "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir produto" + e.getMessage());
        }
    }

//	public void AlterarCursos(ClienteBean cb) {
//		String sql = "UPDATE produto SET nomeProduto = ? , idMarca = ? , valorProduto = ?   WHERE idProduto = ? ";
//		
//		try {
//			PreparedStatement pstmt = this.conexao.prepareStatement(sql);
//			pstmt.setString(1, cb.getNomeProduto());
//			pstmt.setInt(2, cb.getIdMarca());
//			pstmt.setDouble(3, cb.getValor());
//			pstmt.setInt(4, cb.getIdProduto());
//			pstmt.execute();
//			pstmt.close();
//
//		} catch (Exception e) {
//			JOptionPane.showMessageDialog(null, "Falha ao alterar dados");
//		}
//	}
}
