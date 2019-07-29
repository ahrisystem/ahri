package funcoes.pesquisa;

import controller.funcoes.PesquisarController;
import javax.swing.JDialog;
import model.cadastros.produtos.ProdutoModel;

public class BuscarProduto {

    PesquisarController pc = new PesquisarController();
    
    public String buscarProduto(ProdutoModel pm, String input, JDialog pesquisar) {
        String retorno = "";
        if (input.matches("[0-9]+")) {
            if (input.length() >= 6) {
                pc.buscarProduto(pm, "\"codigoBarras\"", input);
                if (pm.getCod() == 0) {
                    retorno = "Produto não existe ou está excluído.";
                } else {
                    //abrir a venda
                }
            } else {
                pc.buscarProduto(pm, "cod", input);
                if (pm.getCod() == 0) {
                    retorno = "Produto não existe ou está excluído.";
                } else {
                    //abrir a venda
                }
            }
        //caso não localizar nem pelo codigo de barras nem pelo codigo
        } else {
            pesquisar.setVisible(true);
            pesquisar.setTitle("Produtos");
        }
        return null;
    }
}
