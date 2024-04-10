/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinal;

/**
 *
 * @author Raul Sigoli
 */
public class Contato {
    public String nome;
    public String telefone;
    public String email;
    public String endereco;
    public String cidade;
    public String estado;

    // Metodos
    
    public String getMensagemErro() {
        String mensagem = "";
        
        if (nome == null || nome.isEmpty()) {
           mensagem = "O nome e obrigatorio";
        } else if (telefone == null || telefone.isEmpty()){
            mensagem = "O telefone e obrigatorio";
        } else if (email == null || email.isEmpty()){
            mensagem = "O email e obrigatorio";
        
        } else if (endereco == null || endereco.isEmpty()){
            mensagem = "O endereco e obrigatorio";
        
        } else if (cidade == null || cidade.isEmpty()){
            mensagem = "A cidade e obrigatorio";
        
        } else if (estado == null || estado.isEmpty()){
            mensagem = "O estado e obrigatorio";
        } 
        
        // Validar
        
        
        return mensagem;
    }
    
}
