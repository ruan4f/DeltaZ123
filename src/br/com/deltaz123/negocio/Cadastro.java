/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deltaz123.negocio;

/**
 *
 * @author Patrocínio
 */
public class Cadastro{
    //Declaração de atributos
    private Equipamento equipamento;
    private Software software;

    //Construtor
    public Cadastro(){
        super();
    }

    public Cadastro(Equipamento equipamento, Software software){
        super();
        this.software = software;
        this.equipamento = equipamento;
    }

    //Declaração de métodos
    public void busca(){

    }

    public void exclusao(){

    }

    public void atualizacao(){

    }

    public void inserir(){

    }

    //Declaração de Getters e Setters
    public Equipamento getEquipamento(){
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento){
        this.equipamento = equipamento;
    }

    public Software getSoftware(){
        return software;
    }

    public void setSoftware(Software software){
        this.software = software;
    }

}

