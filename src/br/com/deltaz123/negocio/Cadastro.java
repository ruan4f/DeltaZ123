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
    ArrayList<Equipamento> equipamento = new ArrayList<>();
    //Equipamento[] equipamento = new Equipamento[10000000];
    //private int index;

    
    //Construtor
    public Cadastro(){
        super();
        
    }
    
    public Cadastro(Equipamento equipamento){
        super();
        this.equipamento.add(equipamento);
    }

    //Declaração de métodos
    
    public Equipamento exibir(String codigo){        
        return equipamento.get(this.busca(codigo));
        
    }
    
    public int busca(String codigo){
        
        for (int i = 0; i < equipamento.size(); i++){
            
            if (equipamento.get(i).getCodEquipamento().equals(codigo)) {
                return i;
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
    
    public void inserir(Equipamento dadosDoEquipamento){
        this.equipamento.add(dadosDoEquipamento);
    }
}

