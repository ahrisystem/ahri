package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.EntidadeModel;

public class EntidadeController {

    private final Connection conexao;

    public EntidadeController() {
        this.conexao = new connection().obterConexao();
    }

    public void cadastraEntidade(EntidadeModel eModel) {
        String sql = "INSERT INTO public.entidade(cod,inativo,tipopessoa,cliente,fornecedor,cnpj,nome,xnome,xlgr,nro,xcpl,xbairro,cmun,xmun,uf,cep,cpais,xpais,fone,fone2,ie,isuf,email) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, eModel.getCod());
            pstmt.setInt(2, eModel.getCod());
            pstmt.setInt(3, eModel.getTipoPessoa());
            pstmt.setInt(4, eModel.getCliente());
            pstmt.setInt(5, eModel.getFornecedor());
            pstmt.setString(6, eModel.getCNPJ());
            pstmt.setString(7, eModel.getNome());
            pstmt.setString(8, eModel.getxNome());
            pstmt.setString(9, eModel.getxLgr());
            pstmt.setInt(10, eModel.getNro());
            pstmt.setString(11, eModel.getxCpl());
            pstmt.setString(12, eModel.getxBairro());
            pstmt.setInt(13, eModel.getcMun());
            pstmt.setString(14, eModel.getxMun());
            pstmt.setString(15, eModel.getUF());
            pstmt.setInt(16, eModel.getCEP());
            pstmt.setInt(17, eModel.getcPais());
            pstmt.setString(18, eModel.getxPais());
            pstmt.setInt(19, eModel.getFone());
            pstmt.setInt(20, eModel.getFone2());
            pstmt.setInt(21, eModel.getIE());
            pstmt.setInt(22, eModel.getISUF());
            pstmt.setString(23, eModel.getEmail());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Entidade " + eModel.getxNome() + " salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.\n" + e.getMessage());
        }
    }

    public List<EntidadeModel> listaClientes(String nome) {
        List<EntidadeModel> clientes = new ArrayList<>();
        String sql = "Select cod,xnome,cnpj from entidade where inativo = false and cliente = 1";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                EntidadeModel eModel = new EntidadeModel();
                eModel.setCod(rs.getInt("cod"));
                eModel.setxNome(rs.getString("xnome"));
                eModel.setCNPJ(rs.getString("cnpj"));
                clientes.add(eModel);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return clientes;
    }

    public List<EntidadeModel> listaFornecedores(String nome) {
        List<EntidadeModel> entidades = new ArrayList<>();
        String sql = "Select cod,xnome,xMun from entidade where inativo = false and fornecedor = 1";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                EntidadeModel eModel = new EntidadeModel();
                eModel.setCod(rs.getInt("cod"));
                eModel.setxNome(rs.getString("xnome"));
                eModel.setxMun(rs.getString("xmun"));
                entidades.add(eModel);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return entidades;
    }

    public int pegaCodigo() {
        String sql = "select max(cod) from entidade;";
        int cod = 1;
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            cod = cod + Integer.parseInt(rs.getString("max"));
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar código.\n" + e.getMessage());
        }
        return cod;
    }

    // id | cod | servico | codigoBarras | inativo | nome | grupo | unidadeMedida | estoque | preco | custo | ncm | cest
    public void puxarDados(EntidadeModel eModel, int cod) {
        String sql = "select * from entidade where cod = " + cod + ";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            eModel.setCod(rs.getInt("cod"));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar código.\n" + e.getMessage());
        }

    }

    public void alterar(EntidadeModel eModel, int cod) {
        String sql = " WHERE cod = " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, eModel.getCod());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar dados.\n" + e.getMessage());
        }
    }

    public void excluir(String cod) {

        String sql = "update entidade set inativo=true where cod= " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir.\n" + e.getMessage());
        }
    }

    public void restaurar(String cod) {

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
