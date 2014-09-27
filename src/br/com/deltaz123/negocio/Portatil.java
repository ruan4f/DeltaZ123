/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deltaz123.negocio;

/**
 *
 * @author Ruan
 */
public class Portatil extends Equipamento{
  public Portatil (String codEquipamento, String codPatrimonial,
			String tipo, String accesorio, String tipoUso, String tipoRede) {
		super();
		this.setCodEquipamento(codEquipamento);
		this.setCodPatrimonial(codPatrimonial);
		this.setTipo (tipo);
		this.setAccesorio(accesorio);
		this.setTipoUso(tipoUso);
		this.setTipoRede (tipoRede);
	}
	public Portatil() {
		super();
	}
}
