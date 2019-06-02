package controller.vendas;

import controller.connection;
import java.sql.Connection;
import java.sql.Date;
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
/////////////////////////ORCAMENTOS/////////////////////////////////////////////       
    public void novoCaixa(CaixaModel model) {
        String sql = "INSERT INTO public.caixa(data,usuario,fechado,fundo,sangria,suprimento,saida,entrada,descontos,bruto,total) "
                + "VALUES (select now(),?,?,?,?,?,?,?,?,?,?);";
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

    public List<CaixaModel> listaCaixas(String filtro,String valor) {
        List<CaixaModel> caixas = new ArrayList<>();
        String sql = "select * from caixa where "+filtro+" = '"+valor+"';";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                CaixaModel model = new CaixaModel();
                model.setData(rs.getDate("data"));
                model.setUsuario(rs.getString("usuario"));
                caixas.add(model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar caixas!\n" + s.getMessage());
        }
        return caixas;
    }
    
    
    
    public int verificar(String data) {
        
        String sql = "SELECT * from caixa where data = '" + data + "';";
        String usuario = "";
        boolean fechado = false;
        int retorno = 0;
        
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                fechado = rs.getBoolean("fechado");
                usuario = rs.getString("usuario");
                if (usuario.equalsIgnoreCase("")) {
                    retorno = 1;
                    //caixa novo
                } else {
                    if (fechado) {
                        retorno = 2;
                        //caixa fechado
                    } else{
                        retorno = 3;
                        //caixa aberto
                    }
                }
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao verificar caixa.\n" + e.getMessage());
        }
        return retorno;
    }
    public void puxarDadosCaixa(VendasModel Model, int cod) {
        String sql = "SELECT id,cod,tipo,status,cliente,placa,valortotalbruto,valortotaldesconto,valortotal,criacao,alteracao,usuario,obs FROM public.vendas where cod = " + cod + ";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Model.setCod(rs.getInt("cod"));
                Model.setTipo(rs.getInt("tipo"));
                Model.setStatus(rs.getInt("status"));
                Model.setCliente(rs.getInt("cliente"));
                Model.setPlaca(rs.getString("placa"));
                Model.setValorTotalBruto(rs.getDouble("valortotalbruto"));
                Model.setValorTotalDesconto(rs.getDouble("valortotaldesconto"));
                Model.setValorTotal(rs.getDouble("valortotal"));
                Model.setCriacao(rs.getDate("criacao"));
                Model.setAlteracao(rs.getDate("alteracao"));
                Model.setUsuario(rs.getString("usuario"));
                Model.setObs(rs.getString("obs"));
            }
            stmt.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha ao buscar dados para alteração.\n" + e.getMessage());
        }
    }
    
    public List<VendasItensModel> puxarDadosProdutosOrcamento(int orcamento) {
        List<VendasItensModel> vendasitens = new ArrayList<>();
        String sql = "SELECT cod,nome,valorunitario,quantidade,valordesconto,valortotal FROM public.vendasitens where venda = "+orcamento+";";
        try {
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                VendasItensModel Model = new VendasItensModel();
                Model.setCod(rs.getInt("cod"));
                Model.setNome(rs.getString("nome"));
                Model.setQuantidade(rs.getDouble("quantidade"));
                Model.setValorunitario(rs.getDouble("valorunitario"));
                Model.setValordesconto(rs.getDouble("valordesconto"));
                Model.setValortotal(rs.getDouble("valortotal"));
                vendasitens.add(Model);
            }
            stmt.close();
        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Falha ao listar!\n" + s.getMessage());
        }
        return vendasitens;
    }
/////////////////////////ORCAMENTOS///////////////////////////////////////////////////////////    
    
    public int pegaCodigo() {
        String sql = "select max(cod) from vendas;";
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
}