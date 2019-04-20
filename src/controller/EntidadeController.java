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
        
        String sql = "INSERT INTO public.entidade(cod, tipopessoa, cliente, fornecedor, cnpj, xnome, xlgr, nro, xcpl, xbairro, cmun, xmun, uf, cep, cpais, xpais, fone, fone2, ie, isuf, email) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, eModel.getCod());
            pstmt.setInt(2, eModel.getTipoPessoa());
            pstmt.setInt(3, eModel.getCliente());
            pstmt.setInt(4, eModel.getFornecedor());
            pstmt.setString(5, eModel.getCNPJ());
            pstmt.setString(6, eModel.getxNome());
            pstmt.setString(7, eModel.getxLgr());
            pstmt.setInt(8, eModel.getNro());
            pstmt.setString(9, eModel.getxCpl());
            pstmt.setString(10, eModel.getxBairro());
            pstmt.setInt(11, eModel.getcMun());
            pstmt.setString(12, eModel.getxMun());
            pstmt.setString(13, eModel.getUF());
            pstmt.setInt(14, eModel.getCEP());
            pstmt.setInt(15, eModel.getcPais());
            pstmt.setString(16, eModel.getxPais());
            pstmt.setInt(17, eModel.getFone());
            pstmt.setInt(18, eModel.getFone2());
            pstmt.setInt(19, eModel.getIE());
            pstmt.setInt(20, eModel.getISUF());
            pstmt.setString(21, eModel.getEmail());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Entidade "+eModel.getxNome()+" salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.\n" + e.getMessage());
        }
    }

    public List<EntidadeModel> listaClientes(String nome) {
        List<EntidadeModel> entidades = new ArrayList<>();
        String sql = "Select cod, xnome, xMun from entidade where cliente = 1";
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
    public List<EntidadeModel> listaFornecedores(String nome) {
        List<EntidadeModel> entidades = new ArrayList<>();
        String sql = "Select cod, xnome, xMun from entidade where fornecedor = 1";
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
    
    public int pegaCodigo(){
        String sql = "select max(cod) from entidade;";
        int cod = 1;
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            cod = cod + Integer.parseInt(rs.getString("max"));
            stmt.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha ao buscar código.\n" + e.getMessage());
        }
        return cod;
    }
    // id | cod | servico | codigoBarras | inativo | nome | grupo | unidadeMedida | estoque | preco | custo | ncm | cest
    public void puxarDados(EntidadeModel eModel, int cod) {
        String sql = "select * from entidade where cod = "+cod+";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            eModel.setCod(rs.getInt("cod"));
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Falha ao buscar código.\n" + e.getMessage());
        }
        
    }
    public void alterar(EntidadeModel eModel, int cod) {
        String sql = "UPDATE public.produto SET cod=?, servico=?, \"codigoBarras\"=?, inativo=?, nome=?, grupo=?, \"unidadeMedida\"=?, estoque=?, preco=?, custo=?, ncm=?, cest=? WHERE cod = "+cod+";";
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

        String sql = "update produto set inativo=true where cod= "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir.\n" + e.getMessage());
        }
    }
    public void restaurar(String cod) {

        String sql = "update produto set inativo=false where cod= "+cod+";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao restaurar produto.\n" + e.getMessage());
        }
    }
}
