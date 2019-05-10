package controller.ferramentas;

import controller.connection;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.ferramentas.BackupModel;

public class BackupController {
    private final Connection conexao;

    public BackupController() {
        this.conexao = new connection().obterConexao();
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
                log = log + "\n" + linha;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao efetuar backup.\n" + e.getMessage());
        }
        return log;
    }

    public void puxarDados(BackupModel eModel) {
        String sql = "SELECT caminho, agendado, hr1, hr2, hr3, hr4, hr5, hr6, ultimo FROM public.backup;";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                eModel.setCaminho(rs.getString(1));
                eModel.setAgendado(rs.getBoolean(2));
                eModel.setHr1(rs.getString(3));
                eModel.setHr2(rs.getString(4));
                eModel.setHr3(rs.getString(5));
                eModel.setHr4(rs.getString(6));
                eModel.setHr5(rs.getString(7));
                eModel.setHr6(rs.getString(8));
                eModel.setUltimo(rs.getDate(9));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar configurações de backup.\n" + e.getMessage());
        }
    }
}
