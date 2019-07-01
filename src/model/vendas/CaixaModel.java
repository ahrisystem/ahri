package model.vendas;

import java.sql.Date;

public class CaixaModel {
    private String data;
    private int status;
    private String usuario;
    private boolean fechado;
    private double fundo;
    private double sangria;
    private double suprimento;
    private double saida;
    private double entrada;
    private double descontos;
    private double bruto;
    private double total;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isFechado() {
        return fechado;
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getFundo() {
        return fundo;
    }

    public void setFundo(double fundo) {
        this.fundo = fundo;
    }

    public double getSuprimento() {
        return suprimento;
    }

    public void setSuprimento(double suprimento) {
        this.suprimento = suprimento;
    }

    public double getSangria() {
        return sangria;
    }

    public void setSangria(double sangria) {
        this.sangria = sangria;
    }

    public double getSaida() {
        return saida;
    }

    public void setSaida(double saida) {
        this.saida = saida;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public double getDescontos() {
        return descontos;
    }

    public void setDescontos(double descontos) {
        this.descontos = descontos;
    }

    public double getBruto() {
        return bruto;
    }

    public void setBruto(double bruto) {
        this.bruto = bruto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
