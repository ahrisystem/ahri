package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.cadastros.cadastrosUnicos.ContabilidadeModel;

public class ContabilidadeController {

    private final Connection conexao;
    
    public ContabilidadeController() {
        this.conexao = new connection().obterConexao();
    }

    public void salvarDados(ContabilidadeModel eModel) {
        String sql = "UPDATE contabilidade SET cnpj=?,cpf=?,crc=?,nomecont=?,contabilidade=?,fone=?,email=?,cep=?,uf=?,xmun=?,xlgr=?,nro=?,xcpl=?,xbairro=?;";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, eModel.getCnpj());
            pstmt.setString(2, eModel.getCpf());
            pstmt.setString(3, eModel.getCrc());
            pstmt.setString(4, eModel.getNomeCont());
            pstmt.setString(5, eModel.getContabilidade());
            pstmt.setString(6, eModel.getFone());
            pstmt.setString(7, eModel.getEmail());
            pstmt.setString(8, eModel.getCep());
            pstmt.setString(9, eModel.getUf());
            pstmt.setString(10, eModel.getXmun());
            pstmt.setString(11, eModel.getXlgr());
            pstmt.setInt(12, eModel.getNro());
            pstmt.setString(13, eModel.getXcpl());
            pstmt.setString(14, eModel.getXbairro());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar.\n" + e.getMessage());
        }
    }

    public void puxarDados(ContabilidadeModel eModel) {
        String sql = "SELECT cnpj,cpf,crc,nomecont,contabilidade,fone,email,cep,uf,xmun,xlgr,nro,xcpl,xbairro FROM contabilidade;";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                eModel.setCnpj(rs.getString("cnpj"));
                eModel.setCpf(rs.getString("cpf"));
                eModel.setCrc(rs.getString("crc"));
                eModel.setNomeCont(rs.getString("nomecont"));
                eModel.setContabilidade(rs.getString("contabilidade"));
                eModel.setFone(rs.getString("fone"));
                eModel.setEmail(rs.getString("email"));
                eModel.setCep(rs.getString("cep"));
                eModel.setUf(rs.getString("cuf"));
                eModel.setXmun(rs.getString("xmun"));
                eModel.setXlgr(rs.getString("xlgr"));
                eModel.setNro(rs.getInt("nro"));
                eModel.setXcpl(rs.getString("xcpl"));
                eModel.setXbairro(rs.getString("xbairro"));
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao puxar dados!\n" + s.getMessage());
        }
    }
}
