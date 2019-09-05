package controller.acoes;

import controller.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.acoes.MovimentoModel;

public class MovimentoController {

    private final Connection conexao;
    
    public MovimentoController() {
        this.conexao = new connection().obterConexao("Movimentação de produtos");
    }

    public void novoMovimento(MovimentoModel Model) {
        String sql = "INSERT INTO public.movimento(tipo,valor,data,usuario,obs) VALUES (?,?,(select now()),?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, Model.getTipo());
            pstmt.setDouble(2, Model.getValor());
            pstmt.setString(3, Model.getUsuario());
            pstmt.setString(4, Model.getObs());
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar movimento.\n" + e.getMessage());
        }
    }
}
