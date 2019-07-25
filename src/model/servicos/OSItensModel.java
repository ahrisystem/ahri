package model.servicos;


public class OSItensModel {
    private int os; //código da venda
    private int cod; //código do produto
    private String nome; //nome do produto
    private double valorunitario; //valor unitario do item
    private double quantidade; //quantidade do item 
    private double valortotal; //valor com desconto aplicado

    public int getOs() {
        return os;
    }

    public void setOs(int os) {
        this.os = os;
    }
    
    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(double valorunitario) {
        this.valorunitario = valorunitario;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }
}
