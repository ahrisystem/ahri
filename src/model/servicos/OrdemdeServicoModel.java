package model.servicos;

import java.util.Date;

public class OrdemdeServicoModel {
    private int cod;
    private int status;
    private int cliente;
    private String nomecliente;
    private String cnpjcliente;
    private String placa;
    private String nomeplaca;
    private Double valorTotalBruto;
    private Double valorTotalDesconto;
    private Double valorTotal;
    private Date criacao;
    private Date alteracao;
    private String usuario; //login do usuario que fez a operacao
    private String obs = "";

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    public String getCnpjcliente() {
        return cnpjcliente;
    }

    public void setCnpjcliente(String cnpjcliente) {
        this.cnpjcliente = cnpjcliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeplaca() {
        return nomeplaca;
    }

    public void setNomeplaca(String nomeplaca) {
        this.nomeplaca = nomeplaca;
    }

    public Double getValorTotalBruto() {
        return valorTotalBruto;
    }

    public void setValorTotalBruto(Double valorTotalBruto) {
        this.valorTotalBruto = valorTotalBruto;
    }

    public Double getValorTotalDesconto() {
        return valorTotalDesconto;
    }

    public void setValorTotalDesconto(Double valorTotalDesconto) {
        this.valorTotalDesconto = valorTotalDesconto;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    public Date getAlteracao() {
        return alteracao;
    }

    public void setAlteracao(Date alteracao) {
        this.alteracao = alteracao;
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
