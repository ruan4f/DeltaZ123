package br.com.deltaz123.negocio;


public abstract class Equipamento {
	private String	codEquipamento;
	private String	codPatrimonial;
	private String	tipo;
	private String	acesorio;
        private String	tipoUso;
	private String	tipoRede;
        
        public void cadastrarEquipamento(){
            
        }
        
        
	public String getCodEquipamento() {
		return codEquipamento;
	}
	public void setCodEquipamento(String codEquipamento) {
		this.codEquipamento = codEquipamento;
	}
	public String getCodPatrimonial() {
		return codPatrimonial;
	}
	public void setCodPatrimonial(String codPatrimonial) {
		this.codPatrimonial = codPatrimonial;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getAcesorio() {
		return acesorio;
	}
	public void setAcesorio(String accesorio) {
		this.acesorio = accesorio;
	}
	public String getTipoUso() {
		return tipoUso;
	}
	public void setTipoUso(String tipoUso) {
		this.tipoUso = tipoUso;
	}
	public String getTipoRede() {
		return tipoRede;
	}
	public void setTipoRede(String tipoRede) {
		this.tipoRede = tipoRede;
	}

}
