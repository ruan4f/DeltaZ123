/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deltaz123.negocio;

/**
 *
 * @author Vinicius
 */
public final class Fixo extends Equipamento {
    public Fixo (String codEquipamento, String codPatrimonial,
			String accesorio, String tipo_uso, String tipoRede) {
		super();
		this.codEquipamento = codEquipamento;
		this.codPatrimonial = codPatrimonial;
		this.tipo = "Fixo";
		this.accesorio = accesorio;
		this.tipoUso = tipo_uso;
		this.tipoRede = tipoRede;
	}
}

