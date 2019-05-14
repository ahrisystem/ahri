package model.vendas;

public class VendasModel {
    /*
    cod integer NOT NULL,
    tipo integer NOT NULL,
    status integer NOT NULL,
    cliente integer,
    placa integer,
    valortotalbruto double precision NOT NULL,
    valortotaldesconto double precision NOT NULL,
    valortotal double precision NOT NULL,
    usuario character varying(50),
    obs character varying(255),
    */
    
    private int cod;
    private int tipo; //1- orcamento 2- saida 3- 
    private int status;
    private int cliente;
    private String placa;
    private Double valorTotalBruto;
    private Double valorTotalDesconto;
    private Double valorTotal;
    private String obs;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
}
