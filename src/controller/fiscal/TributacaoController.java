package controller.fiscal;

import controller.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.fiscal.TributacaoModel;

public class TributacaoController {

    private final Connection conexao;

    public TributacaoController() {
        this.conexao = new connection().obterConexao("Controle de tributações");
    }

    public void cadastra(TributacaoModel eModel) {
        String sql = "INSERT INTO public.tributacao(cod, descricao, tipo, "
                + "cst_origem, cst_tributacao, csosn, aliquota, reducao_base, aliquota_fora, aliquota_efetivo, "
                + "cst_iss, aliquota_iss) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, eModel.getCod());
            pstmt.setString(2, eModel.getDescricao());
            pstmt.setString(3, eModel.getTipo());
            pstmt.setString(4, eModel.getCst_origem());
            pstmt.setString(5, eModel.getCst_tributacao());
            pstmt.setString(6, eModel.getCsosn());
            pstmt.setDouble(7, eModel.getAliquota());
            pstmt.setDouble(8, eModel.getReducao_base());
            pstmt.setDouble(9, eModel.getAliquota_fora());
            pstmt.setDouble(10, eModel.getAliquota_efetivo());
            pstmt.setString(11, eModel.getCst_iss());
            pstmt.setDouble(12, eModel.getAliquota_iss());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Tributação salva com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.\n" + e.getMessage());
        }
    }
    
    public void alterar(TributacaoModel eModel, String cod) {
        String sql = "UPDATE public.tributacao SET descricao=?,tipo=?,cst_origem=?,cst_tributacao=?,"
                + "csosn=?,aliquota=?,reducao_base=?,aliquota_fora=?,aliquota_efetivo=?, cst_iss=?,aliquota_iss=? "
                + "WHERE cod = '"+cod+"';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, eModel.getDescricao());
            pstmt.setString(2, eModel.getTipo());
            pstmt.setString(3, eModel.getCst_origem());
            pstmt.setString(4, eModel.getCst_tributacao());
            pstmt.setString(5, eModel.getCsosn());
            pstmt.setDouble(6, eModel.getAliquota());
            pstmt.setDouble(7, eModel.getReducao_base());
            pstmt.setDouble(8, eModel.getAliquota_fora());
            pstmt.setDouble(9, eModel.getAliquota_efetivo());
            pstmt.setString(10, eModel.getCst_iss());
            pstmt.setDouble(11, eModel.getAliquota_iss());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Alterada tributação com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar.\n" + e.getMessage());
        }
    }

    public List<TributacaoModel> listaTributacao(String nome) {
        List<TributacaoModel> tributacoes = new ArrayList<>();
        String sql = "SELECT cod,descricao FROM public.tributacao where descricao iLIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TributacaoModel t = new TributacaoModel();
                t.setCod(rs.getString("cod"));
                t.setDescricao(rs.getString("descricao"));
                tributacoes.add(t);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar tributacoes!\n" + s.getMessage());
        }
        return tributacoes;
    }
    public void puxarDados(TributacaoModel t, String cod) {
        String sql = "SELECT cod,descricao,tipo,cst_origem,cst_tributacao,"
                + "csosn,aliquota,reducao_base,aliquota_fora,aliquota_efetivo,cst_iss,aliquota_iss "
                + "FROM public.tributacao where cod = '" + cod + "';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                t.setCod(rs.getString("cod"));
                t.setDescricao(rs.getString("descricao"));
                t.setTipo(rs.getString("tipo"));
                t.setCst_origem(rs.getString("cst_origem"));
                t.setCst_tributacao(rs.getString("cst_tributacao"));
                t.setCsosn(rs.getString("csosn"));
                t.setAliquota(rs.getDouble("aliquota"));
                t.setReducao_base(rs.getDouble("reducao_base"));
                t.setAliquota_fora(rs.getDouble("aliquota_fora"));
                t.setAliquota_efetivo(rs.getDouble("aliquota_efetivo"));
                t.setCst_iss(rs.getString("cst_iss"));
                t.setAliquota_iss(rs.getDouble("aliquota_iss"));
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar tributacoes!\n" + s.getMessage());
        }
    }


    public void excluir(String cod) {
        String sql = "delete from tributacao where cod= '" + cod + "';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir.\n" + e.getMessage());
        }
    }
}
