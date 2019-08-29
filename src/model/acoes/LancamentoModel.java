package model.acoes;

import java.sql.Date;

public class LancamentoModel {
    private int tipo;
    private String descricao;
    private double valor;
    private int planocontas;
    private Date data;
    private String usuario;
    private String obs;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getPlanocontas() {
        return planocontas;
    }

    public void setPlanocontas(int planocontas) {
        this.planocontas = planocontas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
}
