package controller.ferramentas;

import controller.connection;
import funcoes.BuscarPropriedadesConfiguradas;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.ferramentas.BackupModel;
import model.funcoes.PropertiesModel;

public class BackupController {
    private final Connection conexao;
    PropertiesModel pm = new PropertiesModel();
    BuscarPropriedadesConfiguradas bp = new BuscarPropriedadesConfiguradas();
    
    public BackupController() {
        this.conexao = new connection().obterConexao("Controle de backup.");
    }
    
    public String efetuarBackup(String arquivo) {
        bp.dado(pm);
        
        String LOCALBIN = pm.getLocalbin();
        String URL = "jdbc:postgresql://"+pm.getBaseip()+":"+pm.getBaseport()+"/"+pm.getBasenome();
        String DRIVER_CLASS = pm.getBasedriver();
        String USER = pm.getBaseuser();
        String PASS = pm.getBasepass();
        
        
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
            ProcessBuilder pb = new ProcessBuilder(LOCALBIN + "//pg_dump.exe", "-h", pm.getBaseip(), "-U", "postgres", "-F", "c", "-b", "-v", "-f", arquivo, pm.getBasenome());
            pb.environment().put("PGPASSWORD", PASS);
            pb.redirectErrorStream(true);
            p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((linha = reader.readLine()) != null) {
                log = log + "\n" + linha;
            }
            //Atualizando data de ultimo backup no banco
            try {
                PreparedStatement pstmt = this.conexao.prepareStatement("update backup set ultimo = (select now())");
                pstmt.executeUpdate();
                pstmt.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Falha ao atualizar dados.\n" + e.getMessage());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao efetuar backup.\n" + e.getMessage());
        }
        return log;
    }

    public void puxarDados(BackupModel Model) {
        String sql = "SELECT caminho, agendado, hr1, hr2, hr3, hr4, hr5, hr6, ultimo FROM public.backup;";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Model.setCaminho(rs.getString(1));
                Model.setAgendado(rs.getBoolean(2));
                Model.setHr1(rs.getString(3));
                Model.setHr2(rs.getString(4));
                Model.setHr3(rs.getString(5));
                Model.setHr4(rs.getString(6));
                Model.setHr5(rs.getString(7));
                Model.setHr6(rs.getString(8));
                Model.setUltimo(rs.getDate(9));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar configurações de backup.\n" + e.getMessage());
        }
    }
    public void alterar(BackupModel Model) {
        String sql = "UPDATE backup SET caminho=?, agendado=?, hr1=?, hr2=?, hr3=?, hr4=?, hr5=?, hr6=?, ultimo=(select now());";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setString(1, Model.getCaminho());
            pstmt.setBoolean(2, Model.getAgendado());
            pstmt.setString(3, Model.getHr1());
            pstmt.setString(4, Model.getHr2());
            pstmt.setString(5, Model.getHr3());
            pstmt.setString(6, Model.getHr4());
            pstmt.setString(7, Model.getHr5());
            pstmt.setString(8, Model.getHr6());
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar dados.\n" + e.getMessage());
        }
    }
}
