package controller.vendas;

import controller.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.vendas.CaixaModel;
import model.vendas.VendasItensModel;
import model.vendas.VendasModel;

public class CaixaController {

    private final Connection conexao;

    public CaixaController(){
        this.conexao = new connection().obterConexao("Caixa.");
    }
    
    public void novoCaixa(CaixaModel model) {
        String sql = "INSERT INTO public.caixa(data,usuario,fechado,fundo,sangria,suprimento,saida,entrada,descontos,bruto,total) "
                + "VALUES ((select now()),?,?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            //data do banco
            pstmt.setString(1, model.getUsuario());
            pstmt.setBoolean(2, model.isFechado());
            pstmt.setDouble(3, model.getFundo());
            pstmt.setDouble(4, model.getSangria());
            pstmt.setDouble(5, model.getSuprimento());
            pstmt.setDouble(6, model.getSaida());
            pstmt.setDouble(7, model.getEntrada());
            pstmt.setDouble(8, model.getDescontos());
            pstmt.setDouble(9, model.getBruto());
            pstmt.setDouble(10, model.getTotal());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Caixa aberto!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir novo caixa.\n" + e.getMessage());
        }
    }
    
    public void alteraCaixa(CaixaModel model, int data) {
        String sql = "UPDATE public.caixa SET usuario=?,fechado=?,fundo=?,"
                + "sangria=?,suprimento=?,saida=?,entrada=?,descontos=?,bruto=?,total=? WHERE data = '"+data+"';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            //data do banco
            pstmt.setString(1, model.getUsuario());
            pstmt.setBoolean(2, model.isFechado());
            pstmt.setDouble(3, model.getFundo());
            pstmt.setDouble(4, model.getSangria());
            pstmt.setDouble(5, model.getSuprimento());
            pstmt.setDouble(6, model.getSaida());
            pstmt.setDouble(7, model.getEntrada());
            pstmt.setDouble(8, model.getDescontos());
            pstmt.setDouble(9, model.getBruto());
            pstmt.setDouble(10, model.getTotal());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Caixa alterado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar caixa.\n" + e.getMessage());
        }
    }
    
    public void fecharCaixa(CaixaModel model, int id) {
        String sql = "UPDATE public.caixa SET fechado=true, fundo=?,sangria=? WHERE id = '"+id+"';";
        try {
            PreparedStatement pstmt = this.conexao.prepareStatement(sql);
            pstmt.setDouble(2, model.getFundo());
            pstmt.setDouble(3, model.getSangria());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Caixa fechado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar caixa.\n" + e.getMessage());
        }
    }

    public List<CaixaModel> listaCaixas(Boolean fechado) {
        List<CaixaModel> caixas = new ArrayList<>();
        String sql;
        if (fechado) {
            sql = "select * from caixa order by data;";
        } else {
            sql = "select * from caixa where fechado ="+fechado+" order by data;";
        }
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                CaixaModel model = new CaixaModel();
                model.setId(rs.getInt("id"));
                model.setData(rs.getString("data"));
                model.setFechado(rs.getBoolean("fechado"));
                model.setUsuario(rs.getString("usuario"));
                model.setEntrada(rs.getDouble("entrada"));
                model.setSaida(rs.getDouble("saida"));
                caixas.add(model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar caixas!\n" + s.getMessage());
        }
        return caixas;
    }
    
    
    
    public int verificar(CaixaModel model) {
        String sql1 = "select * from caixa where data = '" + model.getData() + "';";
        boolean fechado = false;
        int retorno = 1;
        
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql1);
            while (rs.next()) {
                fechado = rs.getBoolean("fechado");
                if (fechado) {
                    retorno = 2;
                    System.out.println("Caixa já fechado.");
                    //caixa fechado
                } else{
                    retorno = 3;
                    System.out.println("Caixa ainda aberto.");
                    //caixa aberto
                }
                //novo caixa
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao verificar caixa.\n" + e.getMessage());
        }
        return retorno;
    }
    
    public void puxarDadosCaixa(CaixaModel Model, int id) {
        String sql = "SELECT * FROM public.vendas where id = '" + id + "';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                //id|data|usuario|fechado| fundo | sangria | suprimento | saida | entrada | descontos | bruto | total
                Model.setData(rs.getString("data"));
                Model.setUsuario(rs.getString("usuario"));
                Model.setFechado(rs.getBoolean("fechado"));
                Model.setFundo(rs.getDouble("fundo"));
                Model.setSangria(rs.getDouble("sangria"));
                Model.setSuprimento(rs.getDouble("suprimento"));
                Model.setSaida(rs.getDouble("saida"));
                Model.setEntrada(rs.getDouble("entrada"));
                Model.setDescontos(rs.getDouble("descontos"));
                Model.setBruto(rs.getDouble("bruto"));
                Model.setTotal(rs.getDouble("total"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados de caixas.\n" + e.getMessage());
        }
    }
}