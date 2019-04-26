package model.cadastros.cadastrosUnicos;

public class EmpresaModel {

    private String CNPJ; //formato 00000000000000 CNPJ do emitente
    private String CPF; //CPF do remetente
    private String xNome; //Razão Social ou Nome do emitente
    private String xFant; //Nome fantasia
//<enderEmit>
    private String xLgr; //Logradouro
    private int nro; //Número
    private String xCpl; //Complemento
    private String xBairro; //Bairro
    private String xMun; //Nome do município
    private String UF; //Sigla da UF
    private String CEP; //Código do CEP
    private String xPais; //Nome do País
//</enderEmit>
    private String fone; //Telefone
    private String email;
    private String IE; //IE
    private String IEST; //IE do Substituto Tributário
    private String IM; //Inscrição Municipal
    private String CNAE; //CNAE fiscal
    private int CRT; //Código de Regime Tributário 1 – Simples Nacional 2 – Simples Nacional – Excesso de sublimite de receita bruta 3 – Regime Normal

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getxNome() {
        return xNome;
    }

    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public String getxFant() {
        return xFant;
    }

    public void setxFant(String xFant) {
        this.xFant = xFant;
    }

    public String getxLgr() {
        return xLgr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getxPais() {
        return xPais;
    }

    public void setxPais(String xPais) {
        this.xPais = xPais;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getIEST() {
        return IEST;
    }

    public void setIEST(String IEST) {
        this.IEST = IEST;
    }

    public String getIM() {
        return IM;
    }

    public void setIM(String IM) {
        this.IM = IM;
    }

    public String getCNAE() {
        return CNAE;
    }

    public void setCNAE(String CNAE) {
        this.CNAE = CNAE;
    }

    public int getCRT() {
        return CRT;
    }

    public void setCRT(int CRT) {
        this.CRT = CRT;
    }
    
    
}
