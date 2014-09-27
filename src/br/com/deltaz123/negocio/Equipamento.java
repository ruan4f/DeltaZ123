package br.com.deltaz123.negocio;


public abstract class Equipamento {
	String	codEquipamento;
	String	codPatrimonial;
	String	tipo;
	String	accesorio;
        String	tipoUso;
	String	tipoRede;
        
	
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
	public String getAccesorio() {
		return accesorio;
	}
	public void setAccesorio(String accesorio) {
		this.accesorio = accesorio;
	}
	public String getTipo_uso() {
		return tipoUso;
	}
	public void setTipo_uso(String tipoUso) {
		this.tipoUso = tipoUso;
	}
	public String getTipoRede() {
		return tipoRede;
	}
	public void setTipoRede(String tipoRede) {
		this.tipoRede = tipoRede;
	}

}
