package funcoes.pesquisa;

import controller.funcoes.PesquisarController;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.placa.PlacaModel;
import model.cadastros.produtos.ProdutoModel;
import model.financeiro.FormapagamentoModel;
import model.vendas.VendasModel;

public class Buscar {

    PesquisarController pc = new PesquisarController();

    public void listar(String tipo, String pesquisa, JDialog pesquisar, JTable tabela) {
        pesquisar.setVisible(true);
        pesquisar.setTitle(tipo);
        pesquisar.setLocation(100, 100);
        pesquisar.setSize(600, 400);
        
        if (tipo.equalsIgnoreCase("Cliente")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (EntidadeModel e : pc.listaEntidades("cliente", pesquisa)) {
                modelo.addRow(new Object[]{
                    e.getCod(),
                    e.getxNome(),
                    e.getCNPJ(),});
            }
        }
        if (tipo.equalsIgnoreCase("Forma de pagamento")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (FormapagamentoModel e : pc.listaFormapagamento(pesquisa)) {
                modelo.addRow(new Object[]{
                    e.getCod(),
                    e.getNome(),
                    e.getParcelas()});
            };
        }
        if (tipo.equalsIgnoreCase("Fornecedor")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (EntidadeModel e : pc.listaEntidades("fornecedor", pesquisa)) {
                modelo.addRow(new Object[]{
                    e.getCod(),
                    e.getxNome(),
                    e.getCNPJ(),});
            };
        }
        if (tipo.equalsIgnoreCase("Placa")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (PlacaModel p : pc.listaPlacas(pesquisa)) {
                modelo.addRow(new Object[]{
                    p.getCod(),
                    p.getNome(),
                    p.getNomecliente(),});
            }
        }

        if (tipo.equalsIgnoreCase("Produto")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (ProdutoModel p : pc.listaProdutos(pesquisa)) {
                modelo.addRow(new Object[]{
                    p.getCod(),
                    p.getNome(),
                    p.getPreco(),});
            }
        }
        if (tipo.equalsIgnoreCase("Orçamento")) {
            DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
            modelo.setNumRows(0);
            for (VendasModel p : pc.listaOrcamentos(pesquisa)) {
                modelo.addRow(new Object[]{
                    p.getCod(),
                    p.getNomecliente(),
                    p.getValorTotal()});
            }
        }
    }
    
    public boolean buscarProduto(ProdutoModel pm, String input, JDialog pesquisar) {
        boolean encontrou = false;
        if (input.length() >= 6) {
            pc.buscarProduto(pm, "\"codigoBarras\"", input);
        } else {
            pc.buscarProduto(pm, "cod", input);
        }
        if (pm.getCod() > 0) {
            encontrou = true;
        } else {//caso não localizar nem pelo codigo de barras nem pelo codigo
            pesquisar.setVisible(true);
            pesquisar.setTitle("Produtos");
            pesquisar.setLocation(100, 100);
            pesquisar.setSize(600, 400);
        }
        System.out.println(encontrou);
        return encontrou;
    }
}