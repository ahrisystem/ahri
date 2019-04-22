package model;

public class EntidadeModel {

    private int cod;
    private boolean inativo;
    private int tipoPessoa; //Jurídica - 0; física - 1
    private int cliente; //0 - não; 1 - sim;
    private int fornecedor; //0 - não; 1 - sim;
    private String CNPJ; //CNPJ ou CPF do destinatário	
    private String nome; //Razão  Social  ou  nome do destinatário	
    private String xNome; //Razão  Social  ou  nome do destinatário	
//<enderDest>
    private String xLgr; //Logradouro	
    private int nro; //Número	
    private String xCpl; //Complemento	
    private String xBairro; //Bairro	
    private int cMun; //Código do município	
    private String xMun;//Nome do município	
    private String UF; //Sigla da UF	
    private int CEP; //Código do CEP	
    private int cPais; //Código do País	
    private String xPais; //Nome do País
//</enderDest>
    private int fone; //Telefone	
    private int fone2; //Telefone	
    private int IE; //Inscrição Estatual	
    private int ISUF; //Inscrição na SUFRAMA	
    private String email; //email do emitente

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }

    public int getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(int tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getxNome() {
        return xNome;
    }

    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public String getxLgr() {
        return xLgr;
    }

    public void setxLgr(String xLgr) {
        this.xLgr = xLgr;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getxCpl() {
        return xCpl;
    }

    public void setxCpl(String xCpl) {
        this.xCpl = xCpl;
    }

    public String getxBairro() {
        return xBairro;
    }

    public void setxBairro(String xBairro) {
        this.xBairro = xBairro;
    }

    public int getcMun() {
        return cMun;
    }

    public void setcMun(int cMun) {
        this.cMun = cMun;
    }

    public String getxMun() {
        return xMun;
    }

    public void setxMun(String xMun) {
        this.xMun = xMun;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public int getcPais() {
        return cPais;
    }

    public void setcPais(int cPais) {
        this.cPais = cPais;
    }

    public String getxPais() {
        return xPais;
    }

    public void setxPais(String xPais) {
        this.xPais = xPais;
    }

    public int getFone() {
        return fone;
    }

    public void setFone(int fone) {
        this.fone = fone;
    }

    public int getFone2() {
        return fone2;
    }

    public void setFone2(int fone2) {
        this.fone2 = fone2;
    }

    public int getIE() {
        return IE;
    }

    public void setIE(int IE) {
        this.IE = IE;
    }

    public int getISUF() {
        return ISUF;
    }

    public void setISUF(int ISUF) {
        this.ISUF = ISUF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}