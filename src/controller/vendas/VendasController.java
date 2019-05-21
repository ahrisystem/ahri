package controller.vendas;

import controller.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.cadastros.entidades.EntidadeModel;
import model.cadastros.produtos.ProdutoModel;
import model.vendas.VendasItensModel;
import model.vendas.VendasModel;

public class VendasController {

    private final Connection conexao;

    public VendasController() {
        this.conexao = new connection().obterConexao();
    }
/////////////////////////ORCAMENTOS/////////////////////////////////////////////       
    public void cadastraOrcamento(VendasModel model) {
        String sql = "INSERT INTO vendas(cod,tipo,status,cliente,placa,"
                + "valortotalbruto,valortotaldesconto,valortotal,criacao,"
                + "alteracao,usuario,obs) VALUES (?,?,?,?,?,?,?,?,(select now()),(select now()),?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, model.getCod());
            pstmt.setInt(2, 1);
            pstmt.setInt(3, 1);
            pstmt.setInt(4, model.getCliente());
            pstmt.setString(5, model.getPlaca());
            pstmt.setDouble(6, model.getValorTotalBruto());
            pstmt.setDouble(7, model.getValorTotalDesconto());
            pstmt.setDouble(8, model.getValorTotal());
            //data do banco criacao
            //data do banco alteracao
            pstmt.setString(9, model.getUsuario());
            pstmt.setString(10, model.getObs());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Orçamento Nº "+model.getCod()+" salvo!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar.\n" + e.getMessage());
        }
    }
    public void cadastraProdutosOrcamento(VendasItensModel model) {
        String sql = "INSERT INTO public.vendasitens("
                + "venda, cod, quantidade, valordesconto, valorunitario)  "
                + "VALUES (?, ?, ?, ?, ?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, model.getVenda());
            pstmt.setInt(2, model.getCod());
            pstmt.setDouble(3, model.getQuantidade());
            pstmt.setDouble(4, model.getValordesconto());
            pstmt.setDouble(5, model.getValorunitario());
            pstmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar produtos do orçamento.\n" + e.getMessage());
        }
    }
    
    public void alteraOrçamento(VendasModel model, int cod) {
        String sql = "UPDATE vendas SET id=?,cod=?,tipo=?,status=?,cliente=?,"
                + "placa=?,valortotalbruto=?,valortotaldesconto=?,valortotal=?,"
                + "alteracao=?,usuario=?,obs=? WHERE cod='"+cod+"';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, model.getCod());
            pstmt.setInt(2, 1);
            pstmt.setInt(3, model.getStatus());
            pstmt.setInt(4, model.getCliente());
            pstmt.setString(5, model.getPlaca());
            pstmt.setDouble(6, model.getValorTotalBruto());
            pstmt.setDouble(7, model.getValorTotalDesconto());
            pstmt.setDouble(8, model.getValorTotal());
            //data do alteracao
            pstmt.setString(10, model.getUsuario());
            pstmt.setString(11, model.getObs());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar.\n" + e.getMessage());
        }
    }

    public List<VendasModel> listaOrcamentos(String filtro,String valor) {
        List<VendasModel> clientes = new ArrayList<>();
        String sql = "SELECT v.cod,v.status,e.nome,e.cnpj,v.valortotal "
                + "FROM vendas v, entidade e WHERE v.cliente = e.cod and "
                + "tipo = 1 and e."+filtro+" like '%"+valor+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                VendasModel Model = new VendasModel();
                Model.setCod(rs.getInt(1));
                Model.setStatus(rs.getInt(2));
                Model.setNomecliente(rs.getString(3));
                Model.setCnpjcliente(rs.getString(4));
                Model.setValorTotal(rs.getDouble(5));
                clientes.add(Model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return clientes;
    }
    
    public void alteraStatusOrcamento(int status, int cod) {
        String sql = "update vendas set status="+status+" where cod= " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao cancelar.\n" + e.getMessage());
        }
    }
    
    public void puxarDadosOrcamento(VendasModel Model, int cod) {
        String sql = "where cod = " + cod + ";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Model.setCod(rs.getInt("cod"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados para alteração.\n" + e.getMessage());
        }
    }
/////////////////////////ORCAMENTOS///////////////////////////////////////////////////////////    
    
    public int pegaCodigo() {
        String sql = "select max(cod) from vendas;";
        int cod = 1;
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            if (rs.getString("max") == null) {
                cod = 1;
            } else {
                cod = cod + Integer.parseInt(rs.getString("max"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar código.\n" + e.getMessage());
        }
        return cod;
    }
}