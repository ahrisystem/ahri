package controller.cadastros.usuarios;

import controller.connection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.cadastros.usuarios.UsuarioModel;

public class UsuarioController {

    private final Connection conexao;

    public UsuarioController() {
        this.conexao = new connection().obterConexao();
    }

    public void cadastraUsuario(UsuarioModel uModel) {
        String sql = "INSERT INTO public.usuario(login,inativo,administrador,nome,perfilusuario,senha,datacadastro) VALUES (?,?,?,?,?,?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, uModel.getLogin());
            pstmt.setBoolean(2, false);
            pstmt.setBoolean(3, uModel.isAdministrador());
            pstmt.setString(4, uModel.getNome());
            pstmt.setString(5, uModel.getPerfilUsuario());
            pstmt.setString(6, uModel.getSenha());
            pstmt.setDate(7, (Date) uModel.getDataCadastro());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Usuário " + uModel.getNome() + " salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.\n" + e.getMessage());
        }
    }

    public List<UsuarioModel> listar(String nome) {
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

    public List<UsuarioModel> listaUsuariosExcluidos(String nome) {
        List<UsuarioModel> usuarios = new ArrayList<>();
        String sql = "select login, nome from usuario where inativo=TRUE and nome LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                UsuarioModel um = new UsuarioModel();
                um.setLogin(rs.getString("login"));
                um.setNome(rs.getString("nome"));
                usuarios.add(um);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return usuarios;
    }

    public void puxarDados(UsuarioModel pModel, String cod) {
        String sql = "SELECT login,administrador,nome,perfilusuario FROM usuario where login = '" + cod + "';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            pModel.setLogin(rs.getString(1));
            pModel.setAdministrador(rs.getBoolean(2));
            pModel.setNome(rs.getString(3));
            pModel.setPerfilUsuario(rs.getString(4));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar código.\n" + e.getMessage());
        }
    }

    public void login(UsuarioModel pModel, String login) {
        String sql = "SELECT login,nome,senha FROM usuario where login = '" + login + "';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(1).length() < 1) {
                    JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
                } else {
                    pModel.setLogin(rs.getString(1));
                    pModel.setNome(rs.getString(2));
                    pModel.setSenha(rs.getString(3));
                }
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar usuário.\n" + e.getMessage());
        }
    }

    public void alterar(UsuarioModel pModel, String cod) {
        String sql = "UPDATE usuario SET administrador=?, nome=?, perfilusuario=? WHERE login = '"+ cod +"';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setBoolean(1, pModel.isAdministrador());
            pstmt.setString(2, pModel.getNome());
            pstmt.setString(3, pModel.getPerfilUsuario());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar dados.\n" + e.getMessage());
        }
    }
    public void alterarSenha(String senha, String cod) {
        String sql = "UPDATE usuario SET senha=? WHERE login = '" + cod + "';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, senha);
            pstmt.executeUpdate();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Senha alterada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar a senha.\n" + e.getMessage());
        }
    }

    public void excluir(String cod) {
        String sql = "update usuario set inativo=true where login= " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir.\n" + e.getMessage());
        }
    }

    public void restaurar(String cod) {
        String sql = "update usuario set inativo=false where login= " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao restaurar.\n" + e.getMessage());
        }
    }
}
