package controller.controles;

import controller.connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class StatusController {

    private final Connection conexao;

    public StatusController(){
        this.conexao = new connection().obterConexao("Status.");
    }
    
    public Double vendasDia() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String data = dtf.format(localDate);
        Double valor = 0.0;
        String sql = "SELECT sum(valortotal) FROM public.vendas where criacao = '" + data + "';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                valor = rs.getDouble("sum");
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar total de vendas diária.\n" + e.getMessage());
        }
        if (valor == null) {
            valor = 0.0;
        }
        return valor;
    }
    
    public Double vendasMes() {
        LocalDate localDate = LocalDate.now();
        Calendar c = new GregorianCalendar(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth());
        String data1 = localDate.getYear() + "-" + localDate.getMonthValue() + "-" + c.getMinimum(GregorianCalendar.DAY_OF_MONTH);
        String data2 = localDate.getYear() + "-" + localDate.getMonthValue() + "-" + c.getMaximum(GregorianCalendar.DAY_OF_MONTH);
        
        Double valor = 0.0;
        String sql = "SELECT sum(valortotal) FROM public.vendas where criacao > '" + data1 + "' and criacao < '"+ data2 +"';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                valor = rs.getDouble("sum");
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar total de vendas no mês.\n" + e.getMessage());
        }
        if (valor == null) {
            valor = 0.0;
        }
        return valor;
    }
}