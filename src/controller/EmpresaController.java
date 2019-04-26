package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.cadastros.cadastrosUnicos.EmpresaModel;

public class EmpresaController {

    private final Connection conexao;
    
    public EmpresaController() {
        this.conexao = new connection().obterConexao();
    }

    public void salvarDados(EmpresaModel eModel) {
        String sql = "UPDATE empresa SET cnpj=?,cpf=?,xnome=?,xfant=?,xlgr=?,nro=?,xcpl=?,xbairro=?,xmun=?,uf=?,cep=?,xpais=?,fone=?,email=?,ie=?,iest=?,im=?,cnae=?,crt=?;";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, eModel.getCNPJ());
            pstmt.setString(2, eModel.getCPF());
            pstmt.setString(3, eModel.getxNome());
            pstmt.setString(4, eModel.getxFant());
            pstmt.setString(5, eModel.getxLgr());
            pstmt.setInt(6, eModel.getNro());
            pstmt.setString(7, eModel.getxCpl());
            pstmt.setString(8, eModel.getxBairro());
            pstmt.setString(9, eModel.getxMun());
            pstmt.setString(10, eModel.getUF());
            pstmt.setString(11, eModel.getCEP());
            pstmt.setString(12, eModel.getxPais());
            pstmt.setString(13, eModel.getFone());
            pstmt.setString(14, eModel.getEmail());
            pstmt.setString(15, eModel.getIE());
            pstmt.setString(16, eModel.getIEST());
            pstmt.setString(17, eModel.getIM());
            pstmt.setString(18, eModel.getCNAE());
            pstmt.setInt(19, eModel.getCRT());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Empresa salva com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro salvar empresa.\n" + e.getMessage());
        }
    }

    public void puxarDados(EmpresaModel e) {
        String sql = "SELECT cnpj,cpf,xnome,xfant,xlgr,nro,xcpl,xbairro,xmun,uf,cep,xpais,fone,email,ie,iest,im,cnae,crt FROM empresa;";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                e.setCNPJ(rs.getString("cnpj"));
                e.setCPF(rs.getString("cpf"));
                e.setxNome(rs.getString("xnome"));
                e.setxFant(rs.getString("xfant"));
                e.setxLgr(rs.getString("xlgr"));
                e.setNro(rs.getInt("nro"));
                e.setxCpl(rs.getString("xcpl"));
                e.setxBairro(rs.getString("xbairro"));
                e.setxMun(rs.getString("xmun"));
                e.setUF(rs.getString("uf"));
                e.setCEP(rs.getString("cep"));
                e.setxPais(rs.getString("xpais"));
                e.setFone(rs.getString("fone"));
                e.setEmail(rs.getString("email"));
                e.setIE(rs.getString("ie"));
                e.setIEST(rs.getString("iest"));
                e.setIM(rs.getString("im"));
                e.setCNAE(rs.getString("cnae"));
                e.setCRT(rs.getInt("crt"));
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao puxar dados!\n" + s.getMessage());
        }
    }
}
