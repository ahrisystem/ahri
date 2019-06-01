package model.financeiro;

public class FormapagamentoModel {
    private int cod;
    private String nome;
    private boolean parcela;
    private int parcelas;
    private boolean obrigadoc;
    private boolean permitefiado;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isParcela() {
        return parcela;
    }

    public void setParcela(boolean parcela) {
        this.parcela = parcela;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public boolean isObrigadoc() {
        return obrigadoc;
    }

    public void setObrigadoc(boolean obrigadoc) {
        this.obrigadoc = obrigadoc;
    }

    public boolean isPermitefiado() {
        return permitefiado;
    }

    public void setPermitefiado(boolean permitefiado) {
        this.permitefiado = permitefiado;
    }
    
    
}