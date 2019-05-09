package controller.ferramentas;

import controller.connection;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.ferramentas.ConfiguracaoModel;

public class BackupController {

    private final Connection conexao;

    public BackupController() {
        this.conexao = new connection().obterConexao();
    }
    public static void main(String[] args) {
        BackupController bc = new BackupController();
        bc.efetuarBackup("C:\\Arquivos Eduardo\\ahri.backup","C:\\PG\\pg96\\bin\\");
    }
    
    public String efetuarBackup(String arquivo, String diretorio) {
        String log = "";
        File arq = new File(arquivo);
        if (arq.exists()) {
            if (arq.length() > 0) {
                arq.delete();
            }
        }
        try {
            Process p = null;
            String linha = "";
            ProcessBuilder pb = new ProcessBuilder(diretorio + "pg_dump.exe", "-h", "localhost", "-U", "postgres", "-F", "c", "-b", "-v", "-f", arquivo, "ahri");
            pb.environment().put("PGPASSWORD", "postgres");
            pb.redirectErrorStream(true);
            p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
                log = log + "\n" + linha;
            }
        } catch (Exception e) {
            System.out.println("Não foi possível efetuar o backup");
        }
        return log;
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
