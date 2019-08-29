package controller.acoes;

import controller.connection;
import java.sql.Connection;

public class MovimentoController {

    private final Connection conexao;
    
    public MovimentoController() {
        this.conexao = new connection().obterConexao("Movimentação de produtos");
    }

    
}
