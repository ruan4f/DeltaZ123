/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.desltaz123.teste;

import br.com.deltaz123.negocio.Usuario;

/**
 *
 * @author TRS
 */
public class TestaUsuario {
    
    public static void main(String[] args){
        
        Usuario usuario = new Usuario();
        
        usuario.setMatriculaUsuario(123456);
        usuario.setNomeUsuario("Ted");
        usuario.setLocalTrabalho("Matrix");
        
        System.out.println("Matricula: "+usuario.getMatriculaUsuario());
        System.out.println("Nome: "+usuario.getNomeUsuario());
        System.out.println("Local de trabalho: "+usuario.getLocalTrabalho());
    }
    
}
