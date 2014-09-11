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
}
