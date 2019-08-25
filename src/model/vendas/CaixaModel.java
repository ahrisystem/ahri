package model.vendas;

public class CaixaModel {
    private int id;
    private String data;
    private int status;
    private String usuario;
    private boolean fechado;
    private double fundo;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public int getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
