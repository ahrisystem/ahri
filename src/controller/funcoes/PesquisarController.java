package controller.funcoes;

import controller.connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.placa.PlacaModel;
import model.cadastros.produtos.ProdutoModel;
import model.financeiro.FormapagamentoModel;
import model.fiscal.TributacaoModel;
import model.vendas.VendasModel;

public class PesquisarController {

    private final Connection conexao;
    
    public PesquisarController() {
        this.conexao = new connection().obterConexao("Função pesquisar.");
    }

    //Listagem
    public List<EntidadeModel> listaClientes(String nome) {
        List<EntidadeModel> clientes = new ArrayList<>();
        String sql = "SELECT cod,nome,cnpj FROM entidade where cliente=1 and nome LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                EntidadeModel e = new EntidadeModel();
                e.setCod(rs.getInt("cod"));
                e.setxNome(rs.getString("nome"));
                e.setCNPJ(rs.getString("cnpj"));
                clientes.add(e);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar clientes!\n" + s.getMessage());
        }
        return clientes;
    }
    public List<FormapagamentoModel> listaFormapagamento(String nome) {
        List<FormapagamentoModel> fms = new ArrayList<>();
        String sql = "SELECT cod,nome,parcela FROM formapagamento where nome LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                FormapagamentoModel e = new FormapagamentoModel();
                e.setCod(rs.getInt("cod"));
                e.setNome(rs.getString("nome"));
                e.setParcela(rs.getBoolean("parcela"));
                fms.add(e);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar formas de pagamento!\n" + s.getMessage());
        }
        return fms;
    }
    public List<VendasModel> listaOrcamentos(String nome) {
        List<VendasModel> vms = new ArrayList<>();
        String sql = "SELECT cod,nomecliente,valortotal FROM vendas where status = 1 and  nomecliente LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                VendasModel vm = new VendasModel();
                vm.setCod(rs.getInt("cod"));
                vm.setNomecliente(rs.getString("nomecliente"));
                vm.setValorTotal(rs.getDouble("valortotal"));
                vms.add(vm);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar orçamentos!\n" + s.getMessage());
        }
        return vms;
    }
    
    public List<PlacaModel> listaPlacas(String cod) {
        List<PlacaModel> placas = new ArrayList<>();
        String sql = "SELECT cod,nome,nomecliente FROM placa where inativo=FALSE and cod LIKE '%" + cod + "%';";
        
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                PlacaModel p = new PlacaModel();
                p.setCod(rs.getString("cod"));
                p.setNome(rs.getString("nome"));
                p.setNomecliente(rs.getString("nomecliente"));
                placas.add(p);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar placas!\n" + s.getMessage());
        }
        return placas;
    }
    public List<ProdutoModel> listaProdutos(String nome) {
        List<ProdutoModel> produtos = new ArrayList<>();
        String sql = "SELECT cod,nome,preco FROM produto where inativo=FALSE and nome LIKE '%" + nome + "%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ProdutoModel p = new ProdutoModel();
                p.setCod(rs.getInt("cod"));
                p.setNome(rs.getString("nome"));
                p.setPreco(rs.getDouble("preco"));
                produtos.add(p);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar produtos!\n" + s.getMessage());
        }
        return produtos;
    }
    public List<TributacaoModel> listaTributacao(String nome) {
        List<TributacaoModel> tributacoes = new ArrayList<>();
        String sql = "SELECT cod,descricao FROM public.tributacao where descricao LIKE '%" + nome + "%';";
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
    
    //Busca
    public void buscarCliente(EntidadeModel model, String cod) {
        String sql = "select cod, nome, cnpj from entidade where cod = '" + cod + "';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                model.setCod(rs.getInt("cod"));
                model.setNome(rs.getString("nome"));
                model.setCNPJ(rs.getString("cnpj"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente.\n" + e.getMessage());
        }
    }
    public void buscarFormapagamento(FormapagamentoModel model, int cod) {
        String sql = "select cod, nome, parcela from formapagamento where cod = " + cod + ";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                model.setCod(rs.getInt("cod"));
                model.setNome(rs.getString("nome"));
                model.setParcela(rs.getBoolean("parcela"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar forma de pagamento.\n" + e.getMessage());
        }
    }
    public void buscarPlaca(PlacaModel model, String cod) {
        String sql = "select cod, nome, codcliente from placa where cod = '" + cod + "';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                model.setCod(rs.getString("cod"));
                model.setNome(rs.getString("nome"));
                model.setCodcliente(rs.getInt("codcliente"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar placa.\n" + e.getMessage());
        }
    }
    public void buscarProduto(ProdutoModel model, String filtro, String cod) {
        String sql = "select cod, nome, preco from produto where "+filtro+" = '" + cod + "';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                model.setCod(rs.getInt("cod"));
                model.setNome(rs.getString("nome"));
                model.setPreco(rs.getDouble("preco"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto.\n" + e.getMessage());
        }
    }
    public void buscarTributacao(TributacaoModel model, String cod) {
        String sql = "select cod, descricao from tributacao where cod = '" + cod + "';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                model.setCod(rs.getString("cod"));
                model.setDescricao(rs.getString("nome"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar tributação.\n" + e.getMessage());
        }
    }
}
