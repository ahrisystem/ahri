package model;

public class PerfilUsuarioModel {
    private int cod;
    private String nome;
    private int adm;
    private int financeiro;

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

    public int getAdm() {
        return adm;
    }

    public void setAdm(int adm) {
        this.adm = adm;
    }

    public int getFinanceiro() {
        return financeiro;
    }

    public void setFinanceiro(int financeiro) {
        this.financeiro = financeiro;
    }
    
    
}