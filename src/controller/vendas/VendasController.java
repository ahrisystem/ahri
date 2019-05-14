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
import model.cadastros.entidades.EntidadModel;
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
    
    public void alteraEntidade(EntidadModel Model, int cod) {
        String sql = "UPDATE entidade SET cod=?, inativo=?, tipopessoa=?, cliente=?, fornecedor=?,cnpj=?, nome=?, xnome=?, xlgr=?, nro=?, xcpl=?, xbairro=?, xmun=?, uf=?, cep=?, xpais=?, fone1=?, fone2=?, fone3=?, ie=?, isuf=?, email=? WHERE cod = '"+cod+"';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, Model.getCod());
            pstmt.setBoolean(2, false);
            pstmt.setInt(3, Model.getTipoPessoa());
            pstmt.setInt(4, Model.getCliente());
            pstmt.setInt(5, Model.getFornecedor());
            pstmt.setString(6, Model.getCNPJ());
            pstmt.setString(7, Model.getNome());
            pstmt.setString(8, Model.getxNome());
            pstmt.setString(9, Model.getxLgr());
            pstmt.setInt(10, Model.getNro());
            pstmt.setString(11, Model.getxCpl());
            pstmt.setString(12, Model.getxBairro());
            pstmt.setString(13, Model.getxMun());
            pstmt.setString(14, Model.getUF());
            pstmt.setString(15, Model.getCEP());
            pstmt.setString(16, Model.getxPais());
            pstmt.setString(17, Model.getFone1());
            pstmt.setString(18, Model.getFone2());
            pstmt.setString(19, Model.getFone3());
            pstmt.setString(20, Model.getIE());
            pstmt.setString(21, Model.getISUF());
            pstmt.setString(22, Model.getEmail());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Entidade " + Model.getNome() + " alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar.\n" + e.getMessage());
        }
    }

    public List<EntidadModel> listaClientes(String nome) {
        List<EntidadModel> clientes = new ArrayList<>();
        String sql = "Select cod,nome,cnpj,uf,xmun from entidade where inativo = false and cliente = 1 and nome like '%"+nome+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                EntidadModel Model = new EntidadModel();
                Model.setCod(rs.getInt("cod"));
                Model.setNome(rs.getString("nome"));
                Model.setCNPJ(rs.getString("cnpj"));
                Model.setUF(rs.getString("uf"));
                Model.setxMun(rs.getString("xmun"));
                clientes.add(Model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return clientes;
    }
    public List<EntidadModel> listaClientesExcluidos(String nome) {
        List<EntidadModel> clientes = new ArrayList<>();
        String sql = "Select cod,nome from entidade where inativo = true and cliente = 1 and nome like '%"+nome+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                EntidadModel Model = new EntidadModel();
                Model.setCod(rs.getInt("cod"));
                Model.setNome(rs.getString("nome"));
                clientes.add(Model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return clientes;
    }

    public List<EntidadModel> listaFornecedores(String nome) {
        List<EntidadModel> entidades = new ArrayList<>();
        String sql = "Select cod,xnome,xMun from entidade where inativo = false and fornecedor = 1";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                EntidadModel Model = new EntidadModel();
                Model.setCod(rs.getInt("cod"));
                Model.setxNome(rs.getString("xnome"));
                Model.setxMun(rs.getString("xmun"));
                entidades.add(Model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return entidades;
    }
    public List<EntidadModel> listaFornecedoresExcluidos(String nome) {
        List<EntidadModel> fornecedores = new ArrayList<>();
        String sql = "Select cod,nome from entidade where inativo = true and fornecedor = 1 and nome like '%"+nome+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                EntidadModel Model = new EntidadModel();
                Model.setCod(rs.getInt("cod"));
                Model.setNome(rs.getString("nome"));
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

    
    public void puxarDados(EntidadModel Model, int cod) {
        String sql = "SELECT cod, inativo, tipopessoa, cliente, fornecedor, cnpj, nome,xnome, xlgr, nro, xcpl, xbairro, xmun, uf, cep, xpais, fone1, fone2, fone3, ie, isuf, email FROM entidade where cod = " + cod + ";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Model.setCod(rs.getInt("cod"));
                Model.setInativo(rs.getBoolean("inativo"));
                Model.setTipoPessoa(rs.getInt("tipopessoa"));
                Model.setCliente(rs.getInt("cliente"));
                Model.setFornecedor(rs.getInt("fornecedor"));
                Model.setCNPJ(rs.getString("cnpj"));
                Model.setNome(rs.getString("nome"));
                Model.setxNome(rs.getString("xnome"));
                Model.setxLgr(rs.getString("xlgr"));
                Model.setNro(rs.getInt("nro"));
                Model.setxCpl(rs.getString("xcpl"));
                Model.setxBairro(rs.getString("xbairro"));
                Model.setxMun(rs.getString("xmun"));
                Model.setUF(rs.getString("uf"));
                Model.setCEP(rs.getString("cep"));
                Model.setxPais(rs.getString("xpais"));
                Model.setFone1(rs.getString("fone1"));
                Model.setFone2(rs.getString("fone2"));
                Model.setFone3(rs.getString("fone3"));
                Model.setIE(rs.getString("ie"));
                Model.setISUF(rs.getString("isuf"));
                Model.setEmail(rs.getString("email"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados para alteração.\n" + e.getMessage());
        }

    }

    public void alterar(EntidadModel Model, int cod) {
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