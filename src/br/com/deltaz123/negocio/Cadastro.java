/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.deltaz123.negocio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrocínio
 */
public class Cadastro{
    //public ArrayList<Equipamento> equipamento = new ArrayList<>();
    Equipamento[] equipamento = new Equipamento[10000000];
    public int index = 0;
    
    //Construtor
    public Cadastro(){
        super();
    }

    public Cadastro(Equipamento equipamento){
        super();
        //this.equipamento.add(equipamento);
        this.equipamento[this.index] = equipamento;
        this.index++;
    }

    //Declaração de métodos
    
    public Equipamento exibir(String codigo){        
        //return equipamento.get(this.busca(codigo));
        return equipamento[this.busca(codigo)];
    }
    
    public int busca(String codigo){
        //equipamento.size() - fica dentro do for se usar arraylist
        for (int i = 0; i < getIndex(); i++){
            //equipamento.get(i).getCodEquipamento().equals(codigo) - fica dentro do if se usar arraylist
            if (equipamento[i].getCodEquipamento().equals(codigo)) {
                return i;
            } else {
            }
        }
        return -1;
    }

    public void exclusao(String codigo){
        int posicao;
        posicao = this.busca(codigo); 
        if (posicao == -1) {
            JOptionPane.showMessageDialog(null, "Não existe este Eqiuipamento");
        }else {
            //this.getEquipamento()[posicao].setCodEquipamento("vazio");
        }
    }

    public void atualizacao(String codigo){
        int posicao;
        posicao = this.busca(codigo); 
        if (posicao == -1) {
            JOptionPane.showMessageDialog(null, "Não existe este Eqiuipamento");
        }else {
            //this.getEquipamento()[posicao].setCodEquipamento("vazio");
        }
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }
}

