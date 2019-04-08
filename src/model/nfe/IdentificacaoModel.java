package model.nfe;

public class IdentificacaoModel {

    private int cUF; //Código da UF do emitente do Documento Fiscal
    private int cNF; //Código Numérico que compõe a Chave de Acesso
    private String natOp; //Descrição da Natureza da Operação
    private int indPag;	//Indicador da forma de pagamento 0 – pagamento à vista; 1 – pagamento à prazo; 2 - outros
    private int mod; //Modelo do Documento Fiscal
    private int serie; //Série do Documento Fiscal
    private int nNF; //Número do Documento Fiscal
    private String dhEmi; //Data e hora de emissão do Documento Fiscal
    private String dhSaiEnt; //Data e hora de Saída ou da Entrada da Mercadoria/Produto
    private int tpNF; //Tipo de Operação 0-entrada / 1-saída
    private int cMunFG; //Código do Município de Ocorrência do Fato Gerador
            //NFref	Grupo de informação das NF/NFe referenciadas

    private int refNFe; //Chave de acesso da NF-e referenciada

//refNF	Grupo de informação da NF modelo 1/1A referenciada
    private int cUFrefNF; //Código da UF do emitente do Documento Fiscal
    private String AAMMrefNF; //Ano e Mês de emissão da NF-e
    private int CNPJrefNF; //CNPJ do emitente
    private int modRefNF; //Modelo do Documento Fiscal
    private int serieRefNF; //Série do Documento Fiscal
    private int nNFrefNF; //Número do Documento Fiscal

//refNFP	Grupo de informações da NF de produtor rural referenciada
    private int cUFrefNFP; //Código da UF do emitente do Documento Fiscal
    private String AAMMrefNFP; //Ano e Mês de emissão da NF-e
    private int CNPJrefNFP; //CNPJ do emitente
    private int CPFrefNFP; //CPF do emitente
    private int IErefNFP; //IE do emitente
    private int modRefNFP; //Modelo do Documento Fiscal
    private int serieRefNFP; //Série do Documento Fiscal
    private int nNFrefNFP; //Número do Documento Fiscal
    private int refCTeRefNFP; //Chave de acesso do CT-e referenciada

//refECF	Informações do Cupom Fiscal referenciado
    private int modRefECF; //Modelo do Documento Fiscal
    private int nECFrefECF; //Número de ordem sequencial do ECF
    private int nCOOrefECF; //Número do Contador de Ordem de Operação - COO

    private int tpImp; //Formato de Impressão do DANFE
    private int tpEmis; //Tipo de Emissão da NF-e
    private int cDV; //Dígito Verificador da Chave de Acesso da NF-e
    private int tpAmb; //Identificação do Ambiente 1-Produção/ 2-Homologação
    private int finNFe; //Finalidade de emissão da NF-e 1- NF-e normal; 2-NF-e complementar;3 – NF-e de ajuste
    private int procEmi; //Identificador do processo de emissão da NF-e: 0 - emissão de NF-e com aplicativo do contribuinte; 1 - emissão de NF-e avulsa pelo Fisco; 2 - emissão de NF-e avulsa, pelo contribuinte com seu certificado digital, através do site do Fisco; 3- emissão NF-e pelo contribuinte com aplicativo fornecido pelo Fisco.
    private String verProc; //Versão do Processo de emissão da NF-e
    private String dhCont; //Data e Hora da entrada em contingência
    private String xJust; //Justificativa da entrada em contingência

    public int getcUF() {
        return cUF;
    }

    public void setcUF(int cUF) {
        this.cUF = cUF;
    }

    public int getcNF() {
        return cNF;
    }

    public void setcNF(int cNF) {
        this.cNF = cNF;
    }

    public String getNatOp() {
        return natOp;
    }

    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    public int getIndPag() {
        return indPag;
    }

    public void setIndPag(int indPag) {
        this.indPag = indPag;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getnNF() {
        return nNF;
    }

    public void setnNF(int nNF) {
        this.nNF = nNF;
    }

    public String getDhEmi() {
        return dhEmi;
    }

    public void setDhEmi(String dhEmi) {
        this.dhEmi = dhEmi;
    }

    public String getDhSaiEnt() {
        return dhSaiEnt;
    }

    public void setDhSaiEnt(String dhSaiEnt) {
        this.dhSaiEnt = dhSaiEnt;
    }

    public int getTpNF() {
        return tpNF;
    }

    public void setTpNF(int tpNF) {
        this.tpNF = tpNF;
    }

    public int getcMunFG() {
        return cMunFG;
    }

    public void setcMunFG(int cMunFG) {
        this.cMunFG = cMunFG;
    }

    public int getRefNFe() {
        return refNFe;
    }

    public void setRefNFe(int refNFe) {
        this.refNFe = refNFe;
    }

    public int getcUFrefNF() {
        return cUFrefNF;
    }

    public void setcUFrefNF(int cUFrefNF) {
        this.cUFrefNF = cUFrefNF;
    }

    public String getAAMMrefNF() {
        return AAMMrefNF;
    }

    public void setAAMMrefNF(String AAMMrefNF) {
        this.AAMMrefNF = AAMMrefNF;
    }

    public int getCNPJrefNF() {
        return CNPJrefNF;
    }

    public void setCNPJrefNF(int CNPJrefNF) {
        this.CNPJrefNF = CNPJrefNF;
    }

    public int getModRefNF() {
        return modRefNF;
    }

    public void setModRefNF(int modRefNF) {
        this.modRefNF = modRefNF;
    }

    public int getSerieRefNF() {
        return serieRefNF;
    }

    public void setSerieRefNF(int serieRefNF) {
        this.serieRefNF = serieRefNF;
    }

    public int getnNFrefNF() {
        return nNFrefNF;
    }

    public void setnNFrefNF(int nNFrefNF) {
        this.nNFrefNF = nNFrefNF;
    }

    public int getcUFrefNFP() {
        return cUFrefNFP;
    }

    public void setcUFrefNFP(int cUFrefNFP) {
        this.cUFrefNFP = cUFrefNFP;
    }

    public String getAAMMrefNFP() {
        return AAMMrefNFP;
    }

    public void setAAMMrefNFP(String AAMMrefNFP) {
        this.AAMMrefNFP = AAMMrefNFP;
    }

    public int getCNPJrefNFP() {
        return CNPJrefNFP;
    }

    public void setCNPJrefNFP(int CNPJrefNFP) {
        this.CNPJrefNFP = CNPJrefNFP;
    }

    public int getCPFrefNFP() {
        return CPFrefNFP;
    }

    public void setCPFrefNFP(int CPFrefNFP) {
        this.CPFrefNFP = CPFrefNFP;
    }

    public int getIErefNFP() {
        return IErefNFP;
    }

    public void setIErefNFP(int IErefNFP) {
        this.IErefNFP = IErefNFP;
    }

    public int getModRefNFP() {
        return modRefNFP;
    }

    public void setModRefNFP(int modRefNFP) {
        this.modRefNFP = modRefNFP;
    }

    public int getSerieRefNFP() {
        return serieRefNFP;
    }

    public void setSerieRefNFP(int serieRefNFP) {
        this.serieRefNFP = serieRefNFP;
    }

    public int getnNFrefNFP() {
        return nNFrefNFP;
    }

    public void setnNFrefNFP(int nNFrefNFP) {
        this.nNFrefNFP = nNFrefNFP;
    }

    public int getRefCTeRefNFP() {
        return refCTeRefNFP;
    }

    public void setRefCTeRefNFP(int refCTeRefNFP) {
        this.refCTeRefNFP = refCTeRefNFP;
    }

    public int getModRefECF() {
        return modRefECF;
    }

    public void setModRefECF(int modRefECF) {
        this.modRefECF = modRefECF;
    }

    public int getnECFrefECF() {
        return nECFrefECF;
    }

    public void setnECFrefECF(int nECFrefECF) {
        this.nECFrefECF = nECFrefECF;
    }

    public int getnCOOrefECF() {
        return nCOOrefECF;
    }

    public void setnCOOrefECF(int nCOOrefECF) {
        this.nCOOrefECF = nCOOrefECF;
    }

    public int getTpImp() {
        return tpImp;
    }

    public void setTpImp(int tpImp) {
        this.tpImp = tpImp;
    }

    public int getTpEmis() {
        return tpEmis;
    }

    public void setTpEmis(int tpEmis) {
        this.tpEmis = tpEmis;
    }

    public int getcDV() {
        return cDV;
    }

    public void setcDV(int cDV) {
        this.cDV = cDV;
    }

    public int getTpAmb() {
        return tpAmb;
    }

    public void setTpAmb(int tpAmb) {
        this.tpAmb = tpAmb;
    }

    public int getFinNFe() {
        return finNFe;
    }

    public void setFinNFe(int finNFe) {
        this.finNFe = finNFe;
    }

    public int getProcEmi() {
        return procEmi;
    }

    public void setProcEmi(int procEmi) {
        this.procEmi = procEmi;
    }

    public String getVerProc() {
        return verProc;
    }

    public void setVerProc(String verProc) {
        this.verProc = verProc;
    }

    public String getDhCont() {
        return dhCont;
    }

    public void setDhCont(String dhCont) {
        this.dhCont = dhCont;
    }

    public String getxJust() {
        return xJust;
    }

    public void setxJust(String xJust) {
        this.xJust = xJust;
    }
    
    
    
}
