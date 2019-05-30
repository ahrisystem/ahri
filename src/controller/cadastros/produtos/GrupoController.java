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
import model.cadastros.produtos.GrupoModel;

public class GrupoController {

    private final Connection conexao;
    
    public GrupoController() {
        this.conexao = new connection().obterConexao("Cadastro de grupos.");
    }

    public void cadastraGrupo(GrupoModel pModel) {
        String sql = "INSERT INTO public.grupo(cod,servico,tipo,pai,nome,ncm,cest) VALUES (?,?,?,?,?,?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, pModel.getCod());
            pstmt.setBoolean(2, pModel.isServico());
            pstmt.setInt(3, pModel.getTipo());
            pstmt.setInt(4, pModel.getPai());
            pstmt.setString(5, pModel.getNome());
            pstmt.setString(6, pModel.getNcm());
            pstmt.setString(7, pModel.getCest());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Grupo "+pModel.getNome()+" salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.\n" + e.getMessage());
        }
    }

    public List<GrupoModel> listaGrupos(String nome) {
        List<GrupoModel> grupos = new ArrayList<>();
        String sql = "SELECT cod,tipo,pai,nome,ncm FROM public.grupo where inativo = false and nome LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                GrupoModel p = new GrupoModel();
                p.setCod(rs.getInt("cod"));
                p.setTipo(rs.getInt("tipo"));
                p.setPai(rs.getInt("pai"));
                p.setNome(rs.getString("nome"));
                p.setNcm(rs.getString("ncm"));
                grupos.add(p);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar grupos!\n" + s.getMessage());
        }
        return grupos;
    }
    //Usado para cadastro de produtos
    public List<String> listaNomeGrupos() {
        List<String> grupos = new ArrayList<>();
        String sql = "SELECT cod,nome from grupo order by nome;";
        String dado;
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                dado = rs.getString("nome");
                dado = dado + " - ";
                dado = dado + rs.getInt("cod");
                grupos.add(dado);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar nomes de grupos!\n" + s.getMessage());
        }
        return grupos;
    }
    
    public List<String> listaPaiGrupos() {
        List<String> grupos = new ArrayList<>();
        String sql = "SELECT cod,nome from grupo where tipo=0 order by nome;";
        String dado;
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                dado = rs.getString("nome");
                dado = dado + " - ";
                dado = dado + rs.getInt("cod");
                grupos.add(dado);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar grupos 'Pai'!\n" + s.getMessage());
        }
        return grupos;
    }
    
    public List<GrupoModel> listaGruposExcluidos(String nome) {
        List<GrupoModel> grupos = new ArrayList<>();
        String sql = "SELECT cod,tipo,nome FROM grupo where inativo=TRUE and nome LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                GrupoModel p = new GrupoModel();
                p.setCod(rs.getInt("cod"));
                p.setTipo(rs.getInt("tipo"));
                p.setNome(rs.getString("nome"));
                grupos.add(p);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar grupos excluídos!\n" + s.getMessage());
        }
        return grupos;
    }
    
    public int pegaCodigo(){
        String sql = "select max(cod) from grupo;";
        int cod = 1;
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            if (rs.getString("max").isEmpty()) {
                cod = 1;
            } else {
                cod = cod + Integer.parseInt(rs.getString("max"));
            }
            stmt.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha ao buscar código.\n" + e.getMessage());
        }
        return cod;
    }
    
    public void puxarDados(GrupoModel pModel, int cod) {
        String sql = "SELECT cod,tipo,pai,nome,ncm FROM public.grupo where cod = "+cod+";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            pModel.setCod(rs.getInt("cod"));
            pModel.setCod(rs.getInt("tipo"));
            pModel.setCod(rs.getInt("pai"));
            pModel.setNome(rs.getString("nome"));
            pModel.setNcm(rs.getString("ncm"));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha ao puxar dados.\n" + e.getMessage());
        }
        
    }
    public void alterarGrupo(GrupoModel pModel, int cod) {
        String sql = "UPDATE public.grupo SET servico=?,tipo=?,pai=?,nome=?,ncm=?,cest=? WHERE cod = "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setBoolean(1, pModel.isServico());
            pstmt.setInt(2, pModel.getTipo());
            pstmt.setInt(3, pModel.getPai());
            pstmt.setString(4, pModel.getNome());
            pstmt.setString(5, pModel.getNcm());
            pstmt.setString(6, pModel.getCest());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar dados.\n" + e.getMessage());
        }
    }

    public void excluir(int cod) {

        String sql = "update grupo set inativo=true where cod= "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir.\n" + e.getMessage());
        }
    }
    public void restaurar(int cod) {

        String sql = "update grupo set inativo=false where cod= "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao restaurar produto.\n" + e.getMessage());
        }
    }
}
