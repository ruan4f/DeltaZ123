package br.com.deltaz123.negocio;


import java.util.Date;

/**
 * 
 */

/**
 * @author Vinicius
 *
 */
public class Software {
    //Declarção de atributos
    //private int codSequencial;
    private String nomeSoftware ;
    private String fabricante ;
    private String versao;
    private String nota_fiscal ;
    private String dataNota ;
    private String chaveLicenca;
    private String dataEspiracao;
    private String classificacao;
	
    //Construtor padrão
    public Software() {
	super();
    }
    
    public Software(/*int codSequencial,*/ String nomeSoftware, String fabricante, String versao, String nota_fiscal, String dataNota, String chaveLicenca, String dataEspiracao, String classificacao) {
        super();
        //this.codSequencial = codSequencial;
        this.nomeSoftware = nomeSoftware;
        this.fabricante = fabricante;
        this.versao = versao;
        this.nota_fiscal = nota_fiscal;
        this.dataNota = dataNota;
        this.chaveLicenca = chaveLicenca;
        this.dataEspiracao = dataEspiracao;
        this.classificacao = classificacao;
    }
        
    public void cadastrarDados(/*int codSequencial,*/ String nomeSoftware, String fabricante, String versao, String nota_fiscal, String dataNota, String chaveLicenca, String dataEspiracao, String classificacao){
        //this.codSequencial = codSequencial;
        this.nomeSoftware = nomeSoftware;
        this.fabricante = fabricante;
        this.versao = versao;
        this.nota_fiscal = nota_fiscal;
        this.dataNota = dataNota;
        this.chaveLicenca = chaveLicenca;
        this.dataEspiracao = dataEspiracao;
        this.classificacao = classificacao;
    }

    public void backUp(){
		
    }
    
    /*
    public boolean verificaValidade(){  
	//falsepara fora da validade e true para dentro da validade        
	boolean valido;  
	Date data = new Date(System.currentTimeMillis()); // pega data atual
	if (data.before(this.getDataEspiracao())){  
            valido = true;  
	} else if (data.after(this.getDataEspiracao()))  
	    valido = false;  
	else  
            valido = true;  	      
            return valido;  
    }*/

    /**
     * @return the codSequencial
     */
    /*public int getCodSequencial() {
        return codSequencial;
    }*/

    /**
     * @param codSequencial the codSequencial to set
     */
    /*public void setCodSequencial(int codSequencial) {
        this.codSequencial = codSequencial;
    }*/

    /**
     * @return the nomeSoftware
     */
    public String getNomeSoftware() {
        return nomeSoftware;
    }

    /**
     * @param nomeSoftware the nomeSoftware to set
     */
    public void setNomeSoftware(String nomeSoftware) {
        this.nomeSoftware = nomeSoftware;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the versao
     */
    public String getVersao() {
        return versao;
    }

    /**
     * @param versao the versao to set
     */
    public void setVersao(String versao) {
        this.versao = versao;
    }

    /**
     * @return the nota_fiscal
     */
    public String getNota_fiscal() {
        return nota_fiscal;
    }

    /**
     * @param nota_fiscal the nota_fiscal to set
     */
    public void setNota_fiscal(String nota_fiscal) {
        this.nota_fiscal = nota_fiscal;
    }

    /**
     * @return the dataNota
     */
    public String getDataNota() {
        return dataNota;
    }

    /**
     * @param dataNota the dataNota to set
     */
    public void setDataNota(String dataNota) {
        this.dataNota = dataNota;
    }

    /**
     * @return the chaveLicenca
     */
    public String getChaveLicenca() {
        return chaveLicenca;
    }

    /**
     * @param chaveLicenca the chaveLicenca to set
     */
    public void setChaveLicenca(String chaveLicenca) {
        this.chaveLicenca = chaveLicenca;
    }

    /**
     * @return the dataEspiracao
     */
    public String getDataEspiracao() {
        return dataEspiracao;
    }

    /**
     * @param dataEspiracao the dataEspiracao to set
     */
    public void setDataEspiracao(String dataEspiracao) {
        this.dataEspiracao = dataEspiracao;
    }

    /**
     * @return the classificacao
     */
    public String getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
	
	
}
