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
import model.vendas.VendasItensModel;
import model.vendas.VendasModel;

public class VendasController {

    private final Connection conexao;

    public VendasController(){
        this.conexao = new connection().obterConexao("Controle de vendas/orçamentos.");
    }
/////////////////////////ORCAMENTOS/////////////////////////////////////////////       
    public void cadastraOrcamento(VendasModel model) {
        String sql = "INSERT INTO public.vendas(cod,tipo,status,cliente,nomecliente,cnpjcliente,"
                + "placa,nomeplaca,valortotalbruto,valortotaldesconto,valortotal,criacao,alteracao,usuario,obs) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,(select now()),(select now()),?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, model.getCod());
            pstmt.setInt(2, 1);
            pstmt.setInt(3, 1);
            pstmt.setInt(4, model.getCliente());
            pstmt.setString(5, model.getNomecliente());
            pstmt.setString(6, model.getCnpjcliente());
            pstmt.setString(7, model.getPlaca());
            pstmt.setString(8, model.getNomeplaca());
            pstmt.setDouble(9, model.getValorTotalBruto());
            pstmt.setDouble(10, model.getValorTotalDesconto());
            pstmt.setDouble(11, model.getValorTotal());
            //data do banco criacao
            //data do banco alteracao
            pstmt.setString(12, model.getUsuario());
            pstmt.setString(13, model.getObs());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Orçamento Nº "+model.getCod()+" salvo!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar.\n" + e.getMessage());
        }
    }
    public void cadastraProdutosOrcamento(VendasItensModel model) {
        String sql = "INSERT INTO public.vendasitens("
                + "venda, cod,nome, quantidade, valordesconto, valorunitario,valortotal)  "
                + "VALUES (?, ?, ?, ?, ?, ?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, model.getVenda());
            pstmt.setInt(2, model.getCod());
            pstmt.setString(3, model.getNome());
            pstmt.setDouble(4, model.getQuantidade());
            pstmt.setDouble(5, model.getValordesconto());
            pstmt.setDouble(6, model.getValorunitario());
            pstmt.setDouble(7, model.getValortotal());
            pstmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar produtos do orçamento.\n" + e.getMessage());
        }
    }
    
    public void alteraOrçamento(VendasModel model, int cod) {
        String sql = "UPDATE vendas SET cod=?,cliente=?,nomecliente=?,cnpjcliente=?"
                + "placa=?,nomeplaca=?,valortotalbruto=?,valortotaldesconto=?,valortotal=?,"
                + "alteracao=?,usuario=?,obs=? WHERE cod='"+cod+"';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, model.getCod());
            pstmt.setInt(2, model.getCliente());
            pstmt.setString(3, model.getNomecliente());
            pstmt.setString(4, model.getCnpjcliente());
            pstmt.setString(5, model.getPlaca());
            pstmt.setString(6, model.getNomeplaca());
            pstmt.setDouble(7, model.getValorTotalBruto());
            pstmt.setDouble(8, model.getValorTotalDesconto());
            pstmt.setDouble(9, model.getValorTotal());
            //data do alteracao
            pstmt.setString(10, model.getUsuario());
            pstmt.setString(11, model.getObs());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Orçamento alterado com sucesso!");
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
        String sql = "SELECT id,cod,tipo,status,cliente,placa,valortotalbruto,valortotaldesconto,valortotal,criacao,alteracao,usuario,obs FROM public.vendas where cod = " + cod + ";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Model.setCod(rs.getInt("cod"));
                Model.setTipo(rs.getInt("tipo"));
                Model.setStatus(rs.getInt("status"));
                Model.setCliente(rs.getInt("cliente"));
                Model.setPlaca(rs.getString("placa"));
                Model.setValorTotalBruto(rs.getDouble("valortotalbruto"));
                Model.setValorTotalDesconto(rs.getDouble("valortotaldesconto"));
                Model.setValorTotal(rs.getDouble("valortotal"));
                Model.setCriacao(rs.getDate("criacao"));
                Model.setAlteracao(rs.getDate("alteracao"));
                Model.setUsuario(rs.getString("usuario"));
                Model.setObs(rs.getString("obs"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados para alteração.\n" + e.getMessage());
        }
    }
    
    public List<VendasItensModel> puxarDadosProdutosOrcamento(int orcamento) {
        List<VendasItensModel> vendasitens = new ArrayList<>();
        String sql = "SELECT cod,nome,valorunitario,quantidade,valordesconto,valortotal FROM public.vendasitens where venda = "+orcamento+";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                VendasItensModel Model = new VendasItensModel();
                Model.setCod(rs.getInt("cod"));
                Model.setNome(rs.getString("nome"));
                Model.setQuantidade(rs.getDouble("quantidade"));
                Model.setValorunitario(rs.getDouble("valorunitario"));
                Model.setValordesconto(rs.getDouble("valordesconto"));
                Model.setValortotal(rs.getDouble("valortotal"));
                vendasitens.add(Model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return vendasitens;
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