package funcoes.pesquisa;

import controller.funcoes.PesquisarController;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.placa.PlacaModel;
import model.cadastros.produtos.ProdutoModel;

public class Buscar {

    PesquisarController pc = new PesquisarController();

    public void listar(String titulo, String pesquisa, JDialog pesquisar, JTable tabela) {
        if (pesquisar.getTitle().equalsIgnoreCase("Clientes")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (EntidadeModel e : pc.listaEntidades("cliente", pesquisa)) {
                modelo.addRow(new Object[]{
                    e.getCod(),
                    e.getxNome(),
                    e.getCNPJ(),});
            }
        }
        if (pesquisar.getTitle().equalsIgnoreCase("Fornecedores")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (EntidadeModel e : pc.listaEntidades("fornecedor", pesquisa)) {
                modelo.addRow(new Object[]{
                    e.getCod(),
                    e.getxNome(),
                    e.getCNPJ(),});
            };
        }
        if (pesquisar.getTitle().equalsIgnoreCase("Placas")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (PlacaModel p : pc.listaPlacas(pesquisa)) {
                modelo.addRow(new Object[]{
                    p.getCod(),
                    p.getNome(),
                    p.getNomecliente(),});
            }
        }

        if (pesquisar.getTitle().equalsIgnoreCase("Produtos")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (ProdutoModel p : pc.listaProdutos(pesquisa)) {
                modelo.addRow(new Object[]{
                    p.getCod(),
                    p.getNome(),
                    p.getPreco(),});
            }
        }
    }
    
    public void buscarProduto(ProdutoModel pm, String input, JDialog pesquisar) {
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
                    
                }
            }
        //caso não localizar nem pelo codigo de barras nem pelo codigo
        } else {
            pesquisar.setVisible(true);
            pesquisar.setTitle("Produtos");
            pesquisar.setLocation(100, 100);
            pesquisar.setSize(300, 300);
        }
    }
}