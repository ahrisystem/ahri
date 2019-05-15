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
import model.vendas.VendasModel;

public class VendasController {

    private final Connection conexao;

    public VendasController() {
        this.conexao = new connection().obterConexao();
    }
/////////////////////////ORCAMENTOS///////////////////////////////////////////////////////////        
    /*
    cod;
    tipo; //1- orcamento 2- saida 3- 
    status;
    cliente;
    placa;
    valorTotalBruto;
    valorTotalDesconto;
    valorTotal;
    criacao;
    alteracao;
    usuario; //login do usuario que fez a operacao
    obs;
    */
    public void cadastraOrcamento(VendasModel model) {
        String sql = "INSERT INTO vendas(cod,tipo,status,cliente,placa,valortotalbruto,valortotaldesconto,valortotal,criacao,usuario,obs) VALUES (?,?,?,?,?,?,?,?,(select now()),?,?);";
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
            //data do banco criacao
            //data do banco alteracao
            pstmt.setString(11, model.getUsuario());
            pstmt.setString(12, model.getObs());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Orçamento Nº "+model.getCod()+" salvo!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar.\n" + e.getMessage());
        }
    }
    
    public void alteraOrçamento(VendasModel model, int cod) {
        String sql = "UPDATE vendas SET id=?,cod=?,tipo=?,status=?,cliente=?,placa=?,valortotalbruto=?,valortotaldesconto=?,valortotal=?,alteracao=?,usuario=?,obs=? WHERE cod='"+cod+"';";
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
                + "status <> 3 and tipo = 1 and e."+filtro+" like '%"+valor+"%';";
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
    
    public void cancelarOrcamento(int cod) {
        String sql = "update vendas set status=3 where cod= " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao cancelar.\n" + e.getMessage());
        }
    }

    public void restaurarOrcamento(int cod) {
        String sql = "update vendas set status=1 where cod= " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao restaurar.\n" + e.getMessage());
        }
    }
/////////////////////////ORCAMENTOS///////////////////////////////////////////////////////////    
    
    
    
    
    public List<VendasModel> listaClientesExcluidos(String nome) {
        List<VendasModel> clientes = new ArrayList<>();
        String sql = "Select cod,nome from entidade where inativo = true and cliente = 1 and nome like '%"+nome+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                VendasModel Model = new VendasModel();
                Model.setCod(rs.getInt("cod"));
                clientes.add(Model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return clientes;
    }

    public List<VendasModel> listaFornecedores(String nome) {
        List<VendasModel> entidades = new ArrayList<>();
        String sql = "Select cod,xnome,xMun from entidade where inativo = false and fornecedor = 1";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                VendasModel Model = new VendasModel();
                Model.setCod(rs.getInt("cod"));
                entidades.add(Model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return entidades;
    }
    public List<VendasModel> listaFornecedoresExcluidos(String nome) {
        List<VendasModel> fornecedores = new ArrayList<>();
        String sql = "Select cod,nome from entidade where inativo = true and fornecedor = 1 and nome like '%"+nome+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                VendasModel Model = new VendasModel();
                Model.setCod(rs.getInt("cod"));
                fornecedores.add(Model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return fornecedores;
    }

    public int pegaCodigo() {
        String sql = "select max(cod) from entidade;";
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

    
    public void puxarDados(VendasModel Model, int cod) {
        String sql = "SELECT cod, inativo, tipopessoa, cliente, fornecedor, cnpj, nome,xnome, xlgr, nro, xcpl, xbairro, xmun, uf, cep, xpais, fone1, fone2, fone3, ie, isuf, email FROM entidade where cod = " + cod + ";";
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

    public void alterar(VendasModel Model, int cod) {
        String sql = " WHERE cod = " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, Model.getCod());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar dados.\n" + e.getMessage());
        }
    }

    
}