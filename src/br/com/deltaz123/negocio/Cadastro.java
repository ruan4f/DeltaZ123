/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deltaz123.negocio;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrocínio
 */
public class Cadastro{
    //Declaração de atributos
    private Equipamento equipamento[];
    private int index = 0;
    private Software software;

    //Construtor
    public Cadastro(){
        super();
    }

    public Cadastro(Equipamento equipamento){
        super();
       
        this.equipamento[1] = equipamento;
    }

    //Declaração de métodos
    public int busca(String codigo){
        for (int i = 0; i <= this.index; i++){
            if (equipamento[i].getCodEquipamento() == codigo ) {
                return i;
            }
        }return -1;
    }

    public void exclusao(String codigo){
        int posicao;
        posicao = this.busca(codigo); 
        if (posicao == -1) {
            JOptionPane.showMessageDialog(null, "Não existe este Eqiuipamento");
        }else {
         this.equipamento[posicao].setCodEquipamento("vazio");
         ++ index;
        }
    }

    public void atualizacao(String codigo){
        int posicao;
        posicao = this.busca(codigo); 
        if (posicao == -1) {
            JOptionPane.showMessageDialog(null, "Não existe este Eqiuipamento");
        }else {
         this.equipamento[posicao].setCodEquipamento("vazio");
         ++ index;
        }
    }

    public void inserirEquimento(Equipamento equipamento){
        this.equipamento[index] = equipamento;
        ++ index;
    }

    //Declaração de Getters e Setters
    public void getEquipamento(){
     
    }

    public void setEquipamento(Equipamento equipamento){
        
    }

    public Software getSoftware(){
        return software;
    }

    public void setSoftware(Software software){
        this.software = software;
    }

}

