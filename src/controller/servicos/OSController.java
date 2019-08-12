package controller.servicos;

import controller.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.servicos.OSItensModel;
import model.servicos.OSModel;

public class OSController {

    private final Connection conexao;

    public OSController(){
        this.conexao = new connection().obterConexao("Controle de OS.");
    }
    
    public void cadastraOS(OSModel model) {
        String sql = "INSERT INTO public.os(cod,status,cliente,nomecliente,cnpjcliente,"
                + "placa,nomeplaca,valortotal,criacao,alteracao,usuario,obs) "
                + "VALUES (?,?,?,?,?,?,?,?,(select now()),(select now()),?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, model.getCod());
            pstmt.setInt(2, 1);
            pstmt.setInt(3, model.getCliente());
            pstmt.setString(4, model.getNomecliente());
            pstmt.setString(5, model.getCnpjcliente());
            pstmt.setString(6, model.getPlaca());
            pstmt.setString(7, model.getNomeplaca());
            pstmt.setDouble(8, model.getValorTotal());
            //data do banco criacao
            //data do banco alteracao
            pstmt.setString(9, model.getUsuario());
            pstmt.setString(10, model.getObs());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "OS Nº "+model.getCod()+" salva!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar OS.\n" + e.getMessage());
        }
    }
    public void cadastraServicosOS(OSItensModel model) {
        String sql = "INSERT INTO public.ositens("
                + "os,cod,nome,valorunitario,quantidade,valortotal)  "
                + "VALUES (?,? ?,?,?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, model.getOs());
            pstmt.setInt(2, model.getCod());
            pstmt.setString(3, model.getNome());
            pstmt.setDouble(4, model.getQuantidade());
            pstmt.setDouble(5, model.getValorunitario());
            pstmt.setDouble(6, model.getValortotal());
            pstmt.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar serviços da OS.\n" + e.getMessage());
        }
    }
    
    public void alteraOS(OSModel model, int cod) {
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
    
    public void deletaProdutosOS(int os){
        String sql = "delete from ositens where venda = "+os+";";
        try {
            PreparedStatement pstmt1 = this.conexao.prepareStatement(sql);
            pstmt1.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar serviços da OS.\n" + e.getMessage());
        }
    }
    

    public List<OSModel> listaOS(String filtro,String valor) {
        List<OSModel> ordens = new ArrayList<>();
        String sql = "SELECT v.cod,v.status,e.nome,e.cnpj,v.valortotal "
                + "FROM os v, entidade e WHERE v.cliente = e.cod and "
                + " e."+filtro+" ilike '%"+valor+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                OSModel Model = new OSModel();
                Model.setCod(rs.getInt(1));
                Model.setStatus(rs.getInt(2));
                Model.setNomecliente(rs.getString(3));
                Model.setCnpjcliente(rs.getString(4));
                Model.setValorTotal(rs.getDouble(5));
                ordens.add(Model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return ordens;
    }
    
    public void alteraStatusOS(int status, int cod) {
        String sql = "update os set status="+status+" where cod= " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar status.\n" + e.getMessage());
        }
    }
    
    public void puxarDadosOS(OSModel Model, int cod) {
        String sql = "SELECT * FROM public.os where cod = " + cod + ";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Model.setCod(rs.getInt("cod"));
                Model.setStatus(rs.getInt("status"));
                Model.setCliente(rs.getInt("cliente"));
                Model.setPlaca(rs.getString("placa"));
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
    
    public List<OSItensModel> puxarDadosItensOS(int os) {
        List<OSItensModel> ositens = new ArrayList<>();
        String sql = "SELECT * FROM public.ositens where os = "+os+";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                OSItensModel Model = new OSItensModel();
                Model.setCod(rs.getInt("cod"));
                Model.setNome(rs.getString("nome"));
                Model.setQuantidade(rs.getDouble("quantidade"));
                Model.setValorunitario(rs.getDouble("valorunitario"));
                Model.setValortotal(rs.getDouble("valortotal"));
                ositens.add(Model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return ositens;
    }
/////////////////////////ORCAMENTOS///////////////////////////////////////////////////////////    
    
    public int pegaCodigo() {
        String sql = "select max(cod) from os;";
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