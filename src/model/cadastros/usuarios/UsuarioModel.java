package model.cadastros.usuarios;

import java.util.Date;

public class UsuarioModel {
    private String login;
    private boolean inativo;
    private boolean administrador;
    private String nome;
    private String PerfilUsuario;
    private String Senha;
    private Date dataCadastro;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }
    
    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    

    public String getPerfilUsuario() {
        return PerfilUsuario;
    }

    public void setPerfilUsuario(String PerfilUsuario) {
        this.PerfilUsuario = PerfilUsuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
}
