package br.com.deltaz123.negocio;

/**
 *
 * @author Tayson RS  / RA 5614124135
 */
public class Usuario {
    //Declaracao de atributos
    private int matriculaUsuario;
    private String nomeUsuario;
    private String localTrabalho;
    
    //Declaracao de Construtores

    public Usuario() {
    }

    public Usuario(int matriculaUsuario, String nomeUsuario, String localTrabalho) {
        this.matriculaUsuario = matriculaUsuario;
        this.nomeUsuario = nomeUsuario;
        this.localTrabalho = localTrabalho;
    }
    
    
    
    //Declaracao de getters & setters
    public int getMatriculaUsuario() {
        return matriculaUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setMatriculaUsuario(int matriculaUsuario) {
        this.matriculaUsuario = matriculaUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }
    
    
    
    
    
    
}
