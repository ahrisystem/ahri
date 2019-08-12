package controller.financeiro;

import controller.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.financeiro.FormapagamentoModel;

public class FormapagamentoController {

    private final Connection conexao;
    
    public FormapagamentoController() {
        this.conexao = new connection().obterConexao("Cadastro de formas de pagamento.");
    }

    public void cadastrar(FormapagamentoModel model) {
        String sql = "INSERT INTO public.formapagamento(cod,nome,parcela,parcelas,obrigardoc,permitefiado) VALUES (?,?,?,?,?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, model.getCod());
            pstmt.setString(2, model.getNome());
            pstmt.setBoolean(3, model.isParcela());
            pstmt.setInt(4, model.getParcelas());
            pstmt.setBoolean(5, model.isObrigadoc());
            pstmt.setBoolean(6, model.isPermitefiado());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Forma de pagamento "+model.getNome()+", salva com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.\n" + e.getMessage());
        }
    }

    public List<FormapagamentoModel> listaFormas(String nome) {
        List<FormapagamentoModel> formas = new ArrayList<>();
        String sql = "SELECT * FROM formapagamento where nome iLIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                FormapagamentoModel p = new FormapagamentoModel();
                p.setCod(rs.getInt("cod"));
                p.setNome(rs.getString("nome"));
                p.setParcela(rs.getBoolean("parcela"));
                p.setPermitefiado(rs.getBoolean("permitefiado"));
                formas.add(p);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return formas;
    }
    
    public void puxarDados(FormapagamentoModel p, int cod) {
        String sql = "select * from formapagamento where cod = "+cod+";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            p.setCod(rs.getInt("cod"));
            p.setNome(rs.getString("nome"));
            p.setParcela(rs.getBoolean("parcela"));
            p.setParcelas(rs.getInt("parcelas"));
            p.setPermitefiado(rs.getBoolean("permitefiado"));
            p.setObrigadoc(rs.getBoolean("obrigardoc"));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados.\n" + e.getMessage());
        }
        
    }
    public void alterar(FormapagamentoModel model, int cod) {
        String sql = "UPDATE public.formapagamento SET nome=?,parcela=?,parcelas=?,obrigardoc=?,permitefiado=? WHERE cod = "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, model.getNome());
            pstmt.setBoolean(2, model.isParcela());
            pstmt.setInt(3, model.getParcelas());
            pstmt.setBoolean(4, model.isObrigadoc());
            pstmt.setBoolean(5, model.isPermitefiado());
            pstmt.executeUpdate();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Forma de pagamento "+model.getNome()+", alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar.\n" + e.getMessage());
        }
    }

    public void excluir(int cod) {
        String sql = "delete from formapagamento where cod= "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir.\n" + e.getMessage());
        }
    }
}
