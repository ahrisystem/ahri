package controller.ferramentas;

import controller.connection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ferramentas.ConfiguracaoModel;

public class BackupController {

    private final Connection conexao;

    public BackupController() {
        this.conexao = new connection().obterConexao();
    }
   
    public void efetuarBackup(String caminho) {
        Process p;
        try {
            p = Runtime.getRuntime().exec("C:\\PG\\pg96\\bin\\pg_dump.exe --host localhost --port 5432 --username \"postgres\" --no-password  --format custom --blobs --verbose --file \"C:\\Arquivos Eduardo\\ahri.backup\" \"ahri\"");
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String lineOut;
            while ((lineOut = input.readLine()) != null) {
                System.out.println(lineOut);
            }
            input.close();
            p.waitFor();
        } catch (IOException ex) {
            Logger.getLogger(BackupController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(BackupController.class.getName()).log(Level.SEVERE, null, ex);
        }
    

//        try {
//            Process process = Runtime.getRuntime().exec("C:\\PG\\pg96\\bin\\pg_dump.exe --host localhost --port 5432 --username \"postgres\" --no-password  --format custom --blobs --verbose --file \"C:\\Arquivos Eduardo\\ahri.backup\" \"ahri\"");
//            JOptionPane.showMessageDialog(null, "Backup efetuado com sucesso");
//            
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
    public void alterar(String caminho) {
        String sql = "C:\\PG\\pg96\\bin\\pg_dump.exe --host localhost --port 5432 --username \"postgres\" --no-password  --format custom --blobs --verbose --file \""+caminho+"\" \"ahri\"";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Backup Efetuado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao efetuar backup.\n" + e.getMessage());
        }
    }

    public List<ConfiguracaoModel> listar(String nome) {
        List<ConfiguracaoModel> clientes = new ArrayList<>();
        String sql = "Select cod,nome,cnpj,uf,xmun from entidade where inativo = false and cliente = 1 and nome like '%"+nome+"%';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                ConfiguracaoModel eModel = new ConfiguracaoModel();
                eModel.setCod(rs.getString("cod"));
                clientes.add(eModel);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return clientes;
    }

    public void puxarDados(ConfiguracaoModel eModel, int cod) {
        String sql = "SELECT cod, inativo, tipopessoa, cliente, fornecedor, cnpj, nome,xnome, xlgr, nro, xcpl, xbairro, xmun, uf, cep, xpais, fone1, fone2, fone3, ie, isuf, email FROM entidade where cod = " + cod + ";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                eModel.setCod(rs.getString("cod"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados.\n" + e.getMessage());
        }
    }
}
