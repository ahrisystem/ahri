package controller.cadastros.placa;

import controller.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.cadastros.placa.PlacaModel;

public class PlacaController {

    private final Connection conexao;

    public PlacaController() {
        this.conexao = new connection().obterConexao();
    }

    public void cadastra(PlacaModel eModel) {
        String sql = "INSERT INTO public.placa(cod,codcliente,nome,nomecliente,tipo,cadastro,detalhes) VALUES (?,?,?,?,?,(select now()),?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, eModel.getCod());
            pstmt.setInt(2, eModel.getCodcliente());
            pstmt.setString(3, eModel.getNome());
            pstmt.setString(4, eModel.getNomecliente());
            pstmt.setString(5, eModel.getTipo());
            //data do banco de dados
            pstmt.setString(6,eModel.getDetalhes());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Placa salva com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.\n" + e.getMessage());
        }
    }

    public List<PlacaModel> listaPlacas(String filtro, String nome) {
        List<PlacaModel> entidades = new ArrayList<>();
        String sql = "Select cod,nome,tipo from placa where inativo = false and "+filtro+" like '%"+nome+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                PlacaModel eModel = new PlacaModel();
                eModel.setCod(rs.getString("cod"));
                eModel.setNome(rs.getString("nome"));
                eModel.setTipo(rs.getString("tipo"));
                entidades.add(eModel);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return entidades;
    }
    
    public List<PlacaModel> listaPlacasExcluidas(String cod) {
        List<PlacaModel> placas = new ArrayList<>();
        String sql = "Select cod,nome from placa where inativo = true and nome like '%"+cod+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                PlacaModel eModel = new PlacaModel();
                eModel.setCod(rs.getString("cod"));
                eModel.setNome(rs.getString("nome"));
                placas.add(eModel);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return placas;
    }

    public void puxarDados(PlacaModel eModel, String cod) {
        String sql = "SELECT cod,codcliente,nome,nomecliente,tipo,detalhes FROM placa where cod = '" + cod + "';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                eModel.setCod(rs.getString("cod"));
                eModel.setCodcliente(rs.getInt("codcliente"));
                eModel.setNome(rs.getString("nome"));
                eModel.setNomecliente(rs.getString("nomecliente"));
                eModel.setTipo(rs.getString("tipo"));
                eModel.setDetalhes(rs.getString("detalhes"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados para alteração.\n" + e.getMessage());
        }

    }

    public void alterar(PlacaModel eModel, String cod) {
        String sql = "UPDATE placa SET codcliente=?,nome=?,nomecliente=?,tipo=?,detalhes=? WHERE cod = '" + cod + "';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, eModel.getCodcliente());
            pstmt.setString(2, eModel.getNome());
            pstmt.setString(3, eModel.getNomecliente());
            pstmt.setString(4, eModel.getTipo());
            pstmt.setString(5, eModel.getDetalhes());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, eModel.getNome() + " alterado com sucesso!");
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar dados.\n" + e.getMessage());
        }
    }

    public void excluir(String cod) {
        String sql = "update placa set inativo=true where cod= '" + cod + "';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir.\n" + e.getMessage());
        }
    }

    public void restaurar(String cod) {
        String sql = "update placa set inativo=false where cod= '" + cod + "';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao restaurar.\n" + e.getMessage());
        }
    }
}
