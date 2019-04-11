package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.EmpresaModel;

public class EmpresaController {

    private final Connection conexao;
    
    public EmpresaController() {
        this.conexao = new connection().obterConexao();
    }

    public void cadastraProduto(EmpresaModel eModel) {
        String sql = "INSERT INTO public.empresa(cnpj, cpf, xnome, xfant, xlgr, nro, xcpl, xbairro, cmun, xmun, uf, cep, cpais, xpais, fone, ie, iest, im, cnae, crt) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setInt(1, eModel.getCNPJ());
            pstmt.execute();
            pstmt.close();
            JOptionPane.showMessageDialog(null, "Empresa salva com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro salvar empresa.\n" + e.getMessage());
        }
    }
//sequence: cnpj, cpf, xnome, xfant, xlgr, nro, xcpl, xbairro, cmun, xmun, uf, cep, cpais, xpais, fone, ie, iest, im, cnae, crt
    public void select() {
        String sql = "SELECT * from empresa;";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            EmpresaModel e = new EmpresaModel();
            e.setCNPJ(rs.getInt("cnpj"));
            e.setCPF(rs.getInt("cpf"));
            e.setxNome(rs.getString("xnome"));
            e.setxFant(rs.getString("xfant"));
            e.setxLgr(rs.getString("xlgr"));
            e.setNro(rs.getInt("nro"));
            e.setxCpl(rs.getString("xcpl"));
            e.setxBairro(rs.getString("xbairro"));
            e.setcMun(rs.getInt("cmun"));
            e.setxMun(rs.getString("xmun"));
            e.setUF(rs.getString("uf"));
            e.setCEP(rs.getInt("cep"));
            e.setcPais(rs.getInt("cpais"));
            e.setxPais(rs.getString("xpais"));
            e.setFone(rs.getInt("fone"));
            e.setIE(rs.getInt("ie"));
            e.setIEST(rs.getInt("iest"));
            e.setIM(rs.getInt("im"));
            e.setCNAE(rs.getInt("cnae"));
            e.setCRT(rs.getInt("crt"));
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao puxar dados da empresa!\n" + s.getMessage());
        }
    }
}
