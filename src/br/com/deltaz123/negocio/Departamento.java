/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.deltaz123.negocio;

/**
 *
 * @author DeltaZ123TI
 */
public class Departamento {
    //Declaração de atributos
    private int codDepto;
    private String descricao;
    
    //Construtores
    //Construtor padrão
    public Departamento(){
        
    }
    
    public Departamento(int codDepto, String descricao){
        this.codDepto = codDepto;
        this.descricao = descricao;
    }
    
    //Declaração de Getters e Setters

    /**
     * @return the codDepto
     */
    public int getCodDepto() {
        return codDepto;
    }

    /**
     * @param codDepto the codDepto to set
     */
    public void setCodDepto(int codDepto) {
        this.codDepto = codDepto;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
