package model;

public class EntidadeModel {

    private String cod;
    private int tipoPessoa; //Jurídica - 0; física - 1
    private String constarEm; //Clientes - 0; Fornecedores - 1; Clientes e fornecedores - 2;

    private int CNPJ; //CNPJ ou CPF do destinatário	
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

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public int getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(int tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getConstarEm() {
        return constarEm;
    }

    public void setConstarEm(String constarEm) {
        this.constarEm = constarEm;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
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
