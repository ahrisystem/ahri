package controller.fiscal;

import controller.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.fiscal.TributacaoModel;

public class TributacaoController {

    private final Connection conexao;

    public TributacaoController() {
        this.conexao = new connection().obterConexao("Controle de tributações");
    }

    public void cadastra(TributacaoModel eModel) {
        String sql = "INSERT INTO public.entidade(cod,inativo,tipopessoa,cliente,fornecedor,cnpj,nome,xnome,xlgr,nro,xcpl,xbairro,xmun,uf,cep,xpais,fone1,fone2,fone3,ie,isuf,email) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, eModel.getCod());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar.\n" + e.getMessage());
        }
    }
    
    public void altera(TributacaoModel eModel, int cod) {
        String sql = "UPDATE entidade SET cod=?, inativo=?, tipopessoa=?, cliente=?, fornecedor=?,cnpj=?, nome=?, xnome=?, xlgr=?, nro=?, xcpl=?, xbairro=?, xmun=?, uf=?, cep=?, xpais=?, fone1=?, fone2=?, fone3=?, ie=?, isuf=?, email=? WHERE cod = '"+cod+"';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, eModel.getCod());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar.\n" + e.getMessage());
        }
    }

    public List<TributacaoModel> listar(String nome) {
        List<TributacaoModel> tributacoes = new ArrayList<>();
        String sql = "Select cod,nome,cnpj,uf,xmun from entidade where inativo = false and cliente = 1 and nome like '%"+nome+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                TributacaoModel eModel = new TributacaoModel();
                eModel.setCod(rs.getString("cod"));
                tributacoes.add(eModel);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return tributacoes;
    }


    public int pegaCodigo() {
        String sql = "select max(cod) from tributacao;";
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

    
    public void puxarDados(TributacaoModel eModel, int cod) {
        String sql = "SELECT cod, inativo, tipopessoa, cliente, fornecedor, cnpj, nome,xnome, xlgr, nro, xcpl, xbairro, xmun, uf, cep, xpais, fone1, fone2, fone3, ie, isuf, email FROM entidade where cod = " + cod + ";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                eModel.setCod(rs.getString("cod"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados para alteração.\n" + e.getMessage());
        }

    }

    public void alterar(TributacaoModel eModel, int cod) {
        String sql = " WHERE cod = " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, eModel.getCod());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar dados.\n" + e.getMessage());
        }
    }

    public void excluir(int cod) {
        String sql = "delete from tributacao where cod= " + cod + ";";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao excluir.\n" + e.getMessage());
        }
    }
}
