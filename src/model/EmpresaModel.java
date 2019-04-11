package model;

public class EmpresaModel {

    private int CNPJ; //formato 00000000000000 CNPJ do emitente
    private int CPF; //CPF do remetente
    private String xNome; //Razão Social ou Nome do emitente
    private String xFant; //Nome fantasia
//<enderEmit>
    private String xLgr; //Logradouro
    private int nro; //Número
    private String xCpl; //Complemento
    private String xBairro; //Bairro
    private int cMun; //Código do município
    private String xMun; //Nome do município
    private String UF; //Sigla da UF
    private int CEP; //Código do CEP
    private int cPais; //Código do País
    private String xPais; //Nome do País
//</enderEmit>
    private int fone; //Telefone
    private int IE; //IE
    private int IEST; //IE do Substituto Tributário
    private int IM; //Inscrição Municipal
    private int CNAE; //CNAE fiscal
    private int CRT; //Código de Regime Tributário 1 – Simples Nacional 2 – Simples Nacional – Excesso de sublimite de receita bruta 3 – Regime Normal

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
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

    public int getIE() {
        return IE;
    }

    public void setIE(int IE) {
        this.IE = IE;
    }

    public int getIEST() {
        return IEST;
    }

    public void setIEST(int IEST) {
        this.IEST = IEST;
    }

    public int getIM() {
        return IM;
    }

    public void setIM(int IM) {
        this.IM = IM;
    }

    public int getCNAE() {
        return CNAE;
    }

    public void setCNAE(int CNAE) {
        this.CNAE = CNAE;
    }

    public int getCRT() {
        return CRT;
    }

    public void setCRT(int CRT) {
        this.CRT = CRT;
    }

}
