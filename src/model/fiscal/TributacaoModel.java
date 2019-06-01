package model.fiscal;

public class TributacaoModel {
    /*
    cod text NOT NULL,
  descricao text NOT NULL DEFAULT ''::text,
  tipo text NOT NULL,
  cst_origem text,
  cst_tributacao text,
  csosn text,
  aliquota double precision,
  reducao_base double precision,
  aliquota_fora double precision,
  aliquota_efetivo double precision DEFAULT 0,
  cst_iss text,
  aliquota_iss double precision,
    */
    
    private String cod;
    private String descricao;
    private String tipo;
    private String cst_origem;
    private String cst_tributacao;
    private String csosn;
    private double aliquota;
    private double reducao_base;
    private double aliquota_fora;
    private double aliquota_efetivo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    public double getReducao_base() {
        return reducao_base;
    }

    public void setReducao_base(double reducao_base) {
        this.reducao_base = reducao_base;
    }

    public double getAliquota_fora() {
        return aliquota_fora;
    }

    public void setAliquota_fora(double aliquota_fora) {
        this.aliquota_fora = aliquota_fora;
    }

    public double getAliquota_efetivo() {
        return aliquota_efetivo;
    }

    public void setAliquota_efetivo(double aliquota_efetivo) {
        this.aliquota_efetivo = aliquota_efetivo;
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
