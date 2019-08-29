package controller.acoes;

import controller.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.acoes.LancamentoModel;

public class LancamentoController {

    private final Connection conexao;
    
    public LancamentoController() {
        this.conexao = new connection().obterConexao("Lançamentos (financeiro)");
    }

    public void novoLancamento(LancamentoModel Model) {
        String sql = "INSERT INTO public.lancamento(tipo,descricao,valor,planocontas,data,usuario,obs) VALUES (?,?,?,?,(select now()),?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, Model.getTipo());
            pstmt.setString(2, Model.getDescricao());
            pstmt.setDouble(3, Model.getValor());
            pstmt.setInt(4, Model.getPlanocontas());
            pstmt.setInt(5, Model.getPlanocontas());
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar lançamento.\n" + e.getMessage());
        }
    }
}
