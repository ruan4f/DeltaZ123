package br.com.deltaz123.negocio;


public abstract class Equipamento {
    //Declaração de Atributos
    private String codEquipamento;
    private String codPatrimonial;
    private String tipo;
    private String acesorio;
    private String tipoUso;
    private String tipoRede;

    //Construtor padrão
    public Equipamento(){
        super();
    }
    
    public Equipamento(String codEquipamento, String codPatrimonial, String tipo, String acesorio, String tipoUso, String tipoRede) {
        super();
        this.codEquipamento = codEquipamento;
        this.codPatrimonial = codPatrimonial;
        this.tipo = tipo;
        this.acesorio = acesorio;
        this.tipoUso = tipoUso;
        this.tipoRede = tipoRede;
    }
    
    public void alterarDados(){
        
    }

    /**
     * @return the codEquipamento
     */
    public String getCodEquipamento() {
        return codEquipamento;
    }

    /**
     * @param codEquipamento the codEquipamento to set
     */
    public void setCodEquipamento(String codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    /**
     * @return the codPatrimonial
     */
    public String getCodPatrimonial() {
        return codPatrimonial;
    }

    /**
     * @param codPatrimonial the codPatrimonial to set
     */
    public void setCodPatrimonial(String codPatrimonial) {
        this.codPatrimonial = codPatrimonial;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the acesorio
     */
    public String getAcesorio() {
        return acesorio;
    }

    /**
     * @param acesorio the acesorio to set
     */
    public void setAcesorio(String acesorio) {
        this.acesorio = acesorio;
    }

    /**
     * @return the tipoUso
     */
    public String getTipoUso() {
        return tipoUso;
    }

    /**
     * @param tipoUso the tipoUso to set
     */
    public void setTipoUso(String tipoUso) {
        this.tipoUso = tipoUso;
    }

    /**
     * @return the tipoRede
     */
    public String getTipoRede() {
        return tipoRede;
    }

    /**
     * @param tipoRede the tipoRede to set
     */
    public void setTipoRede(String tipoRede) {
        this.tipoRede = tipoRede;
    }
        
        
  

}
