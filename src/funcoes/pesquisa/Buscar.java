package funcoes.pesquisa;

import controller.funcoes.PesquisarController;
import model.cadastros.produtos.ProdutoModel;
import view.caixa.PDV;
import view.funcoes.Pesquisar;

public class Buscar {

    PesquisarController pc = new PesquisarController();
    
    public void buscarProduto(ProdutoModel pm, String input, PDV pdv) {
        Pesquisar p = new Pesquisar("Produtos", input);
        if (input.matches("[0-9]+")) {
            if (input.length() >= 6) {
                pc.buscarProduto(pm, "\"codigoBarras\"", input);
                if (pm.getCod() == 0) {
                } else {
                    //abrir a venda
                }
            } else {
                pc.buscarProduto(pm, "cod", input);
                if (pm.getCod() == 0) {
                } else {
                    pdv.preencherDadosBuscaProdutos(pm);
                }
            }
        //caso não localizar nem pelo codigo de barras nem pelo codigo
        } else {
            p.pesquisar.setVisible(true);
            p.pesquisar.setTitle("Produtos");
            p.pesquisar.setLocation(100, 100);
            p.pesquisar.setSize(300, 300);
        }
    }
}
