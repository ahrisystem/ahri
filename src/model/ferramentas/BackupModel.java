package model.ferramentas;

import java.util.Date;

public class BackupModel {
    private String caminho;
    private Boolean agendado;
    private String hr1;
    private String hr2;
    private String hr3;
    private String hr4;
    private String hr5;
    private String hr6;
    private Date ultimo;

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Boolean getAgendado() {
        return agendado;
    }

    public void setAgendado(Boolean agendado) {
        this.agendado = agendado;
    }

    public String getHr1() {
        return hr1;
    }

    public void setHr1(String hr1) {
        this.hr1 = hr1;
    }

    public String getHr2() {
        return hr2;
    }

    public void setHr2(String hr2) {
        this.hr2 = hr2;
    }

    public String getHr3() {
        return hr3;
    }

    public void setHr3(String hr3) {
        this.hr3 = hr3;
    }

    public String getHr4() {
        return hr4;
    }

    public void setHr4(String hr4) {
        this.hr4 = hr4;
    }

    public String getHr5() {
        return hr5;
    }

    public void setHr5(String hr5) {
        this.hr5 = hr5;
    }

    public String getHr6() {
        return hr6;
    }

    public void setHr6(String hr6) {
        this.hr6 = hr6;
    }

    public Date getUltimo() {
        return ultimo;
    }

    public void setUltimo(Date ultimo) {
        this.ultimo = ultimo;
    }
    
    
}
