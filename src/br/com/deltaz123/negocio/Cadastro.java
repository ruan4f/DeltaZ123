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
    ArrayList<Software> software = new ArrayList<>();
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
    
    public Cadastro(Software software){
        super();
        this.software.add(software);
    }

    //Declaração de métodos
    
    public Equipamento exibirEquipamento(String codigo){        
        return equipamento.get(this.buscaEquipamento(codigo));
    }
    
    public Software exibirSoftware(String codigo){        
        return software.get(this.buscaSoftware(codigo));
    }
    
    public int buscaEquipamento(String codigo){
        
        for (int i = 0; i < equipamento.size(); i++){
            
            if (equipamento.get(i).getCodEquipamento().equals(codigo)) {
                return i;
            } 
        }
        return -1;
    }
    
    public int buscaSoftware(String codigo){
        
        for (int i = 0; i < software.size(); i++){
            
            if (software.get(i).getNomeSoftware().equals(codigo)) {
                return i;
            } 
        }
        return -1;
    }

    public void exclusaoEquipamento(String codigo){
        int posicao;
        posicao = this.buscaEquipamento(codigo); 
        
        equipamento.remove(posicao);
    }
    
    public void exclusaoSoftware(String codigo){
        int posicao;
        posicao = this.buscaSoftware(codigo); 
        
        software.remove(posicao);
    }

    public void atualizacaoEquipamento(String codigo){
        int posicao;
        posicao = this.buscaEquipamento(codigo); 
        if (posicao == -1) {
            JOptionPane.showMessageDialog(null, "Não existe este Eqiuipamento");
        }else {
            //this.getEquipamento()[posicao].setCodEquipamento("vazio");
        }
    }
    
    public void inserirEquipamento(Equipamento dadosDoEquipamento){
        this.equipamento.add(dadosDoEquipamento);
    }
    
    public void inserirSoftware(Software dadosDoSoftware){
        this.software.add(dadosDoSoftware);
    }
}

