package model.fiscal;

public class TributacaoModel {
    private String cod;
    private String descricao;
    private double tributacao;
    private boolean servico;
    private double tributacao_fora;
    private String cst;
    private String cst_origem;
    private String cst_tributacao;
    private String csosn;
    private String csosn_origem;
    private String csosn_tributacao;    
    private double reducao_base;
    private String cst_iss;
    private double aliquota_iss;
    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getTributacao() {
        return tributacao;
    }

    public void setTributacao(double tributacao) {
        this.tributacao = tributacao;
    }

    public boolean isServico() {
        return servico;
    }

    public void setServico(boolean servico) {
        this.servico = servico;
    }

    public double getTributacao_fora() {
        return tributacao_fora;
    }

    public void setTributacao_fora(double tributacao_fora) {
        this.tributacao_fora = tributacao_fora;
    }

    public String getCst() {
        return cst;
    }

    public void setCst(String cst) {
        this.cst = cst;
    }

    public String getCst_origem() {
        return cst_origem;
    }

    public void setCst_origem(String cst_origem) {
        this.cst_origem = cst_origem;
    }

    public String getCst_tributacao() {
        return cst_tributacao;
    }

    public void setCst_tributacao(String cst_tributacao) {
        this.cst_tributacao = cst_tributacao;
    }

    public String getCsosn() {
        return csosn;
    }

    public void setCsosn(String csosn) {
        this.csosn = csosn;
    }

    public String getCsosn_origem() {
        return csosn_origem;
    }

    public void setCsosn_origem(String csosn_origem) {
        this.csosn_origem = csosn_origem;
    }

    public String getCsosn_tributacao() {
        return csosn_tributacao;
    }

    public void setCsosn_tributacao(String csosn_tributacao) {
        this.csosn_tributacao = csosn_tributacao;
    }

    public double getReducao_base() {
        return reducao_base;
    }

    public void setReducao_base(double reducao_base) {
        this.reducao_base = reducao_base;
    }

    public String getCst_iss() {
        return cst_iss;
    }

    public void setCst_iss(String cst_iss) {
        this.cst_iss = cst_iss;
    }

    public double getAliquota_iss() {
        return aliquota_iss;
    }

    public void setAliquota_iss(double aliquota_iss) {
        this.aliquota_iss = aliquota_iss;
    }
}
