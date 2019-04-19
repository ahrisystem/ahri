package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.UsuarioModel;

public class UsuarioController {

    private final Connection conexao;
    
    public UsuarioController() {
        this.conexao = new connection().obterConexao();
    }

    public void cadastraUsuario(UsuarioModel uModel) {
        String sql = "INSERT INTO public.usuario(login, administrador, nome, perfilusuario, senha, datacadastro) VALUES (?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, uModel.getLogin());
            pstmt.setBoolean(2, uModel.isAdministrador());
            pstmt.setString(3, uModel.getNome());
            pstmt.setString(4, uModel.getPerfilUsuario());
            pstmt.setString(5, uModel.getSenha());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Usuário "+uModel.getNome()+" salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.\n" + e.getMessage());
        }
    }

    public List<UsuarioModel> listaUsuarios(String nome) {
        List<UsuarioModel> usuarios = new ArrayList<>();
        String sql = "select login, nome, perfilusuario from usuario where inativo=FALSE and nome LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                UsuarioModel um = new UsuarioModel();
                um.setLogin(rs.getString("login"));
                um.setNome(rs.getString("nome"));
                um.setPerfilUsuario(rs.getString("perfilusuario"));
                usuarios.add(um);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return usuarios;
    }
    
    // id | cod | servico | codigoBarras | inativo | nome | grupo | unidadeMedida | estoque | preco | custo | ncm | cest
    public void puxarDados(UsuarioModel pModel, int cod) {
        String sql = "select * from produto where cod = "+cod+";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            pModel.setLogin(rs.getString("login"));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha ao buscar código.\n" + e.getMessage());
        }
        
    }
    public void alterarProduto(UsuarioModel pModel, int cod) {
        String sql = "UPDATE public.produto SET cod=?, servico=?, \"codigoBarras\"=?, inativo=?, nome=?, grupo=?, \"unidadeMedida\"=?, estoque=?, preco=?, custo=?, ncm=?, cest=? WHERE cod = "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, pModel.getLogin());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar dados.\n" + e.getMessage());
        }
    }

    public void excluirProduto(String cod) {

        String sql = "update produto set inativo=true where cod= "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir.\n" + e.getMessage());
        }
    }
    public void restaurarProduto(String cod) {

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
