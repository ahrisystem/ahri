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

    public void cadastraOrcamento(VendasModel model) {
        String sql = "";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, model.getCod());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Orçamento Nº "+model.getCod()+" salvo!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar.\n" + e.getMessage());
        }
    }
    
    public void alteraEntidade(VendasModel Model, int cod) {
        String sql = "UPDATE entidade SET cod=?, inativo=?, tipopessoa=?, cliente=?, fornecedor=?,cnpj=?, nome=?, xnome=?, xlgr=?, nro=?, xcpl=?, xbairro=?, xmun=?, uf=?, cep=?, xpais=?, fone1=?, fone2=?, fone3=?, ie=?, isuf=?, email=? WHERE cod = '"+cod+"';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, Model.getCod());
           
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar.\n" + e.getMessage());
        }
    }

    public List<VendasModel> listaClientes(String nome) {
        List<VendasModel> clientes = new ArrayList<>();
        String sql = "Select cod,nome,cnpj,uf,xmun from entidade where inativo = false and cliente = 1 and nome like '%"+nome+"%';";
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

    public void excluir(int cod) {
        String sql = "update entidade set inativo=true where cod= " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir.\n" + e.getMessage());
        }
    }

    public void restaurar(int cod) {
        String sql = "update entidade set inativo=false where cod= " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao restaurar.\n" + e.getMessage());
        }
    }
}